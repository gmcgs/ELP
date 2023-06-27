
import java.awt.*;
import java.util.*;
import java.util.List;


import static java.lang.System.exit;

public class ScriptInterpreter extends TestBaseListener implements TestListener{
    public static Map<String, Integer> constantesInt = new HashMap<>();
    public Map<String, Boolean> constantesBool = new HashMap<>();
    public Map<String, List<Integer>> constantesPonto = new HashMap<>();
    public Map<String, List<Integer>> constantesDim = new HashMap<>();
    public Map<String, List<Integer>> constantesIntervalo = new HashMap<>();
    public Map<String, Color> constantesCor = new HashMap<>();

    public String div = "";
    private static final Map<Character, Integer> precedence = new HashMap<>();

    @Override
    public void exitConstante(TestParser.ConstanteContext ctx) {
        if(ctx.objeto().getText().matches("\\d+,\\d+")){
            if(constantesPonto.containsKey(ctx.capsID().CAPS().getText())){
                System.err.println("Identificador de constante duplicado.");
                exit(0);
            }
            List<Integer> pontoValues = new ArrayList<>();
            pontoValues.add(Integer.parseInt(ctx.objeto().point2D().expressao(0).getText()));
            pontoValues.add(Integer.parseInt(ctx.objeto().point2D().expressao(1).getText()));
            constantesPonto.put(ctx.capsID().CAPS().getText(),pontoValues);
            //System.out.println(constantesPonto.get(ctx.capsID().CAPS().getText()).toString());
        } else if(ctx.objeto().getText().matches("\\d+~\\d+")){
            if(constantesDim.containsKey(ctx.capsID().CAPS().getText())){
                System.err.println("Identificador de constante duplicado.");
                exit(0);
            }
            List<Integer> dimValues = new ArrayList<>();
            dimValues.add(Integer.parseInt(ctx.objeto().dim().expressao(0).getText()));
            dimValues.add(Integer.parseInt(ctx.objeto().dim().expressao(1).getText()));
            constantesDim.put(ctx.capsID().CAPS().getText(),dimValues);
            //System.out.println(constantesDim.get(ctx.capsID().CAPS().getText()).toString());
        } else if(ctx.objeto().getText().matches("[\\[\\]]\\d+(?:,\\s*\\d+)?[\\[\\]]")){
            if(constantesIntervalo.containsKey(ctx.capsID().CAPS().getText())){
                System.err.println("Identificador de constante duplicado.");
                exit(0);
            }
            List<Integer> interValues = new ArrayList<>();
            interValues.add(Integer.parseInt(ctx.objeto().interval().expressao(0).getText()));
            interValues.add(Integer.parseInt(ctx.objeto().interval().expressao(1).getText()));
            constantesIntervalo.put(ctx.capsID().CAPS().getText(),interValues);
            //System.out.println(constantesIntervalo.get(ctx.capsID().CAPS().getText()).toString());
        } else if(ctx.objeto().getText().matches("\\d+\\|\\d+\\|\\d+")){
            if(constantesCor.containsKey(ctx.capsID().CAPS().getText())){
                System.err.println("Identificador de constante duplicado.");
                exit(0);
            }
            int r = Integer.parseInt(ctx.objeto().color().full().expressao(0).getText());
            int g = Integer.parseInt(ctx.objeto().color().full().expressao(1).getText());
            int b = Integer.parseInt(ctx.objeto().color().full().expressao(2).getText());
            checkColor(r,g,b);
            constantesCor.put(ctx.capsID().CAPS().getText(), new Color(r,g,b));
            //System.out.println(constantesCor.get(ctx.capsID().CAPS().getText()).toString());
        } else if(ctx.objeto().getText().matches("\\|\\d+\\|")){
            if(constantesCor.containsKey(ctx.capsID().CAPS().getText())){
                System.err.println("Identificador de constante duplicado.");
                exit(0);
            }
            int rgb = Integer.parseInt(ctx.objeto().color().cut().expressao().INT().getText());
            checkColor(rgb, rgb, rgb);
            constantesCor.put(ctx.capsID().CAPS().getText(),  new Color(rgb,rgb,rgb));
            //System.out.println(constantesCor.get(ctx.capsID().CAPS().getText()).toString());
        }else if (ctx.objeto().getText().matches("\\d+")) {
            if(constantesInt.containsKey(ctx.capsID().CAPS().getText())){
                System.err.println("Identificador de constante duplicado.");
                exit(0);
            }
            constantesInt.put(ctx.capsID().CAPS().getText(),Integer.parseInt(ctx.objeto().expressao().INT().getText()));
            //System.out.println(constantesInt.get(ctx.capsID().CAPS().getText()).toString());
        } else if (ctx.objeto().getText().equals("true") || ctx.objeto().getText().equals("false")){
            if(constantesBool.containsKey(ctx.capsID().CAPS().getText())){
                System.err.println("Identificador de constante duplicado.");
                exit(0);
            }
            constantesBool.put(ctx.capsID().CAPS().getText(),Boolean.getBoolean(ctx.objeto().BOOLEAN().getText()));
            //System.out.println(constantesBool.get(ctx.capsID().CAPS().getText()).toString());
        }
    }

