// Generated from pascalGrammar.g4 by ANTLR 4.0

    import java.util.*;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface pascalGrammarListener extends ParseTreeListener {
	void enterExpression(pascalGrammarParser.ExpressionContext ctx);
	void exitExpression(pascalGrammarParser.ExpressionContext ctx);

	void enterVarNames(pascalGrammarParser.VarNamesContext ctx);
	void exitVarNames(pascalGrammarParser.VarNamesContext ctx);

	void enterProgramBody(pascalGrammarParser.ProgramBodyContext ctx);
	void exitProgramBody(pascalGrammarParser.ProgramBodyContext ctx);

	void enterReadStatement(pascalGrammarParser.ReadStatementContext ctx);
	void exitReadStatement(pascalGrammarParser.ReadStatementContext ctx);

	void enterCmp(pascalGrammarParser.CmpContext ctx);
	void exitCmp(pascalGrammarParser.CmpContext ctx);

	void enterSignedFactor(pascalGrammarParser.SignedFactorContext ctx);
	void exitSignedFactor(pascalGrammarParser.SignedFactorContext ctx);

	void enterStringLiteral(pascalGrammarParser.StringLiteralContext ctx);
	void exitStringLiteral(pascalGrammarParser.StringLiteralContext ctx);

	void enterVarType(pascalGrammarParser.VarTypeContext ctx);
	void exitVarType(pascalGrammarParser.VarTypeContext ctx);

	void enterVarName(pascalGrammarParser.VarNameContext ctx);
	void exitVarName(pascalGrammarParser.VarNameContext ctx);

	void enterProgramId(pascalGrammarParser.ProgramIdContext ctx);
	void exitProgramId(pascalGrammarParser.ProgramIdContext ctx);

	void enterUnsignedConstant(pascalGrammarParser.UnsignedConstantContext ctx);
	void exitUnsignedConstant(pascalGrammarParser.UnsignedConstantContext ctx);

	void enterStatements(pascalGrammarParser.StatementsContext ctx);
	void exitStatements(pascalGrammarParser.StatementsContext ctx);

	void enterSingleStatement(pascalGrammarParser.SingleStatementContext ctx);
	void exitSingleStatement(pascalGrammarParser.SingleStatementContext ctx);

	void enterProgramName(pascalGrammarParser.ProgramNameContext ctx);
	void exitProgramName(pascalGrammarParser.ProgramNameContext ctx);

	void enterCompoundStatement(pascalGrammarParser.CompoundStatementContext ctx);
	void exitCompoundStatement(pascalGrammarParser.CompoundStatementContext ctx);

	void enterAssignStatement(pascalGrammarParser.AssignStatementContext ctx);
	void exitAssignStatement(pascalGrammarParser.AssignStatementContext ctx);

	void enterFactor(pascalGrammarParser.FactorContext ctx);
	void exitFactor(pascalGrammarParser.FactorContext ctx);

	void enterVariables(pascalGrammarParser.VariablesContext ctx);
	void exitVariables(pascalGrammarParser.VariablesContext ctx);

	void enterWriteStatement(pascalGrammarParser.WriteStatementContext ctx);
	void exitWriteStatement(pascalGrammarParser.WriteStatementContext ctx);

	void enterIfStatement(pascalGrammarParser.IfStatementContext ctx);
	void exitIfStatement(pascalGrammarParser.IfStatementContext ctx);

	void enterEmptyStatement(pascalGrammarParser.EmptyStatementContext ctx);
	void exitEmptyStatement(pascalGrammarParser.EmptyStatementContext ctx);

	void enterStatement(pascalGrammarParser.StatementContext ctx);
	void exitStatement(pascalGrammarParser.StatementContext ctx);

	void enterSign(pascalGrammarParser.SignContext ctx);
	void exitSign(pascalGrammarParser.SignContext ctx);

	void enterWhileStatement(pascalGrammarParser.WhileStatementContext ctx);
	void exitWhileStatement(pascalGrammarParser.WhileStatementContext ctx);

	void enterTerm(pascalGrammarParser.TermContext ctx);
	void exitTerm(pascalGrammarParser.TermContext ctx);

	void enterString(pascalGrammarParser.StringContext ctx);
	void exitString(pascalGrammarParser.StringContext ctx);

	void enterSimpleExpression(pascalGrammarParser.SimpleExpressionContext ctx);
	void exitSimpleExpression(pascalGrammarParser.SimpleExpressionContext ctx);

	void enterVariable(pascalGrammarParser.VariableContext ctx);
	void exitVariable(pascalGrammarParser.VariableContext ctx);

	void enterAllProgram(pascalGrammarParser.AllProgramContext ctx);
	void exitAllProgram(pascalGrammarParser.AllProgramContext ctx);
}