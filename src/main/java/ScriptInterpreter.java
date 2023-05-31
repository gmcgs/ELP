public class ScriptInterpreter extends TestBaseListener {
    @Override 
    public void enterScript(TestParser.ScriptContext ctx) { 
        
    }
    @Override 
    public void exitScript(TestParser.ScriptContext ctx) {
        
    }
    @Override
    public void enterConstante(TestParser.ConstanteContext ctx) { }
    
    @Override 
    public void exitConstante(TestParser.ConstanteContext ctx) { }
    
    @Override 
    public void enterIdentificador(TestParser.IdentificadorContext ctx) { }
    
    @Override 
    public void exitIdentificador(TestParser.IdentificadorContext ctx) { }
    
    @Override 
    public void enterValue(TestParser.ValueContext ctx) { }
    
    @Override 
    public void exitValue(TestParser.ValueContext ctx) { }
    
    @Override 
    public void enterPropriedade(TestParser.PropriedadeContext ctx) { }
    
    @Override 
    public void exitPropriedade(TestParser.PropriedadeContext ctx) { }
    
    @Override 
    public void enterIdentif(TestParser.IdentifContext ctx) { }
    
    @Override 
    public void exitIdentif(TestParser.IdentifContext ctx) { }
    
    @Override 
    public void enterValor(TestParser.ValorContext ctx) { }
    
    @Override 
    public void exitValor(TestParser.ValorContext ctx) { }
    
    @Override 
    public void enterBinaryOperator(TestParser.BinaryOperatorContext ctx) { }
    
    @Override 
    public void exitBinaryOperator(TestParser.BinaryOperatorContext ctx) { }
    
    @Override 
    public void enterInstrucao(TestParser.InstrucaoContext ctx) { }
    @Override 
    public void exitInstrucao(TestParser.InstrucaoContext ctx) { }
}
