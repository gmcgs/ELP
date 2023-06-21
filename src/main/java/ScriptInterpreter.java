import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.awt.*;
import java.util.*;
import java.util.List;

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
    @Override
    public void exitConstante(TestParser.ConstanteContext ctx) {
        if(ctx.objeto().getText().matches("\\d+,\\d+")){
            List<Integer> pontoValues = new ArrayList<>();
            pontoValues.add(Integer.parseInt(ctx.objeto().point2D().expressao(0).getText()));
            pontoValues.add(Integer.parseInt(ctx.objeto().point2D().expressao(1).getText()));
            constantesPonto.put(ctx.capsID().CAPS().getText(),pontoValues);
            System.out.println(constantesPonto.get(ctx.capsID().CAPS().getText()).toString());
        } else if(ctx.objeto().getText().matches("\\d+~\\d+")){
            List<Integer> dimValues = new ArrayList<>();
            dimValues.add(Integer.parseInt(ctx.objeto().dim().expressao(0).getText()));
            dimValues.add(Integer.parseInt(ctx.objeto().dim().expressao(1).getText()));
            constantesDim.put(ctx.capsID().CAPS().getText(),dimValues);
            System.out.println(constantesDim.get(ctx.capsID().CAPS().getText()).toString());
        } else if(ctx.objeto().getText().matches("[\\[\\]]\\d+(?:,\\s*\\d+)?[\\[\\]]")){
            List<Integer> interValues = new ArrayList<>();
            interValues.add(Integer.parseInt(ctx.objeto().interval().expressao(0).getText()));
            interValues.add(Integer.parseInt(ctx.objeto().interval().expressao(1).getText()));
            constantesIntervalo.put(ctx.capsID().CAPS().getText(),interValues);
            System.out.println(constantesIntervalo.get(ctx.capsID().CAPS().getText()).toString());
        } else if(ctx.objeto().getText().matches("\\d+\\|\\d+\\|\\|\\d+")){
            int r = Integer.parseInt(ctx.objeto().color().full().expressao(0).getText());
            int g = Integer.parseInt(ctx.objeto().color().full().expressao(1).getText());
            int b = Integer.parseInt(ctx.objeto().color().full().expressao(2).getText());
            constantesCor.put(ctx.capsID().CAPS().getText(), checkColor(r,g,b));
            System.out.println(constantesCor.get(ctx.capsID().CAPS().getText()).toString());
        } else if(ctx.objeto().getText().matches("\\|\\d+\\|")){
            int rgb = Integer.parseInt(ctx.objeto().color().cut().expressao().INT().getText());
            constantesCor.put(ctx.capsID().CAPS().getText(), checkColor(rgb, rgb, rgb));
            System.out.println(constantesCor.get(ctx.capsID().CAPS().getText()).toString());
        }else if (ctx.objeto().getText().matches("\\d+")) {
            constantesInt.put(ctx.capsID().CAPS().getText(),Integer.parseInt(ctx.objeto().expressao().INT().getText()));
            System.out.println(constantesInt.get(ctx.capsID().CAPS().getText()).toString());
        } else if (ctx.objeto().getText().equals("true") || ctx.objeto().getText().equals("false")){
            constantesBool.put(ctx.capsID().CAPS().getText(),Boolean.getBoolean(ctx.objeto().BOOLEAN().getText()));
            System.out.println(constantesBool.get(ctx.capsID().CAPS().getText()).toString());
        }
    }

    @Override
    public void exitPropriedade(TestParser.PropriedadeContext ctx) {
        if(ctx.color() != null){
            if(ctx.color().getText().matches("\\|\\d+\\|")){
                int rgb = Integer.parseInt(ctx.color().cut().expressao().INT().getText());
                propriedadesCor.put(ctx.lowerID().LOWER().getText(), checkColor(rgb,rgb,rgb));
                System.out.println(propriedadesCor.get(ctx.capsID().CAPS().getText()).toString());
            } else {
                int r = Integer.parseInt(ctx.color().full().expressao(0).getText());
                int g = Integer.parseInt(ctx.color().full().expressao(1).getText());
                int b = Integer.parseInt(ctx.color().full().expressao(2).getText());
                propriedadesCor.put(ctx.lowerID().LOWER().getText(), checkColor(r,g,b));
                System.out.println(propriedadesCor.get(ctx.capsID().CAPS().getText()).toString());
            }
        } else if(ctx.dim() != null){
            List<String> dimValuesProp = new ArrayList<>();
            dimValuesProp.add(ctx.dim().expressao(0).getText());
            dimValuesProp.add(ctx.dim().expressao(1).getText());
            propriedadesDim.put(ctx.lowerID().LOWER().getText(),dimValuesProp);
            System.out.println(propriedadesDim.get(ctx.lowerID().LOWER().getText()).toString());
        } else if(ctx.capsID() != null) {
            propriedadesConst.put(ctx.lowerID().LOWER().getText(), ctx.capsID().CAPS().getText());
            System.out.println(propriedadesConst.get(ctx.lowerID().LOWER().getText()));
        }
    }

    private Color checkColor(int r, int g, int b){
        if(r < 0){
            r = 0;
        }
        if (r > 255) {
            r = 255;
        }
        if (g < 0) {
            g = 0;
        }
        if (g > 255) {
            g = 255;
        }
        if (b < 0) {
            b = 0;
        }
        if (b > 255) {
            b = 255;
        }
        return new Color(r,g,b);
    }
    private int i = 1;
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("got in " + i + " times!");
        i++;
    }
}
