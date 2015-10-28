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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MIDI'", "'{'", "'}'", "'BPM'", "':'", "'bpm'", "'TIME_SIGNATURE'", "'time_sig'", "'TIME_NOTE'", "'time_note'", "'TIME_PAUSE'", "'time_pause'", "'OCTAVE'", "'octave'", "'TRACK'", "','", "'BLOCK'", "'/'", "'sb'", "'m'", "'sm'", "'cl'", "'sc'", "'f'", "'sf'", "'('", "')'", "'chord'", "'C'", "'D'", "'E'", "'F'", "'G'", "'A'", "'B'", "'#'", "'b'", "'PIANO'", "'GUITAR'", "'ELETRIC GUITAR'", "'BASS'", "'SAX'", "'VIOLIN'", "'DRUMS'"
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:145:1: ruleMidiBody returns [EObject current=null] : ( () ( (lv_param_1_0= ruleParameter ) )* ( (lv_tracks_2_0= ruleTrack ) )* ) ;
    public final EObject ruleMidiBody() throws RecognitionException {
        EObject current = null;

        EObject lv_param_1_0 = null;

        EObject lv_tracks_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:148:28: ( ( () ( (lv_param_1_0= ruleParameter ) )* ( (lv_tracks_2_0= ruleTrack ) )* ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:149:1: ( () ( (lv_param_1_0= ruleParameter ) )* ( (lv_tracks_2_0= ruleTrack ) )* )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:149:1: ( () ( (lv_param_1_0= ruleParameter ) )* ( (lv_tracks_2_0= ruleTrack ) )* )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:149:2: () ( (lv_param_1_0= ruleParameter ) )* ( (lv_tracks_2_0= ruleTrack ) )*
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

                if ( (LA1_0==14||LA1_0==17||LA1_0==19||LA1_0==21||LA1_0==23) ) {
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

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:173:3: ( (lv_tracks_2_0= ruleTrack ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:174:1: (lv_tracks_2_0= ruleTrack )
            	    {
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:174:1: (lv_tracks_2_0= ruleTrack )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:175:3: lv_tracks_2_0= ruleTrack
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMidiBodyAccess().getTracksTrackParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTrack_in_ruleMidiBody312);
            	    lv_tracks_2_0=ruleTrack();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMidiBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tracks",
            	            		lv_tracks_2_0, 
            	            		"Track");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:199:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:200:2: (iv_ruleParameter= ruleParameter EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:201:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter349);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter359); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:208:1: ruleParameter returns [EObject current=null] : ( ( () (otherlv_1= 'BPM' otherlv_2= ':' ( (lv_beat_3_0= RULE_INT ) ) ) ( (lv_type_4_0= 'bpm' ) ) ) | ( (otherlv_5= 'TIME_SIGNATURE' otherlv_6= ':' ( (lv_tsig_7_0= ruleTimeSignature ) ) ) ( (lv_type_8_0= 'time_sig' ) ) ) | ( (otherlv_9= 'TIME_NOTE' otherlv_10= ':' ( (lv_tn_11_0= ruleTn ) ) ) ( (lv_type_12_0= 'time_note' ) ) ) | ( (otherlv_13= 'TIME_PAUSE' otherlv_14= ':' ( (lv_tp_15_0= ruleTp ) ) ) ( (lv_type_16_0= 'time_pause' ) ) ) | ( (otherlv_17= 'OCTAVE' otherlv_18= ':' ( (lv_octave_19_0= RULE_INT ) ) ) ( (lv_type_20_0= 'octave' ) ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_beat_3_0=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_type_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_type_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_type_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_octave_19_0=null;
        Token lv_type_20_0=null;
        EObject lv_tsig_7_0 = null;

        AntlrDatatypeRuleToken lv_tn_11_0 = null;

        AntlrDatatypeRuleToken lv_tp_15_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:211:28: ( ( ( () (otherlv_1= 'BPM' otherlv_2= ':' ( (lv_beat_3_0= RULE_INT ) ) ) ( (lv_type_4_0= 'bpm' ) ) ) | ( (otherlv_5= 'TIME_SIGNATURE' otherlv_6= ':' ( (lv_tsig_7_0= ruleTimeSignature ) ) ) ( (lv_type_8_0= 'time_sig' ) ) ) | ( (otherlv_9= 'TIME_NOTE' otherlv_10= ':' ( (lv_tn_11_0= ruleTn ) ) ) ( (lv_type_12_0= 'time_note' ) ) ) | ( (otherlv_13= 'TIME_PAUSE' otherlv_14= ':' ( (lv_tp_15_0= ruleTp ) ) ) ( (lv_type_16_0= 'time_pause' ) ) ) | ( (otherlv_17= 'OCTAVE' otherlv_18= ':' ( (lv_octave_19_0= RULE_INT ) ) ) ( (lv_type_20_0= 'octave' ) ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:212:1: ( ( () (otherlv_1= 'BPM' otherlv_2= ':' ( (lv_beat_3_0= RULE_INT ) ) ) ( (lv_type_4_0= 'bpm' ) ) ) | ( (otherlv_5= 'TIME_SIGNATURE' otherlv_6= ':' ( (lv_tsig_7_0= ruleTimeSignature ) ) ) ( (lv_type_8_0= 'time_sig' ) ) ) | ( (otherlv_9= 'TIME_NOTE' otherlv_10= ':' ( (lv_tn_11_0= ruleTn ) ) ) ( (lv_type_12_0= 'time_note' ) ) ) | ( (otherlv_13= 'TIME_PAUSE' otherlv_14= ':' ( (lv_tp_15_0= ruleTp ) ) ) ( (lv_type_16_0= 'time_pause' ) ) ) | ( (otherlv_17= 'OCTAVE' otherlv_18= ':' ( (lv_octave_19_0= RULE_INT ) ) ) ( (lv_type_20_0= 'octave' ) ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:212:1: ( ( () (otherlv_1= 'BPM' otherlv_2= ':' ( (lv_beat_3_0= RULE_INT ) ) ) ( (lv_type_4_0= 'bpm' ) ) ) | ( (otherlv_5= 'TIME_SIGNATURE' otherlv_6= ':' ( (lv_tsig_7_0= ruleTimeSignature ) ) ) ( (lv_type_8_0= 'time_sig' ) ) ) | ( (otherlv_9= 'TIME_NOTE' otherlv_10= ':' ( (lv_tn_11_0= ruleTn ) ) ) ( (lv_type_12_0= 'time_note' ) ) ) | ( (otherlv_13= 'TIME_PAUSE' otherlv_14= ':' ( (lv_tp_15_0= ruleTp ) ) ) ( (lv_type_16_0= 'time_pause' ) ) ) | ( (otherlv_17= 'OCTAVE' otherlv_18= ':' ( (lv_octave_19_0= RULE_INT ) ) ) ( (lv_type_20_0= 'octave' ) ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:212:2: ( () (otherlv_1= 'BPM' otherlv_2= ':' ( (lv_beat_3_0= RULE_INT ) ) ) ( (lv_type_4_0= 'bpm' ) ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:212:2: ( () (otherlv_1= 'BPM' otherlv_2= ':' ( (lv_beat_3_0= RULE_INT ) ) ) ( (lv_type_4_0= 'bpm' ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:212:3: () (otherlv_1= 'BPM' otherlv_2= ':' ( (lv_beat_3_0= RULE_INT ) ) ) ( (lv_type_4_0= 'bpm' ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:212:3: ()
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:213:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterAccess().getParameterAction_0_0(),
                                current);
                        

                    }

                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:218:2: (otherlv_1= 'BPM' otherlv_2= ':' ( (lv_beat_3_0= RULE_INT ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:218:4: otherlv_1= 'BPM' otherlv_2= ':' ( (lv_beat_3_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleParameter407); 

                        	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getBPMKeyword_0_1_0());
                        
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleParameter419); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_0_1_1());
                        
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:226:1: ( (lv_beat_3_0= RULE_INT ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:227:1: (lv_beat_3_0= RULE_INT )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:227:1: (lv_beat_3_0= RULE_INT )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:228:3: lv_beat_3_0= RULE_INT
                    {
                    lv_beat_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameter436); 

                    			newLeafNode(lv_beat_3_0, grammarAccess.getParameterAccess().getBeatINTTerminalRuleCall_0_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"beat",
                            		lv_beat_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }

                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:244:3: ( (lv_type_4_0= 'bpm' ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:245:1: (lv_type_4_0= 'bpm' )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:245:1: (lv_type_4_0= 'bpm' )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:246:3: lv_type_4_0= 'bpm'
                    {
                    lv_type_4_0=(Token)match(input,16,FOLLOW_16_in_ruleParameter460); 

                            newLeafNode(lv_type_4_0, grammarAccess.getParameterAccess().getTypeBpmKeyword_0_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_4_0, "bpm");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:260:6: ( (otherlv_5= 'TIME_SIGNATURE' otherlv_6= ':' ( (lv_tsig_7_0= ruleTimeSignature ) ) ) ( (lv_type_8_0= 'time_sig' ) ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:260:6: ( (otherlv_5= 'TIME_SIGNATURE' otherlv_6= ':' ( (lv_tsig_7_0= ruleTimeSignature ) ) ) ( (lv_type_8_0= 'time_sig' ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:260:7: (otherlv_5= 'TIME_SIGNATURE' otherlv_6= ':' ( (lv_tsig_7_0= ruleTimeSignature ) ) ) ( (lv_type_8_0= 'time_sig' ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:260:7: (otherlv_5= 'TIME_SIGNATURE' otherlv_6= ':' ( (lv_tsig_7_0= ruleTimeSignature ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:260:9: otherlv_5= 'TIME_SIGNATURE' otherlv_6= ':' ( (lv_tsig_7_0= ruleTimeSignature ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleParameter494); 

                        	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getTIME_SIGNATUREKeyword_1_0_0());
                        
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleParameter506); 

                        	newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getColonKeyword_1_0_1());
                        
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:268:1: ( (lv_tsig_7_0= ruleTimeSignature ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:269:1: (lv_tsig_7_0= ruleTimeSignature )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:269:1: (lv_tsig_7_0= ruleTimeSignature )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:270:3: lv_tsig_7_0= ruleTimeSignature
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getTsigTimeSignatureParserRuleCall_1_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeSignature_in_ruleParameter527);
                    lv_tsig_7_0=ruleTimeSignature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"tsig",
                            		lv_tsig_7_0, 
                            		"TimeSignature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }

                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:286:3: ( (lv_type_8_0= 'time_sig' ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:287:1: (lv_type_8_0= 'time_sig' )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:287:1: (lv_type_8_0= 'time_sig' )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:288:3: lv_type_8_0= 'time_sig'
                    {
                    lv_type_8_0=(Token)match(input,18,FOLLOW_18_in_ruleParameter546); 

                            newLeafNode(lv_type_8_0, grammarAccess.getParameterAccess().getTypeTime_sigKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_8_0, "time_sig");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:302:6: ( (otherlv_9= 'TIME_NOTE' otherlv_10= ':' ( (lv_tn_11_0= ruleTn ) ) ) ( (lv_type_12_0= 'time_note' ) ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:302:6: ( (otherlv_9= 'TIME_NOTE' otherlv_10= ':' ( (lv_tn_11_0= ruleTn ) ) ) ( (lv_type_12_0= 'time_note' ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:302:7: (otherlv_9= 'TIME_NOTE' otherlv_10= ':' ( (lv_tn_11_0= ruleTn ) ) ) ( (lv_type_12_0= 'time_note' ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:302:7: (otherlv_9= 'TIME_NOTE' otherlv_10= ':' ( (lv_tn_11_0= ruleTn ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:302:9: otherlv_9= 'TIME_NOTE' otherlv_10= ':' ( (lv_tn_11_0= ruleTn ) )
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleParameter580); 

                        	newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getTIME_NOTEKeyword_2_0_0());
                        
                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleParameter592); 

                        	newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getColonKeyword_2_0_1());
                        
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:310:1: ( (lv_tn_11_0= ruleTn ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:311:1: (lv_tn_11_0= ruleTn )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:311:1: (lv_tn_11_0= ruleTn )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:312:3: lv_tn_11_0= ruleTn
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getTnTnParserRuleCall_2_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTn_in_ruleParameter613);
                    lv_tn_11_0=ruleTn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"tn",
                            		lv_tn_11_0, 
                            		"Tn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }

                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:328:3: ( (lv_type_12_0= 'time_note' ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:329:1: (lv_type_12_0= 'time_note' )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:329:1: (lv_type_12_0= 'time_note' )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:330:3: lv_type_12_0= 'time_note'
                    {
                    lv_type_12_0=(Token)match(input,20,FOLLOW_20_in_ruleParameter632); 

                            newLeafNode(lv_type_12_0, grammarAccess.getParameterAccess().getTypeTime_noteKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_12_0, "time_note");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:344:6: ( (otherlv_13= 'TIME_PAUSE' otherlv_14= ':' ( (lv_tp_15_0= ruleTp ) ) ) ( (lv_type_16_0= 'time_pause' ) ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:344:6: ( (otherlv_13= 'TIME_PAUSE' otherlv_14= ':' ( (lv_tp_15_0= ruleTp ) ) ) ( (lv_type_16_0= 'time_pause' ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:344:7: (otherlv_13= 'TIME_PAUSE' otherlv_14= ':' ( (lv_tp_15_0= ruleTp ) ) ) ( (lv_type_16_0= 'time_pause' ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:344:7: (otherlv_13= 'TIME_PAUSE' otherlv_14= ':' ( (lv_tp_15_0= ruleTp ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:344:9: otherlv_13= 'TIME_PAUSE' otherlv_14= ':' ( (lv_tp_15_0= ruleTp ) )
                    {
                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleParameter666); 

                        	newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getTIME_PAUSEKeyword_3_0_0());
                        
                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleParameter678); 

                        	newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getColonKeyword_3_0_1());
                        
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:352:1: ( (lv_tp_15_0= ruleTp ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:353:1: (lv_tp_15_0= ruleTp )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:353:1: (lv_tp_15_0= ruleTp )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:354:3: lv_tp_15_0= ruleTp
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getTpTpParserRuleCall_3_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTp_in_ruleParameter699);
                    lv_tp_15_0=ruleTp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"tp",
                            		lv_tp_15_0, 
                            		"Tp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }

                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:370:3: ( (lv_type_16_0= 'time_pause' ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:371:1: (lv_type_16_0= 'time_pause' )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:371:1: (lv_type_16_0= 'time_pause' )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:372:3: lv_type_16_0= 'time_pause'
                    {
                    lv_type_16_0=(Token)match(input,22,FOLLOW_22_in_ruleParameter718); 

                            newLeafNode(lv_type_16_0, grammarAccess.getParameterAccess().getTypeTime_pauseKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_16_0, "time_pause");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:386:6: ( (otherlv_17= 'OCTAVE' otherlv_18= ':' ( (lv_octave_19_0= RULE_INT ) ) ) ( (lv_type_20_0= 'octave' ) ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:386:6: ( (otherlv_17= 'OCTAVE' otherlv_18= ':' ( (lv_octave_19_0= RULE_INT ) ) ) ( (lv_type_20_0= 'octave' ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:386:7: (otherlv_17= 'OCTAVE' otherlv_18= ':' ( (lv_octave_19_0= RULE_INT ) ) ) ( (lv_type_20_0= 'octave' ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:386:7: (otherlv_17= 'OCTAVE' otherlv_18= ':' ( (lv_octave_19_0= RULE_INT ) ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:386:9: otherlv_17= 'OCTAVE' otherlv_18= ':' ( (lv_octave_19_0= RULE_INT ) )
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleParameter752); 

                        	newLeafNode(otherlv_17, grammarAccess.getParameterAccess().getOCTAVEKeyword_4_0_0());
                        
                    otherlv_18=(Token)match(input,15,FOLLOW_15_in_ruleParameter764); 

                        	newLeafNode(otherlv_18, grammarAccess.getParameterAccess().getColonKeyword_4_0_1());
                        
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:394:1: ( (lv_octave_19_0= RULE_INT ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:395:1: (lv_octave_19_0= RULE_INT )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:395:1: (lv_octave_19_0= RULE_INT )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:396:3: lv_octave_19_0= RULE_INT
                    {
                    lv_octave_19_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleParameter781); 

                    			newLeafNode(lv_octave_19_0, grammarAccess.getParameterAccess().getOctaveINTTerminalRuleCall_4_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"octave",
                            		lv_octave_19_0, 
                            		"INT");
                    	    

                    }


                    }


                    }

                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:412:3: ( (lv_type_20_0= 'octave' ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:413:1: (lv_type_20_0= 'octave' )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:413:1: (lv_type_20_0= 'octave' )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:414:3: lv_type_20_0= 'octave'
                    {
                    lv_type_20_0=(Token)match(input,24,FOLLOW_24_in_ruleParameter805); 

                            newLeafNode(lv_type_20_0, grammarAccess.getParameterAccess().getTypeOctaveKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_20_0, "octave");
                    	    

                    }


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTrack"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:435:1: entryRuleTrack returns [EObject current=null] : iv_ruleTrack= ruleTrack EOF ;
    public final EObject entryRuleTrack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrack = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:436:2: (iv_ruleTrack= ruleTrack EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:437:2: iv_ruleTrack= ruleTrack EOF
            {
             newCompositeNode(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_ruleTrack_in_entryRuleTrack855);
            iv_ruleTrack=ruleTrack();

            state._fsp--;

             current =iv_ruleTrack; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrack865); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:444:1: ruleTrack returns [EObject current=null] : (otherlv_0= 'TRACK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleInstrument otherlv_4= '{' ( (lv_tbody_5_0= ruleTrackBody ) ) otherlv_6= '}' ) ;
    public final EObject ruleTrack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_tbody_5_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:447:28: ( (otherlv_0= 'TRACK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleInstrument otherlv_4= '{' ( (lv_tbody_5_0= ruleTrackBody ) ) otherlv_6= '}' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:448:1: (otherlv_0= 'TRACK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleInstrument otherlv_4= '{' ( (lv_tbody_5_0= ruleTrackBody ) ) otherlv_6= '}' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:448:1: (otherlv_0= 'TRACK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleInstrument otherlv_4= '{' ( (lv_tbody_5_0= ruleTrackBody ) ) otherlv_6= '}' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:448:3: otherlv_0= 'TRACK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ruleInstrument otherlv_4= '{' ( (lv_tbody_5_0= ruleTrackBody ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTrack902); 

                	newLeafNode(otherlv_0, grammarAccess.getTrackAccess().getTRACKKeyword_0());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:452:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:453:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:453:1: (lv_name_1_0= RULE_ID )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:454:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrack919); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTrack936); 

                	newLeafNode(otherlv_2, grammarAccess.getTrackAccess().getColonKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getTrackAccess().getInstrumentParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleInstrument_in_ruleTrack952);
            ruleInstrument();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleTrack963); 

                	newLeafNode(otherlv_4, grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_4());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:486:1: ( (lv_tbody_5_0= ruleTrackBody ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:487:1: (lv_tbody_5_0= ruleTrackBody )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:487:1: (lv_tbody_5_0= ruleTrackBody )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:488:3: lv_tbody_5_0= ruleTrackBody
            {
             
            	        newCompositeNode(grammarAccess.getTrackAccess().getTbodyTrackBodyParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTrackBody_in_ruleTrack984);
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

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleTrack996); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:516:1: entryRuleTrackBody returns [EObject current=null] : iv_ruleTrackBody= ruleTrackBody EOF ;
    public final EObject entryRuleTrackBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrackBody = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:517:2: (iv_ruleTrackBody= ruleTrackBody EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:518:2: iv_ruleTrackBody= ruleTrackBody EOF
            {
             newCompositeNode(grammarAccess.getTrackBodyRule()); 
            pushFollow(FOLLOW_ruleTrackBody_in_entryRuleTrackBody1032);
            iv_ruleTrackBody=ruleTrackBody();

            state._fsp--;

             current =iv_ruleTrackBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrackBody1042); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:525:1: ruleTrackBody returns [EObject current=null] : ( ( (lv_body_0_0= ruleBodyComponent ) ) ( (lv_more_1_0= ruleMoreTrackBody ) )? ) ;
    public final EObject ruleTrackBody() throws RecognitionException {
        EObject current = null;

        EObject lv_body_0_0 = null;

        EObject lv_more_1_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:528:28: ( ( ( (lv_body_0_0= ruleBodyComponent ) ) ( (lv_more_1_0= ruleMoreTrackBody ) )? ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:529:1: ( ( (lv_body_0_0= ruleBodyComponent ) ) ( (lv_more_1_0= ruleMoreTrackBody ) )? )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:529:1: ( ( (lv_body_0_0= ruleBodyComponent ) ) ( (lv_more_1_0= ruleMoreTrackBody ) )? )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:529:2: ( (lv_body_0_0= ruleBodyComponent ) ) ( (lv_more_1_0= ruleMoreTrackBody ) )?
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:529:2: ( (lv_body_0_0= ruleBodyComponent ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:530:1: (lv_body_0_0= ruleBodyComponent )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:530:1: (lv_body_0_0= ruleBodyComponent )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:531:3: lv_body_0_0= ruleBodyComponent
            {
             
            	        newCompositeNode(grammarAccess.getTrackBodyAccess().getBodyBodyComponentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBodyComponent_in_ruleTrackBody1088);
            lv_body_0_0=ruleBodyComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTrackBodyRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_0_0, 
                    		"BodyComponent");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:547:2: ( (lv_more_1_0= ruleMoreTrackBody ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:548:1: (lv_more_1_0= ruleMoreTrackBody )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:548:1: (lv_more_1_0= ruleMoreTrackBody )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:549:3: lv_more_1_0= ruleMoreTrackBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getTrackBodyAccess().getMoreMoreTrackBodyParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMoreTrackBody_in_ruleTrackBody1109);
                    lv_more_1_0=ruleMoreTrackBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTrackBodyRule());
                    	        }
                           		set(
                           			current, 
                           			"more",
                            		lv_more_1_0, 
                            		"MoreTrackBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleTrackBody"


    // $ANTLR start "entryRuleMoreTrackBody"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:573:1: entryRuleMoreTrackBody returns [EObject current=null] : iv_ruleMoreTrackBody= ruleMoreTrackBody EOF ;
    public final EObject entryRuleMoreTrackBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoreTrackBody = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:574:2: (iv_ruleMoreTrackBody= ruleMoreTrackBody EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:575:2: iv_ruleMoreTrackBody= ruleMoreTrackBody EOF
            {
             newCompositeNode(grammarAccess.getMoreTrackBodyRule()); 
            pushFollow(FOLLOW_ruleMoreTrackBody_in_entryRuleMoreTrackBody1146);
            iv_ruleMoreTrackBody=ruleMoreTrackBody();

            state._fsp--;

             current =iv_ruleMoreTrackBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMoreTrackBody1156); 

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
    // $ANTLR end "entryRuleMoreTrackBody"


    // $ANTLR start "ruleMoreTrackBody"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:582:1: ruleMoreTrackBody returns [EObject current=null] : ( () (otherlv_1= ',' ( (lv_morebody_2_0= ruleBodyComponent ) ) )+ ) ;
    public final EObject ruleMoreTrackBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_morebody_2_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:585:28: ( ( () (otherlv_1= ',' ( (lv_morebody_2_0= ruleBodyComponent ) ) )+ ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:586:1: ( () (otherlv_1= ',' ( (lv_morebody_2_0= ruleBodyComponent ) ) )+ )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:586:1: ( () (otherlv_1= ',' ( (lv_morebody_2_0= ruleBodyComponent ) ) )+ )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:586:2: () (otherlv_1= ',' ( (lv_morebody_2_0= ruleBodyComponent ) ) )+
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:586:2: ()
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:587:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMoreTrackBodyAccess().getMoreTrackBodyAction_0(),
                        current);
                

            }

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:592:2: (otherlv_1= ',' ( (lv_morebody_2_0= ruleBodyComponent ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:592:4: otherlv_1= ',' ( (lv_morebody_2_0= ruleBodyComponent ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleMoreTrackBody1203); 

            	        	newLeafNode(otherlv_1, grammarAccess.getMoreTrackBodyAccess().getCommaKeyword_1_0());
            	        
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:596:1: ( (lv_morebody_2_0= ruleBodyComponent ) )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:597:1: (lv_morebody_2_0= ruleBodyComponent )
            	    {
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:597:1: (lv_morebody_2_0= ruleBodyComponent )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:598:3: lv_morebody_2_0= ruleBodyComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMoreTrackBodyAccess().getMorebodyBodyComponentParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBodyComponent_in_ruleMoreTrackBody1224);
            	    lv_morebody_2_0=ruleBodyComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMoreTrackBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"morebody",
            	            		lv_morebody_2_0, 
            	            		"BodyComponent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleMoreTrackBody"


    // $ANTLR start "entryRuleBodyComponent"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:622:1: entryRuleBodyComponent returns [EObject current=null] : iv_ruleBodyComponent= ruleBodyComponent EOF ;
    public final EObject entryRuleBodyComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyComponent = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:623:2: (iv_ruleBodyComponent= ruleBodyComponent EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:624:2: iv_ruleBodyComponent= ruleBodyComponent EOF
            {
             newCompositeNode(grammarAccess.getBodyComponentRule()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent1262);
            iv_ruleBodyComponent=ruleBodyComponent();

            state._fsp--;

             current =iv_ruleBodyComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent1272); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:631:1: ruleBodyComponent returns [EObject current=null] : ( ( (lv_cnote_0_0= ruleCustomNote ) ) | ( (lv_note_1_0= ruleNote ) ) | ( (lv_block_2_0= ruleBlock ) ) | ( (lv_chord_3_0= ruleChord ) ) ) ;
    public final EObject ruleBodyComponent() throws RecognitionException {
        EObject current = null;

        EObject lv_cnote_0_0 = null;

        AntlrDatatypeRuleToken lv_note_1_0 = null;

        EObject lv_block_2_0 = null;

        EObject lv_chord_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:634:28: ( ( ( (lv_cnote_0_0= ruleCustomNote ) ) | ( (lv_note_1_0= ruleNote ) ) | ( (lv_block_2_0= ruleBlock ) ) | ( (lv_chord_3_0= ruleChord ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:635:1: ( ( (lv_cnote_0_0= ruleCustomNote ) ) | ( (lv_note_1_0= ruleNote ) ) | ( (lv_block_2_0= ruleBlock ) ) | ( (lv_chord_3_0= ruleChord ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:635:1: ( ( (lv_cnote_0_0= ruleCustomNote ) ) | ( (lv_note_1_0= ruleNote ) ) | ( (lv_block_2_0= ruleBlock ) ) | ( (lv_chord_3_0= ruleChord ) ) )
            int alt6=4;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:635:2: ( (lv_cnote_0_0= ruleCustomNote ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:635:2: ( (lv_cnote_0_0= ruleCustomNote ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:636:1: (lv_cnote_0_0= ruleCustomNote )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:636:1: (lv_cnote_0_0= ruleCustomNote )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:637:3: lv_cnote_0_0= ruleCustomNote
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyComponentAccess().getCnoteCustomNoteParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCustomNote_in_ruleBodyComponent1318);
                    lv_cnote_0_0=ruleCustomNote();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"cnote",
                            		lv_cnote_0_0, 
                            		"CustomNote");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:654:6: ( (lv_note_1_0= ruleNote ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:654:6: ( (lv_note_1_0= ruleNote ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:655:1: (lv_note_1_0= ruleNote )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:655:1: (lv_note_1_0= ruleNote )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:656:3: lv_note_1_0= ruleNote
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyComponentAccess().getNoteNoteParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNote_in_ruleBodyComponent1345);
                    lv_note_1_0=ruleNote();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"note",
                            		lv_note_1_0, 
                            		"Note");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:673:6: ( (lv_block_2_0= ruleBlock ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:673:6: ( (lv_block_2_0= ruleBlock ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:674:1: (lv_block_2_0= ruleBlock )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:674:1: (lv_block_2_0= ruleBlock )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:675:3: lv_block_2_0= ruleBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyComponentAccess().getBlockBlockParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBlock_in_ruleBodyComponent1372);
                    lv_block_2_0=ruleBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"block",
                            		lv_block_2_0, 
                            		"Block");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:692:6: ( (lv_chord_3_0= ruleChord ) )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:692:6: ( (lv_chord_3_0= ruleChord ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:693:1: (lv_chord_3_0= ruleChord )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:693:1: (lv_chord_3_0= ruleChord )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:694:3: lv_chord_3_0= ruleChord
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyComponentAccess().getChordChordParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleChord_in_ruleBodyComponent1399);
                    lv_chord_3_0=ruleChord();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyComponentRule());
                    	        }
                           		set(
                           			current, 
                           			"chord",
                            		lv_chord_3_0, 
                            		"Chord");
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
    // $ANTLR end "ruleBodyComponent"


    // $ANTLR start "entryRuleBlock"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:718:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:719:2: (iv_ruleBlock= ruleBlock EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:720:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock1435);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock1445); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:727:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'BLOCK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_blockbody_3_0= ruleTrackBody ) )* otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_blockbody_3_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:730:28: ( (otherlv_0= 'BLOCK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_blockbody_3_0= ruleTrackBody ) )* otherlv_4= '}' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:731:1: (otherlv_0= 'BLOCK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_blockbody_3_0= ruleTrackBody ) )* otherlv_4= '}' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:731:1: (otherlv_0= 'BLOCK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_blockbody_3_0= ruleTrackBody ) )* otherlv_4= '}' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:731:3: otherlv_0= 'BLOCK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_blockbody_3_0= ruleTrackBody ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleBlock1482); 

                	newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBLOCKKeyword_0());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:735:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:736:1: (lv_name_1_0= RULE_ID )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:736:1: (lv_name_1_0= RULE_ID )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:737:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBlock1499); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBlock1516); 

                	newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:757:1: ( (lv_blockbody_3_0= ruleTrackBody ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27||(LA7_0>=38 && LA7_0<=45)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:758:1: (lv_blockbody_3_0= ruleTrackBody )
            	    {
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:758:1: (lv_blockbody_3_0= ruleTrackBody )
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:759:3: lv_blockbody_3_0= ruleTrackBody
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getBlockbodyTrackBodyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTrackBody_in_ruleBlock1537);
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleBlock1550); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:787:1: entryRuleTimeSignature returns [EObject current=null] : iv_ruleTimeSignature= ruleTimeSignature EOF ;
    public final EObject entryRuleTimeSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSignature = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:788:2: (iv_ruleTimeSignature= ruleTimeSignature EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:789:2: iv_ruleTimeSignature= ruleTimeSignature EOF
            {
             newCompositeNode(grammarAccess.getTimeSignatureRule()); 
            pushFollow(FOLLOW_ruleTimeSignature_in_entryRuleTimeSignature1586);
            iv_ruleTimeSignature=ruleTimeSignature();

            state._fsp--;

             current =iv_ruleTimeSignature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeSignature1596); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:796:1: ruleTimeSignature returns [EObject current=null] : ( ( (lv_quantity_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_note_2_0= RULE_INT ) ) ) ;
    public final EObject ruleTimeSignature() throws RecognitionException {
        EObject current = null;

        Token lv_quantity_0_0=null;
        Token otherlv_1=null;
        Token lv_note_2_0=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:799:28: ( ( ( (lv_quantity_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_note_2_0= RULE_INT ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:800:1: ( ( (lv_quantity_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_note_2_0= RULE_INT ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:800:1: ( ( (lv_quantity_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_note_2_0= RULE_INT ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:800:2: ( (lv_quantity_0_0= RULE_INT ) ) otherlv_1= '/' ( (lv_note_2_0= RULE_INT ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:800:2: ( (lv_quantity_0_0= RULE_INT ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:801:1: (lv_quantity_0_0= RULE_INT )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:801:1: (lv_quantity_0_0= RULE_INT )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:802:3: lv_quantity_0_0= RULE_INT
            {
            lv_quantity_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeSignature1638); 

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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleTimeSignature1655); 

                	newLeafNode(otherlv_1, grammarAccess.getTimeSignatureAccess().getSolidusKeyword_1());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:822:1: ( (lv_note_2_0= RULE_INT ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:823:1: (lv_note_2_0= RULE_INT )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:823:1: (lv_note_2_0= RULE_INT )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:824:3: lv_note_2_0= RULE_INT
            {
            lv_note_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTimeSignature1672); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:848:1: entryRuleTp returns [String current=null] : iv_ruleTp= ruleTp EOF ;
    public final String entryRuleTp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTp = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:849:2: (iv_ruleTp= ruleTp EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:850:2: iv_ruleTp= ruleTp EOF
            {
             newCompositeNode(grammarAccess.getTpRule()); 
            pushFollow(FOLLOW_ruleTp_in_entryRuleTp1714);
            iv_ruleTp=ruleTp();

            state._fsp--;

             current =iv_ruleTp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTp1725); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:857:1: ruleTp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'sb' | kw= 'm' | kw= 'sm' | kw= 'cl' | kw= 'sc' | kw= 'f' | kw= 'sf' ) ;
    public final AntlrDatatypeRuleToken ruleTp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:860:28: ( (kw= 'sb' | kw= 'm' | kw= 'sm' | kw= 'cl' | kw= 'sc' | kw= 'f' | kw= 'sf' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:861:1: (kw= 'sb' | kw= 'm' | kw= 'sm' | kw= 'cl' | kw= 'sc' | kw= 'f' | kw= 'sf' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:861:1: (kw= 'sb' | kw= 'm' | kw= 'sm' | kw= 'cl' | kw= 'sc' | kw= 'f' | kw= 'sf' )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            case 33:
                {
                alt8=5;
                }
                break;
            case 34:
                {
                alt8=6;
                }
                break;
            case 35:
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
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:862:2: kw= 'sb'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleTp1763); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getSbKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:869:2: kw= 'm'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleTp1782); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getMKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:876:2: kw= 'sm'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleTp1801); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getSmKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:883:2: kw= 'cl'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleTp1820); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getClKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:890:2: kw= 'sc'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleTp1839); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getScKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:897:2: kw= 'f'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleTp1858); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTpAccess().getFKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:904:2: kw= 'sf'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleTp1877); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:917:1: entryRuleTn returns [String current=null] : iv_ruleTn= ruleTn EOF ;
    public final String entryRuleTn() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTn = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:918:2: (iv_ruleTn= ruleTn EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:919:2: iv_ruleTn= ruleTn EOF
            {
             newCompositeNode(grammarAccess.getTnRule()); 
            pushFollow(FOLLOW_ruleTn_in_entryRuleTn1918);
            iv_ruleTn=ruleTn();

            state._fsp--;

             current =iv_ruleTn.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTn1929); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:926:1: ruleTn returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Tp_0= ruleTp ;
    public final AntlrDatatypeRuleToken ruleTn() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Tp_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:929:28: (this_Tp_0= ruleTp )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:931:5: this_Tp_0= ruleTp
            {
             
                    newCompositeNode(grammarAccess.getTnAccess().getTpParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTp_in_ruleTn1975);
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


    // $ANTLR start "entryRuleCustomNote"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:949:1: entryRuleCustomNote returns [EObject current=null] : iv_ruleCustomNote= ruleCustomNote EOF ;
    public final EObject entryRuleCustomNote() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomNote = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:950:2: (iv_ruleCustomNote= ruleCustomNote EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:951:2: iv_ruleCustomNote= ruleCustomNote EOF
            {
             newCompositeNode(grammarAccess.getCustomNoteRule()); 
            pushFollow(FOLLOW_ruleCustomNote_in_entryRuleCustomNote2019);
            iv_ruleCustomNote=ruleCustomNote();

            state._fsp--;

             current =iv_ruleCustomNote; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomNote2029); 

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
    // $ANTLR end "entryRuleCustomNote"


    // $ANTLR start "ruleCustomNote"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:958:1: ruleCustomNote returns [EObject current=null] : ( ruleNote otherlv_1= '(' this_CustomNoteParam_2= ruleCustomNoteParam otherlv_3= ')' ) ;
    public final EObject ruleCustomNote() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_CustomNoteParam_2 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:961:28: ( ( ruleNote otherlv_1= '(' this_CustomNoteParam_2= ruleCustomNoteParam otherlv_3= ')' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:962:1: ( ruleNote otherlv_1= '(' this_CustomNoteParam_2= ruleCustomNoteParam otherlv_3= ')' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:962:1: ( ruleNote otherlv_1= '(' this_CustomNoteParam_2= ruleCustomNoteParam otherlv_3= ')' )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:963:5: ruleNote otherlv_1= '(' this_CustomNoteParam_2= ruleCustomNoteParam otherlv_3= ')'
            {
             
                    newCompositeNode(grammarAccess.getCustomNoteAccess().getNoteParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNote_in_ruleCustomNote2070);
            ruleNote();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleCustomNote2081); 

                	newLeafNode(otherlv_1, grammarAccess.getCustomNoteAccess().getLeftParenthesisKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getCustomNoteAccess().getCustomNoteParamParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleCustomNoteParam_in_ruleCustomNote2103);
            this_CustomNoteParam_2=ruleCustomNoteParam();

            state._fsp--;

             
                    current = this_CustomNoteParam_2; 
                    afterParserOrEnumRuleCall();
                
            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleCustomNote2114); 

                	newLeafNode(otherlv_3, grammarAccess.getCustomNoteAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleCustomNote"


    // $ANTLR start "entryRuleChord"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:995:1: entryRuleChord returns [EObject current=null] : iv_ruleChord= ruleChord EOF ;
    public final EObject entryRuleChord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChord = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:996:2: (iv_ruleChord= ruleChord EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:997:2: iv_ruleChord= ruleChord EOF
            {
             newCompositeNode(grammarAccess.getChordRule()); 
            pushFollow(FOLLOW_ruleChord_in_entryRuleChord2150);
            iv_ruleChord=ruleChord();

            state._fsp--;

             current =iv_ruleChord; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChord2160); 

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
    // $ANTLR end "entryRuleChord"


    // $ANTLR start "ruleChord"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1004:1: ruleChord returns [EObject current=null] : (otherlv_0= 'chord' otherlv_1= '(' this_ChordParams_2= ruleChordParams otherlv_3= ')' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject ruleChord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        EObject this_ChordParams_2 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1007:28: ( (otherlv_0= 'chord' otherlv_1= '(' this_ChordParams_2= ruleChordParams otherlv_3= ')' ( (lv_name_4_0= RULE_ID ) ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1008:1: (otherlv_0= 'chord' otherlv_1= '(' this_ChordParams_2= ruleChordParams otherlv_3= ')' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1008:1: (otherlv_0= 'chord' otherlv_1= '(' this_ChordParams_2= ruleChordParams otherlv_3= ')' ( (lv_name_4_0= RULE_ID ) ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1008:3: otherlv_0= 'chord' otherlv_1= '(' this_ChordParams_2= ruleChordParams otherlv_3= ')' ( (lv_name_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleChord2197); 

                	newLeafNode(otherlv_0, grammarAccess.getChordAccess().getChordKeyword_0());
                
            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleChord2209); 

                	newLeafNode(otherlv_1, grammarAccess.getChordAccess().getLeftParenthesisKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getChordAccess().getChordParamsParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleChordParams_in_ruleChord2231);
            this_ChordParams_2=ruleChordParams();

            state._fsp--;

             
                    current = this_ChordParams_2; 
                    afterParserOrEnumRuleCall();
                
            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleChord2242); 

                	newLeafNode(otherlv_3, grammarAccess.getChordAccess().getRightParenthesisKeyword_3());
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1029:1: ( (lv_name_4_0= RULE_ID ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1030:1: (lv_name_4_0= RULE_ID )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1030:1: (lv_name_4_0= RULE_ID )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1031:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChord2259); 

            			newLeafNode(lv_name_4_0, grammarAccess.getChordAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChordRule());
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
    // $ANTLR end "ruleChord"


    // $ANTLR start "entryRuleChordParams"
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1055:1: entryRuleChordParams returns [EObject current=null] : iv_ruleChordParams= ruleChordParams EOF ;
    public final EObject entryRuleChordParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChordParams = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1056:2: (iv_ruleChordParams= ruleChordParams EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1057:2: iv_ruleChordParams= ruleChordParams EOF
            {
             newCompositeNode(grammarAccess.getChordParamsRule()); 
            pushFollow(FOLLOW_ruleChordParams_in_entryRuleChordParams2300);
            iv_ruleChordParams=ruleChordParams();

            state._fsp--;

             current =iv_ruleChordParams; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChordParams2310); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1064:1: ruleChordParams returns [EObject current=null] : ( ( ruleNote | this_CustomNote_1= ruleCustomNote ) (otherlv_2= ',' ( ruleNote | ( (lv_cnotes_4_0= ruleCustomNote ) ) ) )* ) ;
    public final EObject ruleChordParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CustomNote_1 = null;

        EObject lv_cnotes_4_0 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1067:28: ( ( ( ruleNote | this_CustomNote_1= ruleCustomNote ) (otherlv_2= ',' ( ruleNote | ( (lv_cnotes_4_0= ruleCustomNote ) ) ) )* ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1068:1: ( ( ruleNote | this_CustomNote_1= ruleCustomNote ) (otherlv_2= ',' ( ruleNote | ( (lv_cnotes_4_0= ruleCustomNote ) ) ) )* )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1068:1: ( ( ruleNote | this_CustomNote_1= ruleCustomNote ) (otherlv_2= ',' ( ruleNote | ( (lv_cnotes_4_0= ruleCustomNote ) ) ) )* )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1068:2: ( ruleNote | this_CustomNote_1= ruleCustomNote ) (otherlv_2= ',' ( ruleNote | ( (lv_cnotes_4_0= ruleCustomNote ) ) ) )*
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1068:2: ( ruleNote | this_CustomNote_1= ruleCustomNote )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1069:5: ruleNote
                    {
                     
                            newCompositeNode(grammarAccess.getChordParamsAccess().getNoteParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleNote_in_ruleChordParams2352);
                    ruleNote();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1078:5: this_CustomNote_1= ruleCustomNote
                    {
                     
                            newCompositeNode(grammarAccess.getChordParamsAccess().getCustomNoteParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleCustomNote_in_ruleChordParams2379);
                    this_CustomNote_1=ruleCustomNote();

                    state._fsp--;

                     
                            current = this_CustomNote_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1086:2: (otherlv_2= ',' ( ruleNote | ( (lv_cnotes_4_0= ruleCustomNote ) ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1086:4: otherlv_2= ',' ( ruleNote | ( (lv_cnotes_4_0= ruleCustomNote ) ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleChordParams2392); 

            	        	newLeafNode(otherlv_2, grammarAccess.getChordParamsAccess().getCommaKeyword_1_0());
            	        
            	    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1090:1: ( ruleNote | ( (lv_cnotes_4_0= ruleCustomNote ) ) )
            	    int alt10=2;
            	    alt10 = dfa10.predict(input);
            	    switch (alt10) {
            	        case 1 :
            	            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1091:5: ruleNote
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getChordParamsAccess().getNoteParserRuleCall_1_1_0()); 
            	                
            	            pushFollow(FOLLOW_ruleNote_in_ruleChordParams2409);
            	            ruleNote();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1099:6: ( (lv_cnotes_4_0= ruleCustomNote ) )
            	            {
            	            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1099:6: ( (lv_cnotes_4_0= ruleCustomNote ) )
            	            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1100:1: (lv_cnotes_4_0= ruleCustomNote )
            	            {
            	            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1100:1: (lv_cnotes_4_0= ruleCustomNote )
            	            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1101:3: lv_cnotes_4_0= ruleCustomNote
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getChordParamsAccess().getCnotesCustomNoteParserRuleCall_1_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleCustomNote_in_ruleChordParams2435);
            	            lv_cnotes_4_0=ruleCustomNote();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getChordParamsRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"cnotes",
            	                    		lv_cnotes_4_0, 
            	                    		"CustomNote");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1125:1: entryRuleNoteLetter returns [String current=null] : iv_ruleNoteLetter= ruleNoteLetter EOF ;
    public final String entryRuleNoteLetter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoteLetter = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1126:2: (iv_ruleNoteLetter= ruleNoteLetter EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1127:2: iv_ruleNoteLetter= ruleNoteLetter EOF
            {
             newCompositeNode(grammarAccess.getNoteLetterRule()); 
            pushFollow(FOLLOW_ruleNoteLetter_in_entryRuleNoteLetter2475);
            iv_ruleNoteLetter=ruleNoteLetter();

            state._fsp--;

             current =iv_ruleNoteLetter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoteLetter2486); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1134:1: ruleNoteLetter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'A' | kw= 'B' ) ;
    public final AntlrDatatypeRuleToken ruleNoteLetter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1137:28: ( (kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'A' | kw= 'B' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1138:1: (kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'A' | kw= 'B' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1138:1: (kw= 'C' | kw= 'D' | kw= 'E' | kw= 'F' | kw= 'G' | kw= 'A' | kw= 'B' )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 41:
                {
                alt12=3;
                }
                break;
            case 42:
                {
                alt12=4;
                }
                break;
            case 43:
                {
                alt12=5;
                }
                break;
            case 44:
                {
                alt12=6;
                }
                break;
            case 45:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1139:2: kw= 'C'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleNoteLetter2524); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getCKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1146:2: kw= 'D'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleNoteLetter2543); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getDKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1153:2: kw= 'E'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleNoteLetter2562); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1160:2: kw= 'F'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleNoteLetter2581); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getFKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1167:2: kw= 'G'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleNoteLetter2600); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getGKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1174:2: kw= 'A'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleNoteLetter2619); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoteLetterAccess().getAKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1181:2: kw= 'B'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleNoteLetter2638); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1194:1: entryRuleAccident returns [String current=null] : iv_ruleAccident= ruleAccident EOF ;
    public final String entryRuleAccident() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAccident = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1195:2: (iv_ruleAccident= ruleAccident EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1196:2: iv_ruleAccident= ruleAccident EOF
            {
             newCompositeNode(grammarAccess.getAccidentRule()); 
            pushFollow(FOLLOW_ruleAccident_in_entryRuleAccident2679);
            iv_ruleAccident=ruleAccident();

            state._fsp--;

             current =iv_ruleAccident.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccident2690); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1203:1: ruleAccident returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' | kw= 'b' ) ;
    public final AntlrDatatypeRuleToken ruleAccident() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1206:28: ( (kw= '#' | kw= 'b' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1207:1: (kw= '#' | kw= 'b' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1207:1: (kw= '#' | kw= 'b' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            else if ( (LA13_0==47) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1208:2: kw= '#'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleAccident2728); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAccidentAccess().getNumberSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1215:2: kw= 'b'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleAccident2747); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1228:1: entryRuleNote returns [String current=null] : iv_ruleNote= ruleNote EOF ;
    public final String entryRuleNote() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNote = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1229:2: (iv_ruleNote= ruleNote EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1230:2: iv_ruleNote= ruleNote EOF
            {
             newCompositeNode(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote2788);
            iv_ruleNote=ruleNote();

            state._fsp--;

             current =iv_ruleNote.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote2799); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1237:1: ruleNote returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NoteLetter_0= ruleNoteLetter (this_Accident_1= ruleAccident )? ) ;
    public final AntlrDatatypeRuleToken ruleNote() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NoteLetter_0 = null;

        AntlrDatatypeRuleToken this_Accident_1 = null;


         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1240:28: ( (this_NoteLetter_0= ruleNoteLetter (this_Accident_1= ruleAccident )? ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1241:1: (this_NoteLetter_0= ruleNoteLetter (this_Accident_1= ruleAccident )? )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1241:1: (this_NoteLetter_0= ruleNoteLetter (this_Accident_1= ruleAccident )? )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1242:5: this_NoteLetter_0= ruleNoteLetter (this_Accident_1= ruleAccident )?
            {
             
                    newCompositeNode(grammarAccess.getNoteAccess().getNoteLetterParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNoteLetter_in_ruleNote2846);
            this_NoteLetter_0=ruleNoteLetter();

            state._fsp--;


            		current.merge(this_NoteLetter_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1252:1: (this_Accident_1= ruleAccident )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=46 && LA14_0<=47)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1253:5: this_Accident_1= ruleAccident
                    {
                     
                            newCompositeNode(grammarAccess.getNoteAccess().getAccidentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAccident_in_ruleNote2874);
                    this_Accident_1=ruleAccident();

                    state._fsp--;


                    		current.merge(this_Accident_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1271:1: entryRuleInstrument returns [String current=null] : iv_ruleInstrument= ruleInstrument EOF ;
    public final String entryRuleInstrument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInstrument = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1272:2: (iv_ruleInstrument= ruleInstrument EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1273:2: iv_ruleInstrument= ruleInstrument EOF
            {
             newCompositeNode(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_ruleInstrument_in_entryRuleInstrument2922);
            iv_ruleInstrument=ruleInstrument();

            state._fsp--;

             current =iv_ruleInstrument.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstrument2933); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1280:1: ruleInstrument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PIANO' | kw= 'GUITAR' | kw= 'ELETRIC GUITAR' | kw= 'BASS' | kw= 'SAX' | kw= 'VIOLIN' | kw= 'DRUMS' ) ;
    public final AntlrDatatypeRuleToken ruleInstrument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1283:28: ( (kw= 'PIANO' | kw= 'GUITAR' | kw= 'ELETRIC GUITAR' | kw= 'BASS' | kw= 'SAX' | kw= 'VIOLIN' | kw= 'DRUMS' ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1284:1: (kw= 'PIANO' | kw= 'GUITAR' | kw= 'ELETRIC GUITAR' | kw= 'BASS' | kw= 'SAX' | kw= 'VIOLIN' | kw= 'DRUMS' )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1284:1: (kw= 'PIANO' | kw= 'GUITAR' | kw= 'ELETRIC GUITAR' | kw= 'BASS' | kw= 'SAX' | kw= 'VIOLIN' | kw= 'DRUMS' )
            int alt15=7;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt15=1;
                }
                break;
            case 49:
                {
                alt15=2;
                }
                break;
            case 50:
                {
                alt15=3;
                }
                break;
            case 51:
                {
                alt15=4;
                }
                break;
            case 52:
                {
                alt15=5;
                }
                break;
            case 53:
                {
                alt15=6;
                }
                break;
            case 54:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1285:2: kw= 'PIANO'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleInstrument2971); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getPIANOKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1292:2: kw= 'GUITAR'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleInstrument2990); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getGUITARKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1299:2: kw= 'ELETRIC GUITAR'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleInstrument3009); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getELETRICGUITARKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1306:2: kw= 'BASS'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleInstrument3028); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getBASSKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1313:2: kw= 'SAX'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleInstrument3047); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getSAXKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1320:2: kw= 'VIOLIN'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleInstrument3066); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInstrumentAccess().getVIOLINKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1327:2: kw= 'DRUMS'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleInstrument3085); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1340:1: entryRuleCustomNoteParam returns [EObject current=null] : iv_ruleCustomNoteParam= ruleCustomNoteParam EOF ;
    public final EObject entryRuleCustomNoteParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomNoteParam = null;


        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1341:2: (iv_ruleCustomNoteParam= ruleCustomNoteParam EOF )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1342:2: iv_ruleCustomNoteParam= ruleCustomNoteParam EOF
            {
             newCompositeNode(grammarAccess.getCustomNoteParamRule()); 
            pushFollow(FOLLOW_ruleCustomNoteParam_in_entryRuleCustomNoteParam3125);
            iv_ruleCustomNoteParam=ruleCustomNoteParam();

            state._fsp--;

             current =iv_ruleCustomNoteParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomNoteParam3135); 

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
    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1349:1: ruleCustomNoteParam returns [EObject current=null] : ( ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ruleTn ) | ( ruleTn otherlv_4= ',' this_INT_5= RULE_INT ) | this_INT_6= RULE_INT | ruleTn ) ;
    public final EObject ruleCustomNoteParam() throws RecognitionException {
        EObject current = null;

        Token lv_octave_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token this_INT_5=null;
        Token this_INT_6=null;

         enterRule(); 
            
        try {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1352:28: ( ( ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ruleTn ) | ( ruleTn otherlv_4= ',' this_INT_5= RULE_INT ) | this_INT_6= RULE_INT | ruleTn ) )
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1353:1: ( ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ruleTn ) | ( ruleTn otherlv_4= ',' this_INT_5= RULE_INT ) | this_INT_6= RULE_INT | ruleTn )
            {
            // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1353:1: ( ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ruleTn ) | ( ruleTn otherlv_4= ',' this_INT_5= RULE_INT ) | this_INT_6= RULE_INT | ruleTn )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1353:2: ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ruleTn )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1353:2: ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ruleTn )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1353:3: ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ruleTn
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1353:3: ( (lv_octave_0_0= RULE_INT ) )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1354:1: (lv_octave_0_0= RULE_INT )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1354:1: (lv_octave_0_0= RULE_INT )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1355:3: lv_octave_0_0= RULE_INT
                    {
                    lv_octave_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomNoteParam3178); 

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

                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleCustomNoteParam3195); 

                        	newLeafNode(otherlv_1, grammarAccess.getCustomNoteParamAccess().getCommaKeyword_0_1());
                        
                     
                            newCompositeNode(grammarAccess.getCustomNoteParamAccess().getTnParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleTn_in_ruleCustomNoteParam3211);
                    ruleTn();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1384:6: ( ruleTn otherlv_4= ',' this_INT_5= RULE_INT )
                    {
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1384:6: ( ruleTn otherlv_4= ',' this_INT_5= RULE_INT )
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1385:5: ruleTn otherlv_4= ',' this_INT_5= RULE_INT
                    {
                     
                            newCompositeNode(grammarAccess.getCustomNoteParamAccess().getTnParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleTn_in_ruleCustomNoteParam3234);
                    ruleTn();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleCustomNoteParam3245); 

                        	newLeafNode(otherlv_4, grammarAccess.getCustomNoteParamAccess().getCommaKeyword_1_1());
                        
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomNoteParam3256); 
                     
                        newLeafNode(this_INT_5, grammarAccess.getCustomNoteParamAccess().getINTTerminalRuleCall_1_2()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1401:6: this_INT_6= RULE_INT
                    {
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomNoteParam3273); 
                     
                        newLeafNode(this_INT_6, grammarAccess.getCustomNoteParamAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2/src-gen/ufscar/compiladores2/parser/antlr/internal/InternalMusy.g:1407:5: ruleTn
                    {
                     
                            newCompositeNode(grammarAccess.getCustomNoteParamAccess().getTnParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTn_in_ruleCustomNoteParam3294);
                    ruleTn();

                    state._fsp--;

                     
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
    // $ANTLR end "ruleCustomNoteParam"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA6_eotS =
        "\16\uffff";
    static final String DFA6_eofS =
        "\1\uffff\7\14\2\uffff\2\14\2\uffff";
    static final String DFA6_minS =
        "\1\33\7\15\2\uffff\2\15\2\uffff";
    static final String DFA6_maxS =
        "\1\55\7\57\2\uffff\2\55\2\uffff";
    static final String DFA6_acceptS =
        "\10\uffff\1\3\1\4\2\uffff\1\2\1\1";
    static final String DFA6_specialS =
        "\16\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\10\12\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\14\14\uffff\2\14\10\uffff\1\15\1\uffff\10\14\1\12\1\13",
            "\1\14\14\uffff\2\14\10\uffff\1\15\1\uffff\10\14\1\12\1\13",
            "\1\14\14\uffff\2\14\10\uffff\1\15\1\uffff\10\14\1\12\1\13",
            "\1\14\14\uffff\2\14\10\uffff\1\15\1\uffff\10\14\1\12\1\13",
            "\1\14\14\uffff\2\14\10\uffff\1\15\1\uffff\10\14\1\12\1\13",
            "\1\14\14\uffff\2\14\10\uffff\1\15\1\uffff\10\14\1\12\1\13",
            "\1\14\14\uffff\2\14\10\uffff\1\15\1\uffff\10\14\1\12\1\13",
            "",
            "",
            "\1\14\14\uffff\2\14\10\uffff\1\15\1\uffff\10\14",
            "\1\14\14\uffff\2\14\10\uffff\1\15\1\uffff\10\14",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "635:1: ( ( (lv_cnote_0_0= ruleCustomNote ) ) | ( (lv_note_1_0= ruleNote ) ) | ( (lv_block_2_0= ruleBlock ) ) | ( (lv_chord_3_0= ruleChord ) ) )";
        }
    }
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\1\uffff\11\12\2\uffff";
    static final String DFA9_minS =
        "\1\47\11\32\2\uffff";
    static final String DFA9_maxS =
        "\1\55\7\57\2\45\2\uffff";
    static final String DFA9_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\14\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\12\11\uffff\1\13\1\12\10\uffff\1\10\1\11",
            "\1\12\11\uffff\1\13\1\12\10\uffff\1\10\1\11",
            "\1\12\11\uffff\1\13\1\12\10\uffff\1\10\1\11",
            "\1\12\11\uffff\1\13\1\12\10\uffff\1\10\1\11",
            "\1\12\11\uffff\1\13\1\12\10\uffff\1\10\1\11",
            "\1\12\11\uffff\1\13\1\12\10\uffff\1\10\1\11",
            "\1\12\11\uffff\1\13\1\12\10\uffff\1\10\1\11",
            "\1\12\11\uffff\1\13\1\12",
            "\1\12\11\uffff\1\13\1\12",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1068:2: ( ruleNote | this_CustomNote_1= ruleCustomNote )";
        }
    }
    static final String DFA10_eotS =
        "\14\uffff";
    static final String DFA10_eofS =
        "\1\uffff\11\13\2\uffff";
    static final String DFA10_minS =
        "\1\47\11\32\2\uffff";
    static final String DFA10_maxS =
        "\1\55\7\57\2\45\2\uffff";
    static final String DFA10_acceptS =
        "\12\uffff\1\2\1\1";
    static final String DFA10_specialS =
        "\14\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\13\11\uffff\1\12\1\13\10\uffff\1\10\1\11",
            "\1\13\11\uffff\1\12\1\13\10\uffff\1\10\1\11",
            "\1\13\11\uffff\1\12\1\13\10\uffff\1\10\1\11",
            "\1\13\11\uffff\1\12\1\13\10\uffff\1\10\1\11",
            "\1\13\11\uffff\1\12\1\13\10\uffff\1\10\1\11",
            "\1\13\11\uffff\1\12\1\13\10\uffff\1\10\1\11",
            "\1\13\11\uffff\1\12\1\13\10\uffff\1\10\1\11",
            "\1\13\11\uffff\1\12\1\13",
            "\1\13\11\uffff\1\12\1\13",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1090:1: ( ruleNote | ( (lv_cnotes_4_0= ruleCustomNote ) ) )";
        }
    }
    static final String DFA16_eotS =
        "\15\uffff";
    static final String DFA16_eofS =
        "\1\uffff\1\12\7\14\4\uffff";
    static final String DFA16_minS =
        "\1\5\10\32\4\uffff";
    static final String DFA16_maxS =
        "\1\43\10\45\4\uffff";
    static final String DFA16_acceptS =
        "\11\uffff\1\1\1\3\1\2\1\4";
    static final String DFA16_specialS =
        "\15\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\27\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\11\12\uffff\1\12",
            "\1\13\12\uffff\1\14",
            "\1\13\12\uffff\1\14",
            "\1\13\12\uffff\1\14",
            "\1\13\12\uffff\1\14",
            "\1\13\12\uffff\1\14",
            "\1\13\12\uffff\1\14",
            "\1\13\12\uffff\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1353:1: ( ( ( (lv_octave_0_0= RULE_INT ) ) otherlv_1= ',' ruleTn ) | ( ruleTn otherlv_4= ',' this_INT_5= RULE_INT ) | this_INT_6= RULE_INT | ruleTn )";
        }
    }
 

    public static final BitSet FOLLOW_ruleMidi_in_entryRuleMidi75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMidi85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMidi122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMidi139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMidi156 = new BitSet(new long[]{0x0000000002AA6000L});
    public static final BitSet FOLLOW_ruleMidiBody_in_ruleMidi177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMidi189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMidiBody_in_entryRuleMidiBody225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMidiBody235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMidiBody290 = new BitSet(new long[]{0x0000000002AA4002L});
    public static final BitSet FOLLOW_ruleTrack_in_ruleMidiBody312 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleParameter407 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameter419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameter436 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleParameter460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleParameter494 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameter506 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTimeSignature_in_ruleParameter527 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleParameter546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleParameter580 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameter592 = new BitSet(new long[]{0x0000000FE0000000L});
    public static final BitSet FOLLOW_ruleTn_in_ruleParameter613 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleParameter632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleParameter666 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameter678 = new BitSet(new long[]{0x0000000FE0000000L});
    public static final BitSet FOLLOW_ruleTp_in_ruleParameter699 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleParameter718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleParameter752 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameter764 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleParameter781 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleParameter805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrack_in_entryRuleTrack855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrack865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTrack902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrack919 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTrack936 = new BitSet(new long[]{0x007F000000000000L});
    public static final BitSet FOLLOW_ruleInstrument_in_ruleTrack952 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTrack963 = new BitSet(new long[]{0x00003FC008000000L});
    public static final BitSet FOLLOW_ruleTrackBody_in_ruleTrack984 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTrack996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrackBody_in_entryRuleTrackBody1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrackBody1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleTrackBody1088 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleMoreTrackBody_in_ruleTrackBody1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoreTrackBody_in_entryRuleMoreTrackBody1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMoreTrackBody1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMoreTrackBody1203 = new BitSet(new long[]{0x00003FC008000000L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_ruleMoreTrackBody1224 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNote_in_ruleBodyComponent1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleBodyComponent1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleBodyComponent1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_ruleBodyComponent1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock1435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBlock1482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBlock1499 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBlock1516 = new BitSet(new long[]{0x00003FC008002000L});
    public static final BitSet FOLLOW_ruleTrackBody_in_ruleBlock1537 = new BitSet(new long[]{0x00003FC008002000L});
    public static final BitSet FOLLOW_13_in_ruleBlock1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeSignature_in_entryRuleTimeSignature1586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeSignature1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeSignature1638 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTimeSignature1655 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTimeSignature1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTp_in_entryRuleTp1714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTp1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTp1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTp1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTp1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTp1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTp1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTp1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTp1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTn_in_entryRuleTn1918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTn1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTp_in_ruleTn1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNote_in_entryRuleCustomNote2019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomNote2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleCustomNote2070 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCustomNote2081 = new BitSet(new long[]{0x0000000FE0000020L});
    public static final BitSet FOLLOW_ruleCustomNoteParam_in_ruleCustomNote2103 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCustomNote2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_entryRuleChord2150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChord2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleChord2197 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleChord2209 = new BitSet(new long[]{0x00003F8000000000L});
    public static final BitSet FOLLOW_ruleChordParams_in_ruleChord2231 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleChord2242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChord2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChordParams_in_entryRuleChordParams2300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChordParams2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChordParams2352 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleCustomNote_in_ruleChordParams2379 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleChordParams2392 = new BitSet(new long[]{0x00003F8000000000L});
    public static final BitSet FOLLOW_ruleNote_in_ruleChordParams2409 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleCustomNote_in_ruleChordParams2435 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleNoteLetter_in_entryRuleNoteLetter2475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoteLetter2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNoteLetter2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNoteLetter2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNoteLetter2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNoteLetter2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNoteLetter2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleNoteLetter2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleNoteLetter2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccident_in_entryRuleAccident2679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccident2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAccident2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAccident2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote2788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoteLetter_in_ruleNote2846 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_ruleAccident_in_ruleNote2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_entryRuleInstrument2922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstrument2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleInstrument2971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleInstrument2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleInstrument3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInstrument3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInstrument3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInstrument3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInstrument3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNoteParam_in_entryRuleCustomNoteParam3125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomNoteParam3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomNoteParam3178 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCustomNoteParam3195 = new BitSet(new long[]{0x0000000FE0000000L});
    public static final BitSet FOLLOW_ruleTn_in_ruleCustomNoteParam3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTn_in_ruleCustomNoteParam3234 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCustomNoteParam3245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomNoteParam3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomNoteParam3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTn_in_ruleCustomNoteParam3294 = new BitSet(new long[]{0x0000000000000002L});

}