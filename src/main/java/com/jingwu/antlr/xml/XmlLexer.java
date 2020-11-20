// Generated from E:/DEEPEXI/Other/antlr4-example/src\XmlLexer.g4 by ANTLR 4.8
package com.jingwu.antlr.xml;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, CLOSE=2, SLASH_CLOSE=3, EQUALS=4, STRING=5, SlashName=6, Name=7, 
		S=8;
	public static final int
		INSIDE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN", "CLOSE", "SLASH_CLOSE", "EQUALS", "STRING", "SlashName", "Name", 
			"S", "ALPHA", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'/>'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN", "CLOSE", "SLASH_CLOSE", "EQUALS", "STRING", "SlashName", 
			"Name", "S"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public XmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XmlLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nC\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\7\6*\n\6\f\6\16\6-\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\7\b\67\n"+
		"\b\f\b\16\b:\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3+\2\f\4\3\6\4\b\5"+
		"\n\6\f\7\16\b\20\t\22\n\24\2\26\2\4\2\3\5\5\2\13\f\17\17\"\"\4\2C\\c|"+
		"\3\2\62;\2B\2\4\3\2\2\2\3\6\3\2\2\2\3\b\3\2\2\2\3\n\3\2\2\2\3\f\3\2\2"+
		"\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\4\30\3\2\2\2\6\34\3\2\2\2\b"+
		" \3\2\2\2\n%\3\2\2\2\f\'\3\2\2\2\16\60\3\2\2\2\20\63\3\2\2\2\22;\3\2\2"+
		"\2\24?\3\2\2\2\26A\3\2\2\2\30\31\7>\2\2\31\32\3\2\2\2\32\33\b\2\2\2\33"+
		"\5\3\2\2\2\34\35\7@\2\2\35\36\3\2\2\2\36\37\b\3\3\2\37\7\3\2\2\2 !\7\61"+
		"\2\2!\"\7@\2\2\"#\3\2\2\2#$\b\4\3\2$\t\3\2\2\2%&\7?\2\2&\13\3\2\2\2\'"+
		"+\7$\2\2(*\13\2\2\2)(\3\2\2\2*-\3\2\2\2+,\3\2\2\2+)\3\2\2\2,.\3\2\2\2"+
		"-+\3\2\2\2./\7$\2\2/\r\3\2\2\2\60\61\7\61\2\2\61\62\5\20\b\2\62\17\3\2"+
		"\2\2\638\5\24\n\2\64\67\5\24\n\2\65\67\5\26\13\2\66\64\3\2\2\2\66\65\3"+
		"\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\21\3\2\2\2:8\3\2\2\2;<\t\2\2"+
		"\2<=\3\2\2\2=>\b\t\4\2>\23\3\2\2\2?@\t\3\2\2@\25\3\2\2\2AB\t\4\2\2B\27"+
		"\3\2\2\2\7\2\3+\668\5\7\3\2\6\2\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}