//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from C:/Users/GAMER/source/repos/ProtoGram/CubeScript.g4 by ANTLR 4.13.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.1")]
[System.CLSCompliant(false)]
public partial class CubeScriptLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, WHILE=42, ARRAY=43, Comment=44, BOOL_OPERATOR=45, 
		INTEGER=46, FLOAT=47, IMPORT=48, STRING=49, BOOL=50, TYPE=51, NULL=52, 
		WS=53, IDENTIFIER=54;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"WHILE", "ARRAY", "Comment", "BOOL_OPERATOR", "INTEGER", "FLOAT", "ESC", 
		"UNICODE", "HEX", "SAFE", "IMPORT", "STRING", "BOOL", "TYPE", "NULL", 
		"WS", "IDENTIFIER"
	};


	public CubeScriptLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public CubeScriptLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "';'", "'.'", "'house:'", "'{'", "'}'", "'for'", "'('", "'>'", "')'", 
		"'<'", "'='", "'['", "','", "']'", "'if'", "'else'", "'struct'", "'-'", 
		"'!'", "'?'", "':'", "'++'", "'--'", "'*'", "'/'", "'%'", "'^'", "'<<'", 
		"'>>'", "'&'", "'|'", "'&&'", "'||'", "'+='", "'-='", "'*='", "'+'", "'<='", 
		"'>='", "'=='", "'!='", null, null, null, null, null, null, null, null, 
		null, null, "'null'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "WHILE", "ARRAY", "Comment", "BOOL_OPERATOR", 
		"INTEGER", "FLOAT", "IMPORT", "STRING", "BOOL", "TYPE", "NULL", "WS", 
		"IDENTIFIER"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "CubeScript.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override int[] SerializedAtn { get { return _serializedATN; } }

	static CubeScriptLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static int[] _serializedATN = {
		4,0,54,400,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
		6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,
		7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,
		7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,27,7,27,2,28,
		7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,7,33,2,34,7,34,2,35,
		7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,39,7,39,2,40,7,40,2,41,7,41,2,42,
		7,42,2,43,7,43,2,44,7,44,2,45,7,45,2,46,7,46,2,47,7,47,2,48,7,48,2,49,
		7,49,2,50,7,50,2,51,7,51,2,52,7,52,2,53,7,53,2,54,7,54,2,55,7,55,2,56,
		7,56,2,57,7,57,1,0,1,0,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,4,
		1,4,1,5,1,5,1,5,1,5,1,6,1,6,1,7,1,7,1,8,1,8,1,9,1,9,1,10,1,10,1,11,1,11,
		1,12,1,12,1,13,1,13,1,14,1,14,1,14,1,15,1,15,1,15,1,15,1,15,1,16,1,16,
		1,16,1,16,1,16,1,16,1,16,1,17,1,17,1,18,1,18,1,19,1,19,1,20,1,20,1,21,
		1,21,1,21,1,22,1,22,1,22,1,23,1,23,1,24,1,24,1,25,1,25,1,26,1,26,1,27,
		1,27,1,27,1,28,1,28,1,28,1,29,1,29,1,30,1,30,1,31,1,31,1,31,1,32,1,32,
		1,32,1,33,1,33,1,33,1,34,1,34,1,34,1,35,1,35,1,35,1,36,1,36,1,37,1,37,
		1,37,1,38,1,38,1,38,1,39,1,39,1,39,1,40,1,40,1,40,1,41,1,41,1,41,1,41,
		1,41,1,41,1,41,1,41,1,41,1,41,3,41,239,8,41,1,42,1,42,1,43,1,43,1,43,1,
		43,5,43,247,8,43,10,43,12,43,250,9,43,1,43,1,43,1,43,1,43,5,43,256,8,43,
		10,43,12,43,259,9,43,1,43,1,43,1,43,1,43,5,43,265,8,43,10,43,12,43,268,
		9,43,3,43,270,8,43,1,43,1,43,1,44,1,44,1,44,1,44,1,44,1,44,1,44,1,44,3,
		44,282,8,44,1,45,4,45,285,8,45,11,45,12,45,286,1,46,5,46,290,8,46,10,46,
		12,46,293,9,46,1,46,1,46,4,46,297,8,46,11,46,12,46,298,1,47,1,47,1,47,
		3,47,304,8,47,1,48,1,48,1,48,1,48,1,48,1,48,1,49,1,49,1,50,1,50,1,51,1,
		51,1,51,1,51,1,51,1,51,1,51,1,51,1,51,1,51,1,51,1,51,1,51,1,51,1,51,1,
		51,1,51,1,51,1,51,3,51,335,8,51,1,52,1,52,1,52,5,52,340,8,52,10,52,12,
		52,343,9,52,1,52,1,52,1,53,1,53,1,53,1,53,1,53,1,53,1,53,1,53,1,53,3,53,
		356,8,53,1,54,1,54,1,54,1,54,1,54,1,54,1,54,1,54,1,54,1,54,1,54,1,54,1,
		54,1,54,1,54,1,54,1,54,1,54,1,54,1,54,1,54,1,54,3,54,380,8,54,1,55,1,55,
		1,55,1,55,1,55,1,56,4,56,388,8,56,11,56,12,56,389,1,56,1,56,1,57,1,57,
		5,57,396,8,57,10,57,12,57,399,9,57,1,257,0,58,1,1,3,2,5,3,7,4,9,5,11,6,
		13,7,15,8,17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,33,17,35,18,37,
		19,39,20,41,21,43,22,45,23,47,24,49,25,51,26,53,27,55,28,57,29,59,30,61,
		31,63,32,65,33,67,34,69,35,71,36,73,37,75,38,77,39,79,40,81,41,83,42,85,
		43,87,44,89,45,91,46,93,47,95,0,97,0,99,0,101,0,103,48,105,49,107,50,109,
		51,111,52,113,53,115,54,1,0,9,4,0,91,91,93,93,123,123,125,125,2,0,10,10,
		13,13,1,0,48,57,8,0,34,34,47,47,92,92,98,98,102,102,110,110,114,114,116,
		116,3,0,48,57,65,70,97,102,3,0,0,31,34,34,92,92,3,0,9,10,13,13,32,32,3,
		0,65,90,95,95,97,122,4,0,48,57,65,90,95,95,97,122,418,0,1,1,0,0,0,0,3,
		1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,
		0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,
		1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,1,0,0,
		0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,0,0,45,1,0,0,0,0,47,
		1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,0,0,53,1,0,0,0,0,55,1,0,0,0,0,57,1,0,0,
		0,0,59,1,0,0,0,0,61,1,0,0,0,0,63,1,0,0,0,0,65,1,0,0,0,0,67,1,0,0,0,0,69,
		1,0,0,0,0,71,1,0,0,0,0,73,1,0,0,0,0,75,1,0,0,0,0,77,1,0,0,0,0,79,1,0,0,
		0,0,81,1,0,0,0,0,83,1,0,0,0,0,85,1,0,0,0,0,87,1,0,0,0,0,89,1,0,0,0,0,91,
		1,0,0,0,0,93,1,0,0,0,0,103,1,0,0,0,0,105,1,0,0,0,0,107,1,0,0,0,0,109,1,
		0,0,0,0,111,1,0,0,0,0,113,1,0,0,0,0,115,1,0,0,0,1,117,1,0,0,0,3,119,1,
		0,0,0,5,121,1,0,0,0,7,128,1,0,0,0,9,130,1,0,0,0,11,132,1,0,0,0,13,136,
		1,0,0,0,15,138,1,0,0,0,17,140,1,0,0,0,19,142,1,0,0,0,21,144,1,0,0,0,23,
		146,1,0,0,0,25,148,1,0,0,0,27,150,1,0,0,0,29,152,1,0,0,0,31,155,1,0,0,
		0,33,160,1,0,0,0,35,167,1,0,0,0,37,169,1,0,0,0,39,171,1,0,0,0,41,173,1,
		0,0,0,43,175,1,0,0,0,45,178,1,0,0,0,47,181,1,0,0,0,49,183,1,0,0,0,51,185,
		1,0,0,0,53,187,1,0,0,0,55,189,1,0,0,0,57,192,1,0,0,0,59,195,1,0,0,0,61,
		197,1,0,0,0,63,199,1,0,0,0,65,202,1,0,0,0,67,205,1,0,0,0,69,208,1,0,0,
		0,71,211,1,0,0,0,73,214,1,0,0,0,75,216,1,0,0,0,77,219,1,0,0,0,79,222,1,
		0,0,0,81,225,1,0,0,0,83,238,1,0,0,0,85,240,1,0,0,0,87,269,1,0,0,0,89,281,
		1,0,0,0,91,284,1,0,0,0,93,291,1,0,0,0,95,300,1,0,0,0,97,305,1,0,0,0,99,
		311,1,0,0,0,101,313,1,0,0,0,103,334,1,0,0,0,105,336,1,0,0,0,107,355,1,
		0,0,0,109,379,1,0,0,0,111,381,1,0,0,0,113,387,1,0,0,0,115,393,1,0,0,0,
		117,118,5,59,0,0,118,2,1,0,0,0,119,120,5,46,0,0,120,4,1,0,0,0,121,122,
		5,104,0,0,122,123,5,111,0,0,123,124,5,117,0,0,124,125,5,115,0,0,125,126,
		5,101,0,0,126,127,5,58,0,0,127,6,1,0,0,0,128,129,5,123,0,0,129,8,1,0,0,
		0,130,131,5,125,0,0,131,10,1,0,0,0,132,133,5,102,0,0,133,134,5,111,0,0,
		134,135,5,114,0,0,135,12,1,0,0,0,136,137,5,40,0,0,137,14,1,0,0,0,138,139,
		5,62,0,0,139,16,1,0,0,0,140,141,5,41,0,0,141,18,1,0,0,0,142,143,5,60,0,
		0,143,20,1,0,0,0,144,145,5,61,0,0,145,22,1,0,0,0,146,147,5,91,0,0,147,
		24,1,0,0,0,148,149,5,44,0,0,149,26,1,0,0,0,150,151,5,93,0,0,151,28,1,0,
		0,0,152,153,5,105,0,0,153,154,5,102,0,0,154,30,1,0,0,0,155,156,5,101,0,
		0,156,157,5,108,0,0,157,158,5,115,0,0,158,159,5,101,0,0,159,32,1,0,0,0,
		160,161,5,115,0,0,161,162,5,116,0,0,162,163,5,114,0,0,163,164,5,117,0,
		0,164,165,5,99,0,0,165,166,5,116,0,0,166,34,1,0,0,0,167,168,5,45,0,0,168,
		36,1,0,0,0,169,170,5,33,0,0,170,38,1,0,0,0,171,172,5,63,0,0,172,40,1,0,
		0,0,173,174,5,58,0,0,174,42,1,0,0,0,175,176,5,43,0,0,176,177,5,43,0,0,
		177,44,1,0,0,0,178,179,5,45,0,0,179,180,5,45,0,0,180,46,1,0,0,0,181,182,
		5,42,0,0,182,48,1,0,0,0,183,184,5,47,0,0,184,50,1,0,0,0,185,186,5,37,0,
		0,186,52,1,0,0,0,187,188,5,94,0,0,188,54,1,0,0,0,189,190,5,60,0,0,190,
		191,5,60,0,0,191,56,1,0,0,0,192,193,5,62,0,0,193,194,5,62,0,0,194,58,1,
		0,0,0,195,196,5,38,0,0,196,60,1,0,0,0,197,198,5,124,0,0,198,62,1,0,0,0,
		199,200,5,38,0,0,200,201,5,38,0,0,201,64,1,0,0,0,202,203,5,124,0,0,203,
		204,5,124,0,0,204,66,1,0,0,0,205,206,5,43,0,0,206,207,5,61,0,0,207,68,
		1,0,0,0,208,209,5,45,0,0,209,210,5,61,0,0,210,70,1,0,0,0,211,212,5,42,
		0,0,212,213,5,61,0,0,213,72,1,0,0,0,214,215,5,43,0,0,215,74,1,0,0,0,216,
		217,5,60,0,0,217,218,5,61,0,0,218,76,1,0,0,0,219,220,5,62,0,0,220,221,
		5,61,0,0,221,78,1,0,0,0,222,223,5,61,0,0,223,224,5,61,0,0,224,80,1,0,0,
		0,225,226,5,33,0,0,226,227,5,61,0,0,227,82,1,0,0,0,228,229,5,119,0,0,229,
		230,5,104,0,0,230,231,5,105,0,0,231,232,5,108,0,0,232,239,5,101,0,0,233,
		234,5,117,0,0,234,235,5,110,0,0,235,236,5,116,0,0,236,237,5,105,0,0,237,
		239,5,108,0,0,238,228,1,0,0,0,238,233,1,0,0,0,239,84,1,0,0,0,240,241,7,
		0,0,0,241,86,1,0,0,0,242,243,5,47,0,0,243,244,5,47,0,0,244,248,1,0,0,0,
		245,247,8,1,0,0,246,245,1,0,0,0,247,250,1,0,0,0,248,246,1,0,0,0,248,249,
		1,0,0,0,249,270,1,0,0,0,250,248,1,0,0,0,251,252,5,47,0,0,252,253,5,42,
		0,0,253,257,1,0,0,0,254,256,9,0,0,0,255,254,1,0,0,0,256,259,1,0,0,0,257,
		258,1,0,0,0,257,255,1,0,0,0,258,260,1,0,0,0,259,257,1,0,0,0,260,261,5,
		42,0,0,261,270,5,47,0,0,262,266,5,35,0,0,263,265,8,1,0,0,264,263,1,0,0,
		0,265,268,1,0,0,0,266,264,1,0,0,0,266,267,1,0,0,0,267,270,1,0,0,0,268,
		266,1,0,0,0,269,242,1,0,0,0,269,251,1,0,0,0,269,262,1,0,0,0,270,271,1,
		0,0,0,271,272,6,43,0,0,272,88,1,0,0,0,273,274,5,97,0,0,274,275,5,110,0,
		0,275,282,5,100,0,0,276,277,5,111,0,0,277,282,5,114,0,0,278,279,5,120,
		0,0,279,280,5,111,0,0,280,282,5,114,0,0,281,273,1,0,0,0,281,276,1,0,0,
		0,281,278,1,0,0,0,282,90,1,0,0,0,283,285,7,2,0,0,284,283,1,0,0,0,285,286,
		1,0,0,0,286,284,1,0,0,0,286,287,1,0,0,0,287,92,1,0,0,0,288,290,7,2,0,0,
		289,288,1,0,0,0,290,293,1,0,0,0,291,289,1,0,0,0,291,292,1,0,0,0,292,294,
		1,0,0,0,293,291,1,0,0,0,294,296,5,46,0,0,295,297,7,2,0,0,296,295,1,0,0,
		0,297,298,1,0,0,0,298,296,1,0,0,0,298,299,1,0,0,0,299,94,1,0,0,0,300,303,
		5,92,0,0,301,304,7,3,0,0,302,304,3,97,48,0,303,301,1,0,0,0,303,302,1,0,
		0,0,304,96,1,0,0,0,305,306,5,117,0,0,306,307,3,99,49,0,307,308,3,99,49,
		0,308,309,3,99,49,0,309,310,3,99,49,0,310,98,1,0,0,0,311,312,7,4,0,0,312,
		100,1,0,0,0,313,314,8,5,0,0,314,102,1,0,0,0,315,316,5,117,0,0,316,317,
		5,115,0,0,317,318,5,105,0,0,318,319,5,110,0,0,319,335,5,103,0,0,320,321,
		5,42,0,0,321,322,5,105,0,0,322,323,5,110,0,0,323,324,5,99,0,0,324,325,
		5,108,0,0,325,326,5,117,0,0,326,327,5,100,0,0,327,335,5,101,0,0,328,329,
		5,105,0,0,329,330,5,109,0,0,330,331,5,112,0,0,331,332,5,111,0,0,332,333,
		5,114,0,0,333,335,5,116,0,0,334,315,1,0,0,0,334,320,1,0,0,0,334,328,1,
		0,0,0,335,104,1,0,0,0,336,341,5,34,0,0,337,340,3,95,47,0,338,340,3,101,
		50,0,339,337,1,0,0,0,339,338,1,0,0,0,340,343,1,0,0,0,341,339,1,0,0,0,341,
		342,1,0,0,0,342,344,1,0,0,0,343,341,1,0,0,0,344,345,5,34,0,0,345,106,1,
		0,0,0,346,347,5,116,0,0,347,348,5,114,0,0,348,349,5,117,0,0,349,356,5,
		101,0,0,350,351,5,102,0,0,351,352,5,97,0,0,352,353,5,108,0,0,353,354,5,
		115,0,0,354,356,5,101,0,0,355,346,1,0,0,0,355,350,1,0,0,0,356,108,1,0,
		0,0,357,358,5,115,0,0,358,359,5,116,0,0,359,360,5,114,0,0,360,361,5,105,
		0,0,361,362,5,110,0,0,362,380,5,103,0,0,363,364,5,105,0,0,364,365,5,110,
		0,0,365,380,5,116,0,0,366,367,5,102,0,0,367,368,5,108,0,0,368,369,5,111,
		0,0,369,370,5,97,0,0,370,380,5,116,0,0,371,372,5,98,0,0,372,373,5,111,
		0,0,373,374,5,111,0,0,374,380,5,108,0,0,375,376,5,110,0,0,376,377,5,117,
		0,0,377,378,5,108,0,0,378,380,5,108,0,0,379,357,1,0,0,0,379,363,1,0,0,
		0,379,366,1,0,0,0,379,371,1,0,0,0,379,375,1,0,0,0,380,110,1,0,0,0,381,
		382,5,110,0,0,382,383,5,117,0,0,383,384,5,108,0,0,384,385,5,108,0,0,385,
		112,1,0,0,0,386,388,7,6,0,0,387,386,1,0,0,0,388,389,1,0,0,0,389,387,1,
		0,0,0,389,390,1,0,0,0,390,391,1,0,0,0,391,392,6,56,0,0,392,114,1,0,0,0,
		393,397,7,7,0,0,394,396,7,8,0,0,395,394,1,0,0,0,396,399,1,0,0,0,397,395,
		1,0,0,0,397,398,1,0,0,0,398,116,1,0,0,0,399,397,1,0,0,0,18,0,238,248,257,
		266,269,281,286,291,298,303,334,339,341,355,379,389,397,1,6,0,0
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
