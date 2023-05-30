import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class DrawScriptSkeleton extends JComponent {
    private final int DEFAULT_SIDE = 40;
    private final int DEFAULT_MARGIN = 5;
    private final Color DEFAULT_BACKGROUND_COLOR = Color.GRAY;

    private int N;
    private int SIDE;
    private int MARGIN;
    private Color BACKGROUND_COLOR;

    private Map<String, Color> colorConstants;
    private Map<String, Integer> numericConstants;

    private int canvasWidth;
    private int canvasHeight;

    private final Map<String, Object> constantValues = new HashMap<>();

    public DrawScriptSkeleton() {
        SIDE = DEFAULT_SIDE;
        MARGIN = DEFAULT_MARGIN;
        BACKGROUND_COLOR = DEFAULT_BACKGROUND_COLOR;

        colorConstants = new HashMap<>();
        numericConstants = new HashMap<>();
    }

    public void interpretScript(String script) {
        String[] lines = script.split("---\n");
        if(lines.length != 3){
            System.out.println("Script com formato errado");
        } else{
            String[] constantLines = lines[0].split("\n");
            String[] propertyLines = lines[1].split("\n");
            String[] instructionLines = lines[2].split("\n");
            for(String line : constantLines){
                interpretConstants(line);
            }
            for (String line : propertyLines) {
                interpretProperties(line);
            }
            for(String line : instructionLines){
                interpretInstructions(line);
            }
            repaint();
        }
    }

    private void interpretConstants(String line) {
        String[] tokens = line.split(":");
        if (tokens.length == 2) {
            String key = tokens[0].trim();
            Object value = tokens[1].trim();
            constantValues.put(key, value);
        }
    }

    private void interpretProperties(String line) {
        String[] tokens = line.split(":");
        if(tokens.length == 2){
            if(tokens[0].trim().equals("dimension")){
                String[] variableExpressions = tokens[1].split("~");
                String widthExpression = variableExpressions[0].trim();
                String heightExpression = variableExpressions[1].trim();
                try {
                    ScriptEngineManager manager = new ScriptEngineManager();
                    ScriptEngine engine = manager.getEngineByName("JavaScript");

                    canvasWidth = Integer.parseInt(String.valueOf(engine.eval(widthExpression)));
                    canvasHeight = Integer.parseInt(String.valueOf(engine.eval(heightExpression)));
                    setPreferredSize(new Dimension(canvasWidth, canvasHeight));
                } catch (ScriptException e) {
                    System.err.println("Error evaluating the variable expressions: " + e.getMessage());
                }
            } else if (tokens[0].trim().equals("background")) {
                setBackground(getColor(tokens[1].trim()));
            }

        }
    }

    private void interpretInstructions(String line) {

    }

    private Color getColor(String colorValue) {
        if (colorValue.startsWith("|") && colorValue.endsWith("|")) {
            String numericValue = colorValue.substring(1, colorValue.length() - 1);
            int color = Integer.parseInt(numericValue);
            return new Color(color);
        } else if (colorConstants.containsKey(colorValue)) {
            return colorConstants.get(colorValue);
        }
        return null; // Invalid color
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;

        g.setColor(BACKGROUND_COLOR);
        g.fillRect(0, 0, canvasWidth, canvasHeight);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Draw");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);

            DrawScriptSkeleton interpreter = new DrawScriptSkeleton();
            interpreter.interpretScript(""); // adicionar script path depois

            frame.add(interpreter);
            frame.setVisible(true);
        });
    }
}