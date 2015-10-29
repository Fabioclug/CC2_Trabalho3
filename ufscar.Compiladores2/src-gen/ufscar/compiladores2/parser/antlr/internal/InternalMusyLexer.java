package ufscar.compiladores2.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMusyLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalMusyLexer() {;} 
    public InternalMusyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMusyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:11:7: ( 'MIDI' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:11:9: 'MIDI'
            {
            match("MIDI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:12:7: ( '{' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:13:7: ( '}' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:14:7: ( 'BPM' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:14:9: 'BPM'
            {
            match("BPM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:15:7: ( ':' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:16:7: ( 'TIME_SIGNATURE' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:16:9: 'TIME_SIGNATURE'
            {
            match("TIME_SIGNATURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:17:7: ( 'TIME_NOTE' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:17:9: 'TIME_NOTE'
            {
            match("TIME_NOTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:18:7: ( 'TIME_PAUSE' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:18:9: 'TIME_PAUSE'
            {
            match("TIME_PAUSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:19:7: ( 'OCTAVE' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:19:9: 'OCTAVE'
            {
            match("OCTAVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:20:7: ( 'chord' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:20:9: 'chord'
            {
            match("chord"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:21:7: ( '(' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:22:7: ( ')' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:23:7: ( 'TRACK' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:23:9: 'TRACK'
            {
            match("TRACK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:24:7: ( ',' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:24:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:25:7: ( 'BLOCK' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:25:9: 'BLOCK'
            {
            match("BLOCK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:26:7: ( '/' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:26:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:27:7: ( 'sb' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:27:9: 'sb'
            {
            match("sb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:28:7: ( 'm' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:28:9: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:29:7: ( 'sm' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:29:9: 'sm'
            {
            match("sm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:30:7: ( 'cl' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:30:9: 'cl'
            {
            match("cl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:31:7: ( 'sc' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:31:9: 'sc'
            {
            match("sc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:32:7: ( 'f' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:32:9: 'f'
            {
            match('f'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:33:7: ( 'sf' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:33:9: 'sf'
            {
            match("sf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:34:7: ( 'C' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:34:9: 'C'
            {
            match('C'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:35:7: ( 'D' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:35:9: 'D'
            {
            match('D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:36:7: ( 'E' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:36:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:37:7: ( 'F' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:37:9: 'F'
            {
            match('F'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:38:7: ( 'G' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:38:9: 'G'
            {
            match('G'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:39:7: ( 'A' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:39:9: 'A'
            {
            match('A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:40:7: ( 'B' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:40:9: 'B'
            {
            match('B'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:41:7: ( '#' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:41:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:42:7: ( 'b' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:42:9: 'b'
            {
            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:43:7: ( 'PIANO' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:43:9: 'PIANO'
            {
            match("PIANO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:44:7: ( 'GUITAR' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:44:9: 'GUITAR'
            {
            match("GUITAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:45:7: ( 'ELETRIC GUITAR' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:45:9: 'ELETRIC GUITAR'
            {
            match("ELETRIC GUITAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:46:7: ( 'BASS' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:46:9: 'BASS'
            {
            match("BASS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:47:7: ( 'SAX' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:47:9: 'SAX'
            {
            match("SAX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:48:7: ( 'VIOLIN' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:48:9: 'VIOLIN'
            {
            match("VIOLIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:49:7: ( 'DRUMS' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:49:9: 'DRUMS'
            {
            match("DRUMS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1501:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1501:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1501:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1501:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1501:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1503:10: ( ( '0' .. '9' )+ )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1503:12: ( '0' .. '9' )+
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1503:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1503:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1505:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1505:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1505:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1505:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1505:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1505:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1505:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1505:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1505:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1505:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1505:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1507:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1507:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1507:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1507:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1509:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1509:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1509:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1509:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1509:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1509:41: ( '\\r' )? '\\n'
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1509:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1509:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1511:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1511:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1511:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1513:16: ( . )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1513:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=46;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:244: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 41 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:252: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 42 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:261: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:273: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 44 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:289: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 45 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:305: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 46 :
                // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1:313: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\43\2\uffff\1\51\1\uffff\3\43\3\uffff\1\65\1\43\1\72\1\73\1\74\1\76\1\100\1\101\1\103\1\104\1\uffff\1\106\3\43\1\41\2\uffff\2\41\2\uffff\1\43\3\uffff\3\43\2\uffff\4\43\1\125\6\uffff\1\126\1\127\1\130\1\131\3\uffff\1\43\1\uffff\1\43\2\uffff\1\43\4\uffff\3\43\3\uffff\1\43\1\141\6\43\5\uffff\4\43\1\154\1\43\1\156\1\uffff\1\43\1\160\10\43\1\uffff\1\43\1\uffff\1\172\1\uffff\1\43\1\176\1\43\1\u0080\1\u0081\2\43\1\u0084\1\43\1\uffff\3\43\1\uffff\1\u0089\2\uffff\1\43\1\u008b\1\uffff\1\u008c\3\43\1\uffff\1\43\2\uffff\3\43\1\uffff\1\43\1\u0095\2\43\1\uffff\1\u0098\1\43\1\uffff\2\43\1\u009c\1\uffff";
    static final String DFA12_eofS =
        "\u009d\uffff";
    static final String DFA12_minS =
        "\1\0\1\111\2\uffff\1\60\1\uffff\1\111\1\103\1\150\3\uffff\1\52\1\142\10\60\1\uffff\1\60\1\111\1\101\1\111\1\101\2\uffff\2\0\2\uffff\1\104\3\uffff\1\115\1\117\1\123\2\uffff\1\115\1\101\1\124\1\157\1\60\6\uffff\4\60\3\uffff\1\125\1\uffff\1\105\2\uffff\1\111\4\uffff\1\101\1\130\1\117\3\uffff\1\111\1\60\1\103\1\123\1\105\1\103\1\101\1\162\5\uffff\1\115\2\124\1\116\1\60\1\114\1\60\1\uffff\1\113\1\60\1\137\1\113\1\126\1\144\1\123\1\122\1\101\1\117\1\uffff\1\111\1\uffff\1\60\1\uffff\1\116\1\60\1\105\2\60\1\111\1\122\1\60\1\116\1\uffff\1\111\1\117\1\101\1\uffff\1\60\2\uffff\1\103\1\60\1\uffff\1\60\1\107\1\124\1\125\1\uffff\1\40\2\uffff\1\116\1\105\1\123\1\uffff\1\101\1\60\1\105\1\124\1\uffff\1\60\1\125\1\uffff\1\122\1\105\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\111\2\uffff\1\172\1\uffff\1\122\1\103\1\154\3\uffff\1\57\1\155\10\172\1\uffff\1\172\1\111\1\101\1\111\1\172\2\uffff\2\uffff\2\uffff\1\104\3\uffff\1\115\1\117\1\123\2\uffff\1\115\1\101\1\124\1\157\1\172\6\uffff\4\172\3\uffff\1\125\1\uffff\1\105\2\uffff\1\111\4\uffff\1\101\1\130\1\117\3\uffff\1\111\1\172\1\103\1\123\1\105\1\103\1\101\1\162\5\uffff\1\115\2\124\1\116\1\172\1\114\1\172\1\uffff\1\113\1\172\1\137\1\113\1\126\1\144\1\123\1\122\1\101\1\117\1\uffff\1\111\1\uffff\1\172\1\uffff\1\123\1\172\1\105\2\172\1\111\1\122\1\172\1\116\1\uffff\1\111\1\117\1\101\1\uffff\1\172\2\uffff\1\103\1\172\1\uffff\1\172\1\107\1\124\1\125\1\uffff\1\40\2\uffff\1\116\1\105\1\123\1\uffff\1\101\1\172\1\105\1\124\1\uffff\1\172\1\125\1\uffff\1\122\1\105\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\3\uffff\1\13\1\14\1\16\12\uffff\1\37\5\uffff\1\50\1\51\2\uffff\1\55\1\56\1\uffff\1\50\1\2\1\3\3\uffff\1\36\1\5\5\uffff\1\13\1\14\1\16\1\53\1\54\1\20\4\uffff\1\22\1\26\1\30\1\uffff\1\31\1\uffff\1\32\1\33\1\uffff\1\34\1\35\1\37\1\40\3\uffff\1\51\1\52\1\55\10\uffff\1\24\1\21\1\23\1\25\1\27\7\uffff\1\4\12\uffff\1\45\1\uffff\1\1\1\uffff\1\44\11\uffff\1\17\3\uffff\1\15\1\uffff\1\12\1\47\2\uffff\1\41\4\uffff\1\11\1\uffff\1\42\1\46\3\uffff\1\43\4\uffff\1\7\2\uffff\1\10\3\uffff\1\6";
    static final String DFA12_specialS =
        "\1\1\35\uffff\1\2\1\0\175\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\36\1\26\3\41\1\37\1\11\1\12\2\41\1\13\2\41\1\14\12\35\1\5\6\41\1\25\1\4\1\20\1\21\1\22\1\23\1\24\5\34\1\1\1\34\1\7\1\30\2\34\1\31\1\6\1\34\1\32\4\34\3\41\1\33\1\34\1\41\1\34\1\27\1\10\2\34\1\17\6\34\1\16\5\34\1\15\7\34\1\2\1\41\1\3\uff82\41",
            "\1\42",
            "",
            "",
            "\12\43\7\uffff\1\50\12\43\1\47\3\43\1\46\12\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\53\10\uffff\1\54",
            "\1\55",
            "\1\56\3\uffff\1\57",
            "",
            "",
            "",
            "\1\63\4\uffff\1\64",
            "\1\66\1\70\2\uffff\1\71\6\uffff\1\67",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\21\43\1\75\10\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\13\43\1\77\16\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\24\43\1\102\5\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\107",
            "\1\110",
            "\1\111",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\0\113",
            "\0\113",
            "",
            "",
            "\1\115",
            "",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\132",
            "",
            "\1\133",
            "",
            "",
            "\1\134",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "",
            "",
            "\1\140",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "",
            "",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\155",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\157",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\174\1\uffff\1\175\2\uffff\1\173",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\177",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0082",
            "\1\u0083",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\u008a",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0096",
            "\1\u0097",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_31 = input.LA(1);

                        s = -1;
                        if ( ((LA12_31>='\u0000' && LA12_31<='\uFFFF')) ) {s = 75;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='M') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='}') ) {s = 3;}

                        else if ( (LA12_0=='B') ) {s = 4;}

                        else if ( (LA12_0==':') ) {s = 5;}

                        else if ( (LA12_0=='T') ) {s = 6;}

                        else if ( (LA12_0=='O') ) {s = 7;}

                        else if ( (LA12_0=='c') ) {s = 8;}

                        else if ( (LA12_0=='(') ) {s = 9;}

                        else if ( (LA12_0==')') ) {s = 10;}

                        else if ( (LA12_0==',') ) {s = 11;}

                        else if ( (LA12_0=='/') ) {s = 12;}

                        else if ( (LA12_0=='s') ) {s = 13;}

                        else if ( (LA12_0=='m') ) {s = 14;}

                        else if ( (LA12_0=='f') ) {s = 15;}

                        else if ( (LA12_0=='C') ) {s = 16;}

                        else if ( (LA12_0=='D') ) {s = 17;}

                        else if ( (LA12_0=='E') ) {s = 18;}

                        else if ( (LA12_0=='F') ) {s = 19;}

                        else if ( (LA12_0=='G') ) {s = 20;}

                        else if ( (LA12_0=='A') ) {s = 21;}

                        else if ( (LA12_0=='#') ) {s = 22;}

                        else if ( (LA12_0=='b') ) {s = 23;}

                        else if ( (LA12_0=='P') ) {s = 24;}

                        else if ( (LA12_0=='S') ) {s = 25;}

                        else if ( (LA12_0=='V') ) {s = 26;}

                        else if ( (LA12_0=='^') ) {s = 27;}

                        else if ( ((LA12_0>='H' && LA12_0<='L')||LA12_0=='N'||(LA12_0>='Q' && LA12_0<='R')||LA12_0=='U'||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||(LA12_0>='d' && LA12_0<='e')||(LA12_0>='g' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='z')) ) {s = 28;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 29;}

                        else if ( (LA12_0=='\"') ) {s = 30;}

                        else if ( (LA12_0=='\'') ) {s = 31;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 32;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 75;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}