package ufscar.compiladores2.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ufscar.compiladores2.services.MusyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMusyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MIDI'", "'{'", "'}'", "'BPM'", "':'", "'TIME_SIGNATURE'", "'TIME_NOTE'", "'TIME_PAUSE'", "'OCTAVE'", "'chord'", "'('", "')'", "'TRACK'", "','", "'BLOCK'", "'/'", "'sb'", "'m'", "'sm'", "'cl'", "'sc'", "'f'", "'sf'", "'C'", "'D'", "'E'", "'F'", "'G'", "'A'", "'B'", "'#'", "'b'", "'PIANO'", "'GUITAR'", "'ELETRIC GUITAR'", "'BASS'", "'SAX'", "'VIOLIN'", "'DRUMS'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
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


        public InternalMusyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMusyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMusyParser.tokenNames; }
    public String getGrammarFileName() { return "../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g"; }



     	private MusyGrammarAccess grammarAccess;
     	
        public InternalMusyParser(TokenStream input, MusyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Midi";	
       	}
       	
       	@Override
       	protected MusyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMidi"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:67:1: entryRuleMidi returns [EObject current=null] : iv_ruleMidi= ruleMidi EOF ;
    public final EObject entryRuleMidi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMidi = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:68:2: (iv_ruleMidi= ruleMidi EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:69:2: iv_ruleMidi= ruleMidi EOF
            {
             newCompositeNode(grammarAccess.getMidiRule()); 
            pushFollow(FOLLOW_ruleMidi_in_entryRuleMidi75);
            iv_ruleMidi=ruleMidi();

            state._fsp--;

             current =iv_ruleMidi; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMidi85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMidi"


    // $ANTLR start "ruleMidi"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:76:1: ruleMidi returns [EObject current=null] : (otherlv_0= 'MIDI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_body_3_0= ruleMidiBody ) ) otherlv_4= '}' ) ;
    public final EObject ruleMidi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:79:28: ( (otherlv_0= 'MIDI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_body_3_0= ruleMidiBody ) ) otherlv_4= '}' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:80:1: (otherlv_0= 'MIDI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_body_3_0= ruleMidiBody ) ) otherlv_4= '}' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:80:1: (otherlv_0= 'MIDI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_body_3_0= ruleMidiBody ) ) otherlv_4= '}' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:80:3: otherlv_0= 'MIDI' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_body_3_0= ruleMidiBody ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMidi122); 

                	newLeafNode(otherlv_0, grammarAccess.getMidiAccess().getMIDIKeyword_0());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:85:1: (lv_name_1_0= RULE_ID )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMidi139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMidiAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMidiRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMidi156); 

                	newLeafNode(otherlv_2, grammarAccess.getMidiAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:106:1: ( (lv_body_3_0= ruleMidiBody ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:107:1: (lv_body_3_0= ruleMidiBody )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:107:1: (lv_body_3_0= ruleMidiBody )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:108:3: lv_body_3_0= ruleMidiBody
            {
             
            	        newCompositeNode(grammarAccess.getMidiAccess().getBodyMidiBodyParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMidiBody_in_ruleMidi177);
            lv_body_3_0=ruleMidiBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMidiRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_3_0, 
                    		"MidiBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleMidi189); 

                	newLeafNode(otherlv_4, grammarAccess.getMidiAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMidi"


    // $ANTLR start "entryRuleMidiBody"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:136:1: entryRuleMidiBody returns [EObject current=null] : iv_ruleMidiBody= ruleMidiBody EOF ;
    public final EObject entryRuleMidiBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMidiBody = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:137:2: (iv_ruleMidiBody= ruleMidiBody EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:138:2: iv_ruleMidiBody= ruleMidiBody EOF
            {
             newCompositeNode(grammarAccess.getMidiBodyRule()); 
            pushFollow(FOLLOW_ruleMidiBody_in_entryRuleMidiBody225);
            iv_ruleMidiBody=ruleMidiBody();

            state._fsp--;

             current =iv_ruleMidiBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMidiBody235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMidiBody"


    // $ANTLR start "ruleMidiBody"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:145:1: ruleMidiBody returns [EObject current=null] : ( () ( (lv_param_1_0= ruleParameter ) )* ( (lv_chords_2_0= ruleDeclaredChord ) )* ( (lv_tracks_3_0= ruleTrack ) )* ) ;
    public final EObject ruleMidiBody() throws RecognitionException {
        EObject current = null;

        EObject lv_param_1_0 = null;

        EObject lv_chords_2_0 = null;

        EObject lv_tracks_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:148:28: ( ( () ( (lv_param_1_0= ruleParameter ) )* ( (lv_chords_2_0= ruleDeclaredChord ) )* ( (lv_tracks_3_0= ruleTrack ) )* ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:149:1: ( () ( (lv_param_1_0= ruleParameter ) )* ( (lv_chords_2_0= ruleDeclaredChord ) )* ( (lv_tracks_3_0= ruleTrack ) )* )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:149:1: ( () ( (lv_param_1_0= ruleParameter ) )* ( (lv_chords_2_0= ruleDeclaredChord ) )* ( (lv_tracks_3_0= ruleTrack ) )* )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:149:2: () ( (lv_param_1_0= ruleParameter ) )* ( (lv_chords_2_0= ruleDeclaredChord ) )* ( (lv_tracks_3_0= ruleTrack ) )*
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:149:2: ()
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:150:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMidiBodyAccess().getMidiBodyAction_0(),
                        current);
                

            }

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:155:2: ( (lv_param_1_0= ruleParameter ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=16 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:156:1: (lv_param_1_0= ruleParameter )
            	    {
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:156:1: (lv_param_1_0= ruleParameter )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:157:3: lv_param_1_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMidiBodyAccess().getParamParameterParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleMidiBody290);
            	    lv_param_1_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMidiBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"param",
            	            		lv_param_1_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:173:3: ( (lv_chords_2_0= ruleDeclaredChord ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:174:1: (lv_chords_2_0= ruleDeclaredChord )
            	    {
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:174:1: (lv_chords_2_0= ruleDeclaredChord )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:175:3: lv_chords_2_0= ruleDeclaredChord
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMidiBodyAccess().getChordsDeclaredChordParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaredChord_in_ruleMidiBody312);
            	    lv_chords_2_0=ruleDeclaredChord();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMidiBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"chords",
            	            		lv_chords_2_0, 
            	            		"DeclaredChord");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:191:3: ( (lv_tracks_3_0= ruleTrack ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:192:1: (lv_tracks_3_0= ruleTrack )
            	    {
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:192:1: (lv_tracks_3_0= ruleTrack )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:193:3: lv_tracks_3_0= ruleTrack
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMidiBodyAccess().getTracksTrackParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTrack_in_ruleMidiBody334);
            	    lv_tracks_3_0=ruleTrack();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMidiBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tracks",
            	            		lv_tracks_3_0, 
            	            		"Track");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMidiBody"


    // $ANTLR start "entryRuleParameter"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:217:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:218:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:219:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter371);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:226:1: ruleParameter returns [EObject current=null] : (this_ParameterBeat_0= ruleParameterBeat | this_ParameterTimeSignature_1= ruleParameterTimeSignature | this_ParameterTimeNote_2= ruleParameterTimeNote | this_ParameterTimePause_3= ruleParameterTimePause | this_ParameterOctave_4= ruleParameterOctave ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterBeat_0 = null;

        EObject this_ParameterTimeSignature_1 = null;

        EObject this_ParameterTimeNote_2 = null;

        EObject this_ParameterTimePause_3 = null;

        EObject this_ParameterOctave_4 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:229:28: ( (this_ParameterBeat_0= ruleParameterBeat | this_ParameterTimeSignature_1= ruleParameterTimeSignature | this_ParameterTimeNote_2= ruleParameterTimeNote | this_ParameterTimePause_3= ruleParameterTimePause | this_ParameterOctave_4= ruleParameterOctave ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:230:1: (this_ParameterBeat_0= ruleParameterBeat | this_ParameterTimeSignature_1= ruleParameterTimeSignature | this_ParameterTimeNote_2= ruleParameterTimeNote | this_ParameterTimePause_3= ruleParameterTimePause | this_ParameterOctave_4= ruleParameterOctave )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:230:1: (this_ParameterBeat_0= ruleParameterBeat | this_ParameterTimeSignature_1= ruleParameterTimeSignature | this_ParameterTimeNote_2= ruleParameterTimeNote | this_ParameterTimePause_3= ruleParameterTimePause | this_ParameterOctave_4= ruleParameterOctave )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:231:5: this_ParameterBeat_0= ruleParameterBeat
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getParameterBeatParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleParameterBeat_in_ruleParameter428);
                    this_ParameterBeat_0=ruleParameterBeat();

                    state._fsp--;

                     
                            current = this_ParameterBeat_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:241:5: this_ParameterTimeSignature_1= ruleParameterTimeSignature
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getParameterTimeSignatureParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParameterTimeSignature_in_ruleParameter455);
                    this_ParameterTimeSignature_1=ruleParameterTimeSignature();

                    state._fsp--;

                     
                            current = this_ParameterTimeSignature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:251:5: this_ParameterTimeNote_2= ruleParameterTimeNote
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getParameterTimeNoteParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleParameterTimeNote_in_ruleParameter482);
                    this_ParameterTimeNote_2=ruleParameterTimeNote();

                    state._fsp--;

                     
                            current = this_ParameterTimeNote_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:261:5: this_ParameterTimePause_3= ruleParameterTimePause
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getParameterTimePauseParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleParameterTimePause_in_ruleParameter509);
                    this_ParameterTimePause_3=ruleParameterTimePause();

                    state._fsp--;

                     
                            current = this_ParameterTimePause_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:271:5: this_ParameterOctave_4= ruleParameterOctave
                    {
                     
                            newCompositeNode(grammarAccess.getParameterAccess().getParameterOctaveParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleParameterOctave_in_ruleParameter536);
                    this_ParameterOctave_4=ruleParameterOctave();

                    state._fsp--;

                     
                            current = this_ParameterOctave_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterBeat"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:287:1: entryRuleParameterBeat returns [EObject current=null] : iv_ruleParameterBeat= ruleParameterBeat EOF ;
    public final EObject entryRuleParameterBeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBeat = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:288:2: (iv_ruleParameterBeat= ruleParameterBeat EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:289:2: iv_ruleParameterBeat= ruleParameterBeat EOF
            {
             newCompositeNode(grammarAccess.getParameterBeatRule()); 
            pushFollow(FOLLOW_ruleParameterBeat_in_entryRuleParameterBeat571);
            iv_ruleParameterBeat=ruleParameterBeat();

            state._fsp--;

             current =iv_ruleParameterBeat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterBeat581); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBeat"


    // $ANTLR start "ruleParameterBeat"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:296:1: ruleParameterBeat returns [EObject current=null] : (otherlv_0= 'BPM' otherlv_1= ':' ( (lv_beat_2_0= RULE_INT ) ) ) ;
    public final EObject ruleParameterBeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_beat_2_0=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:299:28: ( (otherlv_0= 'BPM' otherlv_1= ':' ( (lv_beat_2_0= RULE_INT ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:300:1: (otherlv_0= 'BPM' otherlv_1= ':' ( (lv_beat_2_0= RULE_INT ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:300:1: (otherlv_0= 'BPM' otherlv_1= ':' ( (lv_beat_2_0= RULE_INT ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:300:3: otherlv_0= 'BPM' otherlv_1= ':' ( (lv_beat_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleParameterBeat618); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterBeatAccess().getBPMKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleParameterBeat630); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterBeatAccess().getColonKeyword_1());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:308:1: ( (lv_beat_2_0= RULE_INT ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:309:1: (lv_beat_2_0= RULE_INT )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:309:1: (lv_beat_2_0= RULE_INT )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:310:3: lv_beat_2_0= RULE_INT
            {
            lv_beat_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameterBeat647); 

            			newLeafNode(lv_beat_2_0, grammarAccess.getParameterBeatAccess().getBeatINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterBeatRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"beat",
                    		lv_beat_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBeat"


    // $ANTLR start "entryRuleParameterTimeSignature"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:334:1: entryRuleParameterTimeSignature returns [EObject current=null] : iv_ruleParameterTimeSignature= ruleParameterTimeSignature EOF ;
    public final EObject entryRuleParameterTimeSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterTimeSignature = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:335:2: (iv_ruleParameterTimeSignature= ruleParameterTimeSignature EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:336:2: iv_ruleParameterTimeSignature= ruleParameterTimeSignature EOF
            {
             newCompositeNode(grammarAccess.getParameterTimeSignatureRule()); 
            pushFollow(FOLLOW_ruleParameterTimeSignature_in_entryRuleParameterTimeSignature688);
            iv_ruleParameterTimeSignature=ruleParameterTimeSignature();

            state._fsp--;

             current =iv_ruleParameterTimeSignature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterTimeSignature698); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterTimeSignature"


    // $ANTLR start "ruleParameterTimeSignature"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:343:1: ruleParameterTimeSignature returns [EObject current=null] : (otherlv_0= 'TIME_SIGNATURE' otherlv_1= ':' ( (lv_tsig_2_0= ruleTimeSignature ) ) ) ;
    public final EObject ruleParameterTimeSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_tsig_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:346:28: ( (otherlv_0= 'TIME_SIGNATURE' otherlv_1= ':' ( (lv_tsig_2_0= ruleTimeSignature ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:347:1: (otherlv_0= 'TIME_SIGNATURE' otherlv_1= ':' ( (lv_tsig_2_0= ruleTimeSignature ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:347:1: (otherlv_0= 'TIME_SIGNATURE' otherlv_1= ':' ( (lv_tsig_2_0= ruleTimeSignature ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:347:3: otherlv_0= 'TIME_SIGNATURE' otherlv_1= ':' ( (lv_tsig_2_0= ruleTimeSignature ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleParameterTimeSignature735); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterTimeSignatureAccess().getTIME_SIGNATUREKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleParameterTimeSignature747); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterTimeSignatureAccess().getColonKeyword_1());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:355:1: ( (lv_tsig_2_0= ruleTimeSignature ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:356:1: (lv_tsig_2_0= ruleTimeSignature )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:356:1: (lv_tsig_2_0= ruleTimeSignature )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:357:3: lv_tsig_2_0= ruleTimeSignature
            {
             
            	        newCompositeNode(grammarAccess.getParameterTimeSignatureAccess().getTsigTimeSignatureParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTimeSignature_in_ruleParameterTimeSignature768);
            lv_tsig_2_0=ruleTimeSignature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterTimeSignatureRule());
            	        }
                   		set(
                   			current, 
                   			"tsig",
                    		lv_tsig_2_0, 
                    		"TimeSignature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterTimeSignature"


    // $ANTLR start "entryRuleParameterTimeNote"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:381:1: entryRuleParameterTimeNote returns [EObject current=null] : iv_ruleParameterTimeNote= ruleParameterTimeNote EOF ;
    public final EObject entryRuleParameterTimeNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterTimeNote = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:382:2: (iv_ruleParameterTimeNote= ruleParameterTimeNote EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:383:2: iv_ruleParameterTimeNote= ruleParameterTimeNote EOF
            {
             newCompositeNode(grammarAccess.getParameterTimeNoteRule()); 
            pushFollow(FOLLOW_ruleParameterTimeNote_in_entryRuleParameterTimeNote804);
            iv_ruleParameterTimeNote=ruleParameterTimeNote();

            state._fsp--;

             current =iv_ruleParameterTimeNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterTimeNote814); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterTimeNote"


    // $ANTLR start "ruleParameterTimeNote"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:390:1: ruleParameterTimeNote returns [EObject current=null] : (otherlv_0= 'TIME_NOTE' otherlv_1= ':' ( (lv_tn_2_0= ruleTn ) ) ) ;
    public final EObject ruleParameterTimeNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_tn_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:393:28: ( (otherlv_0= 'TIME_NOTE' otherlv_1= ':' ( (lv_tn_2_0= ruleTn ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:394:1: (otherlv_0= 'TIME_NOTE' otherlv_1= ':' ( (lv_tn_2_0= ruleTn ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:394:1: (otherlv_0= 'TIME_NOTE' otherlv_1= ':' ( (lv_tn_2_0= ruleTn ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:394:3: otherlv_0= 'TIME_NOTE' otherlv_1= ':' ( (lv_tn_2_0= ruleTn ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleParameterTimeNote851); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterTimeNoteAccess().getTIME_NOTEKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleParameterTimeNote863); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterTimeNoteAccess().getColonKeyword_1());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:402:1: ( (lv_tn_2_0= ruleTn ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:403:1: (lv_tn_2_0= ruleTn )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:403:1: (lv_tn_2_0= ruleTn )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:404:3: lv_tn_2_0= ruleTn
            {
             
            	        newCompositeNode(grammarAccess.getParameterTimeNoteAccess().getTnTnParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTn_in_ruleParameterTimeNote884);
            lv_tn_2_0=ruleTn();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterTimeNoteRule());
            	        }
                   		set(
                   			current, 
                   			"tn",
                    		lv_tn_2_0, 
                    		"Tn");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterTimeNote"


    // $ANTLR start "entryRuleParameterTimePause"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:428:1: entryRuleParameterTimePause returns [EObject current=null] : iv_ruleParameterTimePause= ruleParameterTimePause EOF ;
    public final EObject entryRuleParameterTimePause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterTimePause = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:429:2: (iv_ruleParameterTimePause= ruleParameterTimePause EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:430:2: iv_ruleParameterTimePause= ruleParameterTimePause EOF
            {
             newCompositeNode(grammarAccess.getParameterTimePauseRule()); 
            pushFollow(FOLLOW_ruleParameterTimePause_in_entryRuleParameterTimePause920);
            iv_ruleParameterTimePause=ruleParameterTimePause();

            state._fsp--;

             current =iv_ruleParameterTimePause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterTimePause930); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterTimePause"


    // $ANTLR start "ruleParameterTimePause"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:437:1: ruleParameterTimePause returns [EObject current=null] : (otherlv_0= 'TIME_PAUSE' otherlv_1= ':' ( (lv_tp_2_0= ruleTp ) ) ) ;
    public final EObject ruleParameterTimePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_tp_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:440:28: ( (otherlv_0= 'TIME_PAUSE' otherlv_1= ':' ( (lv_tp_2_0= ruleTp ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:441:1: (otherlv_0= 'TIME_PAUSE' otherlv_1= ':' ( (lv_tp_2_0= ruleTp ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:441:1: (otherlv_0= 'TIME_PAUSE' otherlv_1= ':' ( (lv_tp_2_0= ruleTp ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:441:3: otherlv_0= 'TIME_PAUSE' otherlv_1= ':' ( (lv_tp_2_0= ruleTp ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleParameterTimePause967); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterTimePauseAccess().getTIME_PAUSEKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleParameterTimePause979); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterTimePauseAccess().getColonKeyword_1());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:449:1: ( (lv_tp_2_0= ruleTp ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:450:1: (lv_tp_2_0= ruleTp )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:450:1: (lv_tp_2_0= ruleTp )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:451:3: lv_tp_2_0= ruleTp
            {
             
            	        newCompositeNode(grammarAccess.getParameterTimePauseAccess().getTpTpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTp_in_ruleParameterTimePause1000);
            lv_tp_2_0=ruleTp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterTimePauseRule());
            	        }
                   		set(
                   			current, 
                   			"tp",
                    		lv_tp_2_0, 
                    		"Tp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterTimePause"


    // $ANTLR start "entryRuleParameterOctave"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:475:1: entryRuleParameterOctave returns [EObject current=null] : iv_ruleParameterOctave= ruleParameterOctave EOF ;
    public final EObject entryRuleParameterOctave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterOctave = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:476:2: (iv_ruleParameterOctave= ruleParameterOctave EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:477:2: iv_ruleParameterOctave= ruleParameterOctave EOF
            {
             newCompositeNode(grammarAccess.getParameterOctaveRule()); 
            pushFollow(FOLLOW_ruleParameterOctave_in_entryRuleParameterOctave1036);
            iv_ruleParameterOctave=ruleParameterOctave();

            state._fsp--;

             current =iv_ruleParameterOctave; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterOctave1046); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterOctave"


    // $ANTLR start "ruleParameterOctave"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:484:1: ruleParameterOctave returns [EObject current=null] : (otherlv_0= 'OCTAVE' otherlv_1= ':' ( (lv_octave_2_0= RULE_INT ) ) ) ;
    public final EObject ruleParameterOctave() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_octave_2_0=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:487:28: ( (otherlv_0= 'OCTAVE' otherlv_1= ':' ( (lv_octave_2_0= RULE_INT ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:488:1: (otherlv_0= 'OCTAVE' otherlv_1= ':' ( (lv_octave_2_0= RULE_INT ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:488:1: (otherlv_0= 'OCTAVE' otherlv_1= ':' ( (lv_octave_2_0= RULE_INT ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:488:3: otherlv_0= 'OCTAVE' otherlv_1= ':' ( (lv_octave_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleParameterOctave1083); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterOctaveAccess().getOCTAVEKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleParameterOctave1095); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterOctaveAccess().getColonKeyword_1());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:496:1: ( (lv_octave_2_0= RULE_INT ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:497:1: (lv_octave_2_0= RULE_INT )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:497:1: (lv_octave_2_0= RULE_INT )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:498:3: lv_octave_2_0= RULE_INT
            {
            lv_octave_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameterOctave1112); 

            			newLeafNode(lv_octave_2_0, grammarAccess.getParameterOctaveAccess().getOctaveINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterOctaveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"octave",
                    		lv_octave_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterOctave"


    // $ANTLR start "entryRuleDeclaredChord"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:522:1: entryRuleDeclaredChord returns [EObject current=null] : iv_ruleDeclaredChord= ruleDeclaredChord EOF ;
    public final EObject entryRuleDeclaredChord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredChord = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:523:2: (iv_ruleDeclaredChord= ruleDeclaredChord EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:524:2: iv_ruleDeclaredChord= ruleDeclaredChord EOF
            {
             newCompositeNode(grammarAccess.getDeclaredChordRule()); 
            pushFollow(FOLLOW_ruleDeclaredChord_in_entryRuleDeclaredChord1153);
            iv_ruleDeclaredChord=ruleDeclaredChord();

            state._fsp--;

             current =iv_ruleDeclaredChord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredChord1163); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredChord"


    // $ANTLR start "ruleDeclaredChord"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:531:1: ruleDeclaredChord returns [EObject current=null] : (otherlv_0= 'chord' otherlv_1= '(' ( (lv_cp_2_0= ruleChordParams ) ) otherlv_3= ')' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredChord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject lv_cp_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:534:28: ( (otherlv_0= 'chord' otherlv_1= '(' ( (lv_cp_2_0= ruleChordParams ) ) otherlv_3= ')' ( (lv_name_4_0= RULE_ID ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:535:1: (otherlv_0= 'chord' otherlv_1= '(' ( (lv_cp_2_0= ruleChordParams ) ) otherlv_3= ')' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:535:1: (otherlv_0= 'chord' otherlv_1= '(' ( (lv_cp_2_0= ruleChordParams ) ) otherlv_3= ')' ( (lv_name_4_0= RULE_ID ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:535:3: otherlv_0= 'chord' otherlv_1= '(' ( (lv_cp_2_0= ruleChordParams ) ) otherlv_3= ')' ( (lv_name_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDeclaredChord1200); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclaredChordAccess().getChordKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleDeclaredChord1212); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclaredChordAccess().getLeftParenthesisKeyword_1());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:543:1: ( (lv_cp_2_0= ruleChordParams ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:544:1: (lv_cp_2_0= ruleChordParams )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:544:1: (lv_cp_2_0= ruleChordParams )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:545:3: lv_cp_2_0= ruleChordParams
            {
             
            	        newCompositeNode(grammarAccess.getDeclaredChordAccess().getCpChordParamsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleChordParams_in_ruleDeclaredChord1233);
            lv_cp_2_0=ruleChordParams();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclaredChordRule());
            	        }
                   		set(
                   			current, 
                   			"cp",
                    		lv_cp_2_0, 
                    		"ChordParams");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleDeclaredChord1245); 

                	newLeafNode(otherlv_3, grammarAccess.getDeclaredChordAccess().getRightParenthesisKeyword_3());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:565:1: ( (lv_name_4_0= RULE_ID ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:566:1: (lv_name_4_0= RULE_ID )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:566:1: (lv_name_4_0= RULE_ID )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:567:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclaredChord1262); 

            			newLeafNode(lv_name_4_0, grammarAccess.getDeclaredChordAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclaredChordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredChord"


    // $ANTLR start "entryRuleTrack"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:591:1: entryRuleTrack returns [EObject current=null] : iv_ruleTrack= ruleTrack EOF ;
    public final EObject entryRuleTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrack = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:592:2: (iv_ruleTrack= ruleTrack EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:593:2: iv_ruleTrack= ruleTrack EOF
            {
             newCompositeNode(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_ruleTrack_in_entryRuleTrack1303);
            iv_ruleTrack=ruleTrack();

            state._fsp--;

             current =iv_ruleTrack; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrack1313); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:600:1: ruleTrack returns [EObject current=null] : (otherlv_0= 'TRACK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_i_3_0= ruleInstrument ) ) otherlv_4= '{' ( (lv_tbody_5_0= ruleTrackBody ) ) otherlv_6= '}' ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_i_3_0 = null;

        EObject lv_tbody_5_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:603:28: ( (otherlv_0= 'TRACK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_i_3_0= ruleInstrument ) ) otherlv_4= '{' ( (lv_tbody_5_0= ruleTrackBody ) ) otherlv_6= '}' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:604:1: (otherlv_0= 'TRACK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_i_3_0= ruleInstrument ) ) otherlv_4= '{' ( (lv_tbody_5_0= ruleTrackBody ) ) otherlv_6= '}' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:604:1: (otherlv_0= 'TRACK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_i_3_0= ruleInstrument ) ) otherlv_4= '{' ( (lv_tbody_5_0= ruleTrackBody ) ) otherlv_6= '}' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:604:3: otherlv_0= 'TRACK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_i_3_0= ruleInstrument ) ) otherlv_4= '{' ( (lv_tbody_5_0= ruleTrackBody ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleTrack1350); 

                	newLeafNode(otherlv_0, grammarAccess.getTrackAccess().getTRACKKeyword_0());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:608:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:609:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:609:1: (lv_name_1_0= RULE_ID )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:610:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrack1367); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTrackAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrackRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTrack1384); 

                	newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getColonKeyword_2());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:630:1: ( (lv_i_3_0= ruleInstrument ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:631:1: (lv_i_3_0= ruleInstrument )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:631:1: (lv_i_3_0= ruleInstrument )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:632:3: lv_i_3_0= ruleInstrument
            {
             
            	        newCompositeNode(grammarAccess.getTrackAccess().getIInstrumentParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInstrument_in_ruleTrack1405);
            lv_i_3_0=ruleInstrument();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTrackRule());
            	        }
                   		set(
                   			current, 
                   			"i",
                    		lv_i_3_0, 
                    		"Instrument");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleTrack1417); 

                	newLeafNode(otherlv_4, grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:652:1: ( (lv_tbody_5_0= ruleTrackBody ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:653:1: (lv_tbody_5_0= ruleTrackBody )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:653:1: (lv_tbody_5_0= ruleTrackBody )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:654:3: lv_tbody_5_0= ruleTrackBody
            {
             
            	        newCompositeNode(grammarAccess.getTrackAccess().getTbodyTrackBodyParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTrackBody_in_ruleTrack1438);
            lv_tbody_5_0=ruleTrackBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTrackRule());
            	        }
                   		set(
                   			current, 
                   			"tbody",
                    		lv_tbody_5_0, 
                    		"TrackBody");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleTrack1450); 

                	newLeafNode(otherlv_6, grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRuleTrackBody"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:682:1: entryRuleTrackBody returns [EObject current=null] : iv_ruleTrackBody= ruleTrackBody EOF ;
    public final EObject entryRuleTrackBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrackBody = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:683:2: (iv_ruleTrackBody= ruleTrackBody EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:684:2: iv_ruleTrackBody= ruleTrackBody EOF
            {
             newCompositeNode(grammarAccess.getTrackBodyRule()); 
            pushFollow(FOLLOW_ruleTrackBody_in_entryRuleTrackBody1486);
            iv_ruleTrackBody=ruleTrackBody();

            state._fsp--;

             current =iv_ruleTrackBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrackBody1496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrackBody"


    // $ANTLR start "ruleTrackBody"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:691:1: ruleTrackBody returns [EObject current=null] : ( ( (lv_bc_0_0= ruleBodyComponent ) ) (otherlv_1= ',' ( (lv_bc_2_0= ruleBodyComponent ) ) )* ) ;
    public final EObject ruleTrackBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_bc_0_0 = null;

        EObject lv_bc_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:694:28: ( ( ( (lv_bc_0_0= ruleBodyComponent ) ) (otherlv_1= ',' ( (lv_bc_2_0= ruleBodyComponent ) ) )* ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:695:1: ( ( (lv_bc_0_0= ruleBodyComponent ) ) (otherlv_1= ',' ( (lv_bc_2_0= ruleBodyComponent ) ) )* )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:695:1: ( ( (lv_bc_0_0= ruleBodyComponent ) ) (otherlv_1= ',' ( (lv_bc_2_0= ruleBodyComponent ) ) )* )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:695:2: ( (lv_bc_0_0= ruleBodyComponent ) ) (otherlv_1= ',' ( (lv_bc_2_0= ruleBodyComponent ) ) )*
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:695:2: ( (lv_bc_0_0= ruleBodyComponent ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:696:1: (lv_bc_0_0= ruleBodyComponent )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:696:1: (lv_bc_0_0= ruleBodyComponent )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:697:3: lv_bc_0_0= ruleBodyComponent
            {
             
            	        newCompositeNode(grammarAccess.getTrackBodyAccess().getBcBodyComponentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyComponent_in_ruleTrackBody1542);
            lv_bc_0_0=ruleBodyComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTrackBodyRule());
            	        }
                   		add(
                   			current, 
                   			"bc",
                    		lv_bc_0_0, 
                    		"BodyComponent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:713:2: (otherlv_1= ',' ( (lv_bc_2_0= ruleBodyComponent ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:713:4: otherlv_1= ',' ( (lv_bc_2_0= ruleBodyComponent ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleTrackBody1555); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTrackBodyAccess().getCommaKeyword_1_0());
            	        
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:717:1: ( (lv_bc_2_0= ruleBodyComponent ) )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:718:1: (lv_bc_2_0= ruleBodyComponent )
            	    {
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:718:1: (lv_bc_2_0= ruleBodyComponent )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:719:3: lv_bc_2_0= ruleBodyComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTrackBodyAccess().getBcBodyComponentParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyComponent_in_ruleTrackBody1576);
            	    lv_bc_2_0=ruleBodyComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTrackBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bc",
            	            		lv_bc_2_0, 
            	            		"BodyComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrackBody"


    // $ANTLR start "entryRuleBodyComponent"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:743:1: entryRuleBodyComponent returns [EObject current=null] : iv_ruleBodyComponent= ruleBodyComponent EOF ;
    public final EObject entryRuleBodyComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyComponent = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:744:2: (iv_ruleBodyComponent= ruleBodyComponent EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:745:2: iv_ruleBodyComponent= ruleBodyComponent EOF
            {
             newCompositeNode(grammarAccess.getBodyComponentRule()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent1614);
            iv_ruleBodyComponent=ruleBodyComponent();

            state._fsp--;

             current =iv_ruleBodyComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent1624); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBodyComponent"


    // $ANTLR start "ruleBodyComponent"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:752:1: ruleBodyComponent returns [EObject current=null] : ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_block_1_0= ruleBlock ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleBodyComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_note_0_0 = null;

        EObject lv_block_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:755:28: ( ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_block_1_0= ruleBlock ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:756:1: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_block_1_0= ruleBlock ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:756:1: ( ( (lv_note_0_0= ruleNote ) ) | ( (lv_block_1_0= ruleBlock ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:756:2: ( (lv_note_0_0= ruleNote ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:756:2: ( (lv_note_0_0= ruleNote ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:757:1: (lv_note_0_0= ruleNote )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:757:1: (lv_note_0_0= ruleNote )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:758:3: lv_note_0_0= ruleNote
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyComponentAccess().getNoteNoteParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNote_in_ruleBodyComponent1670);
                    lv_note_0_0=ruleNote();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"note",
                            		lv_note_0_0, 
                            		"Note");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:775:6: ( (lv_block_1_0= ruleBlock ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:775:6: ( (lv_block_1_0= ruleBlock ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:776:1: (lv_block_1_0= ruleBlock )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:776:1: (lv_block_1_0= ruleBlock )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:777:3: lv_block_1_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyComponentAccess().getBlockBlockParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleBodyComponent1697);
                    lv_block_1_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"block",
                            		lv_block_1_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:794:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:794:6: ( (otherlv_2= RULE_ID ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:795:1: (otherlv_2= RULE_ID )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:795:1: (otherlv_2= RULE_ID )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:796:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBodyComponentRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBodyComponent1723); 

                    		newLeafNode(otherlv_2, grammarAccess.getBodyComponentAccess().getChDeclaredChordCrossReference_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBodyComponent"


    // $ANTLR start "entryRuleBlock"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:815:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:816:2: (iv_ruleBlock= ruleBlock EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:817:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock1759);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock1769); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:824:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'BLOCK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_blockbody_3_0= ruleTrackBody ) )* otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_blockbody_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:827:28: ( (otherlv_0= 'BLOCK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_blockbody_3_0= ruleTrackBody ) )* otherlv_4= '}' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:828:1: (otherlv_0= 'BLOCK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_blockbody_3_0= ruleTrackBody ) )* otherlv_4= '}' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:828:1: (otherlv_0= 'BLOCK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_blockbody_3_0= ruleTrackBody ) )* otherlv_4= '}' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:828:3: otherlv_0= 'BLOCK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_blockbody_3_0= ruleTrackBody ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleBlock1806); 

                	newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBLOCKKeyword_0());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:832:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:833:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:833:1: (lv_name_1_0= RULE_ID )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:834:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBlock1823); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBlock1840); 

                	newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:854:1: ( (lv_blockbody_3_0= ruleTrackBody ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==25||(LA7_0>=34 && LA7_0<=40)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:855:1: (lv_blockbody_3_0= ruleTrackBody )
            	    {
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:855:1: (lv_blockbody_3_0= ruleTrackBody )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:856:3: lv_blockbody_3_0= ruleTrackBody
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getBlockbodyTrackBodyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTrackBody_in_ruleBlock1861);
            	    lv_blockbody_3_0=ruleTrackBody();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blockbody",
            	            		lv_blockbody_3_0, 
            	            		"TrackBody");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleBlock1874); 

                	newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleTimeSignature"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:884:1: entryRuleTimeSignature returns [EObject current=null] : iv_ruleTimeSignature= ruleTimeSignature EOF ;
    public final EObject entryRuleTimeSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSignature = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:885:2: (iv_ruleTimeSignature= ruleTimeSignature EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:886:2: iv_ruleTimeSignature= ruleTimeSignature EOF
            {
             newCompositeNode(grammarAccess.getTimeSignatureRule()); 
            pushFollow(FOLLOW_ruleTimeSignature_in_entryRuleTimeSignature1910);
            iv_ruleTimeSignature=ruleTimeSignature();

            state._fsp--;

             current =iv_ruleTimeSignature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeSignature1920); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeSignature"


    // $ANTLR start "ruleTimeSignature"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:893:1: ruleTimeSignature returns [EObject current=null] : ( ( (lv_quantity_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_note_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTimeSignature() throws RecognitionException {
        EObject current = null;

        Token lv_quantity_0_0=null;
        Token otherlv_1=null;
        Token lv_note_2_0=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:896:28: ( ( ( (lv_quantity_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_note_2_0= RULE_INT ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:897:1: ( ( (lv_quantity_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_note_2_0= RULE_INT ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:897:1: ( ( (lv_quantity_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_note_2_0= RULE_INT ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:897:2: ( (lv_quantity_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_note_2_0= RULE_INT ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:897:2: ( (lv_quantity_0_0= RULE_INT ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:898:1: (lv_quantity_0_0= RULE_INT )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:898:1: (lv_quantity_0_0= RULE_INT )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:899:3: lv_quantity_0_0= RULE_INT
            {
            lv_quantity_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeSignature1962); 

            			newLeafNode(lv_quantity_0_0, grammarAccess.getTimeSignatureAccess().getQuantityINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeSignatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"quantity",
                    		lv_quantity_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleTimeSignature1979); 

                	newLeafNode(otherlv_1, grammarAccess.getTimeSignatureAccess().getSolidusKeyword_1());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:919:1: ( (lv_note_2_0= RULE_INT ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:920:1: (lv_note_2_0= RULE_INT )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:920:1: (lv_note_2_0= RULE_INT )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:921:3: lv_note_2_0= RULE_INT
            {
            lv_note_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeSignature1996); 

            			newLeafNode(lv_note_2_0, grammarAccess.getTimeSignatureAccess().getNoteINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeSignatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"note",
                    		lv_note_2_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeSignature"


    // $ANTLR start "entryRuleTp"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:945:1: entryRuleTp returns [String current=null] : iv_ruleTp= ruleTp EOF ;
    public final String entryRuleTp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTp = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:946:2: (iv_ruleTp= ruleTp EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:947:2: iv_ruleTp= ruleTp EOF
            {
             newCompositeNode(grammarAccess.getTpRule()); 
            pushFollow(FOLLOW_ruleTp_in_entryRuleTp2038);
            iv_ruleTp=ruleTp();

            state._fsp--;

             current =iv_ruleTp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTp2049); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTp"


    // $ANTLR start "ruleTp"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:954:1: ruleTp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'sb' | kw= 'm' | kw= 'sm' | kw= 'cl' | kw= 'sc' | kw= 'f' | kw= 'sf' ) ;
    public final AntlrDatatypeRuleToken ruleTp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:957:28: ( (kw= 'sb' | kw= 'm' | kw= 'sm' | kw= 'cl' | kw= 'sc' | kw= 'f' | kw= 'sf' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:958:1: (kw= 'sb' | kw= 'm' | kw= 'sm' | kw= 'cl' | kw= 'sc' | kw= 'f' | kw= 'sf' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:958:1: (kw= 'sb' | kw= 'm' | kw= 'sm' | kw= 'cl' | kw= 'sc' | kw= 'f' | kw= 'sf' )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            case 31:
                {
                alt8=5;
                }
                break;
            case 32:
                {
                alt8=6;
                }
                break;
            case 33:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:959:2: kw= 'sb'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleTp2087); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getSbKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:966:2: kw= 'm'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleTp2106); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getMKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:973:2: kw= 'sm'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleTp2125); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getSmKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:980:2: kw= 'cl'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleTp2144); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getClKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:987:2: kw= 'sc'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleTp2163); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getScKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:994:2: kw= 'f'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleTp2182); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getFKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1001:2: kw= 'sf'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleTp2201); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getSfKeyword_6()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTp"


    // $ANTLR start "entryRuleTn"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1014:1: entryRuleTn returns [String current=null] : iv_ruleTn= ruleTn EOF ;
    public final String entryRuleTn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTn = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1015:2: (iv_ruleTn= ruleTn EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1016:2: iv_ruleTn= ruleTn EOF
            {
             newCompositeNode(grammarAccess.getTnRule()); 
            pushFollow(FOLLOW_ruleTn_in_entryRuleTn2242);
            iv_ruleTn=ruleTn();

            state._fsp--;

             current =iv_ruleTn.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTn2253); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTn"


    // $ANTLR start "ruleTn"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1023:1: ruleTn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Tp_0= ruleTp ;
    public final AntlrDatatypeRuleToken ruleTn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Tp_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1026:28: (this_Tp_0= ruleTp )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1028:5: this_Tp_0= ruleTp
            {
             
                    newCompositeNode(grammarAccess.getTnAccess().getTpParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTp_in_ruleTn2299);
            this_Tp_0=ruleTp();

            state._fsp--;


            		current.merge(this_Tp_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTn"


    // $ANTLR start "entryRuleChordParams"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1046:1: entryRuleChordParams returns [EObject current=null] : iv_ruleChordParams= ruleChordParams EOF ;
    public final EObject entryRuleChordParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChordParams = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1047:2: (iv_ruleChordParams= ruleChordParams EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1048:2: iv_ruleChordParams= ruleChordParams EOF
            {
             newCompositeNode(grammarAccess.getChordParamsRule()); 
            pushFollow(FOLLOW_ruleChordParams_in_entryRuleChordParams2343);
            iv_ruleChordParams=ruleChordParams();

            state._fsp--;

             current =iv_ruleChordParams; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChordParams2353); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChordParams"


    // $ANTLR start "ruleChordParams"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1055:1: ruleChordParams returns [EObject current=null] : ( ( (lv_cnote_0_0= ruleNote ) ) (otherlv_1= ',' ( (lv_cnote_2_0= ruleNote ) ) )* ) ;
    public final EObject ruleChordParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_cnote_0_0 = null;

        EObject lv_cnote_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1058:28: ( ( ( (lv_cnote_0_0= ruleNote ) ) (otherlv_1= ',' ( (lv_cnote_2_0= ruleNote ) ) )* ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1059:1: ( ( (lv_cnote_0_0= ruleNote ) ) (otherlv_1= ',' ( (lv_cnote_2_0= ruleNote ) ) )* )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1059:1: ( ( (lv_cnote_0_0= ruleNote ) ) (otherlv_1= ',' ( (lv_cnote_2_0= ruleNote ) ) )* )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1059:2: ( (lv_cnote_0_0= ruleNote ) ) (otherlv_1= ',' ( (lv_cnote_2_0= ruleNote ) ) )*
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1059:2: ( (lv_cnote_0_0= ruleNote ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1060:1: (lv_cnote_0_0= ruleNote )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1060:1: (lv_cnote_0_0= ruleNote )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1061:3: lv_cnote_0_0= ruleNote
            {
             
            	        newCompositeNode(grammarAccess.getChordParamsAccess().getCnoteNoteParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNote_in_ruleChordParams2399);
            lv_cnote_0_0=ruleNote();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChordParamsRule());
            	        }
                   		add(
                   			current, 
                   			"cnote",
                    		lv_cnote_0_0, 
                    		"Note");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1077:2: (otherlv_1= ',' ( (lv_cnote_2_0= ruleNote ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1077:4: otherlv_1= ',' ( (lv_cnote_2_0= ruleNote ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleChordParams2412); 

            	        	newLeafNode(otherlv_1, grammarAccess.getChordParamsAccess().getCommaKeyword_1_0());
            	        
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1081:1: ( (lv_cnote_2_0= ruleNote ) )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1082:1: (lv_cnote_2_0= ruleNote )
            	    {
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1082:1: (lv_cnote_2_0= ruleNote )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1083:3: lv_cnote_2_0= ruleNote
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChordParamsAccess().getCnoteNoteParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNote_in_ruleChordParams2433);
            	    lv_cnote_2_0=ruleNote();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChordParamsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cnote",
            	            		lv_cnote_2_0, 
            	            		"Note");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChordParams"


    // $ANTLR start "entryRuleNoteLetter"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1107:1: entryRuleNoteLetter returns [String current=null] : iv_ruleNoteLetter= ruleNoteLetter EOF ;
    public final String entryRuleNoteLetter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoteLetter = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1108:2: (iv_ruleNoteLetter= ruleNoteLetter EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1109:2: iv_ruleNoteLetter= ruleNoteLetter EOF
            {
             newCompositeNode(grammarAccess.getNoteLetterRule()); 
            pushFollow(FOLLOW_ruleNoteLetter_in_entryRuleNoteLetter2472);
            iv_ruleNoteLetter=ruleNoteLetter();

            state._fsp--;

             current =iv_ruleNoteLetter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoteLetter2483); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoteLetter"


    // $ANTLR start "ruleNoteLetter"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1116:1: ruleNoteLetter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'A' | kw= 'B' ) ;
    public final AntlrDatatypeRuleToken ruleNoteLetter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1119:28: ( (kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'A' | kw= 'B' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1120:1: (kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'A' | kw= 'B' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1120:1: (kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'A' | kw= 'B' )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt10=1;
                }
                break;
            case 35:
                {
                alt10=2;
                }
                break;
            case 36:
                {
                alt10=3;
                }
                break;
            case 37:
                {
                alt10=4;
                }
                break;
            case 38:
                {
                alt10=5;
                }
                break;
            case 39:
                {
                alt10=6;
                }
                break;
            case 40:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1121:2: kw= 'C'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleNoteLetter2521); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getCKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1128:2: kw= 'D'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleNoteLetter2540); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getDKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1135:2: kw= 'E'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleNoteLetter2559); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1142:2: kw= 'F'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleNoteLetter2578); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getFKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1149:2: kw= 'G'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleNoteLetter2597); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getGKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1156:2: kw= 'A'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleNoteLetter2616); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getAKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1163:2: kw= 'B'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleNoteLetter2635); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getBKeyword_6()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoteLetter"


    // $ANTLR start "entryRuleAccident"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1176:1: entryRuleAccident returns [String current=null] : iv_ruleAccident= ruleAccident EOF ;
    public final String entryRuleAccident() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAccident = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1177:2: (iv_ruleAccident= ruleAccident EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1178:2: iv_ruleAccident= ruleAccident EOF
            {
             newCompositeNode(grammarAccess.getAccidentRule()); 
            pushFollow(FOLLOW_ruleAccident_in_entryRuleAccident2676);
            iv_ruleAccident=ruleAccident();

            state._fsp--;

             current =iv_ruleAccident.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccident2687); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccident"


    // $ANTLR start "ruleAccident"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1185:1: ruleAccident returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' | kw= 'b' ) ;
    public final AntlrDatatypeRuleToken ruleAccident() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1188:28: ( (kw= '#' | kw= 'b' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1189:1: (kw= '#' | kw= 'b' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1189:1: (kw= '#' | kw= 'b' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            else if ( (LA11_0==42) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1190:2: kw= '#'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleAccident2725); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAccidentAccess().getNumberSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1197:2: kw= 'b'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleAccident2744); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAccidentAccess().getBKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccident"


    // $ANTLR start "entryRuleNote"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1210:1: entryRuleNote returns [EObject current=null] : iv_ruleNote= ruleNote EOF ;
    public final EObject entryRuleNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNote = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1211:2: (iv_ruleNote= ruleNote EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1212:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote2784);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote2794); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1219:1: ruleNote returns [EObject current=null] : ( ( (lv_nl_0_0= ruleNoteLetter ) ) ( (lv_acc_1_0= ruleAccident ) )? (otherlv_2= '(' ( (lv_cnp_3_0= ruleCustomNoteParam ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nl_0_0 = null;

        AntlrDatatypeRuleToken lv_acc_1_0 = null;

        EObject lv_cnp_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1222:28: ( ( ( (lv_nl_0_0= ruleNoteLetter ) ) ( (lv_acc_1_0= ruleAccident ) )? (otherlv_2= '(' ( (lv_cnp_3_0= ruleCustomNoteParam ) ) otherlv_4= ')' )? ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1223:1: ( ( (lv_nl_0_0= ruleNoteLetter ) ) ( (lv_acc_1_0= ruleAccident ) )? (otherlv_2= '(' ( (lv_cnp_3_0= ruleCustomNoteParam ) ) otherlv_4= ')' )? )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1223:1: ( ( (lv_nl_0_0= ruleNoteLetter ) ) ( (lv_acc_1_0= ruleAccident ) )? (otherlv_2= '(' ( (lv_cnp_3_0= ruleCustomNoteParam ) ) otherlv_4= ')' )? )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1223:2: ( (lv_nl_0_0= ruleNoteLetter ) ) ( (lv_acc_1_0= ruleAccident ) )? (otherlv_2= '(' ( (lv_cnp_3_0= ruleCustomNoteParam ) ) otherlv_4= ')' )?
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1223:2: ( (lv_nl_0_0= ruleNoteLetter ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1224:1: (lv_nl_0_0= ruleNoteLetter )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1224:1: (lv_nl_0_0= ruleNoteLetter )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1225:3: lv_nl_0_0= ruleNoteLetter
            {
             
            	        newCompositeNode(grammarAccess.getNoteAccess().getNlNoteLetterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNoteLetter_in_ruleNote2840);
            lv_nl_0_0=ruleNoteLetter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNoteRule());
            	        }
                   		set(
                   			current, 
                   			"nl",
                    		lv_nl_0_0, 
                    		"NoteLetter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1241:2: ( (lv_acc_1_0= ruleAccident ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=41 && LA12_0<=42)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1242:1: (lv_acc_1_0= ruleAccident )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1242:1: (lv_acc_1_0= ruleAccident )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1243:3: lv_acc_1_0= ruleAccident
                    {
                     
                    	        newCompositeNode(grammarAccess.getNoteAccess().getAccAccidentParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAccident_in_ruleNote2861);
                    lv_acc_1_0=ruleAccident();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNoteRule());
                    	        }
                           		set(
                           			current, 
                           			"acc",
                            		lv_acc_1_0, 
                            		"Accident");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1259:3: (otherlv_2= '(' ( (lv_cnp_3_0= ruleCustomNoteParam ) ) otherlv_4= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1259:5: otherlv_2= '(' ( (lv_cnp_3_0= ruleCustomNoteParam ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleNote2875); 

                        	newLeafNode(otherlv_2, grammarAccess.getNoteAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1263:1: ( (lv_cnp_3_0= ruleCustomNoteParam ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1264:1: (lv_cnp_3_0= ruleCustomNoteParam )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1264:1: (lv_cnp_3_0= ruleCustomNoteParam )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1265:3: lv_cnp_3_0= ruleCustomNoteParam
                    {
                     
                    	        newCompositeNode(grammarAccess.getNoteAccess().getCnpCustomNoteParamParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCustomNoteParam_in_ruleNote2896);
                    lv_cnp_3_0=ruleCustomNoteParam();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNoteRule());
                    	        }
                           		set(
                           			current, 
                           			"cnp",
                            		lv_cnp_3_0, 
                            		"CustomNoteParam");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleNote2908); 

                        	newLeafNode(otherlv_4, grammarAccess.getNoteAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleInstrument"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1293:1: entryRuleInstrument returns [String current=null] : iv_ruleInstrument= ruleInstrument EOF ;
    public final String entryRuleInstrument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInstrument = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1294:2: (iv_ruleInstrument= ruleInstrument EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1295:2: iv_ruleInstrument= ruleInstrument EOF
            {
             newCompositeNode(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_ruleInstrument_in_entryRuleInstrument2947);
            iv_ruleInstrument=ruleInstrument();

            state._fsp--;

             current =iv_ruleInstrument.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstrument2958); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstrument"


    // $ANTLR start "ruleInstrument"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1302:1: ruleInstrument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PIANO' | kw= 'GUITAR' | kw= 'ELETRIC GUITAR' | kw= 'BASS' | kw= 'SAX' | kw= 'VIOLIN' | kw= 'DRUMS' ) ;
    public final AntlrDatatypeRuleToken ruleInstrument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1305:28: ( (kw= 'PIANO' | kw= 'GUITAR' | kw= 'ELETRIC GUITAR' | kw= 'BASS' | kw= 'SAX' | kw= 'VIOLIN' | kw= 'DRUMS' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1306:1: (kw= 'PIANO' | kw= 'GUITAR' | kw= 'ELETRIC GUITAR' | kw= 'BASS' | kw= 'SAX' | kw= 'VIOLIN' | kw= 'DRUMS' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1306:1: (kw= 'PIANO' | kw= 'GUITAR' | kw= 'ELETRIC GUITAR' | kw= 'BASS' | kw= 'SAX' | kw= 'VIOLIN' | kw= 'DRUMS' )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 45:
                {
                alt14=3;
                }
                break;
            case 46:
                {
                alt14=4;
                }
                break;
            case 47:
                {
                alt14=5;
                }
                break;
            case 48:
                {
                alt14=6;
                }
                break;
            case 49:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1307:2: kw= 'PIANO'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleInstrument2996); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getPIANOKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1314:2: kw= 'GUITAR'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleInstrument3015); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getGUITARKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1321:2: kw= 'ELETRIC GUITAR'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleInstrument3034); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getELETRICGUITARKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1328:2: kw= 'BASS'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleInstrument3053); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getBASSKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1335:2: kw= 'SAX'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleInstrument3072); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getSAXKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1342:2: kw= 'VIOLIN'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleInstrument3091); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getVIOLINKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1349:2: kw= 'DRUMS'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleInstrument3110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getDRUMSKeyword_6()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstrument"


    // $ANTLR start "entryRuleCustomNoteParam"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1362:1: entryRuleCustomNoteParam returns [EObject current=null] : iv_ruleCustomNoteParam= ruleCustomNoteParam EOF ;
    public final EObject entryRuleCustomNoteParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomNoteParam = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1363:2: (iv_ruleCustomNoteParam= ruleCustomNoteParam EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1364:2: iv_ruleCustomNoteParam= ruleCustomNoteParam EOF
            {
             newCompositeNode(grammarAccess.getCustomNoteParamRule()); 
            pushFollow(FOLLOW_ruleCustomNoteParam_in_entryRuleCustomNoteParam3150);
            iv_ruleCustomNoteParam=ruleCustomNoteParam();

            state._fsp--;

             current =iv_ruleCustomNoteParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomNoteParam3160); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomNoteParam"


    // $ANTLR start "ruleCustomNoteParam"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1371:1: ruleCustomNoteParam returns [EObject current=null] : ( ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_duration_2_0= ruleTn ) ) ) | ( ( (lv_duration_3_0= ruleTn ) ) otherlv_4= ',' ( (lv_octave_5_0= RULE_INT ) ) ) | ( (lv_octave_6_0= RULE_INT ) ) | ( (lv_duration_7_0= ruleTn ) ) ) ;
    public final EObject ruleCustomNoteParam() throws RecognitionException {
        EObject current = null;

        Token lv_octave_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_octave_5_0=null;
        Token lv_octave_6_0=null;
        AntlrDatatypeRuleToken lv_duration_2_0 = null;

        AntlrDatatypeRuleToken lv_duration_3_0 = null;

        AntlrDatatypeRuleToken lv_duration_7_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1374:28: ( ( ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_duration_2_0= ruleTn ) ) ) | ( ( (lv_duration_3_0= ruleTn ) ) otherlv_4= ',' ( (lv_octave_5_0= RULE_INT ) ) ) | ( (lv_octave_6_0= RULE_INT ) ) | ( (lv_duration_7_0= ruleTn ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1375:1: ( ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_duration_2_0= ruleTn ) ) ) | ( ( (lv_duration_3_0= ruleTn ) ) otherlv_4= ',' ( (lv_octave_5_0= RULE_INT ) ) ) | ( (lv_octave_6_0= RULE_INT ) ) | ( (lv_duration_7_0= ruleTn ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1375:1: ( ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_duration_2_0= ruleTn ) ) ) | ( ( (lv_duration_3_0= ruleTn ) ) otherlv_4= ',' ( (lv_octave_5_0= RULE_INT ) ) ) | ( (lv_octave_6_0= RULE_INT ) ) | ( (lv_duration_7_0= ruleTn ) ) )
            int alt15=4;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1375:2: ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_duration_2_0= ruleTn ) ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1375:2: ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_duration_2_0= ruleTn ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1375:3: ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_duration_2_0= ruleTn ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1375:3: ( (lv_octave_0_0= RULE_INT ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1376:1: (lv_octave_0_0= RULE_INT )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1376:1: (lv_octave_0_0= RULE_INT )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1377:3: lv_octave_0_0= RULE_INT
                    {
                    lv_octave_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomNoteParam3203); 

                    			newLeafNode(lv_octave_0_0, grammarAccess.getCustomNoteParamAccess().getOctaveINTTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomNoteParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"octave",
                            		lv_octave_0_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCustomNoteParam3220); 

                        	newLeafNode(otherlv_1, grammarAccess.getCustomNoteParamAccess().getCommaKeyword_0_1());
                        
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1397:1: ( (lv_duration_2_0= ruleTn ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1398:1: (lv_duration_2_0= ruleTn )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1398:1: (lv_duration_2_0= ruleTn )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1399:3: lv_duration_2_0= ruleTn
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomNoteParamAccess().getDurationTnParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTn_in_ruleCustomNoteParam3241);
                    lv_duration_2_0=ruleTn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomNoteParamRule());
                    	        }
                           		set(
                           			current, 
                           			"duration",
                            		lv_duration_2_0, 
                            		"Tn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1416:6: ( ( (lv_duration_3_0= ruleTn ) ) otherlv_4= ',' ( (lv_octave_5_0= RULE_INT ) ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1416:6: ( ( (lv_duration_3_0= ruleTn ) ) otherlv_4= ',' ( (lv_octave_5_0= RULE_INT ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1416:7: ( (lv_duration_3_0= ruleTn ) ) otherlv_4= ',' ( (lv_octave_5_0= RULE_INT ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1416:7: ( (lv_duration_3_0= ruleTn ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1417:1: (lv_duration_3_0= ruleTn )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1417:1: (lv_duration_3_0= ruleTn )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1418:3: lv_duration_3_0= ruleTn
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomNoteParamAccess().getDurationTnParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTn_in_ruleCustomNoteParam3270);
                    lv_duration_3_0=ruleTn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomNoteParamRule());
                    	        }
                           		set(
                           			current, 
                           			"duration",
                            		lv_duration_3_0, 
                            		"Tn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleCustomNoteParam3282); 

                        	newLeafNode(otherlv_4, grammarAccess.getCustomNoteParamAccess().getCommaKeyword_1_1());
                        
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1438:1: ( (lv_octave_5_0= RULE_INT ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1439:1: (lv_octave_5_0= RULE_INT )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1439:1: (lv_octave_5_0= RULE_INT )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1440:3: lv_octave_5_0= RULE_INT
                    {
                    lv_octave_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomNoteParam3299); 

                    			newLeafNode(lv_octave_5_0, grammarAccess.getCustomNoteParamAccess().getOctaveINTTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomNoteParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"octave",
                            		lv_octave_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1457:6: ( (lv_octave_6_0= RULE_INT ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1457:6: ( (lv_octave_6_0= RULE_INT ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1458:1: (lv_octave_6_0= RULE_INT )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1458:1: (lv_octave_6_0= RULE_INT )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1459:3: lv_octave_6_0= RULE_INT
                    {
                    lv_octave_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomNoteParam3328); 

                    			newLeafNode(lv_octave_6_0, grammarAccess.getCustomNoteParamAccess().getOctaveINTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomNoteParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"octave",
                            		lv_octave_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1476:6: ( (lv_duration_7_0= ruleTn ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1476:6: ( (lv_duration_7_0= ruleTn ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1477:1: (lv_duration_7_0= ruleTn )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1477:1: (lv_duration_7_0= ruleTn )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1478:3: lv_duration_7_0= ruleTn
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomNoteParamAccess().getDurationTnParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTn_in_ruleCustomNoteParam3360);
                    lv_duration_7_0=ruleTn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomNoteParamRule());
                    	        }
                           		set(
                           			current, 
                           			"duration",
                            		lv_duration_7_0, 
                            		"Tn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomNoteParam"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\15\uffff";
    static final String DFA15_eofS =
        "\1\uffff\1\12\7\14\4\uffff";
    static final String DFA15_minS =
        "\1\5\10\26\4\uffff";
    static final String DFA15_maxS =
        "\1\41\10\30\4\uffff";
    static final String DFA15_acceptS =
        "\11\uffff\1\1\1\3\1\2\1\4";
    static final String DFA15_specialS =
        "\15\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\25\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12\1\uffff\1\11",
            "\1\14\1\uffff\1\13",
            "\1\14\1\uffff\1\13",
            "\1\14\1\uffff\1\13",
            "\1\14\1\uffff\1\13",
            "\1\14\1\uffff\1\13",
            "\1\14\1\uffff\1\13",
            "\1\14\1\uffff\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1375:1: ( ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_duration_2_0= ruleTn ) ) ) | ( ( (lv_duration_3_0= ruleTn ) ) otherlv_4= ',' ( (lv_octave_5_0= RULE_INT ) ) ) | ( (lv_octave_6_0= RULE_INT ) ) | ( (lv_duration_7_0= ruleTn ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleMidi_in_entryRuleMidi75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMidi85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMidi122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMidi139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMidi156 = new BitSet(new long[]{0x00000000009F6000L});
    public static final BitSet FOLLOW_ruleMidiBody_in_ruleMidi177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMidi189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMidiBody_in_entryRuleMidiBody225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMidiBody235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMidiBody290 = new BitSet(new long[]{0x00000000009F4002L});
    public static final BitSet FOLLOW_ruleDeclaredChord_in_ruleMidiBody312 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_ruleTrack_in_ruleMidiBody334 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterBeat_in_ruleParameter428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterTimeSignature_in_ruleParameter455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterTimeNote_in_ruleParameter482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterTimePause_in_ruleParameter509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOctave_in_ruleParameter536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterBeat_in_entryRuleParameterBeat571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterBeat581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleParameterBeat618 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameterBeat630 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameterBeat647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterTimeSignature_in_entryRuleParameterTimeSignature688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterTimeSignature698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleParameterTimeSignature735 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameterTimeSignature747 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTimeSignature_in_ruleParameterTimeSignature768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterTimeNote_in_entryRuleParameterTimeNote804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterTimeNote814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleParameterTimeNote851 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameterTimeNote863 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_ruleTn_in_ruleParameterTimeNote884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterTimePause_in_entryRuleParameterTimePause920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterTimePause930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleParameterTimePause967 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameterTimePause979 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_ruleTp_in_ruleParameterTimePause1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterOctave_in_entryRuleParameterOctave1036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterOctave1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleParameterOctave1083 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameterOctave1095 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameterOctave1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredChord_in_entryRuleDeclaredChord1153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredChord1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDeclaredChord1200 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDeclaredChord1212 = new BitSet(new long[]{0x000001FC00000000L});
    public static final BitSet FOLLOW_ruleChordParams_in_ruleDeclaredChord1233 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDeclaredChord1245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaredChord1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrack_in_entryRuleTrack1303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrack1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTrack1350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrack1367 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTrack1384 = new BitSet(new long[]{0x0003F80000000000L});
    public static final BitSet FOLLOW_ruleInstrument_in_ruleTrack1405 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTrack1417 = new BitSet(new long[]{0x000001FC02000010L});
    public static final BitSet FOLLOW_ruleTrackBody_in_ruleTrack1438 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTrack1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrackBody_in_entryRuleTrackBody1486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrackBody1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleTrackBody1542 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleTrackBody1555 = new BitSet(new long[]{0x000001FC02000010L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleTrackBody1576 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent1614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleBodyComponent1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBodyComponent1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBodyComponent1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock1759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBlock1806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBlock1823 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBlock1840 = new BitSet(new long[]{0x000001FC02002010L});
    public static final BitSet FOLLOW_ruleTrackBody_in_ruleBlock1861 = new BitSet(new long[]{0x000001FC02002010L});
    public static final BitSet FOLLOW_13_in_ruleBlock1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeSignature_in_entryRuleTimeSignature1910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeSignature1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeSignature1962 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTimeSignature1979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeSignature1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTp_in_entryRuleTp2038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTp2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTp2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTp2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTp2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTp2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTp2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTp2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTp2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTn_in_entryRuleTn2242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTn2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTp_in_ruleTn2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChordParams_in_entryRuleChordParams2343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChordParams2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChordParams2399 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleChordParams2412 = new BitSet(new long[]{0x000001FC00000000L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChordParams2433 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleNoteLetter_in_entryRuleNoteLetter2472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoteLetter2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleNoteLetter2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNoteLetter2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleNoteLetter2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleNoteLetter2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleNoteLetter2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNoteLetter2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNoteLetter2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccident_in_entryRuleAccident2676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccident2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAccident2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAccident2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote2784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoteLetter_in_ruleNote2840 = new BitSet(new long[]{0x0000060000200002L});
    public static final BitSet FOLLOW_ruleAccident_in_ruleNote2861 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleNote2875 = new BitSet(new long[]{0x00000003F8000020L});
    public static final BitSet FOLLOW_ruleCustomNoteParam_in_ruleNote2896 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleNote2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_entryRuleInstrument2947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstrument2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInstrument2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleInstrument3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleInstrument3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleInstrument3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleInstrument3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleInstrument3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleInstrument3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNoteParam_in_entryRuleCustomNoteParam3150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomNoteParam3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomNoteParam3203 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCustomNoteParam3220 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_ruleTn_in_ruleCustomNoteParam3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTn_in_ruleCustomNoteParam3270 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCustomNoteParam3282 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomNoteParam3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomNoteParam3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTn_in_ruleCustomNoteParam3360 = new BitSet(new long[]{0x0000000000000002L});

}