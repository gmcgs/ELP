import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.awt.*;
import java.util.*;
import java.util.List;
import javax.script.*;
import javax.sound.midi.SysexMessage;

import static java.lang.System.exit;

public class ScriptInterpreter extends TestBaseListener implements TestListener{
    public Map<String, Integer> constantesInt = new HashMap<>();
    public Map<String, Boolean> constantesBool = new HashMap<>();
    public Map<String, List<Integer>> constantesPonto = new HashMap<>();
    public Map<String, List<Integer>> constantesDim = new HashMap<>();
    public Map<String, List<Integer>> constantesIntervalo = new HashMap<>();
    public Map<String, Color> constantesCor = new HashMap<>();
    public Map<String, String> propriedadesConst = new HashMap<>();
    public Map<String, List<String>> propriedadesDim = new HashMap<>();
    public Map<String, Color> propriedadesCor = new HashMap<>();

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
        } else if(ctx.objeto().getText().matches("\\d+\\|\\d+\\|\\|\\d+")){
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
                propriedadesCor.put(ctx.lowerID().LOWER().getText(), new Color(rgb,rgb,rgb));
                //System.out.println(propriedadesCor.get(ctx.capsID().CAPS().getText()).toString());
            } else {
                int r = Integer.parseInt(ctx.color().full().expressao(0).getText());
                int g = Integer.parseInt(ctx.color().full().expressao(1).getText());
                int b = Integer.parseInt(ctx.color().full().expressao(2).getText());
                checkColor(r,g,b);
                propriedadesCor.put(ctx.lowerID().LOWER().getText(), new Color(r,g,b));
                //System.out.println(propriedadesCor.get(ctx.capsID().CAPS().getText()).toString());
            }
        } else if(ctx.dim() != null){
            List<String> dimValuesProp = new ArrayList<>();
            dimValuesProp.add(ctx.dim().expressao(0).getText());
            dimValuesProp.add(ctx.dim().expressao(1).getText());
            propriedadesDim.put(ctx.lowerID().LOWER().getText(),dimValuesProp);
            //System.out.println(propriedadesDim.get(ctx.lowerID().LOWER().getText()).toString());
        } else if(ctx.capsID() != null) {
            propriedadesConst.put(ctx.lowerID().LOWER().getText(), ctx.capsID().CAPS().getText());
            //System.out.println(propriedadesConst.get(ctx.lowerID().LOWER().getText()));
        }
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

    public List<Integer> getDimensions(){
        List<String> value = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : propriedadesDim.entrySet()){
            value = entry.getValue();
        }
        List<Integer> dimensions = new ArrayList<>();
        for (String str : value){
            String expression = str;
            for (Map.Entry<String, Integer> entry : constantesInt.entrySet()) {
                String key = entry.getKey();
                int constValue = entry.getValue();
                expression = expression.replaceAll(key, String.valueOf(constValue));
            }
            dimensions.add(evaluateExpression(expression));
        }return dimensions;
    }

    public Color getBackground(){
        Color color = new Color(0);
        for (Map.Entry<String, String> entry : propriedadesConst.entrySet()){
            String colorName = entry.getValue();
            color = constantesCor.get(colorName);
        }
        System.out.println(color);
        return color;
    }
    public void printFile(){
        System.out.println("\nFile parsed:");
        if(!constantesBool.isEmpty()){
            for (Map.Entry<?, ?> entry : constantesBool.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }if(!constantesInt.isEmpty()){
            for (Map.Entry<?, ?> entry : constantesInt.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }if(!constantesCor.isEmpty()){
            for (Map.Entry<?, ?> entry : constantesCor.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }if(!constantesPonto.isEmpty()){
            for (Map.Entry<?, ?> entry : constantesPonto.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }if(!constantesDim.isEmpty()){
            for (Map.Entry<?, ?> entry : constantesDim.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }System.out.println(div);
        if(!propriedadesDim.isEmpty()){
            for (Map.Entry<?, ?> entry : propriedadesDim.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }if(!propriedadesCor.isEmpty()){
            for (Map.Entry<?, ?> entry : propriedadesCor.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }if(!propriedadesConst.isEmpty()){
            for (Map.Entry<?, ?> entry : propriedadesConst.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        System.out.println(div);
    }

    static {
        precedence.put('+', 1);
        precedence.put('-', 1);
        precedence.put('*', 2);
        precedence.put('/', 2);
    }

    public static int evaluateExpression(String expression) {
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
