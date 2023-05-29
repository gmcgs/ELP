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
	 * Visit a parse tree produced by {@link TestParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(TestParser.IdentificadorContext ctx);
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
	 * Visit a parse tree produced by {@link TestParser#identif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentif(TestParser.IdentifContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(TestParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(TestParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(TestParser.InstrucaoContext ctx);
}