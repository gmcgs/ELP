// Generated from /Users/franciscorodrigues/Downloads/ELP/src/Test.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestParser}.
 */
public interface TestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(TestParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(TestParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(TestParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(TestParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#propriedade}.
	 * @param ctx the parse tree
	 */
	void enterPropriedade(TestParser.PropriedadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#propriedade}.
	 * @param ctx the parse tree
	 */
	void exitPropriedade(TestParser.PropriedadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(TestParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(TestParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(TestParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(TestParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(TestParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(TestParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#point2D}.
	 * @param ctx the parse tree
	 */
	void enterPoint2D(TestParser.Point2DContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#point2D}.
	 * @param ctx the parse tree
	 */
	void exitPoint2D(TestParser.Point2DContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterDim(TestParser.DimContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitDim(TestParser.DimContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(TestParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(TestParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(TestParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(TestParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#cut}.
	 * @param ctx the parse tree
	 */
	void enterCut(TestParser.CutContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#cut}.
	 * @param ctx the parse tree
	 */
	void exitCut(TestParser.CutContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#full}.
	 * @param ctx the parse tree
	 */
	void enterFull(TestParser.FullContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#full}.
	 * @param ctx the parse tree
	 */
	void exitFull(TestParser.FullContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#colorCommand}.
	 * @param ctx the parse tree
	 */
	void enterColorCommand(TestParser.ColorCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#colorCommand}.
	 * @param ctx the parse tree
	 */
	void exitColorCommand(TestParser.ColorCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#figure}.
	 * @param ctx the parse tree
	 */
	void enterFigure(TestParser.FigureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#figure}.
	 * @param ctx the parse tree
	 */
	void exitFigure(TestParser.FigureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void enterEstrutura(TestParser.EstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void exitEstrutura(TestParser.EstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#fig}.
	 * @param ctx the parse tree
	 */
	void enterFig(TestParser.FigContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#fig}.
	 * @param ctx the parse tree
	 */
	void exitFig(TestParser.FigContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(TestParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(TestParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void enterIfCommand(TestParser.IfCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void exitIfCommand(TestParser.IfCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(TestParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(TestParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(TestParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(TestParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#capsID}.
	 * @param ctx the parse tree
	 */
	void enterCapsID(TestParser.CapsIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#capsID}.
	 * @param ctx the parse tree
	 */
	void exitCapsID(TestParser.CapsIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#lowerID}.
	 * @param ctx the parse tree
	 */
	void enterLowerID(TestParser.LowerIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#lowerID}.
	 * @param ctx the parse tree
	 */
	void exitLowerID(TestParser.LowerIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(TestParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(TestParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#aux}.
	 * @param ctx the parse tree
	 */
	void enterAux(TestParser.AuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#aux}.
	 * @param ctx the parse tree
	 */
	void exitAux(TestParser.AuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(TestParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(TestParser.OperacaoContext ctx);
}