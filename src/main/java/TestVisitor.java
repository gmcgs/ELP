// Generated from /Users/franciscorodrigues/Downloads/ELP/src/Test.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(TestParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(TestParser.ConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(TestParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#propriedade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropriedade(TestParser.PropriedadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(TestParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(TestParser.InstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#colorCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorCommand(TestParser.ColorCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#loopCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopCommand(TestParser.LoopCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#drawCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawCommand(TestParser.DrawCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#algo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgo(TestParser.AlgoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#ifCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCommand(TestParser.IfCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#elseifCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifCommand(TestParser.ElseifCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#elseCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCommand(TestParser.ElseCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TestParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#geometric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometric(TestParser.GeometricContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#square}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquare(TestParser.SquareContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#rectangule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRectangule(TestParser.RectanguleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(TestParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(TestParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#identif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentif(TestParser.IdentifContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(TestParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(TestParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigure(TestParser.FigureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(TestParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#parenteses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenteses(TestParser.ParentesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(TestParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TestParser.ConditionContext ctx);
}