    @Override
    public void exitPropriedade(TestParser.PropriedadeContext ctx) {
        if(ctx.color() != null){
            if(ctx.color().getText().matches("\\|\\d+\\|")){
                int rgb = Integer.parseInt(ctx.color().cut().expressao().INT().getText());
                checkColor(rgb,rgb,rgb);
                DrawScript.backgroundPanel.setBackground(new Color(rgb,rgb,rgb));
                //System.out.println(propriedadesCor.get(ctx.capsID().CAPS().getText()).toString());
            } else if(ctx.color().getText().matches("\\d+\\|\\d+\\|\\d+")){
                int r = Integer.parseInt(ctx.color().full().expressao(0).getText());
                int g = Integer.parseInt(ctx.color().full().expressao(1).getText());
                int b = Integer.parseInt(ctx.color().full().expressao(2).getText());
                checkColor(r,g,b);
                DrawScript.backgroundPanel.setBackground(new Color(r,g,b));
                //System.out.println(propriedadesCor.get(ctx.capsID().CAPS().getText()).toString());
            }
        } else if(ctx.dim() != null){
            String x = ctx.dim().expressao(0).getText();
            String y = ctx.dim().expressao(1).getText();
            DrawScript.frame.setSize(evaluateExpression(x),evaluateExpression(y));
            DrawScript.backgroundPanel.setSize(evaluateExpression(x),evaluateExpression(y));
            DrawScript.frontPanel.setSize(evaluateExpression(x),evaluateExpression(y));
            DrawScript.painter.setSize(evaluateExpression(x),evaluateExpression(y));
            DrawScript.x = evaluateExpression(x);
            DrawScript.y = evaluateExpression(y);
            //System.out.println(propriedadesDim.get(ctx.lowerID().LOWER().getText()).toString());
        } else if(ctx.capsID() != null) {
            if(Objects.equals(ctx.lowerID().LOWER().getText(), "dimension") && constantesDim.containsKey(ctx.capsID().CAPS().getText())){
                DrawScript.backgroundPanel.setSize(constantesDim.get(ctx.capsID().CAPS().getText()).get(0),constantesDim.get(ctx.capsID().CAPS().getText()).get(1));
                DrawScript.frame.setSize(constantesDim.get(ctx.capsID().CAPS().getText()).get(0),constantesDim.get(ctx.capsID().CAPS().getText()).get(1));
                DrawScript.frontPanel.setSize(constantesDim.get(ctx.capsID().CAPS().getText()).get(0),constantesDim.get(ctx.capsID().CAPS().getText()).get(1));
                DrawScript.painter.setSize(constantesDim.get(ctx.capsID().CAPS().getText()).get(0),constantesDim.get(ctx.capsID().CAPS().getText()).get(1));
                DrawScript.x = constantesDim.get(ctx.capsID().CAPS().getText()).get(0);
                DrawScript.y = constantesDim.get(ctx.capsID().CAPS().getText()).get(1);
            } else if(Objects.equals(ctx.lowerID().LOWER().getText(), "background") && constantesCor.containsKey(ctx.capsID().CAPS().getText())){
                DrawScript.backgroundPanel.setBackground(constantesCor.get(ctx.capsID().CAPS().getText()));
            }
            //System.out.println(propriedadesConst.get(ctx.lowerID().LOWER().getText()));
        }
    }

    @Override
    public void exitColorCommand(TestParser.ColorCommandContext ctx) {
        if(Objects.equals(ctx.lowerID().LOWER().getText(), "line") && ctx.color() != null){
            if(ctx.color().getText().matches("\\|\\d+\\|")){
                int rgb = Integer.parseInt(ctx.color().cut().expressao().INT().getText());
                checkColor(rgb,rgb,rgb);
                DrawScript.liner = new Color(rgb,rgb,rgb);
            } else if(ctx.color().getText().matches("\\d+\\|\\d+\\|\\d+")){
                int r = Integer.parseInt(ctx.color().full().expressao(0).getText());
                int g = Integer.parseInt(ctx.color().full().expressao(1).getText());
                int b = Integer.parseInt(ctx.color().full().expressao(2).getText());
                checkColor(r,g,b);
                DrawScript.liner = new Color(r,g,b);
            }
        } else if (Objects.equals(ctx.lowerID().LOWER().getText(), "line") && ctx.capsID() != null) {
            DrawScript.liner = constantesCor.get(ctx.capsID().CAPS().getText());
        } else if(Objects.equals(ctx.lowerID().LOWER().getText(), "color") && ctx.color() != null){
            if(ctx.color().getText().matches("\\|\\d+\\|")){
                int rgb = Integer.parseInt(ctx.color().cut().expressao().INT().getText());
                checkColor(rgb,rgb,rgb);
                DrawScript.filler = new Color(rgb,rgb,rgb);
            } else if(ctx.color().getText().matches("\\d+\\|\\d+\\|\\d+")){
                int r = Integer.parseInt(ctx.color().full().expressao(0).getText());
                int g = Integer.parseInt(ctx.color().full().expressao(1).getText());
                int b = Integer.parseInt(ctx.color().full().expressao(2).getText());
                checkColor(r,g,b);
                DrawScript.filler = new Color(r,g,b);
            }
        } else if (Objects.equals(ctx.lowerID().LOWER().getText(), "color") && ctx.capsID() != null) {
            DrawScript.filler = constantesCor.get(ctx.capsID().CAPS().getText());
        }

    }

