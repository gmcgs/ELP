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
	 * Enter a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(TestParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(TestParser.ValueContext ctx);
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
	 * Enter a parse tree produced by {@link TestParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(TestParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(TestParser.ValorContext ctx);
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
	 * Enter a parse tree produced by {@link TestParser#loopCommand}.
	 * @param ctx the parse tree
	 */
	void enterLoopCommand(TestParser.LoopCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#loopCommand}.
	 * @param ctx the parse tree
	 */
	void exitLoopCommand(TestParser.LoopCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#drawCommand}.
	 * @param ctx the parse tree
	 */
	void enterDrawCommand(TestParser.DrawCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#drawCommand}.
	 * @param ctx the parse tree
	 */
	void exitDrawCommand(TestParser.DrawCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#algo}.
	 * @param ctx the parse tree
	 */
	void enterAlgo(TestParser.AlgoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#algo}.
	 * @param ctx the parse tree
	 */
	void exitAlgo(TestParser.AlgoContext ctx);
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
	 * Enter a parse tree produced by {@link TestParser#elseifCommand}.
	 * @param ctx the parse tree
	 */
	void enterElseifCommand(TestParser.ElseifCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#elseifCommand}.
	 * @param ctx the parse tree
	 */
	void exitElseifCommand(TestParser.ElseifCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#elseCommand}.
	 * @param ctx the parse tree
	 */
	void enterElseCommand(TestParser.ElseCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#elseCommand}.
	 * @param ctx the parse tree
	 */
	void exitElseCommand(TestParser.ElseCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TestParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TestParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#geometric}.
	 * @param ctx the parse tree
	 */
	void enterGeometric(TestParser.GeometricContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#geometric}.
	 * @param ctx the parse tree
	 */
	void exitGeometric(TestParser.GeometricContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#square}.
	 * @param ctx the parse tree
	 */
	void enterSquare(TestParser.SquareContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#square}.
	 * @param ctx the parse tree
	 */
	void exitSquare(TestParser.SquareContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#rectangule}.
	 * @param ctx the parse tree
	 */
	void enterRectangule(TestParser.RectanguleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#rectangule}.
	 * @param ctx the parse tree
	 */
	void exitRectangule(TestParser.RectanguleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#first}.
	 * @param ctx the parse tree
	 */
	void enterFirst(TestParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#first}.
	 * @param ctx the parse tree
	 */
	void exitFirst(TestParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(TestParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(TestParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#identif}.
	 * @param ctx the parse tree
	 */
	void enterIdentif(TestParser.IdentifContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#identif}.
	 * @param ctx the parse tree
	 */
	void exitIdentif(TestParser.IdentifContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(TestParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(TestParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(TestParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(TestParser.IfContext ctx);
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
	 * Enter a parse tree produced by {@link TestParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(TestParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(TestParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#parenteses}.
	 * @param ctx the parse tree
	 */
	void enterParenteses(TestParser.ParentesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#parenteses}.
	 * @param ctx the parse tree
	 */
	void exitParenteses(TestParser.ParentesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(TestParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(TestParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TestParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TestParser.ConditionContext ctx);
}