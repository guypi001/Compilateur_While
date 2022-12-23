// $ANTLR null /home/guypi/Documents/Compilateur_While/projet.g 2022-12-23 01:13:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class projetParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BASE", "COMM", "DEF", "DO", "ELSE", 
		"FONC", "FOR", "FOREACH", "IF", "IN", "INPUT", "NIL", "OUTPUT", "READWRITE", 
		"SYM", "Symbol", "THEN", "VAR", "Variable", "WHILE", "WS", "'%'", "'('", 
		"')'", "','", "':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", 
		"'fi'", "'for'", "'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", 
		"'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int BASE=4;
	public static final int COMM=5;
	public static final int DEF=6;
	public static final int DO=7;
	public static final int ELSE=8;
	public static final int FONC=9;
	public static final int FOR=10;
	public static final int FOREACH=11;
	public static final int IF=12;
	public static final int IN=13;
	public static final int INPUT=14;
	public static final int NIL=15;
	public static final int OUTPUT=16;
	public static final int READWRITE=17;
	public static final int SYM=18;
	public static final int Symbol=19;
	public static final int THEN=20;
	public static final int VAR=21;
	public static final int Variable=22;
	public static final int WHILE=23;
	public static final int WS=24;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "commands", "start", "vari", "exprs", "input", "lExpr", 
		"symb", "vars", "expression", "inputSub", "command", "exprBase", "function", 
		"program", "definition", "output"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public projetParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public projetParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public projetParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return projetParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/guypi/Documents/Compilateur_While/projet.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/guypi/Documents/Compilateur_While/projet.g:27:1: program : function ( program )? ;
	public final projetParser.program_return program() throws RecognitionException {
		projetParser.program_return retval = new projetParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;
		ParserRuleReturnScope program2 =null;


		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:27:9: ( function ( program )? )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:28:3: function ( program )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(28,3);
			pushFollow(FOLLOW_function_in_program99);
			function1=function();
			state._fsp--;

			adaptor.addChild(root_0, function1.getTree());
			dbg.location(28,12);
			// /home/guypi/Documents/Compilateur_While/projet.g:28:12: ( program )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==39) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:28:12: program
					{
					dbg.location(28,12);
					pushFollow(FOLLOW_program_in_program101);
					program2=program();
					state._fsp--;

					adaptor.addChild(root_0, program2.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(28, 19);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// /home/guypi/Documents/Compilateur_While/projet.g:29:1: function : 'function' symb ':' definition -> ^( FONC symb definition ) ;
	public final projetParser.function_return function() throws RecognitionException {
		projetParser.function_return retval = new projetParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal3=null;
		Token char_literal5=null;
		ParserRuleReturnScope symb4 =null;
		ParserRuleReturnScope definition6 =null;

		Object string_literal3_tree=null;
		Object char_literal5_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
		RewriteRuleSubtreeStream stream_symb=new RewriteRuleSubtreeStream(adaptor,"rule symb");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:29:9: ( 'function' symb ':' definition -> ^( FONC symb definition ) )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:30:3: 'function' symb ':' definition
			{
			dbg.location(30,3);
			string_literal3=(Token)match(input,39,FOLLOW_39_in_function111);  
			stream_39.add(string_literal3);
			dbg.location(30,14);
			pushFollow(FOLLOW_symb_in_function113);
			symb4=symb();
			state._fsp--;

			stream_symb.add(symb4.getTree());dbg.location(30,19);
			char_literal5=(Token)match(input,29,FOLLOW_29_in_function115);  
			stream_29.add(char_literal5);
			dbg.location(30,23);
			pushFollow(FOLLOW_definition_in_function117);
			definition6=definition();
			state._fsp--;

			stream_definition.add(definition6.getTree());
			// AST REWRITE
			// elements: definition, symb
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 31:3: -> ^( FONC symb definition )
			{
				dbg.location(31,6);
				// /home/guypi/Documents/Compilateur_While/projet.g:31:6: ^( FONC symb definition )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(31,8);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FONC, "FONC"), root_1);
				dbg.location(31,13);
				adaptor.addChild(root_1, stream_symb.nextTree());dbg.location(31,18);
				adaptor.addChild(root_1, stream_definition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(32, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "function"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// /home/guypi/Documents/Compilateur_While/projet.g:33:1: definition : 'read' ( inputSub )? '%' commands '%' 'write' output -> ^( READWRITE ^( INPUT ( inputSub )? ) commands ^( OUTPUT output ) ) ;
	public final projetParser.definition_return definition() throws RecognitionException {
		projetParser.definition_return retval = new projetParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal7=null;
		Token char_literal9=null;
		Token char_literal11=null;
		Token string_literal12=null;
		ParserRuleReturnScope inputSub8 =null;
		ParserRuleReturnScope commands10 =null;
		ParserRuleReturnScope output13 =null;

		Object string_literal7_tree=null;
		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		Object string_literal12_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:34:3: ( 'read' ( inputSub )? '%' commands '%' 'write' output -> ^( READWRITE ^( INPUT ( inputSub )? ) commands ^( OUTPUT output ) ) )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:34:5: 'read' ( inputSub )? '%' commands '%' 'write' output
			{
			dbg.location(34,5);
			string_literal7=(Token)match(input,47,FOLLOW_47_in_definition141);  
			stream_47.add(string_literal7);
			dbg.location(34,12);
			// /home/guypi/Documents/Compilateur_While/projet.g:34:12: ( inputSub )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==Variable) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:34:12: inputSub
					{
					dbg.location(34,12);
					pushFollow(FOLLOW_inputSub_in_definition143);
					inputSub8=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub8.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(34,22);
			char_literal9=(Token)match(input,25,FOLLOW_25_in_definition146);  
			stream_25.add(char_literal9);
			dbg.location(34,26);
			pushFollow(FOLLOW_commands_in_definition148);
			commands10=commands();
			state._fsp--;

			stream_commands.add(commands10.getTree());dbg.location(34,35);
			char_literal11=(Token)match(input,25,FOLLOW_25_in_definition150);  
			stream_25.add(char_literal11);
			dbg.location(34,39);
			string_literal12=(Token)match(input,51,FOLLOW_51_in_definition152);  
			stream_51.add(string_literal12);
			dbg.location(34,47);
			pushFollow(FOLLOW_output_in_definition154);
			output13=output();
			state._fsp--;

			stream_output.add(output13.getTree());
			// AST REWRITE
			// elements: inputSub, commands, output
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 35:3: -> ^( READWRITE ^( INPUT ( inputSub )? ) commands ^( OUTPUT output ) )
			{
				dbg.location(35,8);
				// /home/guypi/Documents/Compilateur_While/projet.g:35:8: ^( READWRITE ^( INPUT ( inputSub )? ) commands ^( OUTPUT output ) )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(35,10);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READWRITE, "READWRITE"), root_1);
				dbg.location(35,21);
				// /home/guypi/Documents/Compilateur_While/projet.g:35:21: ^( INPUT ( inputSub )? )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(35,23);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_2);
				dbg.location(35,29);
				// /home/guypi/Documents/Compilateur_While/projet.g:35:29: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					dbg.location(35,29);
					adaptor.addChild(root_2, stream_inputSub.nextTree());
				}
				stream_inputSub.reset();

				adaptor.addChild(root_1, root_2);
				}
				dbg.location(35,40);
				adaptor.addChild(root_1, stream_commands.nextTree());dbg.location(35,49);
				// /home/guypi/Documents/Compilateur_While/projet.g:35:49: ^( OUTPUT output )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(35,51);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_2);
				dbg.location(35,58);
				adaptor.addChild(root_2, stream_output.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "definition"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// /home/guypi/Documents/Compilateur_While/projet.g:37:1: input : ( inputSub |);
	public final projetParser.input_return input() throws RecognitionException {
		projetParser.input_return retval = new projetParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub14 =null;


		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:37:8: ( inputSub |)
			int alt3=2;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==Variable) ) {
				alt3=1;
			}
			else if ( (LA3_0==EOF) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:38:3: inputSub
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(38,3);
					pushFollow(FOLLOW_inputSub_in_input196);
					inputSub14=inputSub();
					state._fsp--;

					adaptor.addChild(root_0, inputSub14.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/guypi/Documents/Compilateur_While/projet.g:38:13: 
					{
					root_0 = (Object)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(38, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "input"


	public static class inputSub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputSub"
	// /home/guypi/Documents/Compilateur_While/projet.g:39:1: inputSub : vari ( ',' inputSub )? -> ^( VAR ( vari )+ ) ;
	public final projetParser.inputSub_return inputSub() throws RecognitionException {
		projetParser.inputSub_return retval = new projetParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal16=null;
		ParserRuleReturnScope vari15 =null;
		ParserRuleReturnScope inputSub17 =null;

		Object char_literal16_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_vari=new RewriteRuleSubtreeStream(adaptor,"rule vari");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try { dbg.enterRule(getGrammarFileName(), "inputSub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:40:3: ( vari ( ',' inputSub )? -> ^( VAR ( vari )+ ) )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:40:5: vari ( ',' inputSub )?
			{
			dbg.location(40,5);
			pushFollow(FOLLOW_vari_in_inputSub207);
			vari15=vari();
			state._fsp--;

			stream_vari.add(vari15.getTree());dbg.location(40,10);
			// /home/guypi/Documents/Compilateur_While/projet.g:40:10: ( ',' inputSub )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==28) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:40:11: ',' inputSub
					{
					dbg.location(40,11);
					char_literal16=(Token)match(input,28,FOLLOW_28_in_inputSub210);  
					stream_28.add(char_literal16);
					dbg.location(40,15);
					pushFollow(FOLLOW_inputSub_in_inputSub212);
					inputSub17=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub17.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			// AST REWRITE
			// elements: vari
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 41:3: -> ^( VAR ( vari )+ )
			{
				dbg.location(41,6);
				// /home/guypi/Documents/Compilateur_While/projet.g:41:6: ^( VAR ( vari )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(41,8);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
				dbg.location(41,12);
				if ( !(stream_vari.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_vari.hasNext() ) {
					dbg.location(41,12);
					adaptor.addChild(root_1, stream_vari.nextTree());
				}
				stream_vari.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inputSub");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "inputSub"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// /home/guypi/Documents/Compilateur_While/projet.g:42:1: output : vari ( ',' output )? -> ^( VAR ( vari )+ ) ;
	public final projetParser.output_return output() throws RecognitionException {
		projetParser.output_return retval = new projetParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal19=null;
		ParserRuleReturnScope vari18 =null;
		ParserRuleReturnScope output20 =null;

		Object char_literal19_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_vari=new RewriteRuleSubtreeStream(adaptor,"rule vari");

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:42:8: ( vari ( ',' output )? -> ^( VAR ( vari )+ ) )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:43:3: vari ( ',' output )?
			{
			dbg.location(43,3);
			pushFollow(FOLLOW_vari_in_output236);
			vari18=vari();
			state._fsp--;

			stream_vari.add(vari18.getTree());dbg.location(43,8);
			// /home/guypi/Documents/Compilateur_While/projet.g:43:8: ( ',' output )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==28) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:43:9: ',' output
					{
					dbg.location(43,9);
					char_literal19=(Token)match(input,28,FOLLOW_28_in_output239);  
					stream_28.add(char_literal19);
					dbg.location(43,13);
					pushFollow(FOLLOW_output_in_output241);
					output20=output();
					state._fsp--;

					stream_output.add(output20.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			// AST REWRITE
			// elements: vari
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 44:3: -> ^( VAR ( vari )+ )
			{
				dbg.location(44,6);
				// /home/guypi/Documents/Compilateur_While/projet.g:44:6: ^( VAR ( vari )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(44,8);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
				dbg.location(44,12);
				if ( !(stream_vari.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_vari.hasNext() ) {
					dbg.location(44,12);
					adaptor.addChild(root_1, stream_vari.nextTree());
				}
				stream_vari.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(44, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "output");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "output"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// /home/guypi/Documents/Compilateur_While/projet.g:45:1: commands : command ( ';' commands )? -> ^( COMM ( command )+ ) ;
	public final projetParser.commands_return commands() throws RecognitionException {
		projetParser.commands_return retval = new projetParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal22=null;
		ParserRuleReturnScope command21 =null;
		ParserRuleReturnScope commands23 =null;

		Object char_literal22_tree=null;
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:45:9: ( command ( ';' commands )? -> ^( COMM ( command )+ ) )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:46:3: command ( ';' commands )?
			{
			dbg.location(46,3);
			pushFollow(FOLLOW_command_in_commands264);
			command21=command();
			state._fsp--;

			stream_command.add(command21.getTree());dbg.location(46,11);
			// /home/guypi/Documents/Compilateur_While/projet.g:46:11: ( ';' commands )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==31) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:46:12: ';' commands
					{
					dbg.location(46,12);
					char_literal22=(Token)match(input,31,FOLLOW_31_in_commands267);  
					stream_31.add(char_literal22);
					dbg.location(46,16);
					pushFollow(FOLLOW_commands_in_commands269);
					commands23=commands();
					state._fsp--;

					stream_commands.add(commands23.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

			// AST REWRITE
			// elements: command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 47:3: -> ^( COMM ( command )+ )
			{
				dbg.location(47,6);
				// /home/guypi/Documents/Compilateur_While/projet.g:47:6: ^( COMM ( command )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(47,8);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMM, "COMM"), root_1);
				dbg.location(47,13);
				if ( !(stream_command.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_command.hasNext() ) {
					dbg.location(47,13);
					adaptor.addChild(root_1, stream_command.nextTree());
				}
				stream_command.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(47, 22);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "commands");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "commands"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// /home/guypi/Documents/Compilateur_While/projet.g:48:1: command : ( 'nop' -> ^( NIL ) | vars ':=' exprs -> ^( ':=' vars exprs ) | 'foreach' vari 'in' expression 'do' commands 'od' -> ^( FOREACH vari ^( IN expression ) ^( DO commands ) ) | 'if' expression 'then' commands ( 'else' commands )? 'fi' -> ^( IF ^( THEN expression ) ^( ELSE ( commands )? ) ) | 'while' expression 'do' commands 'od' -> ^( WHILE expression ^( DO commands ) ) | 'for' expression 'do' commands 'od' -> ^( FOR expression ^( DO commands ) ) );
	public final projetParser.command_return command() throws RecognitionException {
		projetParser.command_return retval = new projetParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal24=null;
		Token string_literal26=null;
		Token string_literal28=null;
		Token string_literal30=null;
		Token string_literal32=null;
		Token string_literal34=null;
		Token string_literal35=null;
		Token string_literal37=null;
		Token string_literal39=null;
		Token string_literal41=null;
		Token string_literal42=null;
		Token string_literal44=null;
		Token string_literal46=null;
		Token string_literal47=null;
		Token string_literal49=null;
		Token string_literal51=null;
		ParserRuleReturnScope vars25 =null;
		ParserRuleReturnScope exprs27 =null;
		ParserRuleReturnScope vari29 =null;
		ParserRuleReturnScope expression31 =null;
		ParserRuleReturnScope commands33 =null;
		ParserRuleReturnScope expression36 =null;
		ParserRuleReturnScope commands38 =null;
		ParserRuleReturnScope commands40 =null;
		ParserRuleReturnScope expression43 =null;
		ParserRuleReturnScope commands45 =null;
		ParserRuleReturnScope expression48 =null;
		ParserRuleReturnScope commands50 =null;

		Object string_literal24_tree=null;
		Object string_literal26_tree=null;
		Object string_literal28_tree=null;
		Object string_literal30_tree=null;
		Object string_literal32_tree=null;
		Object string_literal34_tree=null;
		Object string_literal35_tree=null;
		Object string_literal37_tree=null;
		Object string_literal39_tree=null;
		Object string_literal41_tree=null;
		Object string_literal42_tree=null;
		Object string_literal44_tree=null;
		Object string_literal46_tree=null;
		Object string_literal47_tree=null;
		Object string_literal49_tree=null;
		Object string_literal51_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_vari=new RewriteRuleSubtreeStream(adaptor,"rule vari");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:48:9: ( 'nop' -> ^( NIL ) | vars ':=' exprs -> ^( ':=' vars exprs ) | 'foreach' vari 'in' expression 'do' commands 'od' -> ^( FOREACH vari ^( IN expression ) ^( DO commands ) ) | 'if' expression 'then' commands ( 'else' commands )? 'fi' -> ^( IF ^( THEN expression ) ^( ELSE ( commands )? ) ) | 'while' expression 'do' commands 'od' -> ^( WHILE expression ^( DO commands ) ) | 'for' expression 'do' commands 'od' -> ^( FOR expression ^( DO commands ) ) )
			int alt8=6;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			switch ( input.LA(1) ) {
			case 45:
				{
				alt8=1;
				}
				break;
			case Variable:
				{
				alt8=2;
				}
				break;
			case 38:
				{
				alt8=3;
				}
				break;
			case 41:
				{
				alt8=4;
				}
				break;
			case 50:
				{
				alt8=5;
				}
				break;
			case 37:
				{
				alt8=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:49:3: 'nop'
					{
					dbg.location(49,3);
					string_literal24=(Token)match(input,45,FOLLOW_45_in_command293);  
					stream_45.add(string_literal24);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 49:9: -> ^( NIL )
					{
						dbg.location(49,12);
						// /home/guypi/Documents/Compilateur_While/projet.g:49:12: ^( NIL )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(49,15);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NIL, "NIL"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/guypi/Documents/Compilateur_While/projet.g:50:6: vars ':=' exprs
					{
					dbg.location(50,6);
					pushFollow(FOLLOW_vars_in_command308);
					vars25=vars();
					state._fsp--;

					stream_vars.add(vars25.getTree());dbg.location(50,11);
					string_literal26=(Token)match(input,30,FOLLOW_30_in_command310);  
					stream_30.add(string_literal26);
					dbg.location(50,16);
					pushFollow(FOLLOW_exprs_in_command312);
					exprs27=exprs();
					state._fsp--;

					stream_exprs.add(exprs27.getTree());
					// AST REWRITE
					// elements: 30, exprs, vars
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 50:21: -> ^( ':=' vars exprs )
					{
						dbg.location(50,24);
						// /home/guypi/Documents/Compilateur_While/projet.g:50:24: ^( ':=' vars exprs )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(50,26);
						root_1 = (Object)adaptor.becomeRoot(stream_30.nextNode(), root_1);
						dbg.location(50,31);
						adaptor.addChild(root_1, stream_vars.nextTree());dbg.location(50,36);
						adaptor.addChild(root_1, stream_exprs.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/guypi/Documents/Compilateur_While/projet.g:52:3: 'foreach' vari 'in' expression 'do' commands 'od'
					{
					dbg.location(52,3);
					string_literal28=(Token)match(input,38,FOLLOW_38_in_command331);  
					stream_38.add(string_literal28);
					dbg.location(52,13);
					pushFollow(FOLLOW_vari_in_command333);
					vari29=vari();
					state._fsp--;

					stream_vari.add(vari29.getTree());dbg.location(52,18);
					string_literal30=(Token)match(input,42,FOLLOW_42_in_command335);  
					stream_42.add(string_literal30);
					dbg.location(52,23);
					pushFollow(FOLLOW_expression_in_command337);
					expression31=expression();
					state._fsp--;

					stream_expression.add(expression31.getTree());dbg.location(52,34);
					string_literal32=(Token)match(input,34,FOLLOW_34_in_command339);  
					stream_34.add(string_literal32);
					dbg.location(52,39);
					pushFollow(FOLLOW_commands_in_command341);
					commands33=commands();
					state._fsp--;

					stream_commands.add(commands33.getTree());dbg.location(52,48);
					string_literal34=(Token)match(input,46,FOLLOW_46_in_command343);  
					stream_46.add(string_literal34);

					// AST REWRITE
					// elements: expression, vari, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 52:53: -> ^( FOREACH vari ^( IN expression ) ^( DO commands ) )
					{
						dbg.location(52,56);
						// /home/guypi/Documents/Compilateur_While/projet.g:52:56: ^( FOREACH vari ^( IN expression ) ^( DO commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(52,58);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
						dbg.location(52,66);
						adaptor.addChild(root_1, stream_vari.nextTree());dbg.location(52,72);
						// /home/guypi/Documents/Compilateur_While/projet.g:52:72: ^( IN expression )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(52,74);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
						dbg.location(52,78);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(52,90);
						// /home/guypi/Documents/Compilateur_While/projet.g:52:90: ^( DO commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(52,92);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
						dbg.location(52,95);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/guypi/Documents/Compilateur_While/projet.g:53:3: 'if' expression 'then' commands ( 'else' commands )? 'fi'
					{
					dbg.location(53,3);
					string_literal35=(Token)match(input,41,FOLLOW_41_in_command371);  
					stream_41.add(string_literal35);
					dbg.location(53,8);
					pushFollow(FOLLOW_expression_in_command373);
					expression36=expression();
					state._fsp--;

					stream_expression.add(expression36.getTree());dbg.location(53,19);
					string_literal37=(Token)match(input,48,FOLLOW_48_in_command375);  
					stream_48.add(string_literal37);
					dbg.location(53,26);
					pushFollow(FOLLOW_commands_in_command377);
					commands38=commands();
					state._fsp--;

					stream_commands.add(commands38.getTree());dbg.location(53,35);
					// /home/guypi/Documents/Compilateur_While/projet.g:53:35: ( 'else' commands )?
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( (LA7_0==35) ) {
						alt7=1;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /home/guypi/Documents/Compilateur_While/projet.g:53:36: 'else' commands
							{
							dbg.location(53,36);
							string_literal39=(Token)match(input,35,FOLLOW_35_in_command380);  
							stream_35.add(string_literal39);
							dbg.location(53,43);
							pushFollow(FOLLOW_commands_in_command382);
							commands40=commands();
							state._fsp--;

							stream_commands.add(commands40.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(53,54);
					string_literal41=(Token)match(input,36,FOLLOW_36_in_command386);  
					stream_36.add(string_literal41);

					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 53:59: -> ^( IF ^( THEN expression ) ^( ELSE ( commands )? ) )
					{
						dbg.location(53,63);
						// /home/guypi/Documents/Compilateur_While/projet.g:53:63: ^( IF ^( THEN expression ) ^( ELSE ( commands )? ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(53,65);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
						dbg.location(53,68);
						// /home/guypi/Documents/Compilateur_While/projet.g:53:68: ^( THEN expression )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(53,70);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_2);
						dbg.location(53,75);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}
						dbg.location(53,89);
						// /home/guypi/Documents/Compilateur_While/projet.g:53:89: ^( ELSE ( commands )? )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(53,91);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_2);
						dbg.location(53,96);
						// /home/guypi/Documents/Compilateur_While/projet.g:53:96: ( commands )?
						if ( stream_commands.hasNext() ) {
							dbg.location(53,96);
							adaptor.addChild(root_2, stream_commands.nextTree());
						}
						stream_commands.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/guypi/Documents/Compilateur_While/projet.g:54:3: 'while' expression 'do' commands 'od'
					{
					dbg.location(54,3);
					string_literal42=(Token)match(input,50,FOLLOW_50_in_command413);  
					stream_50.add(string_literal42);
					dbg.location(54,11);
					pushFollow(FOLLOW_expression_in_command415);
					expression43=expression();
					state._fsp--;

					stream_expression.add(expression43.getTree());dbg.location(54,22);
					string_literal44=(Token)match(input,34,FOLLOW_34_in_command417);  
					stream_34.add(string_literal44);
					dbg.location(54,27);
					pushFollow(FOLLOW_commands_in_command419);
					commands45=commands();
					state._fsp--;

					stream_commands.add(commands45.getTree());dbg.location(54,36);
					string_literal46=(Token)match(input,46,FOLLOW_46_in_command421);  
					stream_46.add(string_literal46);

					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 54:41: -> ^( WHILE expression ^( DO commands ) )
					{
						dbg.location(54,44);
						// /home/guypi/Documents/Compilateur_While/projet.g:54:44: ^( WHILE expression ^( DO commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(54,46);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
						dbg.location(54,52);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(54,63);
						// /home/guypi/Documents/Compilateur_While/projet.g:54:63: ^( DO commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(54,65);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
						dbg.location(54,68);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/guypi/Documents/Compilateur_While/projet.g:55:3: 'for' expression 'do' commands 'od'
					{
					dbg.location(55,3);
					string_literal47=(Token)match(input,37,FOLLOW_37_in_command440);  
					stream_37.add(string_literal47);
					dbg.location(55,9);
					pushFollow(FOLLOW_expression_in_command442);
					expression48=expression();
					state._fsp--;

					stream_expression.add(expression48.getTree());dbg.location(55,20);
					string_literal49=(Token)match(input,34,FOLLOW_34_in_command444);  
					stream_34.add(string_literal49);
					dbg.location(55,25);
					pushFollow(FOLLOW_commands_in_command446);
					commands50=commands();
					state._fsp--;

					stream_commands.add(commands50.getTree());dbg.location(55,34);
					string_literal51=(Token)match(input,46,FOLLOW_46_in_command448);  
					stream_46.add(string_literal51);

					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 55:38: -> ^( FOR expression ^( DO commands ) )
					{
						dbg.location(55,42);
						// /home/guypi/Documents/Compilateur_While/projet.g:55:42: ^( FOR expression ^( DO commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(55,44);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						dbg.location(55,48);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(55,60);
						// /home/guypi/Documents/Compilateur_While/projet.g:55:60: ^( DO commands )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(55,63);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_2);
						dbg.location(55,66);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(55, 75);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "command"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// /home/guypi/Documents/Compilateur_While/projet.g:56:1: vars : vari ( ',' vars )? -> ^( VAR ( vari )+ ) ;
	public final projetParser.vars_return vars() throws RecognitionException {
		projetParser.vars_return retval = new projetParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal53=null;
		ParserRuleReturnScope vari52 =null;
		ParserRuleReturnScope vars54 =null;

		Object char_literal53_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_vari=new RewriteRuleSubtreeStream(adaptor,"rule vari");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:56:6: ( vari ( ',' vars )? -> ^( VAR ( vari )+ ) )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:57:4: vari ( ',' vars )?
			{
			dbg.location(57,4);
			pushFollow(FOLLOW_vari_in_vars474);
			vari52=vari();
			state._fsp--;

			stream_vari.add(vari52.getTree());dbg.location(57,9);
			// /home/guypi/Documents/Compilateur_While/projet.g:57:9: ( ',' vars )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==28) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:57:10: ',' vars
					{
					dbg.location(57,10);
					char_literal53=(Token)match(input,28,FOLLOW_28_in_vars477);  
					stream_28.add(char_literal53);
					dbg.location(57,14);
					pushFollow(FOLLOW_vars_in_vars479);
					vars54=vars();
					state._fsp--;

					stream_vars.add(vars54.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			// AST REWRITE
			// elements: vari
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 57:21: -> ^( VAR ( vari )+ )
			{
				dbg.location(57,24);
				// /home/guypi/Documents/Compilateur_While/projet.g:57:24: ^( VAR ( vari )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(57,26);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
				dbg.location(57,30);
				if ( !(stream_vari.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_vari.hasNext() ) {
					dbg.location(57,30);
					adaptor.addChild(root_1, stream_vari.nextTree());
				}
				stream_vari.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(57, 36);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vars");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// /home/guypi/Documents/Compilateur_While/projet.g:58:1: exprs : expression ( ',' exprs )? ;
	public final projetParser.exprs_return exprs() throws RecognitionException {
		projetParser.exprs_return retval = new projetParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal56=null;
		ParserRuleReturnScope expression55 =null;
		ParserRuleReturnScope exprs57 =null;

		Object char_literal56_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:58:7: ( expression ( ',' exprs )? )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:59:3: expression ( ',' exprs )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(59,3);
			pushFollow(FOLLOW_expression_in_exprs501);
			expression55=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression55.getTree());
			dbg.location(59,14);
			// /home/guypi/Documents/Compilateur_While/projet.g:59:14: ( ',' exprs )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==28) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:59:15: ',' exprs
					{
					dbg.location(59,15);
					char_literal56=(Token)match(input,28,FOLLOW_28_in_exprs504); 
					char_literal56_tree = (Object)adaptor.create(char_literal56);
					adaptor.addChild(root_0, char_literal56_tree);
					dbg.location(59,19);
					pushFollow(FOLLOW_exprs_in_exprs506);
					exprs57=exprs();
					state._fsp--;

					adaptor.addChild(root_0, exprs57.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(59, 25);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprs"


	public static class exprBase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// /home/guypi/Documents/Compilateur_While/projet.g:60:1: exprBase : ( 'nil' -> ^( NIL ) | vari -> ^( VAR vari ) | symb -> ^( SYM symb ) | '(' 'cons' lExpr ')' -> ^( BASE lExpr ) | '(' 'list' lExpr ')' -> ^( BASE lExpr ) | '(' 'hd' exprBase ')' -> ^( BASE exprBase ) | '(' 'tl' exprBase ')' -> ^( BASE exprBase ) | ( '(' symb ( exprBase )? ')' ) -> ^( BASE symb ( exprBase )? ) );
	public final projetParser.exprBase_return exprBase() throws RecognitionException {
		projetParser.exprBase_return retval = new projetParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal58=null;
		Token char_literal61=null;
		Token string_literal62=null;
		Token char_literal64=null;
		Token char_literal65=null;
		Token string_literal66=null;
		Token char_literal68=null;
		Token char_literal69=null;
		Token string_literal70=null;
		Token char_literal72=null;
		Token char_literal73=null;
		Token string_literal74=null;
		Token char_literal76=null;
		Token char_literal77=null;
		Token char_literal80=null;
		ParserRuleReturnScope vari59 =null;
		ParserRuleReturnScope symb60 =null;
		ParserRuleReturnScope lExpr63 =null;
		ParserRuleReturnScope lExpr67 =null;
		ParserRuleReturnScope exprBase71 =null;
		ParserRuleReturnScope exprBase75 =null;
		ParserRuleReturnScope symb78 =null;
		ParserRuleReturnScope exprBase79 =null;

		Object string_literal58_tree=null;
		Object char_literal61_tree=null;
		Object string_literal62_tree=null;
		Object char_literal64_tree=null;
		Object char_literal65_tree=null;
		Object string_literal66_tree=null;
		Object char_literal68_tree=null;
		Object char_literal69_tree=null;
		Object string_literal70_tree=null;
		Object char_literal72_tree=null;
		Object char_literal73_tree=null;
		Object string_literal74_tree=null;
		Object char_literal76_tree=null;
		Object char_literal77_tree=null;
		Object char_literal80_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");
		RewriteRuleSubtreeStream stream_vari=new RewriteRuleSubtreeStream(adaptor,"rule vari");
		RewriteRuleSubtreeStream stream_symb=new RewriteRuleSubtreeStream(adaptor,"rule symb");

		try { dbg.enterRule(getGrammarFileName(), "exprBase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:60:9: ( 'nil' -> ^( NIL ) | vari -> ^( VAR vari ) | symb -> ^( SYM symb ) | '(' 'cons' lExpr ')' -> ^( BASE lExpr ) | '(' 'list' lExpr ')' -> ^( BASE lExpr ) | '(' 'hd' exprBase ')' -> ^( BASE exprBase ) | '(' 'tl' exprBase ')' -> ^( BASE exprBase ) | ( '(' symb ( exprBase )? ')' ) -> ^( BASE symb ( exprBase )? ) )
			int alt12=8;
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			switch ( input.LA(1) ) {
			case 44:
				{
				alt12=1;
				}
				break;
			case Variable:
				{
				alt12=2;
				}
				break;
			case Symbol:
				{
				alt12=3;
				}
				break;
			case 26:
				{
				switch ( input.LA(2) ) {
				case 33:
					{
					alt12=4;
					}
					break;
				case 43:
					{
					alt12=5;
					}
					break;
				case 40:
					{
					alt12=6;
					}
					break;
				case 49:
					{
					alt12=7;
					}
					break;
				case Symbol:
					{
					alt12=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 4, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:61:3: 'nil'
					{
					dbg.location(61,3);
					string_literal58=(Token)match(input,44,FOLLOW_44_in_exprBase517);  
					stream_44.add(string_literal58);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 61:9: -> ^( NIL )
					{
						dbg.location(61,12);
						// /home/guypi/Documents/Compilateur_While/projet.g:61:12: ^( NIL )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(61,14);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NIL, "NIL"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/guypi/Documents/Compilateur_While/projet.g:62:5: vari
					{
					dbg.location(62,5);
					pushFollow(FOLLOW_vari_in_exprBase529);
					vari59=vari();
					state._fsp--;

					stream_vari.add(vari59.getTree());
					// AST REWRITE
					// elements: vari
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 62:10: -> ^( VAR vari )
					{
						dbg.location(62,13);
						// /home/guypi/Documents/Compilateur_While/projet.g:62:13: ^( VAR vari )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(62,15);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						dbg.location(62,19);
						adaptor.addChild(root_1, stream_vari.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/guypi/Documents/Compilateur_While/projet.g:63:5: symb
					{
					dbg.location(63,5);
					pushFollow(FOLLOW_symb_in_exprBase544);
					symb60=symb();
					state._fsp--;

					stream_symb.add(symb60.getTree());
					// AST REWRITE
					// elements: symb
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 63:10: -> ^( SYM symb )
					{
						dbg.location(63,13);
						// /home/guypi/Documents/Compilateur_While/projet.g:63:13: ^( SYM symb )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(63,15);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYM, "SYM"), root_1);
						dbg.location(63,19);
						adaptor.addChild(root_1, stream_symb.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/guypi/Documents/Compilateur_While/projet.g:64:3: '(' 'cons' lExpr ')'
					{
					dbg.location(64,3);
					char_literal61=(Token)match(input,26,FOLLOW_26_in_exprBase558);  
					stream_26.add(char_literal61);
					dbg.location(64,7);
					string_literal62=(Token)match(input,33,FOLLOW_33_in_exprBase560);  
					stream_33.add(string_literal62);
					dbg.location(64,14);
					pushFollow(FOLLOW_lExpr_in_exprBase562);
					lExpr63=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr63.getTree());dbg.location(64,20);
					char_literal64=(Token)match(input,27,FOLLOW_27_in_exprBase564);  
					stream_27.add(char_literal64);

					// AST REWRITE
					// elements: lExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 64:24: -> ^( BASE lExpr )
					{
						dbg.location(64,27);
						// /home/guypi/Documents/Compilateur_While/projet.g:64:27: ^( BASE lExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(64,29);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BASE, "BASE"), root_1);
						dbg.location(64,34);
						adaptor.addChild(root_1, stream_lExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/guypi/Documents/Compilateur_While/projet.g:65:5: '(' 'list' lExpr ')'
					{
					dbg.location(65,5);
					char_literal65=(Token)match(input,26,FOLLOW_26_in_exprBase579);  
					stream_26.add(char_literal65);
					dbg.location(65,9);
					string_literal66=(Token)match(input,43,FOLLOW_43_in_exprBase581);  
					stream_43.add(string_literal66);
					dbg.location(65,16);
					pushFollow(FOLLOW_lExpr_in_exprBase583);
					lExpr67=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr67.getTree());dbg.location(65,22);
					char_literal68=(Token)match(input,27,FOLLOW_27_in_exprBase585);  
					stream_27.add(char_literal68);

					// AST REWRITE
					// elements: lExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 65:26: -> ^( BASE lExpr )
					{
						dbg.location(65,29);
						// /home/guypi/Documents/Compilateur_While/projet.g:65:29: ^( BASE lExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(65,31);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BASE, "BASE"), root_1);
						dbg.location(65,36);
						adaptor.addChild(root_1, stream_lExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/guypi/Documents/Compilateur_While/projet.g:67:3: '(' 'hd' exprBase ')'
					{
					dbg.location(67,3);
					char_literal69=(Token)match(input,26,FOLLOW_26_in_exprBase602);  
					stream_26.add(char_literal69);
					dbg.location(67,7);
					string_literal70=(Token)match(input,40,FOLLOW_40_in_exprBase604);  
					stream_40.add(string_literal70);
					dbg.location(67,12);
					pushFollow(FOLLOW_exprBase_in_exprBase606);
					exprBase71=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase71.getTree());dbg.location(67,21);
					char_literal72=(Token)match(input,27,FOLLOW_27_in_exprBase608);  
					stream_27.add(char_literal72);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 67:25: -> ^( BASE exprBase )
					{
						dbg.location(67,28);
						// /home/guypi/Documents/Compilateur_While/projet.g:67:28: ^( BASE exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(67,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BASE, "BASE"), root_1);
						dbg.location(67,35);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/guypi/Documents/Compilateur_While/projet.g:68:5: '(' 'tl' exprBase ')'
					{
					dbg.location(68,5);
					char_literal73=(Token)match(input,26,FOLLOW_26_in_exprBase623);  
					stream_26.add(char_literal73);
					dbg.location(68,9);
					string_literal74=(Token)match(input,49,FOLLOW_49_in_exprBase625);  
					stream_49.add(string_literal74);
					dbg.location(68,14);
					pushFollow(FOLLOW_exprBase_in_exprBase627);
					exprBase75=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase75.getTree());dbg.location(68,23);
					char_literal76=(Token)match(input,27,FOLLOW_27_in_exprBase629);  
					stream_27.add(char_literal76);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 68:26: -> ^( BASE exprBase )
					{
						dbg.location(68,29);
						// /home/guypi/Documents/Compilateur_While/projet.g:68:29: ^( BASE exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(68,31);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BASE, "BASE"), root_1);
						dbg.location(68,37);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/guypi/Documents/Compilateur_While/projet.g:69:3: ( '(' symb ( exprBase )? ')' )
					{
					dbg.location(69,3);
					// /home/guypi/Documents/Compilateur_While/projet.g:69:3: ( '(' symb ( exprBase )? ')' )
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:69:4: '(' symb ( exprBase )? ')'
					{
					dbg.location(69,4);
					char_literal77=(Token)match(input,26,FOLLOW_26_in_exprBase643);  
					stream_26.add(char_literal77);
					dbg.location(69,8);
					pushFollow(FOLLOW_symb_in_exprBase645);
					symb78=symb();
					state._fsp--;

					stream_symb.add(symb78.getTree());dbg.location(69,13);
					// /home/guypi/Documents/Compilateur_While/projet.g:69:13: ( exprBase )?
					int alt11=2;
					try { dbg.enterSubRule(11);
					try { dbg.enterDecision(11, decisionCanBacktrack[11]);

					int LA11_0 = input.LA(1);
					if ( (LA11_0==Symbol||LA11_0==Variable||LA11_0==26||LA11_0==44) ) {
						alt11=1;
					}
					} finally {dbg.exitDecision(11);}

					switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// /home/guypi/Documents/Compilateur_While/projet.g:69:13: exprBase
							{
							dbg.location(69,13);
							pushFollow(FOLLOW_exprBase_in_exprBase647);
							exprBase79=exprBase();
							state._fsp--;

							stream_exprBase.add(exprBase79.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(69,23);
					char_literal80=(Token)match(input,27,FOLLOW_27_in_exprBase650);  
					stream_27.add(char_literal80);

					}

					// AST REWRITE
					// elements: exprBase, symb
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 69:28: -> ^( BASE symb ( exprBase )? )
					{
						dbg.location(69,31);
						// /home/guypi/Documents/Compilateur_While/projet.g:69:31: ^( BASE symb ( exprBase )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(69,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BASE, "BASE"), root_1);
						dbg.location(69,38);
						adaptor.addChild(root_1, stream_symb.nextTree());dbg.location(69,43);
						// /home/guypi/Documents/Compilateur_While/projet.g:69:43: ( exprBase )?
						if ( stream_exprBase.hasNext() ) {
							dbg.location(69,43);
							adaptor.addChild(root_1, stream_exprBase.nextTree());
						}
						stream_exprBase.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(70, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprBase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprBase"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/guypi/Documents/Compilateur_While/projet.g:71:1: expression : exprBase ( '=?' exprBase )? ;
	public final projetParser.expression_return expression() throws RecognitionException {
		projetParser.expression_return retval = new projetParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal82=null;
		ParserRuleReturnScope exprBase81 =null;
		ParserRuleReturnScope exprBase83 =null;

		Object string_literal82_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:72:3: ( exprBase ( '=?' exprBase )? )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:72:5: exprBase ( '=?' exprBase )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(72,5);
			pushFollow(FOLLOW_exprBase_in_expression675);
			exprBase81=exprBase();
			state._fsp--;

			adaptor.addChild(root_0, exprBase81.getTree());
			dbg.location(72,14);
			// /home/guypi/Documents/Compilateur_While/projet.g:72:14: ( '=?' exprBase )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==32) ) {
				alt13=1;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:72:15: '=?' exprBase
					{
					dbg.location(72,15);
					string_literal82=(Token)match(input,32,FOLLOW_32_in_expression678); 
					string_literal82_tree = (Object)adaptor.create(string_literal82);
					adaptor.addChild(root_0, string_literal82_tree);
					dbg.location(72,20);
					pushFollow(FOLLOW_exprBase_in_expression680);
					exprBase83=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase83.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(74, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression"


	public static class lExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lExpr"
	// /home/guypi/Documents/Compilateur_While/projet.g:75:1: lExpr : ( exprBase )* ;
	public final projetParser.lExpr_return lExpr() throws RecognitionException {
		projetParser.lExpr_return retval = new projetParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprBase84 =null;


		try { dbg.enterRule(getGrammarFileName(), "lExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:75:7: ( ( exprBase )* )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:76:3: ( exprBase )*
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(76,3);
			// /home/guypi/Documents/Compilateur_While/projet.g:76:3: ( exprBase )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=2;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==Symbol||LA14_0==Variable||LA14_0==26||LA14_0==44) ) {
					alt14=1;
				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /home/guypi/Documents/Compilateur_While/projet.g:76:3: exprBase
					{
					dbg.location(76,3);
					pushFollow(FOLLOW_exprBase_in_lExpr698);
					exprBase84=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase84.getTree());

					}
					break;

				default :
					break loop14;
				}
			}
			} finally {dbg.exitSubRule(14);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(76, 11);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "lExpr"


	public static class symb_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "symb"
	// /home/guypi/Documents/Compilateur_While/projet.g:78:1: symb : Symbol ;
	public final projetParser.symb_return symb() throws RecognitionException {
		projetParser.symb_return retval = new projetParser.symb_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Symbol85=null;

		Object Symbol85_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "symb");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:78:6: ( Symbol )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:78:8: Symbol
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(78,8);
			Symbol85=(Token)match(input,Symbol,FOLLOW_Symbol_in_symb709); 
			Symbol85_tree = (Object)adaptor.create(Symbol85);
			adaptor.addChild(root_0, Symbol85_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(78, 13);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "symb");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "symb"


	public static class vari_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vari"
	// /home/guypi/Documents/Compilateur_While/projet.g:80:1: vari : Variable ;
	public final projetParser.vari_return vari() throws RecognitionException {
		projetParser.vari_return retval = new projetParser.vari_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable86=null;

		Object Variable86_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "vari");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:80:6: ( Variable )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:80:8: Variable
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(80,8);
			Variable86=(Token)match(input,Variable,FOLLOW_Variable_in_vari717); 
			Variable86_tree = (Object)adaptor.create(Variable86);
			adaptor.addChild(root_0, Variable86_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(80, 15);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vari");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vari"


	public static class start_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "start"
	// /home/guypi/Documents/Compilateur_While/projet.g:92:1: start : program ;
	public final projetParser.start_return start() throws RecognitionException {
		projetParser.start_return retval = new projetParser.start_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program87 =null;


		try { dbg.enterRule(getGrammarFileName(), "start");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// /home/guypi/Documents/Compilateur_While/projet.g:92:7: ( program )
			dbg.enterAlt(1);

			// /home/guypi/Documents/Compilateur_While/projet.g:92:9: program
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(92,9);
			pushFollow(FOLLOW_program_in_start857);
			program87=program();
			state._fsp--;

			adaptor.addChild(root_0, program87.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(92, 15);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "start");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "start"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program99 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_program_in_program101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_function111 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_symb_in_function113 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_function115 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_definition_in_function117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_definition141 = new BitSet(new long[]{0x0000000002400000L});
	public static final BitSet FOLLOW_inputSub_in_definition143 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_definition146 = new BitSet(new long[]{0x0004226000400000L});
	public static final BitSet FOLLOW_commands_in_definition148 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_definition150 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_definition152 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_output_in_definition154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vari_in_inputSub207 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_inputSub210 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vari_in_output236 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_output239 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_output_in_output241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands264 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_commands267 = new BitSet(new long[]{0x0004226000400000L});
	public static final BitSet FOLLOW_commands_in_commands269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_command293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command308 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_command310 = new BitSet(new long[]{0x0000100004480000L});
	public static final BitSet FOLLOW_exprs_in_command312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_command331 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_vari_in_command333 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_command335 = new BitSet(new long[]{0x0000100004480000L});
	public static final BitSet FOLLOW_expression_in_command337 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_command339 = new BitSet(new long[]{0x0004226000400000L});
	public static final BitSet FOLLOW_commands_in_command341 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_command371 = new BitSet(new long[]{0x0000100004480000L});
	public static final BitSet FOLLOW_expression_in_command373 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command375 = new BitSet(new long[]{0x0004226000400000L});
	public static final BitSet FOLLOW_commands_in_command377 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_35_in_command380 = new BitSet(new long[]{0x0004226000400000L});
	public static final BitSet FOLLOW_commands_in_command382 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_command386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_command413 = new BitSet(new long[]{0x0000100004480000L});
	public static final BitSet FOLLOW_expression_in_command415 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_command417 = new BitSet(new long[]{0x0004226000400000L});
	public static final BitSet FOLLOW_commands_in_command419 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_command440 = new BitSet(new long[]{0x0000100004480000L});
	public static final BitSet FOLLOW_expression_in_command442 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_command444 = new BitSet(new long[]{0x0004226000400000L});
	public static final BitSet FOLLOW_commands_in_command446 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vari_in_vars474 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_vars477 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_vars_in_vars479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs501 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_exprs504 = new BitSet(new long[]{0x0000100004480000L});
	public static final BitSet FOLLOW_exprs_in_exprs506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_exprBase517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vari_in_exprBase529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symb_in_exprBase544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprBase558 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_exprBase560 = new BitSet(new long[]{0x000010000C480000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase562 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprBase564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprBase579 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_exprBase581 = new BitSet(new long[]{0x000010000C480000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase583 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprBase585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprBase602 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprBase604 = new BitSet(new long[]{0x0000100004480000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase606 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprBase608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprBase623 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_exprBase625 = new BitSet(new long[]{0x0000100004480000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase627 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprBase629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprBase643 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_symb_in_exprBase645 = new BitSet(new long[]{0x000010000C480000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase647 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprBase650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression675 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_expression678 = new BitSet(new long[]{0x0000100004480000L});
	public static final BitSet FOLLOW_exprBase_in_expression680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr698 = new BitSet(new long[]{0x0000100004480002L});
	public static final BitSet FOLLOW_Symbol_in_symb709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vari717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_program_in_start857 = new BitSet(new long[]{0x0000000000000002L});
}
