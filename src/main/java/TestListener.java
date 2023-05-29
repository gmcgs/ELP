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
	 * Enter a parse tree produced by {@link TestParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(TestParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(TestParser.InstrucaoContext ctx);
}