    @Override
    public void exitFigure(TestParser.FigureContext ctx) {
        if(Objects.equals(ctx.lowerID().LOWER().getText(), "square")){
            DrawScript.painter.figures.add(new DrawScript.Square(evaluateExpression(ctx.fig().expressao(0).getText()), evaluateExpression(ctx.fig().expressao(0).getText()), constantesInt.get(ctx.shape().expressao().CAPS().getText())));
        } else if(Objects.equals(ctx.lowerID().LOWER().getText(), "rectangle")){
            DrawScript.painter.figures.add(new DrawScript.Rectangle(evaluateExpression(ctx.fig().expressao(0).getText()), evaluateExpression(ctx.fig().expressao(0).getText()), evaluateExpression(ctx.shape().dim().expressao(0).getText()), evaluateExpression(ctx.shape().dim().expressao(1).getText())));
        } else if(Objects.equals(ctx.lowerID().LOWER().getText(), "circle")){
            DrawScript.painter.figures.add(new DrawScript.Circle(evaluateExpression(ctx.fig().expressao(0).getText()), evaluateExpression(ctx.fig().expressao(1).getText()), constantesInt.get(ctx.shape().expressao().CAPS().getText())));
        } else if(Objects.equals(ctx.lowerID().LOWER().getText(), "ellipse")){
            DrawScript.painter.figures.add(new DrawScript.Ellipse(evaluateExpression(ctx.fig().expressao(0).getText()), evaluateExpression(ctx.fig().expressao(0).getText()), evaluateExpression(ctx.shape().dim().expressao(0).getText()), evaluateExpression(ctx.shape().dim().expressao(1).getText())));
        }
    }

    @Override
    public void exitEstrutura(TestParser.EstruturaContext ctx) {

    }

    @Override public void exitDiv(TestParser.DivContext ctx) {
        div = ctx.DIV().getText();
    }
    private void checkColor(int r, int g, int b){
        if(r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255){
            System.err.println("Os valores literais para os componentes das cores não são válidos [0, 255]");
            exit(0);
        }
    }

    static {
        precedence.put('+', 1);
        precedence.put('-', 1);
        precedence.put('*', 2);
        precedence.put('/', 2);
    }

    public static int evaluateExpression(String expression) {
        for (Map.Entry<String, Integer> entry : constantesInt.entrySet()) {
            String key = entry.getKey();
            int constValue = entry.getValue();
            expression = expression.replaceAll(key, String.valueOf(constValue));
            expression = expression.replaceAll(key, String.valueOf(constValue));
        }
        List<String> postfix = infixToPostfix(expression);
        return evaluatePostfix(postfix);
    }

    private static List<String> infixToPostfix(String expression) {
        List<String> postfix = new ArrayList<>();
        Deque<Character> operatorStack = new ArrayDeque<>();

        StringBuilder number = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                number.append(c);
            } else {
                if (number.length() > 0) {
                    postfix.add(number.toString());
                    number.setLength(0);
                }

                if (c == '(') {
                    operatorStack.push(c);
                } else if (c == ')') {
                    while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                        postfix.add(operatorStack.pop().toString());
                    }
                    operatorStack.pop();
                } else {
                    while (!operatorStack.isEmpty() && precedence.getOrDefault(c, 0) <= precedence.getOrDefault(operatorStack.peek(), 0)) {
                        postfix.add(operatorStack.pop().toString());
                    }
                    operatorStack.push(c);
                }
            }
        }

        if (number.length() > 0) {
            postfix.add(number.toString());
        }

        while (!operatorStack.isEmpty()) {
            postfix.add(operatorStack.pop().toString());
        }

        return postfix;
    }

    private static int evaluatePostfix(List<String> postfix) {
        Deque<Integer> operandStack = new ArrayDeque<>();

        for (String token : postfix) {
            if (Character.isDigit(token.charAt(0))) {
                operandStack.push(Integer.parseInt(token));
            } else {
                int b = operandStack.pop();
                int a = operandStack.pop();

                int result;
                switch (token.charAt(0)) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }

                operandStack.push(result);
            }
        }

        return operandStack.pop();
    }
}
