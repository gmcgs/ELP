// Generated from C:/Users/gmigu/Documents/3ano/2sem/ELP/projeto/src/main/resources/grammar\Test.g4 by ANTLR 4.12.0
package grammar;
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
	 * Visit a parse tree produced by {@link TestParser#propriedade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropriedade(TestParser.PropriedadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(TestParser.InstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(TestParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(TestParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#point2D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint2D(TestParser.Point2DContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDim(TestParser.DimContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(TestParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(TestParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#cut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCut(TestParser.CutContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#full}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull(TestParser.FullContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#colorCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorCommand(TestParser.ColorCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigure(TestParser.FigureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#estrutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstrutura(TestParser.EstruturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#fig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFig(TestParser.FigContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#shape}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape(TestParser.ShapeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#ifCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCommand(TestParser.IfCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#condicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao(TestParser.CondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(TestParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#capsID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapsID(TestParser.CapsIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#lowerID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowerID(TestParser.LowerIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(TestParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAux(TestParser.AuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#operacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacao(TestParser.OperacaoContext ctx);
}