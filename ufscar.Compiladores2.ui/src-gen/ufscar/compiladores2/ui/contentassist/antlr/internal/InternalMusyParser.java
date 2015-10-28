package ufscar.compiladores2.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ufscar.compiladores2.services.MusyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMusyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sb'", "'m'", "'sm'", "'cl'", "'sc'", "'f'", "'sf'", "'C'", "'D'", "'E'", "'F'", "'G'", "'A'", "'B'", "'#'", "'b'", "'PIANO'", "'GUITAR'", "'ELETRIC GUITAR'", "'BASS'", "'SAX'", "'VIOLIN'", "'DRUMS'", "'MIDI'", "'{'", "'}'", "'BPM'", "':'", "'TIME_SIGNATURE'", "'TIME_NOTE'", "'TIME_PAUSE'", "'OCTAVE'", "'TRACK'", "','", "'BLOCK'", "'/'", "'('", "')'", "'chord'", "'bpm'", "'time_sig'", "'time_note'", "'time_pause'", "'octave'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g"; }


     
     	private MusyGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MusyGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMidi"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:60:1: entryRuleMidi : ruleMidi EOF ;
    public final void entryRuleMidi() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:61:1: ( ruleMidi EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:62:1: ruleMidi EOF
            {
             before(grammarAccess.getMidiRule()); 
            pushFollow(FOLLOW_ruleMidi_in_entryRuleMidi61);
            ruleMidi();

            state._fsp--;

             after(grammarAccess.getMidiRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMidi68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMidi"


    // $ANTLR start "ruleMidi"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:69:1: ruleMidi : ( ( rule__Midi__Group__0 ) ) ;
    public final void ruleMidi() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:73:2: ( ( ( rule__Midi__Group__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:74:1: ( ( rule__Midi__Group__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:74:1: ( ( rule__Midi__Group__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:75:1: ( rule__Midi__Group__0 )
            {
             before(grammarAccess.getMidiAccess().getGroup()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:76:1: ( rule__Midi__Group__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:76:2: rule__Midi__Group__0
            {
            pushFollow(FOLLOW_rule__Midi__Group__0_in_ruleMidi94);
            rule__Midi__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMidiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMidi"


    // $ANTLR start "entryRuleMidiBody"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:88:1: entryRuleMidiBody : ruleMidiBody EOF ;
    public final void entryRuleMidiBody() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:89:1: ( ruleMidiBody EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:90:1: ruleMidiBody EOF
            {
             before(grammarAccess.getMidiBodyRule()); 
            pushFollow(FOLLOW_ruleMidiBody_in_entryRuleMidiBody121);
            ruleMidiBody();

            state._fsp--;

             after(grammarAccess.getMidiBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMidiBody128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMidiBody"


    // $ANTLR start "ruleMidiBody"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:97:1: ruleMidiBody : ( ( rule__MidiBody__Group__0 ) ) ;
    public final void ruleMidiBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:101:2: ( ( ( rule__MidiBody__Group__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:102:1: ( ( rule__MidiBody__Group__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:102:1: ( ( rule__MidiBody__Group__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:103:1: ( rule__MidiBody__Group__0 )
            {
             before(grammarAccess.getMidiBodyAccess().getGroup()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:104:1: ( rule__MidiBody__Group__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:104:2: rule__MidiBody__Group__0
            {
            pushFollow(FOLLOW_rule__MidiBody__Group__0_in_ruleMidiBody154);
            rule__MidiBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMidiBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMidiBody"


    // $ANTLR start "entryRuleParameter"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:116:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:117:1: ( ruleParameter EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:118:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter181);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:125:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:129:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:130:1: ( ( rule__Parameter__Alternatives ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:130:1: ( ( rule__Parameter__Alternatives ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:131:1: ( rule__Parameter__Alternatives )
            {
             before(grammarAccess.getParameterAccess().getAlternatives()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:132:1: ( rule__Parameter__Alternatives )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:132:2: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_rule__Parameter__Alternatives_in_ruleParameter214);
            rule__Parameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleTrack"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:144:1: entryRuleTrack : ruleTrack EOF ;
    public final void entryRuleTrack() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:145:1: ( ruleTrack EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:146:1: ruleTrack EOF
            {
             before(grammarAccess.getTrackRule()); 
            pushFollow(FOLLOW_ruleTrack_in_entryRuleTrack241);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getTrackRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrack248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrack"


    // $ANTLR start "ruleTrack"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:153:1: ruleTrack : ( ( rule__Track__Group__0 ) ) ;
    public final void ruleTrack() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:157:2: ( ( ( rule__Track__Group__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:158:1: ( ( rule__Track__Group__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:158:1: ( ( rule__Track__Group__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:159:1: ( rule__Track__Group__0 )
            {
             before(grammarAccess.getTrackAccess().getGroup()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:160:1: ( rule__Track__Group__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:160:2: rule__Track__Group__0
            {
            pushFollow(FOLLOW_rule__Track__Group__0_in_ruleTrack274);
            rule__Track__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrack"


    // $ANTLR start "entryRuleTrackBody"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:172:1: entryRuleTrackBody : ruleTrackBody EOF ;
    public final void entryRuleTrackBody() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:173:1: ( ruleTrackBody EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:174:1: ruleTrackBody EOF
            {
             before(grammarAccess.getTrackBodyRule()); 
            pushFollow(FOLLOW_ruleTrackBody_in_entryRuleTrackBody301);
            ruleTrackBody();

            state._fsp--;

             after(grammarAccess.getTrackBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrackBody308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrackBody"


    // $ANTLR start "ruleTrackBody"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:181:1: ruleTrackBody : ( ( rule__TrackBody__Group__0 ) ) ;
    public final void ruleTrackBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:185:2: ( ( ( rule__TrackBody__Group__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:186:1: ( ( rule__TrackBody__Group__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:186:1: ( ( rule__TrackBody__Group__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:187:1: ( rule__TrackBody__Group__0 )
            {
             before(grammarAccess.getTrackBodyAccess().getGroup()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:188:1: ( rule__TrackBody__Group__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:188:2: rule__TrackBody__Group__0
            {
            pushFollow(FOLLOW_rule__TrackBody__Group__0_in_ruleTrackBody334);
            rule__TrackBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrackBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrackBody"


    // $ANTLR start "entryRuleMoreTrackBody"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:200:1: entryRuleMoreTrackBody : ruleMoreTrackBody EOF ;
    public final void entryRuleMoreTrackBody() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:201:1: ( ruleMoreTrackBody EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:202:1: ruleMoreTrackBody EOF
            {
             before(grammarAccess.getMoreTrackBodyRule()); 
            pushFollow(FOLLOW_ruleMoreTrackBody_in_entryRuleMoreTrackBody361);
            ruleMoreTrackBody();

            state._fsp--;

             after(grammarAccess.getMoreTrackBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMoreTrackBody368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoreTrackBody"


    // $ANTLR start "ruleMoreTrackBody"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:209:1: ruleMoreTrackBody : ( ( rule__MoreTrackBody__Group__0 ) ) ;
    public final void ruleMoreTrackBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:213:2: ( ( ( rule__MoreTrackBody__Group__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:214:1: ( ( rule__MoreTrackBody__Group__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:214:1: ( ( rule__MoreTrackBody__Group__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:215:1: ( rule__MoreTrackBody__Group__0 )
            {
             before(grammarAccess.getMoreTrackBodyAccess().getGroup()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:216:1: ( rule__MoreTrackBody__Group__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:216:2: rule__MoreTrackBody__Group__0
            {
            pushFollow(FOLLOW_rule__MoreTrackBody__Group__0_in_ruleMoreTrackBody394);
            rule__MoreTrackBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoreTrackBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoreTrackBody"


    // $ANTLR start "entryRuleBodyComponent"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:228:1: entryRuleBodyComponent : ruleBodyComponent EOF ;
    public final void entryRuleBodyComponent() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:229:1: ( ruleBodyComponent EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:230:1: ruleBodyComponent EOF
            {
             before(grammarAccess.getBodyComponentRule()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent421);
            ruleBodyComponent();

            state._fsp--;

             after(grammarAccess.getBodyComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBodyComponent"


    // $ANTLR start "ruleBodyComponent"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:237:1: ruleBodyComponent : ( ( rule__BodyComponent__Alternatives ) ) ;
    public final void ruleBodyComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:241:2: ( ( ( rule__BodyComponent__Alternatives ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:242:1: ( ( rule__BodyComponent__Alternatives ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:242:1: ( ( rule__BodyComponent__Alternatives ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:243:1: ( rule__BodyComponent__Alternatives )
            {
             before(grammarAccess.getBodyComponentAccess().getAlternatives()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:244:1: ( rule__BodyComponent__Alternatives )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:244:2: rule__BodyComponent__Alternatives
            {
            pushFollow(FOLLOW_rule__BodyComponent__Alternatives_in_ruleBodyComponent454);
            rule__BodyComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBodyComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBodyComponent"


    // $ANTLR start "entryRuleBlock"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:256:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:257:1: ( ruleBlock EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:258:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock481);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:265:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:269:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:270:1: ( ( rule__Block__Group__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:270:1: ( ( rule__Block__Group__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:271:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:272:1: ( rule__Block__Group__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:272:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock514);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleTimeSignature"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:284:1: entryRuleTimeSignature : ruleTimeSignature EOF ;
    public final void entryRuleTimeSignature() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:285:1: ( ruleTimeSignature EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:286:1: ruleTimeSignature EOF
            {
             before(grammarAccess.getTimeSignatureRule()); 
            pushFollow(FOLLOW_ruleTimeSignature_in_entryRuleTimeSignature541);
            ruleTimeSignature();

            state._fsp--;

             after(grammarAccess.getTimeSignatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeSignature548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeSignature"


    // $ANTLR start "ruleTimeSignature"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:293:1: ruleTimeSignature : ( ( rule__TimeSignature__Group__0 ) ) ;
    public final void ruleTimeSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:297:2: ( ( ( rule__TimeSignature__Group__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:298:1: ( ( rule__TimeSignature__Group__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:298:1: ( ( rule__TimeSignature__Group__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:299:1: ( rule__TimeSignature__Group__0 )
            {
             before(grammarAccess.getTimeSignatureAccess().getGroup()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:300:1: ( rule__TimeSignature__Group__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:300:2: rule__TimeSignature__Group__0
            {
            pushFollow(FOLLOW_rule__TimeSignature__Group__0_in_ruleTimeSignature574);
            rule__TimeSignature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeSignature"


    // $ANTLR start "entryRuleTp"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:312:1: entryRuleTp : ruleTp EOF ;
    public final void entryRuleTp() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:313:1: ( ruleTp EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:314:1: ruleTp EOF
            {
             before(grammarAccess.getTpRule()); 
            pushFollow(FOLLOW_ruleTp_in_entryRuleTp601);
            ruleTp();

            state._fsp--;

             after(grammarAccess.getTpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTp608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTp"


    // $ANTLR start "ruleTp"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:321:1: ruleTp : ( ( rule__Tp__Alternatives ) ) ;
    public final void ruleTp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:325:2: ( ( ( rule__Tp__Alternatives ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:326:1: ( ( rule__Tp__Alternatives ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:326:1: ( ( rule__Tp__Alternatives ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:327:1: ( rule__Tp__Alternatives )
            {
             before(grammarAccess.getTpAccess().getAlternatives()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:328:1: ( rule__Tp__Alternatives )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:328:2: rule__Tp__Alternatives
            {
            pushFollow(FOLLOW_rule__Tp__Alternatives_in_ruleTp634);
            rule__Tp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTp"


    // $ANTLR start "entryRuleTn"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:340:1: entryRuleTn : ruleTn EOF ;
    public final void entryRuleTn() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:341:1: ( ruleTn EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:342:1: ruleTn EOF
            {
             before(grammarAccess.getTnRule()); 
            pushFollow(FOLLOW_ruleTn_in_entryRuleTn661);
            ruleTn();

            state._fsp--;

             after(grammarAccess.getTnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTn668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTn"


    // $ANTLR start "ruleTn"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:349:1: ruleTn : ( ruleTp ) ;
    public final void ruleTn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:353:2: ( ( ruleTp ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:354:1: ( ruleTp )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:354:1: ( ruleTp )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:355:1: ruleTp
            {
             before(grammarAccess.getTnAccess().getTpParserRuleCall()); 
            pushFollow(FOLLOW_ruleTp_in_ruleTn694);
            ruleTp();

            state._fsp--;

             after(grammarAccess.getTnAccess().getTpParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTn"


    // $ANTLR start "entryRuleCustomNote"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:368:1: entryRuleCustomNote : ruleCustomNote EOF ;
    public final void entryRuleCustomNote() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:369:1: ( ruleCustomNote EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:370:1: ruleCustomNote EOF
            {
             before(grammarAccess.getCustomNoteRule()); 
            pushFollow(FOLLOW_ruleCustomNote_in_entryRuleCustomNote720);
            ruleCustomNote();

            state._fsp--;

             after(grammarAccess.getCustomNoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomNote727); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomNote"


    // $ANTLR start "ruleCustomNote"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:377:1: ruleCustomNote : ( ( rule__CustomNote__Group__0 ) ) ;
    public final void ruleCustomNote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:381:2: ( ( ( rule__CustomNote__Group__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:382:1: ( ( rule__CustomNote__Group__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:382:1: ( ( rule__CustomNote__Group__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:383:1: ( rule__CustomNote__Group__0 )
            {
             before(grammarAccess.getCustomNoteAccess().getGroup()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:384:1: ( rule__CustomNote__Group__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:384:2: rule__CustomNote__Group__0
            {
            pushFollow(FOLLOW_rule__CustomNote__Group__0_in_ruleCustomNote753);
            rule__CustomNote__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomNote"


    // $ANTLR start "entryRuleChord"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:396:1: entryRuleChord : ruleChord EOF ;
    public final void entryRuleChord() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:397:1: ( ruleChord EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:398:1: ruleChord EOF
            {
             before(grammarAccess.getChordRule()); 
            pushFollow(FOLLOW_ruleChord_in_entryRuleChord780);
            ruleChord();

            state._fsp--;

             after(grammarAccess.getChordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChord787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChord"


    // $ANTLR start "ruleChord"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:405:1: ruleChord : ( ( rule__Chord__Group__0 ) ) ;
    public final void ruleChord() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:409:2: ( ( ( rule__Chord__Group__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:410:1: ( ( rule__Chord__Group__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:410:1: ( ( rule__Chord__Group__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:411:1: ( rule__Chord__Group__0 )
            {
             before(grammarAccess.getChordAccess().getGroup()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:412:1: ( rule__Chord__Group__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:412:2: rule__Chord__Group__0
            {
            pushFollow(FOLLOW_rule__Chord__Group__0_in_ruleChord813);
            rule__Chord__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChordAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChord"


    // $ANTLR start "entryRuleChordParams"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:424:1: entryRuleChordParams : ruleChordParams EOF ;
    public final void entryRuleChordParams() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:425:1: ( ruleChordParams EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:426:1: ruleChordParams EOF
            {
             before(grammarAccess.getChordParamsRule()); 
            pushFollow(FOLLOW_ruleChordParams_in_entryRuleChordParams840);
            ruleChordParams();

            state._fsp--;

             after(grammarAccess.getChordParamsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChordParams847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChordParams"


    // $ANTLR start "ruleChordParams"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:433:1: ruleChordParams : ( ( rule__ChordParams__Group__0 ) ) ;
    public final void ruleChordParams() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:437:2: ( ( ( rule__ChordParams__Group__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:438:1: ( ( rule__ChordParams__Group__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:438:1: ( ( rule__ChordParams__Group__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:439:1: ( rule__ChordParams__Group__0 )
            {
             before(grammarAccess.getChordParamsAccess().getGroup()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:440:1: ( rule__ChordParams__Group__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:440:2: rule__ChordParams__Group__0
            {
            pushFollow(FOLLOW_rule__ChordParams__Group__0_in_ruleChordParams873);
            rule__ChordParams__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChordParamsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChordParams"


    // $ANTLR start "entryRuleNoteLetter"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:452:1: entryRuleNoteLetter : ruleNoteLetter EOF ;
    public final void entryRuleNoteLetter() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:453:1: ( ruleNoteLetter EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:454:1: ruleNoteLetter EOF
            {
             before(grammarAccess.getNoteLetterRule()); 
            pushFollow(FOLLOW_ruleNoteLetter_in_entryRuleNoteLetter900);
            ruleNoteLetter();

            state._fsp--;

             after(grammarAccess.getNoteLetterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoteLetter907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoteLetter"


    // $ANTLR start "ruleNoteLetter"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:461:1: ruleNoteLetter : ( ( rule__NoteLetter__Alternatives ) ) ;
    public final void ruleNoteLetter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:465:2: ( ( ( rule__NoteLetter__Alternatives ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:466:1: ( ( rule__NoteLetter__Alternatives ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:466:1: ( ( rule__NoteLetter__Alternatives ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:467:1: ( rule__NoteLetter__Alternatives )
            {
             before(grammarAccess.getNoteLetterAccess().getAlternatives()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:468:1: ( rule__NoteLetter__Alternatives )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:468:2: rule__NoteLetter__Alternatives
            {
            pushFollow(FOLLOW_rule__NoteLetter__Alternatives_in_ruleNoteLetter933);
            rule__NoteLetter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoteLetterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoteLetter"


    // $ANTLR start "entryRuleAccident"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:480:1: entryRuleAccident : ruleAccident EOF ;
    public final void entryRuleAccident() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:481:1: ( ruleAccident EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:482:1: ruleAccident EOF
            {
             before(grammarAccess.getAccidentRule()); 
            pushFollow(FOLLOW_ruleAccident_in_entryRuleAccident960);
            ruleAccident();

            state._fsp--;

             after(grammarAccess.getAccidentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccident967); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccident"


    // $ANTLR start "ruleAccident"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:489:1: ruleAccident : ( ( rule__Accident__Alternatives ) ) ;
    public final void ruleAccident() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:493:2: ( ( ( rule__Accident__Alternatives ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:494:1: ( ( rule__Accident__Alternatives ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:494:1: ( ( rule__Accident__Alternatives ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:495:1: ( rule__Accident__Alternatives )
            {
             before(grammarAccess.getAccidentAccess().getAlternatives()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:496:1: ( rule__Accident__Alternatives )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:496:2: rule__Accident__Alternatives
            {
            pushFollow(FOLLOW_rule__Accident__Alternatives_in_ruleAccident993);
            rule__Accident__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccidentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccident"


    // $ANTLR start "entryRuleNote"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:508:1: entryRuleNote : ruleNote EOF ;
    public final void entryRuleNote() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:509:1: ( ruleNote EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:510:1: ruleNote EOF
            {
             before(grammarAccess.getNoteRule()); 
            pushFollow(FOLLOW_ruleNote_in_entryRuleNote1020);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getNoteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNote1027); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNote"


    // $ANTLR start "ruleNote"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:517:1: ruleNote : ( ( rule__Note__Group__0 ) ) ;
    public final void ruleNote() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:521:2: ( ( ( rule__Note__Group__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:522:1: ( ( rule__Note__Group__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:522:1: ( ( rule__Note__Group__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:523:1: ( rule__Note__Group__0 )
            {
             before(grammarAccess.getNoteAccess().getGroup()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:524:1: ( rule__Note__Group__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:524:2: rule__Note__Group__0
            {
            pushFollow(FOLLOW_rule__Note__Group__0_in_ruleNote1053);
            rule__Note__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNote"


    // $ANTLR start "entryRuleInstrument"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:536:1: entryRuleInstrument : ruleInstrument EOF ;
    public final void entryRuleInstrument() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:537:1: ( ruleInstrument EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:538:1: ruleInstrument EOF
            {
             before(grammarAccess.getInstrumentRule()); 
            pushFollow(FOLLOW_ruleInstrument_in_entryRuleInstrument1080);
            ruleInstrument();

            state._fsp--;

             after(grammarAccess.getInstrumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstrument1087); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstrument"


    // $ANTLR start "ruleInstrument"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:545:1: ruleInstrument : ( ( rule__Instrument__Alternatives ) ) ;
    public final void ruleInstrument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:549:2: ( ( ( rule__Instrument__Alternatives ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:550:1: ( ( rule__Instrument__Alternatives ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:550:1: ( ( rule__Instrument__Alternatives ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:551:1: ( rule__Instrument__Alternatives )
            {
             before(grammarAccess.getInstrumentAccess().getAlternatives()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:552:1: ( rule__Instrument__Alternatives )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:552:2: rule__Instrument__Alternatives
            {
            pushFollow(FOLLOW_rule__Instrument__Alternatives_in_ruleInstrument1113);
            rule__Instrument__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstrumentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstrument"


    // $ANTLR start "entryRuleCustomNoteParam"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:564:1: entryRuleCustomNoteParam : ruleCustomNoteParam EOF ;
    public final void entryRuleCustomNoteParam() throws RecognitionException {
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:565:1: ( ruleCustomNoteParam EOF )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:566:1: ruleCustomNoteParam EOF
            {
             before(grammarAccess.getCustomNoteParamRule()); 
            pushFollow(FOLLOW_ruleCustomNoteParam_in_entryRuleCustomNoteParam1140);
            ruleCustomNoteParam();

            state._fsp--;

             after(grammarAccess.getCustomNoteParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomNoteParam1147); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCustomNoteParam"


    // $ANTLR start "ruleCustomNoteParam"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:573:1: ruleCustomNoteParam : ( ( rule__CustomNoteParam__Alternatives ) ) ;
    public final void ruleCustomNoteParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:577:2: ( ( ( rule__CustomNoteParam__Alternatives ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:578:1: ( ( rule__CustomNoteParam__Alternatives ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:578:1: ( ( rule__CustomNoteParam__Alternatives ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:579:1: ( rule__CustomNoteParam__Alternatives )
            {
             before(grammarAccess.getCustomNoteParamAccess().getAlternatives()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:580:1: ( rule__CustomNoteParam__Alternatives )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:580:2: rule__CustomNoteParam__Alternatives
            {
            pushFollow(FOLLOW_rule__CustomNoteParam__Alternatives_in_ruleCustomNoteParam1173);
            rule__CustomNoteParam__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCustomNoteParamAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomNoteParam"


    // $ANTLR start "rule__Parameter__Alternatives"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:592:1: rule__Parameter__Alternatives : ( ( ( rule__Parameter__Group_0__0 ) ) | ( ( rule__Parameter__Group_1__0 ) ) | ( ( rule__Parameter__Group_2__0 ) ) | ( ( rule__Parameter__Group_3__0 ) ) | ( ( rule__Parameter__Group_4__0 ) ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:596:1: ( ( ( rule__Parameter__Group_0__0 ) ) | ( ( rule__Parameter__Group_1__0 ) ) | ( ( rule__Parameter__Group_2__0 ) ) | ( ( rule__Parameter__Group_3__0 ) ) | ( ( rule__Parameter__Group_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt1=1;
                }
                break;
            case 39:
                {
                alt1=2;
                }
                break;
            case 40:
                {
                alt1=3;
                }
                break;
            case 41:
                {
                alt1=4;
                }
                break;
            case 42:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:597:1: ( ( rule__Parameter__Group_0__0 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:597:1: ( ( rule__Parameter__Group_0__0 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:598:1: ( rule__Parameter__Group_0__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_0()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:599:1: ( rule__Parameter__Group_0__0 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:599:2: rule__Parameter__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_0__0_in_rule__Parameter__Alternatives1209);
                    rule__Parameter__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:603:6: ( ( rule__Parameter__Group_1__0 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:603:6: ( ( rule__Parameter__Group_1__0 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:604:1: ( rule__Parameter__Group_1__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_1()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:605:1: ( rule__Parameter__Group_1__0 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:605:2: rule__Parameter__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_1__0_in_rule__Parameter__Alternatives1227);
                    rule__Parameter__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:609:6: ( ( rule__Parameter__Group_2__0 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:609:6: ( ( rule__Parameter__Group_2__0 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:610:1: ( rule__Parameter__Group_2__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_2()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:611:1: ( rule__Parameter__Group_2__0 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:611:2: rule__Parameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Alternatives1245);
                    rule__Parameter__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:615:6: ( ( rule__Parameter__Group_3__0 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:615:6: ( ( rule__Parameter__Group_3__0 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:616:1: ( rule__Parameter__Group_3__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_3()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:617:1: ( rule__Parameter__Group_3__0 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:617:2: rule__Parameter__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_3__0_in_rule__Parameter__Alternatives1263);
                    rule__Parameter__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:621:6: ( ( rule__Parameter__Group_4__0 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:621:6: ( ( rule__Parameter__Group_4__0 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:622:1: ( rule__Parameter__Group_4__0 )
                    {
                     before(grammarAccess.getParameterAccess().getGroup_4()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:623:1: ( rule__Parameter__Group_4__0 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:623:2: rule__Parameter__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_4__0_in_rule__Parameter__Alternatives1281);
                    rule__Parameter__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Alternatives"


    // $ANTLR start "rule__BodyComponent__Alternatives"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:632:1: rule__BodyComponent__Alternatives : ( ( ( rule__BodyComponent__CnoteAssignment_0 ) ) | ( ( rule__BodyComponent__NoteAssignment_1 ) ) | ( ( rule__BodyComponent__BlockAssignment_2 ) ) | ( ( rule__BodyComponent__ChordAssignment_3 ) ) );
    public final void rule__BodyComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:636:1: ( ( ( rule__BodyComponent__CnoteAssignment_0 ) ) | ( ( rule__BodyComponent__NoteAssignment_1 ) ) | ( ( rule__BodyComponent__BlockAssignment_2 ) ) | ( ( rule__BodyComponent__ChordAssignment_3 ) ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:637:1: ( ( rule__BodyComponent__CnoteAssignment_0 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:637:1: ( ( rule__BodyComponent__CnoteAssignment_0 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:638:1: ( rule__BodyComponent__CnoteAssignment_0 )
                    {
                     before(grammarAccess.getBodyComponentAccess().getCnoteAssignment_0()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:639:1: ( rule__BodyComponent__CnoteAssignment_0 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:639:2: rule__BodyComponent__CnoteAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BodyComponent__CnoteAssignment_0_in_rule__BodyComponent__Alternatives1314);
                    rule__BodyComponent__CnoteAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyComponentAccess().getCnoteAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:643:6: ( ( rule__BodyComponent__NoteAssignment_1 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:643:6: ( ( rule__BodyComponent__NoteAssignment_1 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:644:1: ( rule__BodyComponent__NoteAssignment_1 )
                    {
                     before(grammarAccess.getBodyComponentAccess().getNoteAssignment_1()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:645:1: ( rule__BodyComponent__NoteAssignment_1 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:645:2: rule__BodyComponent__NoteAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BodyComponent__NoteAssignment_1_in_rule__BodyComponent__Alternatives1332);
                    rule__BodyComponent__NoteAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyComponentAccess().getNoteAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:649:6: ( ( rule__BodyComponent__BlockAssignment_2 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:649:6: ( ( rule__BodyComponent__BlockAssignment_2 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:650:1: ( rule__BodyComponent__BlockAssignment_2 )
                    {
                     before(grammarAccess.getBodyComponentAccess().getBlockAssignment_2()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:651:1: ( rule__BodyComponent__BlockAssignment_2 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:651:2: rule__BodyComponent__BlockAssignment_2
                    {
                    pushFollow(FOLLOW_rule__BodyComponent__BlockAssignment_2_in_rule__BodyComponent__Alternatives1350);
                    rule__BodyComponent__BlockAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyComponentAccess().getBlockAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:655:6: ( ( rule__BodyComponent__ChordAssignment_3 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:655:6: ( ( rule__BodyComponent__ChordAssignment_3 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:656:1: ( rule__BodyComponent__ChordAssignment_3 )
                    {
                     before(grammarAccess.getBodyComponentAccess().getChordAssignment_3()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:657:1: ( rule__BodyComponent__ChordAssignment_3 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:657:2: rule__BodyComponent__ChordAssignment_3
                    {
                    pushFollow(FOLLOW_rule__BodyComponent__ChordAssignment_3_in_rule__BodyComponent__Alternatives1368);
                    rule__BodyComponent__ChordAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getBodyComponentAccess().getChordAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyComponent__Alternatives"


    // $ANTLR start "rule__Tp__Alternatives"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:666:1: rule__Tp__Alternatives : ( ( 'sb' ) | ( 'm' ) | ( 'sm' ) | ( 'cl' ) | ( 'sc' ) | ( 'f' ) | ( 'sf' ) );
    public final void rule__Tp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:670:1: ( ( 'sb' ) | ( 'm' ) | ( 'sm' ) | ( 'cl' ) | ( 'sc' ) | ( 'f' ) | ( 'sf' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:671:1: ( 'sb' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:671:1: ( 'sb' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:672:1: 'sb'
                    {
                     before(grammarAccess.getTpAccess().getSbKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Tp__Alternatives1402); 
                     after(grammarAccess.getTpAccess().getSbKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:679:6: ( 'm' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:679:6: ( 'm' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:680:1: 'm'
                    {
                     before(grammarAccess.getTpAccess().getMKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Tp__Alternatives1422); 
                     after(grammarAccess.getTpAccess().getMKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:687:6: ( 'sm' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:687:6: ( 'sm' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:688:1: 'sm'
                    {
                     before(grammarAccess.getTpAccess().getSmKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Tp__Alternatives1442); 
                     after(grammarAccess.getTpAccess().getSmKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:695:6: ( 'cl' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:695:6: ( 'cl' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:696:1: 'cl'
                    {
                     before(grammarAccess.getTpAccess().getClKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__Tp__Alternatives1462); 
                     after(grammarAccess.getTpAccess().getClKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:703:6: ( 'sc' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:703:6: ( 'sc' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:704:1: 'sc'
                    {
                     before(grammarAccess.getTpAccess().getScKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__Tp__Alternatives1482); 
                     after(grammarAccess.getTpAccess().getScKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:711:6: ( 'f' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:711:6: ( 'f' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:712:1: 'f'
                    {
                     before(grammarAccess.getTpAccess().getFKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__Tp__Alternatives1502); 
                     after(grammarAccess.getTpAccess().getFKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:719:6: ( 'sf' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:719:6: ( 'sf' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:720:1: 'sf'
                    {
                     before(grammarAccess.getTpAccess().getSfKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__Tp__Alternatives1522); 
                     after(grammarAccess.getTpAccess().getSfKeyword_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tp__Alternatives"


    // $ANTLR start "rule__ChordParams__Alternatives_0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:732:1: rule__ChordParams__Alternatives_0 : ( ( ruleNote ) | ( ruleCustomNote ) );
    public final void rule__ChordParams__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:736:1: ( ( ruleNote ) | ( ruleCustomNote ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:737:1: ( ruleNote )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:737:1: ( ruleNote )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:738:1: ruleNote
                    {
                     before(grammarAccess.getChordParamsAccess().getNoteParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleNote_in_rule__ChordParams__Alternatives_01556);
                    ruleNote();

                    state._fsp--;

                     after(grammarAccess.getChordParamsAccess().getNoteParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:743:6: ( ruleCustomNote )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:743:6: ( ruleCustomNote )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:744:1: ruleCustomNote
                    {
                     before(grammarAccess.getChordParamsAccess().getCustomNoteParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleCustomNote_in_rule__ChordParams__Alternatives_01573);
                    ruleCustomNote();

                    state._fsp--;

                     after(grammarAccess.getChordParamsAccess().getCustomNoteParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChordParams__Alternatives_0"


    // $ANTLR start "rule__ChordParams__Alternatives_1_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:754:1: rule__ChordParams__Alternatives_1_1 : ( ( ruleNote ) | ( ( rule__ChordParams__CnotesAssignment_1_1_1 ) ) );
    public final void rule__ChordParams__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:758:1: ( ( ruleNote ) | ( ( rule__ChordParams__CnotesAssignment_1_1_1 ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:759:1: ( ruleNote )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:759:1: ( ruleNote )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:760:1: ruleNote
                    {
                     before(grammarAccess.getChordParamsAccess().getNoteParserRuleCall_1_1_0()); 
                    pushFollow(FOLLOW_ruleNote_in_rule__ChordParams__Alternatives_1_11605);
                    ruleNote();

                    state._fsp--;

                     after(grammarAccess.getChordParamsAccess().getNoteParserRuleCall_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:765:6: ( ( rule__ChordParams__CnotesAssignment_1_1_1 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:765:6: ( ( rule__ChordParams__CnotesAssignment_1_1_1 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:766:1: ( rule__ChordParams__CnotesAssignment_1_1_1 )
                    {
                     before(grammarAccess.getChordParamsAccess().getCnotesAssignment_1_1_1()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:767:1: ( rule__ChordParams__CnotesAssignment_1_1_1 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:767:2: rule__ChordParams__CnotesAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__ChordParams__CnotesAssignment_1_1_1_in_rule__ChordParams__Alternatives_1_11622);
                    rule__ChordParams__CnotesAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getChordParamsAccess().getCnotesAssignment_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChordParams__Alternatives_1_1"


    // $ANTLR start "rule__NoteLetter__Alternatives"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:776:1: rule__NoteLetter__Alternatives : ( ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'A' ) | ( 'B' ) );
    public final void rule__NoteLetter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:780:1: ( ( 'C' ) | ( 'D' ) | ( 'E' ) | ( 'F' ) | ( 'G' ) | ( 'A' ) | ( 'B' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            case 23:
                {
                alt6=6;
                }
                break;
            case 24:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:781:1: ( 'C' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:781:1: ( 'C' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:782:1: 'C'
                    {
                     before(grammarAccess.getNoteLetterAccess().getCKeyword_0()); 
                    match(input,18,FOLLOW_18_in_rule__NoteLetter__Alternatives1656); 
                     after(grammarAccess.getNoteLetterAccess().getCKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:789:6: ( 'D' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:789:6: ( 'D' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:790:1: 'D'
                    {
                     before(grammarAccess.getNoteLetterAccess().getDKeyword_1()); 
                    match(input,19,FOLLOW_19_in_rule__NoteLetter__Alternatives1676); 
                     after(grammarAccess.getNoteLetterAccess().getDKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:797:6: ( 'E' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:797:6: ( 'E' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:798:1: 'E'
                    {
                     before(grammarAccess.getNoteLetterAccess().getEKeyword_2()); 
                    match(input,20,FOLLOW_20_in_rule__NoteLetter__Alternatives1696); 
                     after(grammarAccess.getNoteLetterAccess().getEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:805:6: ( 'F' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:805:6: ( 'F' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:806:1: 'F'
                    {
                     before(grammarAccess.getNoteLetterAccess().getFKeyword_3()); 
                    match(input,21,FOLLOW_21_in_rule__NoteLetter__Alternatives1716); 
                     after(grammarAccess.getNoteLetterAccess().getFKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:813:6: ( 'G' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:813:6: ( 'G' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:814:1: 'G'
                    {
                     before(grammarAccess.getNoteLetterAccess().getGKeyword_4()); 
                    match(input,22,FOLLOW_22_in_rule__NoteLetter__Alternatives1736); 
                     after(grammarAccess.getNoteLetterAccess().getGKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:821:6: ( 'A' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:821:6: ( 'A' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:822:1: 'A'
                    {
                     before(grammarAccess.getNoteLetterAccess().getAKeyword_5()); 
                    match(input,23,FOLLOW_23_in_rule__NoteLetter__Alternatives1756); 
                     after(grammarAccess.getNoteLetterAccess().getAKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:829:6: ( 'B' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:829:6: ( 'B' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:830:1: 'B'
                    {
                     before(grammarAccess.getNoteLetterAccess().getBKeyword_6()); 
                    match(input,24,FOLLOW_24_in_rule__NoteLetter__Alternatives1776); 
                     after(grammarAccess.getNoteLetterAccess().getBKeyword_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteLetter__Alternatives"


    // $ANTLR start "rule__Accident__Alternatives"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:842:1: rule__Accident__Alternatives : ( ( '#' ) | ( 'b' ) );
    public final void rule__Accident__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:846:1: ( ( '#' ) | ( 'b' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:847:1: ( '#' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:847:1: ( '#' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:848:1: '#'
                    {
                     before(grammarAccess.getAccidentAccess().getNumberSignKeyword_0()); 
                    match(input,25,FOLLOW_25_in_rule__Accident__Alternatives1811); 
                     after(grammarAccess.getAccidentAccess().getNumberSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:855:6: ( 'b' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:855:6: ( 'b' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:856:1: 'b'
                    {
                     before(grammarAccess.getAccidentAccess().getBKeyword_1()); 
                    match(input,26,FOLLOW_26_in_rule__Accident__Alternatives1831); 
                     after(grammarAccess.getAccidentAccess().getBKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accident__Alternatives"


    // $ANTLR start "rule__Instrument__Alternatives"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:868:1: rule__Instrument__Alternatives : ( ( 'PIANO' ) | ( 'GUITAR' ) | ( 'ELETRIC GUITAR' ) | ( 'BASS' ) | ( 'SAX' ) | ( 'VIOLIN' ) | ( 'DRUMS' ) );
    public final void rule__Instrument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:872:1: ( ( 'PIANO' ) | ( 'GUITAR' ) | ( 'ELETRIC GUITAR' ) | ( 'BASS' ) | ( 'SAX' ) | ( 'VIOLIN' ) | ( 'DRUMS' ) )
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
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:873:1: ( 'PIANO' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:873:1: ( 'PIANO' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:874:1: 'PIANO'
                    {
                     before(grammarAccess.getInstrumentAccess().getPIANOKeyword_0()); 
                    match(input,27,FOLLOW_27_in_rule__Instrument__Alternatives1866); 
                     after(grammarAccess.getInstrumentAccess().getPIANOKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:881:6: ( 'GUITAR' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:881:6: ( 'GUITAR' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:882:1: 'GUITAR'
                    {
                     before(grammarAccess.getInstrumentAccess().getGUITARKeyword_1()); 
                    match(input,28,FOLLOW_28_in_rule__Instrument__Alternatives1886); 
                     after(grammarAccess.getInstrumentAccess().getGUITARKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:889:6: ( 'ELETRIC GUITAR' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:889:6: ( 'ELETRIC GUITAR' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:890:1: 'ELETRIC GUITAR'
                    {
                     before(grammarAccess.getInstrumentAccess().getELETRICGUITARKeyword_2()); 
                    match(input,29,FOLLOW_29_in_rule__Instrument__Alternatives1906); 
                     after(grammarAccess.getInstrumentAccess().getELETRICGUITARKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:897:6: ( 'BASS' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:897:6: ( 'BASS' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:898:1: 'BASS'
                    {
                     before(grammarAccess.getInstrumentAccess().getBASSKeyword_3()); 
                    match(input,30,FOLLOW_30_in_rule__Instrument__Alternatives1926); 
                     after(grammarAccess.getInstrumentAccess().getBASSKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:905:6: ( 'SAX' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:905:6: ( 'SAX' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:906:1: 'SAX'
                    {
                     before(grammarAccess.getInstrumentAccess().getSAXKeyword_4()); 
                    match(input,31,FOLLOW_31_in_rule__Instrument__Alternatives1946); 
                     after(grammarAccess.getInstrumentAccess().getSAXKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:913:6: ( 'VIOLIN' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:913:6: ( 'VIOLIN' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:914:1: 'VIOLIN'
                    {
                     before(grammarAccess.getInstrumentAccess().getVIOLINKeyword_5()); 
                    match(input,32,FOLLOW_32_in_rule__Instrument__Alternatives1966); 
                     after(grammarAccess.getInstrumentAccess().getVIOLINKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:921:6: ( 'DRUMS' )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:921:6: ( 'DRUMS' )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:922:1: 'DRUMS'
                    {
                     before(grammarAccess.getInstrumentAccess().getDRUMSKeyword_6()); 
                    match(input,33,FOLLOW_33_in_rule__Instrument__Alternatives1986); 
                     after(grammarAccess.getInstrumentAccess().getDRUMSKeyword_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instrument__Alternatives"


    // $ANTLR start "rule__CustomNoteParam__Alternatives"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:934:1: rule__CustomNoteParam__Alternatives : ( ( ( rule__CustomNoteParam__Group_0__0 ) ) | ( ( rule__CustomNoteParam__Group_1__0 ) ) | ( RULE_INT ) | ( ruleTn ) );
    public final void rule__CustomNoteParam__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:938:1: ( ( ( rule__CustomNoteParam__Group_0__0 ) ) | ( ( rule__CustomNoteParam__Group_1__0 ) ) | ( RULE_INT ) | ( ruleTn ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:939:1: ( ( rule__CustomNoteParam__Group_0__0 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:939:1: ( ( rule__CustomNoteParam__Group_0__0 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:940:1: ( rule__CustomNoteParam__Group_0__0 )
                    {
                     before(grammarAccess.getCustomNoteParamAccess().getGroup_0()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:941:1: ( rule__CustomNoteParam__Group_0__0 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:941:2: rule__CustomNoteParam__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CustomNoteParam__Group_0__0_in_rule__CustomNoteParam__Alternatives2020);
                    rule__CustomNoteParam__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomNoteParamAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:945:6: ( ( rule__CustomNoteParam__Group_1__0 ) )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:945:6: ( ( rule__CustomNoteParam__Group_1__0 ) )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:946:1: ( rule__CustomNoteParam__Group_1__0 )
                    {
                     before(grammarAccess.getCustomNoteParamAccess().getGroup_1()); 
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:947:1: ( rule__CustomNoteParam__Group_1__0 )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:947:2: rule__CustomNoteParam__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CustomNoteParam__Group_1__0_in_rule__CustomNoteParam__Alternatives2038);
                    rule__CustomNoteParam__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomNoteParamAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:951:6: ( RULE_INT )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:951:6: ( RULE_INT )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:952:1: RULE_INT
                    {
                     before(grammarAccess.getCustomNoteParamAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CustomNoteParam__Alternatives2056); 
                     after(grammarAccess.getCustomNoteParamAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:957:6: ( ruleTn )
                    {
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:957:6: ( ruleTn )
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:958:1: ruleTn
                    {
                     before(grammarAccess.getCustomNoteParamAccess().getTnParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTn_in_rule__CustomNoteParam__Alternatives2073);
                    ruleTn();

                    state._fsp--;

                     after(grammarAccess.getCustomNoteParamAccess().getTnParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Alternatives"


    // $ANTLR start "rule__Midi__Group__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:970:1: rule__Midi__Group__0 : rule__Midi__Group__0__Impl rule__Midi__Group__1 ;
    public final void rule__Midi__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:974:1: ( rule__Midi__Group__0__Impl rule__Midi__Group__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:975:2: rule__Midi__Group__0__Impl rule__Midi__Group__1
            {
            pushFollow(FOLLOW_rule__Midi__Group__0__Impl_in_rule__Midi__Group__02103);
            rule__Midi__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Midi__Group__1_in_rule__Midi__Group__02106);
            rule__Midi__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__Group__0"


    // $ANTLR start "rule__Midi__Group__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:982:1: rule__Midi__Group__0__Impl : ( 'MIDI' ) ;
    public final void rule__Midi__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:986:1: ( ( 'MIDI' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:987:1: ( 'MIDI' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:987:1: ( 'MIDI' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:988:1: 'MIDI'
            {
             before(grammarAccess.getMidiAccess().getMIDIKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Midi__Group__0__Impl2134); 
             after(grammarAccess.getMidiAccess().getMIDIKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__Group__0__Impl"


    // $ANTLR start "rule__Midi__Group__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1001:1: rule__Midi__Group__1 : rule__Midi__Group__1__Impl rule__Midi__Group__2 ;
    public final void rule__Midi__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1005:1: ( rule__Midi__Group__1__Impl rule__Midi__Group__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1006:2: rule__Midi__Group__1__Impl rule__Midi__Group__2
            {
            pushFollow(FOLLOW_rule__Midi__Group__1__Impl_in_rule__Midi__Group__12165);
            rule__Midi__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Midi__Group__2_in_rule__Midi__Group__12168);
            rule__Midi__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__Group__1"


    // $ANTLR start "rule__Midi__Group__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1013:1: rule__Midi__Group__1__Impl : ( ( rule__Midi__NameAssignment_1 ) ) ;
    public final void rule__Midi__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1017:1: ( ( ( rule__Midi__NameAssignment_1 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1018:1: ( ( rule__Midi__NameAssignment_1 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1018:1: ( ( rule__Midi__NameAssignment_1 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1019:1: ( rule__Midi__NameAssignment_1 )
            {
             before(grammarAccess.getMidiAccess().getNameAssignment_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1020:1: ( rule__Midi__NameAssignment_1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1020:2: rule__Midi__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Midi__NameAssignment_1_in_rule__Midi__Group__1__Impl2195);
            rule__Midi__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMidiAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__Group__1__Impl"


    // $ANTLR start "rule__Midi__Group__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1030:1: rule__Midi__Group__2 : rule__Midi__Group__2__Impl rule__Midi__Group__3 ;
    public final void rule__Midi__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1034:1: ( rule__Midi__Group__2__Impl rule__Midi__Group__3 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1035:2: rule__Midi__Group__2__Impl rule__Midi__Group__3
            {
            pushFollow(FOLLOW_rule__Midi__Group__2__Impl_in_rule__Midi__Group__22225);
            rule__Midi__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Midi__Group__3_in_rule__Midi__Group__22228);
            rule__Midi__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__Group__2"


    // $ANTLR start "rule__Midi__Group__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1042:1: rule__Midi__Group__2__Impl : ( '{' ) ;
    public final void rule__Midi__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1046:1: ( ( '{' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1047:1: ( '{' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1047:1: ( '{' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1048:1: '{'
            {
             before(grammarAccess.getMidiAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Midi__Group__2__Impl2256); 
             after(grammarAccess.getMidiAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__Group__2__Impl"


    // $ANTLR start "rule__Midi__Group__3"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1061:1: rule__Midi__Group__3 : rule__Midi__Group__3__Impl rule__Midi__Group__4 ;
    public final void rule__Midi__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1065:1: ( rule__Midi__Group__3__Impl rule__Midi__Group__4 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1066:2: rule__Midi__Group__3__Impl rule__Midi__Group__4
            {
            pushFollow(FOLLOW_rule__Midi__Group__3__Impl_in_rule__Midi__Group__32287);
            rule__Midi__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Midi__Group__4_in_rule__Midi__Group__32290);
            rule__Midi__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__Group__3"


    // $ANTLR start "rule__Midi__Group__3__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1073:1: rule__Midi__Group__3__Impl : ( ( rule__Midi__BodyAssignment_3 ) ) ;
    public final void rule__Midi__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1077:1: ( ( ( rule__Midi__BodyAssignment_3 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1078:1: ( ( rule__Midi__BodyAssignment_3 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1078:1: ( ( rule__Midi__BodyAssignment_3 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1079:1: ( rule__Midi__BodyAssignment_3 )
            {
             before(grammarAccess.getMidiAccess().getBodyAssignment_3()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1080:1: ( rule__Midi__BodyAssignment_3 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1080:2: rule__Midi__BodyAssignment_3
            {
            pushFollow(FOLLOW_rule__Midi__BodyAssignment_3_in_rule__Midi__Group__3__Impl2317);
            rule__Midi__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMidiAccess().getBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__Group__3__Impl"


    // $ANTLR start "rule__Midi__Group__4"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1090:1: rule__Midi__Group__4 : rule__Midi__Group__4__Impl ;
    public final void rule__Midi__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1094:1: ( rule__Midi__Group__4__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1095:2: rule__Midi__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Midi__Group__4__Impl_in_rule__Midi__Group__42347);
            rule__Midi__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__Group__4"


    // $ANTLR start "rule__Midi__Group__4__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1101:1: rule__Midi__Group__4__Impl : ( '}' ) ;
    public final void rule__Midi__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1105:1: ( ( '}' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1106:1: ( '}' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1106:1: ( '}' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1107:1: '}'
            {
             before(grammarAccess.getMidiAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__Midi__Group__4__Impl2375); 
             after(grammarAccess.getMidiAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__Group__4__Impl"


    // $ANTLR start "rule__MidiBody__Group__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1130:1: rule__MidiBody__Group__0 : rule__MidiBody__Group__0__Impl rule__MidiBody__Group__1 ;
    public final void rule__MidiBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1134:1: ( rule__MidiBody__Group__0__Impl rule__MidiBody__Group__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1135:2: rule__MidiBody__Group__0__Impl rule__MidiBody__Group__1
            {
            pushFollow(FOLLOW_rule__MidiBody__Group__0__Impl_in_rule__MidiBody__Group__02416);
            rule__MidiBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MidiBody__Group__1_in_rule__MidiBody__Group__02419);
            rule__MidiBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidiBody__Group__0"


    // $ANTLR start "rule__MidiBody__Group__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1142:1: rule__MidiBody__Group__0__Impl : ( () ) ;
    public final void rule__MidiBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1146:1: ( ( () ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1147:1: ( () )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1147:1: ( () )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1148:1: ()
            {
             before(grammarAccess.getMidiBodyAccess().getMidiBodyAction_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1149:1: ()
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1151:1: 
            {
            }

             after(grammarAccess.getMidiBodyAccess().getMidiBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidiBody__Group__0__Impl"


    // $ANTLR start "rule__MidiBody__Group__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1161:1: rule__MidiBody__Group__1 : rule__MidiBody__Group__1__Impl rule__MidiBody__Group__2 ;
    public final void rule__MidiBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1165:1: ( rule__MidiBody__Group__1__Impl rule__MidiBody__Group__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1166:2: rule__MidiBody__Group__1__Impl rule__MidiBody__Group__2
            {
            pushFollow(FOLLOW_rule__MidiBody__Group__1__Impl_in_rule__MidiBody__Group__12477);
            rule__MidiBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MidiBody__Group__2_in_rule__MidiBody__Group__12480);
            rule__MidiBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidiBody__Group__1"


    // $ANTLR start "rule__MidiBody__Group__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1173:1: rule__MidiBody__Group__1__Impl : ( ( rule__MidiBody__ParamAssignment_1 )* ) ;
    public final void rule__MidiBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1177:1: ( ( ( rule__MidiBody__ParamAssignment_1 )* ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1178:1: ( ( rule__MidiBody__ParamAssignment_1 )* )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1178:1: ( ( rule__MidiBody__ParamAssignment_1 )* )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1179:1: ( rule__MidiBody__ParamAssignment_1 )*
            {
             before(grammarAccess.getMidiBodyAccess().getParamAssignment_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1180:1: ( rule__MidiBody__ParamAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37||(LA10_0>=39 && LA10_0<=42)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1180:2: rule__MidiBody__ParamAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__MidiBody__ParamAssignment_1_in_rule__MidiBody__Group__1__Impl2507);
            	    rule__MidiBody__ParamAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMidiBodyAccess().getParamAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidiBody__Group__1__Impl"


    // $ANTLR start "rule__MidiBody__Group__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1190:1: rule__MidiBody__Group__2 : rule__MidiBody__Group__2__Impl ;
    public final void rule__MidiBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1194:1: ( rule__MidiBody__Group__2__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1195:2: rule__MidiBody__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MidiBody__Group__2__Impl_in_rule__MidiBody__Group__22538);
            rule__MidiBody__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidiBody__Group__2"


    // $ANTLR start "rule__MidiBody__Group__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1201:1: rule__MidiBody__Group__2__Impl : ( ( rule__MidiBody__TracksAssignment_2 )* ) ;
    public final void rule__MidiBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1205:1: ( ( ( rule__MidiBody__TracksAssignment_2 )* ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1206:1: ( ( rule__MidiBody__TracksAssignment_2 )* )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1206:1: ( ( rule__MidiBody__TracksAssignment_2 )* )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1207:1: ( rule__MidiBody__TracksAssignment_2 )*
            {
             before(grammarAccess.getMidiBodyAccess().getTracksAssignment_2()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1208:1: ( rule__MidiBody__TracksAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==43) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1208:2: rule__MidiBody__TracksAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__MidiBody__TracksAssignment_2_in_rule__MidiBody__Group__2__Impl2565);
            	    rule__MidiBody__TracksAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMidiBodyAccess().getTracksAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidiBody__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group_0__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1224:1: rule__Parameter__Group_0__0 : rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 ;
    public final void rule__Parameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1228:1: ( rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1229:2: rule__Parameter__Group_0__0__Impl rule__Parameter__Group_0__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_0__0__Impl_in_rule__Parameter__Group_0__02602);
            rule__Parameter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_0__1_in_rule__Parameter__Group_0__02605);
            rule__Parameter__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__0"


    // $ANTLR start "rule__Parameter__Group_0__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1236:1: rule__Parameter__Group_0__0__Impl : ( () ) ;
    public final void rule__Parameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1240:1: ( ( () ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1241:1: ( () )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1241:1: ( () )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1242:1: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1243:1: ()
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1245:1: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__0__Impl"


    // $ANTLR start "rule__Parameter__Group_0__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1255:1: rule__Parameter__Group_0__1 : rule__Parameter__Group_0__1__Impl rule__Parameter__Group_0__2 ;
    public final void rule__Parameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1259:1: ( rule__Parameter__Group_0__1__Impl rule__Parameter__Group_0__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1260:2: rule__Parameter__Group_0__1__Impl rule__Parameter__Group_0__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group_0__1__Impl_in_rule__Parameter__Group_0__12663);
            rule__Parameter__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_0__2_in_rule__Parameter__Group_0__12666);
            rule__Parameter__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__1"


    // $ANTLR start "rule__Parameter__Group_0__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1267:1: rule__Parameter__Group_0__1__Impl : ( ( rule__Parameter__Group_0_1__0 ) ) ;
    public final void rule__Parameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1271:1: ( ( ( rule__Parameter__Group_0_1__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1272:1: ( ( rule__Parameter__Group_0_1__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1272:1: ( ( rule__Parameter__Group_0_1__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1273:1: ( rule__Parameter__Group_0_1__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup_0_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1274:1: ( rule__Parameter__Group_0_1__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1274:2: rule__Parameter__Group_0_1__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group_0_1__0_in_rule__Parameter__Group_0__1__Impl2693);
            rule__Parameter__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__1__Impl"


    // $ANTLR start "rule__Parameter__Group_0__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1284:1: rule__Parameter__Group_0__2 : rule__Parameter__Group_0__2__Impl ;
    public final void rule__Parameter__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1288:1: ( rule__Parameter__Group_0__2__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1289:2: rule__Parameter__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_0__2__Impl_in_rule__Parameter__Group_0__22723);
            rule__Parameter__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__2"


    // $ANTLR start "rule__Parameter__Group_0__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1295:1: rule__Parameter__Group_0__2__Impl : ( ( rule__Parameter__TypeAssignment_0_2 ) ) ;
    public final void rule__Parameter__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1299:1: ( ( ( rule__Parameter__TypeAssignment_0_2 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1300:1: ( ( rule__Parameter__TypeAssignment_0_2 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1300:1: ( ( rule__Parameter__TypeAssignment_0_2 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1301:1: ( rule__Parameter__TypeAssignment_0_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0_2()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1302:1: ( rule__Parameter__TypeAssignment_0_2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1302:2: rule__Parameter__TypeAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_0_2_in_rule__Parameter__Group_0__2__Impl2750);
            rule__Parameter__TypeAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0__2__Impl"


    // $ANTLR start "rule__Parameter__Group_0_1__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1318:1: rule__Parameter__Group_0_1__0 : rule__Parameter__Group_0_1__0__Impl rule__Parameter__Group_0_1__1 ;
    public final void rule__Parameter__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1322:1: ( rule__Parameter__Group_0_1__0__Impl rule__Parameter__Group_0_1__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1323:2: rule__Parameter__Group_0_1__0__Impl rule__Parameter__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_0_1__0__Impl_in_rule__Parameter__Group_0_1__02786);
            rule__Parameter__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_0_1__1_in_rule__Parameter__Group_0_1__02789);
            rule__Parameter__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0_1__0"


    // $ANTLR start "rule__Parameter__Group_0_1__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1330:1: rule__Parameter__Group_0_1__0__Impl : ( 'BPM' ) ;
    public final void rule__Parameter__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1334:1: ( ( 'BPM' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1335:1: ( 'BPM' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1335:1: ( 'BPM' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1336:1: 'BPM'
            {
             before(grammarAccess.getParameterAccess().getBPMKeyword_0_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Parameter__Group_0_1__0__Impl2817); 
             after(grammarAccess.getParameterAccess().getBPMKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0_1__0__Impl"


    // $ANTLR start "rule__Parameter__Group_0_1__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1349:1: rule__Parameter__Group_0_1__1 : rule__Parameter__Group_0_1__1__Impl rule__Parameter__Group_0_1__2 ;
    public final void rule__Parameter__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1353:1: ( rule__Parameter__Group_0_1__1__Impl rule__Parameter__Group_0_1__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1354:2: rule__Parameter__Group_0_1__1__Impl rule__Parameter__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group_0_1__1__Impl_in_rule__Parameter__Group_0_1__12848);
            rule__Parameter__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_0_1__2_in_rule__Parameter__Group_0_1__12851);
            rule__Parameter__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0_1__1"


    // $ANTLR start "rule__Parameter__Group_0_1__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1361:1: rule__Parameter__Group_0_1__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1365:1: ( ( ':' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1366:1: ( ':' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1366:1: ( ':' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1367:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_0_1_1()); 
            match(input,38,FOLLOW_38_in_rule__Parameter__Group_0_1__1__Impl2879); 
             after(grammarAccess.getParameterAccess().getColonKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group_0_1__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1380:1: rule__Parameter__Group_0_1__2 : rule__Parameter__Group_0_1__2__Impl ;
    public final void rule__Parameter__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1384:1: ( rule__Parameter__Group_0_1__2__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1385:2: rule__Parameter__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_0_1__2__Impl_in_rule__Parameter__Group_0_1__22910);
            rule__Parameter__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0_1__2"


    // $ANTLR start "rule__Parameter__Group_0_1__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1391:1: rule__Parameter__Group_0_1__2__Impl : ( ( rule__Parameter__BeatAssignment_0_1_2 ) ) ;
    public final void rule__Parameter__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1395:1: ( ( ( rule__Parameter__BeatAssignment_0_1_2 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1396:1: ( ( rule__Parameter__BeatAssignment_0_1_2 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1396:1: ( ( rule__Parameter__BeatAssignment_0_1_2 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1397:1: ( rule__Parameter__BeatAssignment_0_1_2 )
            {
             before(grammarAccess.getParameterAccess().getBeatAssignment_0_1_2()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1398:1: ( rule__Parameter__BeatAssignment_0_1_2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1398:2: rule__Parameter__BeatAssignment_0_1_2
            {
            pushFollow(FOLLOW_rule__Parameter__BeatAssignment_0_1_2_in_rule__Parameter__Group_0_1__2__Impl2937);
            rule__Parameter__BeatAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getBeatAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_0_1__2__Impl"


    // $ANTLR start "rule__Parameter__Group_1__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1414:1: rule__Parameter__Group_1__0 : rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 ;
    public final void rule__Parameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1418:1: ( rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1419:2: rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_1__0__Impl_in_rule__Parameter__Group_1__02973);
            rule__Parameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_1__1_in_rule__Parameter__Group_1__02976);
            rule__Parameter__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__0"


    // $ANTLR start "rule__Parameter__Group_1__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1426:1: rule__Parameter__Group_1__0__Impl : ( ( rule__Parameter__Group_1_0__0 ) ) ;
    public final void rule__Parameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1430:1: ( ( ( rule__Parameter__Group_1_0__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1431:1: ( ( rule__Parameter__Group_1_0__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1431:1: ( ( rule__Parameter__Group_1_0__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1432:1: ( rule__Parameter__Group_1_0__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup_1_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1433:1: ( rule__Parameter__Group_1_0__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1433:2: rule__Parameter__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group_1_0__0_in_rule__Parameter__Group_1__0__Impl3003);
            rule__Parameter__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__0__Impl"


    // $ANTLR start "rule__Parameter__Group_1__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1443:1: rule__Parameter__Group_1__1 : rule__Parameter__Group_1__1__Impl ;
    public final void rule__Parameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1447:1: ( rule__Parameter__Group_1__1__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1448:2: rule__Parameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_1__1__Impl_in_rule__Parameter__Group_1__13033);
            rule__Parameter__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__1"


    // $ANTLR start "rule__Parameter__Group_1__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1454:1: rule__Parameter__Group_1__1__Impl : ( ( rule__Parameter__TypeAssignment_1_1 ) ) ;
    public final void rule__Parameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1458:1: ( ( ( rule__Parameter__TypeAssignment_1_1 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1459:1: ( ( rule__Parameter__TypeAssignment_1_1 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1459:1: ( ( rule__Parameter__TypeAssignment_1_1 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1460:1: ( rule__Parameter__TypeAssignment_1_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_1_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1461:1: ( rule__Parameter__TypeAssignment_1_1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1461:2: rule__Parameter__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_1_in_rule__Parameter__Group_1__1__Impl3060);
            rule__Parameter__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group_1_0__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1475:1: rule__Parameter__Group_1_0__0 : rule__Parameter__Group_1_0__0__Impl rule__Parameter__Group_1_0__1 ;
    public final void rule__Parameter__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1479:1: ( rule__Parameter__Group_1_0__0__Impl rule__Parameter__Group_1_0__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1480:2: rule__Parameter__Group_1_0__0__Impl rule__Parameter__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_1_0__0__Impl_in_rule__Parameter__Group_1_0__03094);
            rule__Parameter__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_1_0__1_in_rule__Parameter__Group_1_0__03097);
            rule__Parameter__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_0__0"


    // $ANTLR start "rule__Parameter__Group_1_0__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1487:1: rule__Parameter__Group_1_0__0__Impl : ( 'TIME_SIGNATURE' ) ;
    public final void rule__Parameter__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1491:1: ( ( 'TIME_SIGNATURE' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1492:1: ( 'TIME_SIGNATURE' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1492:1: ( 'TIME_SIGNATURE' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1493:1: 'TIME_SIGNATURE'
            {
             before(grammarAccess.getParameterAccess().getTIME_SIGNATUREKeyword_1_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Parameter__Group_1_0__0__Impl3125); 
             after(grammarAccess.getParameterAccess().getTIME_SIGNATUREKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_0__0__Impl"


    // $ANTLR start "rule__Parameter__Group_1_0__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1506:1: rule__Parameter__Group_1_0__1 : rule__Parameter__Group_1_0__1__Impl rule__Parameter__Group_1_0__2 ;
    public final void rule__Parameter__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1510:1: ( rule__Parameter__Group_1_0__1__Impl rule__Parameter__Group_1_0__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1511:2: rule__Parameter__Group_1_0__1__Impl rule__Parameter__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group_1_0__1__Impl_in_rule__Parameter__Group_1_0__13156);
            rule__Parameter__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_1_0__2_in_rule__Parameter__Group_1_0__13159);
            rule__Parameter__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_0__1"


    // $ANTLR start "rule__Parameter__Group_1_0__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1518:1: rule__Parameter__Group_1_0__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1522:1: ( ( ':' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1523:1: ( ':' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1523:1: ( ':' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1524:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1_0_1()); 
            match(input,38,FOLLOW_38_in_rule__Parameter__Group_1_0__1__Impl3187); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_0__1__Impl"


    // $ANTLR start "rule__Parameter__Group_1_0__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1537:1: rule__Parameter__Group_1_0__2 : rule__Parameter__Group_1_0__2__Impl ;
    public final void rule__Parameter__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1541:1: ( rule__Parameter__Group_1_0__2__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1542:2: rule__Parameter__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_1_0__2__Impl_in_rule__Parameter__Group_1_0__23218);
            rule__Parameter__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_0__2"


    // $ANTLR start "rule__Parameter__Group_1_0__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1548:1: rule__Parameter__Group_1_0__2__Impl : ( ( rule__Parameter__TsigAssignment_1_0_2 ) ) ;
    public final void rule__Parameter__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1552:1: ( ( ( rule__Parameter__TsigAssignment_1_0_2 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1553:1: ( ( rule__Parameter__TsigAssignment_1_0_2 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1553:1: ( ( rule__Parameter__TsigAssignment_1_0_2 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1554:1: ( rule__Parameter__TsigAssignment_1_0_2 )
            {
             before(grammarAccess.getParameterAccess().getTsigAssignment_1_0_2()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1555:1: ( rule__Parameter__TsigAssignment_1_0_2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1555:2: rule__Parameter__TsigAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Parameter__TsigAssignment_1_0_2_in_rule__Parameter__Group_1_0__2__Impl3245);
            rule__Parameter__TsigAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTsigAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_1_0__2__Impl"


    // $ANTLR start "rule__Parameter__Group_2__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1571:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1575:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1576:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__03281);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__03284);
            rule__Parameter__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__0"


    // $ANTLR start "rule__Parameter__Group_2__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1583:1: rule__Parameter__Group_2__0__Impl : ( ( rule__Parameter__Group_2_0__0 ) ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1587:1: ( ( ( rule__Parameter__Group_2_0__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1588:1: ( ( rule__Parameter__Group_2_0__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1588:1: ( ( rule__Parameter__Group_2_0__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1589:1: ( rule__Parameter__Group_2_0__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup_2_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1590:1: ( rule__Parameter__Group_2_0__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1590:2: rule__Parameter__Group_2_0__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2_0__0_in_rule__Parameter__Group_2__0__Impl3311);
            rule__Parameter__Group_2_0__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__0__Impl"


    // $ANTLR start "rule__Parameter__Group_2__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1600:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1604:1: ( rule__Parameter__Group_2__1__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1605:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__13341);
            rule__Parameter__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__1"


    // $ANTLR start "rule__Parameter__Group_2__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1611:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__TypeAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1615:1: ( ( ( rule__Parameter__TypeAssignment_2_1 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1616:1: ( ( rule__Parameter__TypeAssignment_2_1 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1616:1: ( ( rule__Parameter__TypeAssignment_2_1 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1617:1: ( rule__Parameter__TypeAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1618:1: ( rule__Parameter__TypeAssignment_2_1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1618:2: rule__Parameter__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl3368);
            rule__Parameter__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group_2_0__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1632:1: rule__Parameter__Group_2_0__0 : rule__Parameter__Group_2_0__0__Impl rule__Parameter__Group_2_0__1 ;
    public final void rule__Parameter__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1636:1: ( rule__Parameter__Group_2_0__0__Impl rule__Parameter__Group_2_0__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1637:2: rule__Parameter__Group_2_0__0__Impl rule__Parameter__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2_0__0__Impl_in_rule__Parameter__Group_2_0__03402);
            rule__Parameter__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_2_0__1_in_rule__Parameter__Group_2_0__03405);
            rule__Parameter__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__0"


    // $ANTLR start "rule__Parameter__Group_2_0__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1644:1: rule__Parameter__Group_2_0__0__Impl : ( 'TIME_NOTE' ) ;
    public final void rule__Parameter__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1648:1: ( ( 'TIME_NOTE' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1649:1: ( 'TIME_NOTE' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1649:1: ( 'TIME_NOTE' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1650:1: 'TIME_NOTE'
            {
             before(grammarAccess.getParameterAccess().getTIME_NOTEKeyword_2_0_0()); 
            match(input,40,FOLLOW_40_in_rule__Parameter__Group_2_0__0__Impl3433); 
             after(grammarAccess.getParameterAccess().getTIME_NOTEKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__0__Impl"


    // $ANTLR start "rule__Parameter__Group_2_0__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1663:1: rule__Parameter__Group_2_0__1 : rule__Parameter__Group_2_0__1__Impl rule__Parameter__Group_2_0__2 ;
    public final void rule__Parameter__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1667:1: ( rule__Parameter__Group_2_0__1__Impl rule__Parameter__Group_2_0__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1668:2: rule__Parameter__Group_2_0__1__Impl rule__Parameter__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2_0__1__Impl_in_rule__Parameter__Group_2_0__13464);
            rule__Parameter__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_2_0__2_in_rule__Parameter__Group_2_0__13467);
            rule__Parameter__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__1"


    // $ANTLR start "rule__Parameter__Group_2_0__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1675:1: rule__Parameter__Group_2_0__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1679:1: ( ( ':' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1680:1: ( ':' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1680:1: ( ':' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1681:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_2_0_1()); 
            match(input,38,FOLLOW_38_in_rule__Parameter__Group_2_0__1__Impl3495); 
             after(grammarAccess.getParameterAccess().getColonKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__1__Impl"


    // $ANTLR start "rule__Parameter__Group_2_0__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1694:1: rule__Parameter__Group_2_0__2 : rule__Parameter__Group_2_0__2__Impl ;
    public final void rule__Parameter__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1698:1: ( rule__Parameter__Group_2_0__2__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1699:2: rule__Parameter__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_2_0__2__Impl_in_rule__Parameter__Group_2_0__23526);
            rule__Parameter__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__2"


    // $ANTLR start "rule__Parameter__Group_2_0__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1705:1: rule__Parameter__Group_2_0__2__Impl : ( ( rule__Parameter__TnAssignment_2_0_2 ) ) ;
    public final void rule__Parameter__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1709:1: ( ( ( rule__Parameter__TnAssignment_2_0_2 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1710:1: ( ( rule__Parameter__TnAssignment_2_0_2 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1710:1: ( ( rule__Parameter__TnAssignment_2_0_2 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1711:1: ( rule__Parameter__TnAssignment_2_0_2 )
            {
             before(grammarAccess.getParameterAccess().getTnAssignment_2_0_2()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1712:1: ( rule__Parameter__TnAssignment_2_0_2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1712:2: rule__Parameter__TnAssignment_2_0_2
            {
            pushFollow(FOLLOW_rule__Parameter__TnAssignment_2_0_2_in_rule__Parameter__Group_2_0__2__Impl3553);
            rule__Parameter__TnAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTnAssignment_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2_0__2__Impl"


    // $ANTLR start "rule__Parameter__Group_3__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1728:1: rule__Parameter__Group_3__0 : rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 ;
    public final void rule__Parameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1732:1: ( rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1733:2: rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3__0__Impl_in_rule__Parameter__Group_3__03589);
            rule__Parameter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_3__1_in_rule__Parameter__Group_3__03592);
            rule__Parameter__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__0"


    // $ANTLR start "rule__Parameter__Group_3__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1740:1: rule__Parameter__Group_3__0__Impl : ( ( rule__Parameter__Group_3_0__0 ) ) ;
    public final void rule__Parameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1744:1: ( ( ( rule__Parameter__Group_3_0__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1745:1: ( ( rule__Parameter__Group_3_0__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1745:1: ( ( rule__Parameter__Group_3_0__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1746:1: ( rule__Parameter__Group_3_0__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup_3_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1747:1: ( rule__Parameter__Group_3_0__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1747:2: rule__Parameter__Group_3_0__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3_0__0_in_rule__Parameter__Group_3__0__Impl3619);
            rule__Parameter__Group_3_0__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1757:1: rule__Parameter__Group_3__1 : rule__Parameter__Group_3__1__Impl ;
    public final void rule__Parameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1761:1: ( rule__Parameter__Group_3__1__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1762:2: rule__Parameter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3__1__Impl_in_rule__Parameter__Group_3__13649);
            rule__Parameter__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__1"


    // $ANTLR start "rule__Parameter__Group_3__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1768:1: rule__Parameter__Group_3__1__Impl : ( ( rule__Parameter__TypeAssignment_3_1 ) ) ;
    public final void rule__Parameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1772:1: ( ( ( rule__Parameter__TypeAssignment_3_1 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1773:1: ( ( rule__Parameter__TypeAssignment_3_1 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1773:1: ( ( rule__Parameter__TypeAssignment_3_1 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1774:1: ( rule__Parameter__TypeAssignment_3_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_3_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1775:1: ( rule__Parameter__TypeAssignment_3_1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1775:2: rule__Parameter__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_3_1_in_rule__Parameter__Group_3__1__Impl3676);
            rule__Parameter__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group_3_0__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1789:1: rule__Parameter__Group_3_0__0 : rule__Parameter__Group_3_0__0__Impl rule__Parameter__Group_3_0__1 ;
    public final void rule__Parameter__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1793:1: ( rule__Parameter__Group_3_0__0__Impl rule__Parameter__Group_3_0__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1794:2: rule__Parameter__Group_3_0__0__Impl rule__Parameter__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3_0__0__Impl_in_rule__Parameter__Group_3_0__03710);
            rule__Parameter__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_3_0__1_in_rule__Parameter__Group_3_0__03713);
            rule__Parameter__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_0__0"


    // $ANTLR start "rule__Parameter__Group_3_0__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1801:1: rule__Parameter__Group_3_0__0__Impl : ( 'TIME_PAUSE' ) ;
    public final void rule__Parameter__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1805:1: ( ( 'TIME_PAUSE' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1806:1: ( 'TIME_PAUSE' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1806:1: ( 'TIME_PAUSE' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1807:1: 'TIME_PAUSE'
            {
             before(grammarAccess.getParameterAccess().getTIME_PAUSEKeyword_3_0_0()); 
            match(input,41,FOLLOW_41_in_rule__Parameter__Group_3_0__0__Impl3741); 
             after(grammarAccess.getParameterAccess().getTIME_PAUSEKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_0__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3_0__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1820:1: rule__Parameter__Group_3_0__1 : rule__Parameter__Group_3_0__1__Impl rule__Parameter__Group_3_0__2 ;
    public final void rule__Parameter__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1824:1: ( rule__Parameter__Group_3_0__1__Impl rule__Parameter__Group_3_0__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1825:2: rule__Parameter__Group_3_0__1__Impl rule__Parameter__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3_0__1__Impl_in_rule__Parameter__Group_3_0__13772);
            rule__Parameter__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_3_0__2_in_rule__Parameter__Group_3_0__13775);
            rule__Parameter__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_0__1"


    // $ANTLR start "rule__Parameter__Group_3_0__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1832:1: rule__Parameter__Group_3_0__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1836:1: ( ( ':' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1837:1: ( ':' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1837:1: ( ':' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1838:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_3_0_1()); 
            match(input,38,FOLLOW_38_in_rule__Parameter__Group_3_0__1__Impl3803); 
             after(grammarAccess.getParameterAccess().getColonKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_0__1__Impl"


    // $ANTLR start "rule__Parameter__Group_3_0__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1851:1: rule__Parameter__Group_3_0__2 : rule__Parameter__Group_3_0__2__Impl ;
    public final void rule__Parameter__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1855:1: ( rule__Parameter__Group_3_0__2__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1856:2: rule__Parameter__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_3_0__2__Impl_in_rule__Parameter__Group_3_0__23834);
            rule__Parameter__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_0__2"


    // $ANTLR start "rule__Parameter__Group_3_0__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1862:1: rule__Parameter__Group_3_0__2__Impl : ( ( rule__Parameter__TpAssignment_3_0_2 ) ) ;
    public final void rule__Parameter__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1866:1: ( ( ( rule__Parameter__TpAssignment_3_0_2 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1867:1: ( ( rule__Parameter__TpAssignment_3_0_2 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1867:1: ( ( rule__Parameter__TpAssignment_3_0_2 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1868:1: ( rule__Parameter__TpAssignment_3_0_2 )
            {
             before(grammarAccess.getParameterAccess().getTpAssignment_3_0_2()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1869:1: ( rule__Parameter__TpAssignment_3_0_2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1869:2: rule__Parameter__TpAssignment_3_0_2
            {
            pushFollow(FOLLOW_rule__Parameter__TpAssignment_3_0_2_in_rule__Parameter__Group_3_0__2__Impl3861);
            rule__Parameter__TpAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTpAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_3_0__2__Impl"


    // $ANTLR start "rule__Parameter__Group_4__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1885:1: rule__Parameter__Group_4__0 : rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1 ;
    public final void rule__Parameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1889:1: ( rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1890:2: rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_4__0__Impl_in_rule__Parameter__Group_4__03897);
            rule__Parameter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_4__1_in_rule__Parameter__Group_4__03900);
            rule__Parameter__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__0"


    // $ANTLR start "rule__Parameter__Group_4__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1897:1: rule__Parameter__Group_4__0__Impl : ( ( rule__Parameter__Group_4_0__0 ) ) ;
    public final void rule__Parameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1901:1: ( ( ( rule__Parameter__Group_4_0__0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1902:1: ( ( rule__Parameter__Group_4_0__0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1902:1: ( ( rule__Parameter__Group_4_0__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1903:1: ( rule__Parameter__Group_4_0__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup_4_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1904:1: ( rule__Parameter__Group_4_0__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1904:2: rule__Parameter__Group_4_0__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group_4_0__0_in_rule__Parameter__Group_4__0__Impl3927);
            rule__Parameter__Group_4_0__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__0__Impl"


    // $ANTLR start "rule__Parameter__Group_4__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1914:1: rule__Parameter__Group_4__1 : rule__Parameter__Group_4__1__Impl ;
    public final void rule__Parameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1918:1: ( rule__Parameter__Group_4__1__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1919:2: rule__Parameter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_4__1__Impl_in_rule__Parameter__Group_4__13957);
            rule__Parameter__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__1"


    // $ANTLR start "rule__Parameter__Group_4__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1925:1: rule__Parameter__Group_4__1__Impl : ( ( rule__Parameter__TypeAssignment_4_1 ) ) ;
    public final void rule__Parameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1929:1: ( ( ( rule__Parameter__TypeAssignment_4_1 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1930:1: ( ( rule__Parameter__TypeAssignment_4_1 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1930:1: ( ( rule__Parameter__TypeAssignment_4_1 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1931:1: ( rule__Parameter__TypeAssignment_4_1 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_4_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1932:1: ( rule__Parameter__TypeAssignment_4_1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1932:2: rule__Parameter__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_4_1_in_rule__Parameter__Group_4__1__Impl3984);
            rule__Parameter__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__1__Impl"


    // $ANTLR start "rule__Parameter__Group_4_0__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1946:1: rule__Parameter__Group_4_0__0 : rule__Parameter__Group_4_0__0__Impl rule__Parameter__Group_4_0__1 ;
    public final void rule__Parameter__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1950:1: ( rule__Parameter__Group_4_0__0__Impl rule__Parameter__Group_4_0__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1951:2: rule__Parameter__Group_4_0__0__Impl rule__Parameter__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_4_0__0__Impl_in_rule__Parameter__Group_4_0__04018);
            rule__Parameter__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_4_0__1_in_rule__Parameter__Group_4_0__04021);
            rule__Parameter__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4_0__0"


    // $ANTLR start "rule__Parameter__Group_4_0__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1958:1: rule__Parameter__Group_4_0__0__Impl : ( 'OCTAVE' ) ;
    public final void rule__Parameter__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1962:1: ( ( 'OCTAVE' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1963:1: ( 'OCTAVE' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1963:1: ( 'OCTAVE' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1964:1: 'OCTAVE'
            {
             before(grammarAccess.getParameterAccess().getOCTAVEKeyword_4_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Parameter__Group_4_0__0__Impl4049); 
             after(grammarAccess.getParameterAccess().getOCTAVEKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4_0__0__Impl"


    // $ANTLR start "rule__Parameter__Group_4_0__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1977:1: rule__Parameter__Group_4_0__1 : rule__Parameter__Group_4_0__1__Impl rule__Parameter__Group_4_0__2 ;
    public final void rule__Parameter__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1981:1: ( rule__Parameter__Group_4_0__1__Impl rule__Parameter__Group_4_0__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1982:2: rule__Parameter__Group_4_0__1__Impl rule__Parameter__Group_4_0__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group_4_0__1__Impl_in_rule__Parameter__Group_4_0__14080);
            rule__Parameter__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group_4_0__2_in_rule__Parameter__Group_4_0__14083);
            rule__Parameter__Group_4_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4_0__1"


    // $ANTLR start "rule__Parameter__Group_4_0__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1989:1: rule__Parameter__Group_4_0__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1993:1: ( ( ':' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1994:1: ( ':' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1994:1: ( ':' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:1995:1: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_4_0_1()); 
            match(input,38,FOLLOW_38_in_rule__Parameter__Group_4_0__1__Impl4111); 
             after(grammarAccess.getParameterAccess().getColonKeyword_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4_0__1__Impl"


    // $ANTLR start "rule__Parameter__Group_4_0__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2008:1: rule__Parameter__Group_4_0__2 : rule__Parameter__Group_4_0__2__Impl ;
    public final void rule__Parameter__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2012:1: ( rule__Parameter__Group_4_0__2__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2013:2: rule__Parameter__Group_4_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_4_0__2__Impl_in_rule__Parameter__Group_4_0__24142);
            rule__Parameter__Group_4_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4_0__2"


    // $ANTLR start "rule__Parameter__Group_4_0__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2019:1: rule__Parameter__Group_4_0__2__Impl : ( ( rule__Parameter__OctaveAssignment_4_0_2 ) ) ;
    public final void rule__Parameter__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2023:1: ( ( ( rule__Parameter__OctaveAssignment_4_0_2 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2024:1: ( ( rule__Parameter__OctaveAssignment_4_0_2 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2024:1: ( ( rule__Parameter__OctaveAssignment_4_0_2 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2025:1: ( rule__Parameter__OctaveAssignment_4_0_2 )
            {
             before(grammarAccess.getParameterAccess().getOctaveAssignment_4_0_2()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2026:1: ( rule__Parameter__OctaveAssignment_4_0_2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2026:2: rule__Parameter__OctaveAssignment_4_0_2
            {
            pushFollow(FOLLOW_rule__Parameter__OctaveAssignment_4_0_2_in_rule__Parameter__Group_4_0__2__Impl4169);
            rule__Parameter__OctaveAssignment_4_0_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getOctaveAssignment_4_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4_0__2__Impl"


    // $ANTLR start "rule__Track__Group__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2042:1: rule__Track__Group__0 : rule__Track__Group__0__Impl rule__Track__Group__1 ;
    public final void rule__Track__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2046:1: ( rule__Track__Group__0__Impl rule__Track__Group__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2047:2: rule__Track__Group__0__Impl rule__Track__Group__1
            {
            pushFollow(FOLLOW_rule__Track__Group__0__Impl_in_rule__Track__Group__04205);
            rule__Track__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Track__Group__1_in_rule__Track__Group__04208);
            rule__Track__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__0"


    // $ANTLR start "rule__Track__Group__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2054:1: rule__Track__Group__0__Impl : ( 'TRACK' ) ;
    public final void rule__Track__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2058:1: ( ( 'TRACK' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2059:1: ( 'TRACK' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2059:1: ( 'TRACK' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2060:1: 'TRACK'
            {
             before(grammarAccess.getTrackAccess().getTRACKKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Track__Group__0__Impl4236); 
             after(grammarAccess.getTrackAccess().getTRACKKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__0__Impl"


    // $ANTLR start "rule__Track__Group__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2073:1: rule__Track__Group__1 : rule__Track__Group__1__Impl rule__Track__Group__2 ;
    public final void rule__Track__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2077:1: ( rule__Track__Group__1__Impl rule__Track__Group__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2078:2: rule__Track__Group__1__Impl rule__Track__Group__2
            {
            pushFollow(FOLLOW_rule__Track__Group__1__Impl_in_rule__Track__Group__14267);
            rule__Track__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Track__Group__2_in_rule__Track__Group__14270);
            rule__Track__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__1"


    // $ANTLR start "rule__Track__Group__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2085:1: rule__Track__Group__1__Impl : ( ( rule__Track__NameAssignment_1 ) ) ;
    public final void rule__Track__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2089:1: ( ( ( rule__Track__NameAssignment_1 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2090:1: ( ( rule__Track__NameAssignment_1 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2090:1: ( ( rule__Track__NameAssignment_1 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2091:1: ( rule__Track__NameAssignment_1 )
            {
             before(grammarAccess.getTrackAccess().getNameAssignment_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2092:1: ( rule__Track__NameAssignment_1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2092:2: rule__Track__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Track__NameAssignment_1_in_rule__Track__Group__1__Impl4297);
            rule__Track__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__1__Impl"


    // $ANTLR start "rule__Track__Group__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2102:1: rule__Track__Group__2 : rule__Track__Group__2__Impl rule__Track__Group__3 ;
    public final void rule__Track__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2106:1: ( rule__Track__Group__2__Impl rule__Track__Group__3 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2107:2: rule__Track__Group__2__Impl rule__Track__Group__3
            {
            pushFollow(FOLLOW_rule__Track__Group__2__Impl_in_rule__Track__Group__24327);
            rule__Track__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Track__Group__3_in_rule__Track__Group__24330);
            rule__Track__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__2"


    // $ANTLR start "rule__Track__Group__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2114:1: rule__Track__Group__2__Impl : ( ':' ) ;
    public final void rule__Track__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2118:1: ( ( ':' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2119:1: ( ':' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2119:1: ( ':' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2120:1: ':'
            {
             before(grammarAccess.getTrackAccess().getColonKeyword_2()); 
            match(input,38,FOLLOW_38_in_rule__Track__Group__2__Impl4358); 
             after(grammarAccess.getTrackAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__2__Impl"


    // $ANTLR start "rule__Track__Group__3"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2133:1: rule__Track__Group__3 : rule__Track__Group__3__Impl rule__Track__Group__4 ;
    public final void rule__Track__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2137:1: ( rule__Track__Group__3__Impl rule__Track__Group__4 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2138:2: rule__Track__Group__3__Impl rule__Track__Group__4
            {
            pushFollow(FOLLOW_rule__Track__Group__3__Impl_in_rule__Track__Group__34389);
            rule__Track__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Track__Group__4_in_rule__Track__Group__34392);
            rule__Track__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__3"


    // $ANTLR start "rule__Track__Group__3__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2145:1: rule__Track__Group__3__Impl : ( ruleInstrument ) ;
    public final void rule__Track__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2149:1: ( ( ruleInstrument ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2150:1: ( ruleInstrument )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2150:1: ( ruleInstrument )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2151:1: ruleInstrument
            {
             before(grammarAccess.getTrackAccess().getInstrumentParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleInstrument_in_rule__Track__Group__3__Impl4419);
            ruleInstrument();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getInstrumentParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__3__Impl"


    // $ANTLR start "rule__Track__Group__4"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2162:1: rule__Track__Group__4 : rule__Track__Group__4__Impl rule__Track__Group__5 ;
    public final void rule__Track__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2166:1: ( rule__Track__Group__4__Impl rule__Track__Group__5 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2167:2: rule__Track__Group__4__Impl rule__Track__Group__5
            {
            pushFollow(FOLLOW_rule__Track__Group__4__Impl_in_rule__Track__Group__44448);
            rule__Track__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Track__Group__5_in_rule__Track__Group__44451);
            rule__Track__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__4"


    // $ANTLR start "rule__Track__Group__4__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2174:1: rule__Track__Group__4__Impl : ( '{' ) ;
    public final void rule__Track__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2178:1: ( ( '{' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2179:1: ( '{' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2179:1: ( '{' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2180:1: '{'
            {
             before(grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__Track__Group__4__Impl4479); 
             after(grammarAccess.getTrackAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__4__Impl"


    // $ANTLR start "rule__Track__Group__5"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2193:1: rule__Track__Group__5 : rule__Track__Group__5__Impl rule__Track__Group__6 ;
    public final void rule__Track__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2197:1: ( rule__Track__Group__5__Impl rule__Track__Group__6 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2198:2: rule__Track__Group__5__Impl rule__Track__Group__6
            {
            pushFollow(FOLLOW_rule__Track__Group__5__Impl_in_rule__Track__Group__54510);
            rule__Track__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Track__Group__6_in_rule__Track__Group__54513);
            rule__Track__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__5"


    // $ANTLR start "rule__Track__Group__5__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2205:1: rule__Track__Group__5__Impl : ( ( rule__Track__TbodyAssignment_5 ) ) ;
    public final void rule__Track__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2209:1: ( ( ( rule__Track__TbodyAssignment_5 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2210:1: ( ( rule__Track__TbodyAssignment_5 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2210:1: ( ( rule__Track__TbodyAssignment_5 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2211:1: ( rule__Track__TbodyAssignment_5 )
            {
             before(grammarAccess.getTrackAccess().getTbodyAssignment_5()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2212:1: ( rule__Track__TbodyAssignment_5 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2212:2: rule__Track__TbodyAssignment_5
            {
            pushFollow(FOLLOW_rule__Track__TbodyAssignment_5_in_rule__Track__Group__5__Impl4540);
            rule__Track__TbodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTrackAccess().getTbodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__5__Impl"


    // $ANTLR start "rule__Track__Group__6"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2222:1: rule__Track__Group__6 : rule__Track__Group__6__Impl ;
    public final void rule__Track__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2226:1: ( rule__Track__Group__6__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2227:2: rule__Track__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Track__Group__6__Impl_in_rule__Track__Group__64570);
            rule__Track__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__6"


    // $ANTLR start "rule__Track__Group__6__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2233:1: rule__Track__Group__6__Impl : ( '}' ) ;
    public final void rule__Track__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2237:1: ( ( '}' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2238:1: ( '}' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2238:1: ( '}' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2239:1: '}'
            {
             before(grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_6()); 
            match(input,36,FOLLOW_36_in_rule__Track__Group__6__Impl4598); 
             after(grammarAccess.getTrackAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__Group__6__Impl"


    // $ANTLR start "rule__TrackBody__Group__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2266:1: rule__TrackBody__Group__0 : rule__TrackBody__Group__0__Impl rule__TrackBody__Group__1 ;
    public final void rule__TrackBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2270:1: ( rule__TrackBody__Group__0__Impl rule__TrackBody__Group__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2271:2: rule__TrackBody__Group__0__Impl rule__TrackBody__Group__1
            {
            pushFollow(FOLLOW_rule__TrackBody__Group__0__Impl_in_rule__TrackBody__Group__04643);
            rule__TrackBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrackBody__Group__1_in_rule__TrackBody__Group__04646);
            rule__TrackBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBody__Group__0"


    // $ANTLR start "rule__TrackBody__Group__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2278:1: rule__TrackBody__Group__0__Impl : ( ( rule__TrackBody__BodyAssignment_0 ) ) ;
    public final void rule__TrackBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2282:1: ( ( ( rule__TrackBody__BodyAssignment_0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2283:1: ( ( rule__TrackBody__BodyAssignment_0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2283:1: ( ( rule__TrackBody__BodyAssignment_0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2284:1: ( rule__TrackBody__BodyAssignment_0 )
            {
             before(grammarAccess.getTrackBodyAccess().getBodyAssignment_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2285:1: ( rule__TrackBody__BodyAssignment_0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2285:2: rule__TrackBody__BodyAssignment_0
            {
            pushFollow(FOLLOW_rule__TrackBody__BodyAssignment_0_in_rule__TrackBody__Group__0__Impl4673);
            rule__TrackBody__BodyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTrackBodyAccess().getBodyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBody__Group__0__Impl"


    // $ANTLR start "rule__TrackBody__Group__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2295:1: rule__TrackBody__Group__1 : rule__TrackBody__Group__1__Impl ;
    public final void rule__TrackBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2299:1: ( rule__TrackBody__Group__1__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2300:2: rule__TrackBody__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TrackBody__Group__1__Impl_in_rule__TrackBody__Group__14703);
            rule__TrackBody__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBody__Group__1"


    // $ANTLR start "rule__TrackBody__Group__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2306:1: rule__TrackBody__Group__1__Impl : ( ( rule__TrackBody__MoreAssignment_1 )? ) ;
    public final void rule__TrackBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2310:1: ( ( ( rule__TrackBody__MoreAssignment_1 )? ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2311:1: ( ( rule__TrackBody__MoreAssignment_1 )? )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2311:1: ( ( rule__TrackBody__MoreAssignment_1 )? )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2312:1: ( rule__TrackBody__MoreAssignment_1 )?
            {
             before(grammarAccess.getTrackBodyAccess().getMoreAssignment_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2313:1: ( rule__TrackBody__MoreAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==44) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2313:2: rule__TrackBody__MoreAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TrackBody__MoreAssignment_1_in_rule__TrackBody__Group__1__Impl4730);
                    rule__TrackBody__MoreAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrackBodyAccess().getMoreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBody__Group__1__Impl"


    // $ANTLR start "rule__MoreTrackBody__Group__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2327:1: rule__MoreTrackBody__Group__0 : rule__MoreTrackBody__Group__0__Impl rule__MoreTrackBody__Group__1 ;
    public final void rule__MoreTrackBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2331:1: ( rule__MoreTrackBody__Group__0__Impl rule__MoreTrackBody__Group__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2332:2: rule__MoreTrackBody__Group__0__Impl rule__MoreTrackBody__Group__1
            {
            pushFollow(FOLLOW_rule__MoreTrackBody__Group__0__Impl_in_rule__MoreTrackBody__Group__04765);
            rule__MoreTrackBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoreTrackBody__Group__1_in_rule__MoreTrackBody__Group__04768);
            rule__MoreTrackBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoreTrackBody__Group__0"


    // $ANTLR start "rule__MoreTrackBody__Group__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2339:1: rule__MoreTrackBody__Group__0__Impl : ( () ) ;
    public final void rule__MoreTrackBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2343:1: ( ( () ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2344:1: ( () )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2344:1: ( () )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2345:1: ()
            {
             before(grammarAccess.getMoreTrackBodyAccess().getMoreTrackBodyAction_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2346:1: ()
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2348:1: 
            {
            }

             after(grammarAccess.getMoreTrackBodyAccess().getMoreTrackBodyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoreTrackBody__Group__0__Impl"


    // $ANTLR start "rule__MoreTrackBody__Group__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2358:1: rule__MoreTrackBody__Group__1 : rule__MoreTrackBody__Group__1__Impl ;
    public final void rule__MoreTrackBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2362:1: ( rule__MoreTrackBody__Group__1__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2363:2: rule__MoreTrackBody__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MoreTrackBody__Group__1__Impl_in_rule__MoreTrackBody__Group__14826);
            rule__MoreTrackBody__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoreTrackBody__Group__1"


    // $ANTLR start "rule__MoreTrackBody__Group__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2369:1: rule__MoreTrackBody__Group__1__Impl : ( ( ( rule__MoreTrackBody__Group_1__0 ) ) ( ( rule__MoreTrackBody__Group_1__0 )* ) ) ;
    public final void rule__MoreTrackBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2373:1: ( ( ( ( rule__MoreTrackBody__Group_1__0 ) ) ( ( rule__MoreTrackBody__Group_1__0 )* ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2374:1: ( ( ( rule__MoreTrackBody__Group_1__0 ) ) ( ( rule__MoreTrackBody__Group_1__0 )* ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2374:1: ( ( ( rule__MoreTrackBody__Group_1__0 ) ) ( ( rule__MoreTrackBody__Group_1__0 )* ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2375:1: ( ( rule__MoreTrackBody__Group_1__0 ) ) ( ( rule__MoreTrackBody__Group_1__0 )* )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2375:1: ( ( rule__MoreTrackBody__Group_1__0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2376:1: ( rule__MoreTrackBody__Group_1__0 )
            {
             before(grammarAccess.getMoreTrackBodyAccess().getGroup_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2377:1: ( rule__MoreTrackBody__Group_1__0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2377:2: rule__MoreTrackBody__Group_1__0
            {
            pushFollow(FOLLOW_rule__MoreTrackBody__Group_1__0_in_rule__MoreTrackBody__Group__1__Impl4855);
            rule__MoreTrackBody__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getMoreTrackBodyAccess().getGroup_1()); 

            }

            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2380:1: ( ( rule__MoreTrackBody__Group_1__0 )* )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2381:1: ( rule__MoreTrackBody__Group_1__0 )*
            {
             before(grammarAccess.getMoreTrackBodyAccess().getGroup_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2382:1: ( rule__MoreTrackBody__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2382:2: rule__MoreTrackBody__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MoreTrackBody__Group_1__0_in_rule__MoreTrackBody__Group__1__Impl4867);
            	    rule__MoreTrackBody__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMoreTrackBodyAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoreTrackBody__Group__1__Impl"


    // $ANTLR start "rule__MoreTrackBody__Group_1__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2397:1: rule__MoreTrackBody__Group_1__0 : rule__MoreTrackBody__Group_1__0__Impl rule__MoreTrackBody__Group_1__1 ;
    public final void rule__MoreTrackBody__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2401:1: ( rule__MoreTrackBody__Group_1__0__Impl rule__MoreTrackBody__Group_1__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2402:2: rule__MoreTrackBody__Group_1__0__Impl rule__MoreTrackBody__Group_1__1
            {
            pushFollow(FOLLOW_rule__MoreTrackBody__Group_1__0__Impl_in_rule__MoreTrackBody__Group_1__04904);
            rule__MoreTrackBody__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MoreTrackBody__Group_1__1_in_rule__MoreTrackBody__Group_1__04907);
            rule__MoreTrackBody__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoreTrackBody__Group_1__0"


    // $ANTLR start "rule__MoreTrackBody__Group_1__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2409:1: rule__MoreTrackBody__Group_1__0__Impl : ( ',' ) ;
    public final void rule__MoreTrackBody__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2413:1: ( ( ',' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2414:1: ( ',' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2414:1: ( ',' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2415:1: ','
            {
             before(grammarAccess.getMoreTrackBodyAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__MoreTrackBody__Group_1__0__Impl4935); 
             after(grammarAccess.getMoreTrackBodyAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoreTrackBody__Group_1__0__Impl"


    // $ANTLR start "rule__MoreTrackBody__Group_1__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2428:1: rule__MoreTrackBody__Group_1__1 : rule__MoreTrackBody__Group_1__1__Impl ;
    public final void rule__MoreTrackBody__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2432:1: ( rule__MoreTrackBody__Group_1__1__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2433:2: rule__MoreTrackBody__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MoreTrackBody__Group_1__1__Impl_in_rule__MoreTrackBody__Group_1__14966);
            rule__MoreTrackBody__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoreTrackBody__Group_1__1"


    // $ANTLR start "rule__MoreTrackBody__Group_1__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2439:1: rule__MoreTrackBody__Group_1__1__Impl : ( ( rule__MoreTrackBody__MorebodyAssignment_1_1 ) ) ;
    public final void rule__MoreTrackBody__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2443:1: ( ( ( rule__MoreTrackBody__MorebodyAssignment_1_1 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2444:1: ( ( rule__MoreTrackBody__MorebodyAssignment_1_1 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2444:1: ( ( rule__MoreTrackBody__MorebodyAssignment_1_1 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2445:1: ( rule__MoreTrackBody__MorebodyAssignment_1_1 )
            {
             before(grammarAccess.getMoreTrackBodyAccess().getMorebodyAssignment_1_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2446:1: ( rule__MoreTrackBody__MorebodyAssignment_1_1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2446:2: rule__MoreTrackBody__MorebodyAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MoreTrackBody__MorebodyAssignment_1_1_in_rule__MoreTrackBody__Group_1__1__Impl4993);
            rule__MoreTrackBody__MorebodyAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMoreTrackBodyAccess().getMorebodyAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoreTrackBody__Group_1__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2460:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2464:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2465:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05027);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05030);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2472:1: rule__Block__Group__0__Impl : ( 'BLOCK' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2476:1: ( ( 'BLOCK' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2477:1: ( 'BLOCK' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2477:1: ( 'BLOCK' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2478:1: 'BLOCK'
            {
             before(grammarAccess.getBlockAccess().getBLOCKKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__Block__Group__0__Impl5058); 
             after(grammarAccess.getBlockAccess().getBLOCKKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2491:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2495:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2496:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15089);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__15092);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2503:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2507:1: ( ( ( rule__Block__NameAssignment_1 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2508:1: ( ( rule__Block__NameAssignment_1 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2508:1: ( ( rule__Block__NameAssignment_1 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2509:1: ( rule__Block__NameAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2510:1: ( rule__Block__NameAssignment_1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2510:2: rule__Block__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Block__NameAssignment_1_in_rule__Block__Group__1__Impl5119);
            rule__Block__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2520:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2524:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2525:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__25149);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__25152);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2532:1: rule__Block__Group__2__Impl : ( '{' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2536:1: ( ( '{' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2537:1: ( '{' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2537:1: ( '{' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2538:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Block__Group__2__Impl5180); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2551:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2555:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2556:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__35211);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__4_in_rule__Block__Group__35214);
            rule__Block__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2563:1: rule__Block__Group__3__Impl : ( ( rule__Block__BlockbodyAssignment_3 )* ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2567:1: ( ( ( rule__Block__BlockbodyAssignment_3 )* ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2568:1: ( ( rule__Block__BlockbodyAssignment_3 )* )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2568:1: ( ( rule__Block__BlockbodyAssignment_3 )* )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2569:1: ( rule__Block__BlockbodyAssignment_3 )*
            {
             before(grammarAccess.getBlockAccess().getBlockbodyAssignment_3()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2570:1: ( rule__Block__BlockbodyAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=18 && LA14_0<=24)||LA14_0==45||LA14_0==49) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2570:2: rule__Block__BlockbodyAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Block__BlockbodyAssignment_3_in_rule__Block__Group__3__Impl5241);
            	    rule__Block__BlockbodyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getBlockbodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2580:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2584:1: ( rule__Block__Group__4__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2585:2: rule__Block__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__4__Impl_in_rule__Block__Group__45272);
            rule__Block__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2591:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2595:1: ( ( '}' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2596:1: ( '}' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2596:1: ( '}' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2597:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__Block__Group__4__Impl5300); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__TimeSignature__Group__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2620:1: rule__TimeSignature__Group__0 : rule__TimeSignature__Group__0__Impl rule__TimeSignature__Group__1 ;
    public final void rule__TimeSignature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2624:1: ( rule__TimeSignature__Group__0__Impl rule__TimeSignature__Group__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2625:2: rule__TimeSignature__Group__0__Impl rule__TimeSignature__Group__1
            {
            pushFollow(FOLLOW_rule__TimeSignature__Group__0__Impl_in_rule__TimeSignature__Group__05341);
            rule__TimeSignature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeSignature__Group__1_in_rule__TimeSignature__Group__05344);
            rule__TimeSignature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__0"


    // $ANTLR start "rule__TimeSignature__Group__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2632:1: rule__TimeSignature__Group__0__Impl : ( ( rule__TimeSignature__QuantityAssignment_0 ) ) ;
    public final void rule__TimeSignature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2636:1: ( ( ( rule__TimeSignature__QuantityAssignment_0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2637:1: ( ( rule__TimeSignature__QuantityAssignment_0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2637:1: ( ( rule__TimeSignature__QuantityAssignment_0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2638:1: ( rule__TimeSignature__QuantityAssignment_0 )
            {
             before(grammarAccess.getTimeSignatureAccess().getQuantityAssignment_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2639:1: ( rule__TimeSignature__QuantityAssignment_0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2639:2: rule__TimeSignature__QuantityAssignment_0
            {
            pushFollow(FOLLOW_rule__TimeSignature__QuantityAssignment_0_in_rule__TimeSignature__Group__0__Impl5371);
            rule__TimeSignature__QuantityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSignatureAccess().getQuantityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__0__Impl"


    // $ANTLR start "rule__TimeSignature__Group__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2649:1: rule__TimeSignature__Group__1 : rule__TimeSignature__Group__1__Impl rule__TimeSignature__Group__2 ;
    public final void rule__TimeSignature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2653:1: ( rule__TimeSignature__Group__1__Impl rule__TimeSignature__Group__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2654:2: rule__TimeSignature__Group__1__Impl rule__TimeSignature__Group__2
            {
            pushFollow(FOLLOW_rule__TimeSignature__Group__1__Impl_in_rule__TimeSignature__Group__15401);
            rule__TimeSignature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeSignature__Group__2_in_rule__TimeSignature__Group__15404);
            rule__TimeSignature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__1"


    // $ANTLR start "rule__TimeSignature__Group__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2661:1: rule__TimeSignature__Group__1__Impl : ( '/' ) ;
    public final void rule__TimeSignature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2665:1: ( ( '/' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2666:1: ( '/' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2666:1: ( '/' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2667:1: '/'
            {
             before(grammarAccess.getTimeSignatureAccess().getSolidusKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__TimeSignature__Group__1__Impl5432); 
             after(grammarAccess.getTimeSignatureAccess().getSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__1__Impl"


    // $ANTLR start "rule__TimeSignature__Group__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2680:1: rule__TimeSignature__Group__2 : rule__TimeSignature__Group__2__Impl ;
    public final void rule__TimeSignature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2684:1: ( rule__TimeSignature__Group__2__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2685:2: rule__TimeSignature__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TimeSignature__Group__2__Impl_in_rule__TimeSignature__Group__25463);
            rule__TimeSignature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__2"


    // $ANTLR start "rule__TimeSignature__Group__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2691:1: rule__TimeSignature__Group__2__Impl : ( ( rule__TimeSignature__NoteAssignment_2 ) ) ;
    public final void rule__TimeSignature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2695:1: ( ( ( rule__TimeSignature__NoteAssignment_2 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2696:1: ( ( rule__TimeSignature__NoteAssignment_2 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2696:1: ( ( rule__TimeSignature__NoteAssignment_2 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2697:1: ( rule__TimeSignature__NoteAssignment_2 )
            {
             before(grammarAccess.getTimeSignatureAccess().getNoteAssignment_2()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2698:1: ( rule__TimeSignature__NoteAssignment_2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2698:2: rule__TimeSignature__NoteAssignment_2
            {
            pushFollow(FOLLOW_rule__TimeSignature__NoteAssignment_2_in_rule__TimeSignature__Group__2__Impl5490);
            rule__TimeSignature__NoteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeSignatureAccess().getNoteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__Group__2__Impl"


    // $ANTLR start "rule__CustomNote__Group__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2714:1: rule__CustomNote__Group__0 : rule__CustomNote__Group__0__Impl rule__CustomNote__Group__1 ;
    public final void rule__CustomNote__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2718:1: ( rule__CustomNote__Group__0__Impl rule__CustomNote__Group__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2719:2: rule__CustomNote__Group__0__Impl rule__CustomNote__Group__1
            {
            pushFollow(FOLLOW_rule__CustomNote__Group__0__Impl_in_rule__CustomNote__Group__05526);
            rule__CustomNote__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomNote__Group__1_in_rule__CustomNote__Group__05529);
            rule__CustomNote__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNote__Group__0"


    // $ANTLR start "rule__CustomNote__Group__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2726:1: rule__CustomNote__Group__0__Impl : ( ruleNote ) ;
    public final void rule__CustomNote__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2730:1: ( ( ruleNote ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2731:1: ( ruleNote )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2731:1: ( ruleNote )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2732:1: ruleNote
            {
             before(grammarAccess.getCustomNoteAccess().getNoteParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__CustomNote__Group__0__Impl5556);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getCustomNoteAccess().getNoteParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNote__Group__0__Impl"


    // $ANTLR start "rule__CustomNote__Group__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2743:1: rule__CustomNote__Group__1 : rule__CustomNote__Group__1__Impl rule__CustomNote__Group__2 ;
    public final void rule__CustomNote__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2747:1: ( rule__CustomNote__Group__1__Impl rule__CustomNote__Group__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2748:2: rule__CustomNote__Group__1__Impl rule__CustomNote__Group__2
            {
            pushFollow(FOLLOW_rule__CustomNote__Group__1__Impl_in_rule__CustomNote__Group__15585);
            rule__CustomNote__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomNote__Group__2_in_rule__CustomNote__Group__15588);
            rule__CustomNote__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNote__Group__1"


    // $ANTLR start "rule__CustomNote__Group__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2755:1: rule__CustomNote__Group__1__Impl : ( '(' ) ;
    public final void rule__CustomNote__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2759:1: ( ( '(' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2760:1: ( '(' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2760:1: ( '(' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2761:1: '('
            {
             before(grammarAccess.getCustomNoteAccess().getLeftParenthesisKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__CustomNote__Group__1__Impl5616); 
             after(grammarAccess.getCustomNoteAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNote__Group__1__Impl"


    // $ANTLR start "rule__CustomNote__Group__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2774:1: rule__CustomNote__Group__2 : rule__CustomNote__Group__2__Impl rule__CustomNote__Group__3 ;
    public final void rule__CustomNote__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2778:1: ( rule__CustomNote__Group__2__Impl rule__CustomNote__Group__3 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2779:2: rule__CustomNote__Group__2__Impl rule__CustomNote__Group__3
            {
            pushFollow(FOLLOW_rule__CustomNote__Group__2__Impl_in_rule__CustomNote__Group__25647);
            rule__CustomNote__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomNote__Group__3_in_rule__CustomNote__Group__25650);
            rule__CustomNote__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNote__Group__2"


    // $ANTLR start "rule__CustomNote__Group__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2786:1: rule__CustomNote__Group__2__Impl : ( ruleCustomNoteParam ) ;
    public final void rule__CustomNote__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2790:1: ( ( ruleCustomNoteParam ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2791:1: ( ruleCustomNoteParam )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2791:1: ( ruleCustomNoteParam )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2792:1: ruleCustomNoteParam
            {
             before(grammarAccess.getCustomNoteAccess().getCustomNoteParamParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleCustomNoteParam_in_rule__CustomNote__Group__2__Impl5677);
            ruleCustomNoteParam();

            state._fsp--;

             after(grammarAccess.getCustomNoteAccess().getCustomNoteParamParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNote__Group__2__Impl"


    // $ANTLR start "rule__CustomNote__Group__3"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2803:1: rule__CustomNote__Group__3 : rule__CustomNote__Group__3__Impl ;
    public final void rule__CustomNote__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2807:1: ( rule__CustomNote__Group__3__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2808:2: rule__CustomNote__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CustomNote__Group__3__Impl_in_rule__CustomNote__Group__35706);
            rule__CustomNote__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNote__Group__3"


    // $ANTLR start "rule__CustomNote__Group__3__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2814:1: rule__CustomNote__Group__3__Impl : ( ')' ) ;
    public final void rule__CustomNote__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2818:1: ( ( ')' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2819:1: ( ')' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2819:1: ( ')' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2820:1: ')'
            {
             before(grammarAccess.getCustomNoteAccess().getRightParenthesisKeyword_3()); 
            match(input,48,FOLLOW_48_in_rule__CustomNote__Group__3__Impl5734); 
             after(grammarAccess.getCustomNoteAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNote__Group__3__Impl"


    // $ANTLR start "rule__Chord__Group__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2841:1: rule__Chord__Group__0 : rule__Chord__Group__0__Impl rule__Chord__Group__1 ;
    public final void rule__Chord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2845:1: ( rule__Chord__Group__0__Impl rule__Chord__Group__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2846:2: rule__Chord__Group__0__Impl rule__Chord__Group__1
            {
            pushFollow(FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__05773);
            rule__Chord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__05776);
            rule__Chord__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group__0"


    // $ANTLR start "rule__Chord__Group__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2853:1: rule__Chord__Group__0__Impl : ( 'chord' ) ;
    public final void rule__Chord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2857:1: ( ( 'chord' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2858:1: ( 'chord' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2858:1: ( 'chord' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2859:1: 'chord'
            {
             before(grammarAccess.getChordAccess().getChordKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__Chord__Group__0__Impl5804); 
             after(grammarAccess.getChordAccess().getChordKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group__0__Impl"


    // $ANTLR start "rule__Chord__Group__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2872:1: rule__Chord__Group__1 : rule__Chord__Group__1__Impl rule__Chord__Group__2 ;
    public final void rule__Chord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2876:1: ( rule__Chord__Group__1__Impl rule__Chord__Group__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2877:2: rule__Chord__Group__1__Impl rule__Chord__Group__2
            {
            pushFollow(FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__15835);
            rule__Chord__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group__2_in_rule__Chord__Group__15838);
            rule__Chord__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group__1"


    // $ANTLR start "rule__Chord__Group__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2884:1: rule__Chord__Group__1__Impl : ( '(' ) ;
    public final void rule__Chord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2888:1: ( ( '(' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2889:1: ( '(' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2889:1: ( '(' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2890:1: '('
            {
             before(grammarAccess.getChordAccess().getLeftParenthesisKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__Chord__Group__1__Impl5866); 
             after(grammarAccess.getChordAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group__1__Impl"


    // $ANTLR start "rule__Chord__Group__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2903:1: rule__Chord__Group__2 : rule__Chord__Group__2__Impl rule__Chord__Group__3 ;
    public final void rule__Chord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2907:1: ( rule__Chord__Group__2__Impl rule__Chord__Group__3 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2908:2: rule__Chord__Group__2__Impl rule__Chord__Group__3
            {
            pushFollow(FOLLOW_rule__Chord__Group__2__Impl_in_rule__Chord__Group__25897);
            rule__Chord__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group__3_in_rule__Chord__Group__25900);
            rule__Chord__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group__2"


    // $ANTLR start "rule__Chord__Group__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2915:1: rule__Chord__Group__2__Impl : ( ruleChordParams ) ;
    public final void rule__Chord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2919:1: ( ( ruleChordParams ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2920:1: ( ruleChordParams )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2920:1: ( ruleChordParams )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2921:1: ruleChordParams
            {
             before(grammarAccess.getChordAccess().getChordParamsParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleChordParams_in_rule__Chord__Group__2__Impl5927);
            ruleChordParams();

            state._fsp--;

             after(grammarAccess.getChordAccess().getChordParamsParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group__2__Impl"


    // $ANTLR start "rule__Chord__Group__3"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2932:1: rule__Chord__Group__3 : rule__Chord__Group__3__Impl rule__Chord__Group__4 ;
    public final void rule__Chord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2936:1: ( rule__Chord__Group__3__Impl rule__Chord__Group__4 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2937:2: rule__Chord__Group__3__Impl rule__Chord__Group__4
            {
            pushFollow(FOLLOW_rule__Chord__Group__3__Impl_in_rule__Chord__Group__35956);
            rule__Chord__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Chord__Group__4_in_rule__Chord__Group__35959);
            rule__Chord__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group__3"


    // $ANTLR start "rule__Chord__Group__3__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2944:1: rule__Chord__Group__3__Impl : ( ')' ) ;
    public final void rule__Chord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2948:1: ( ( ')' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2949:1: ( ')' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2949:1: ( ')' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2950:1: ')'
            {
             before(grammarAccess.getChordAccess().getRightParenthesisKeyword_3()); 
            match(input,48,FOLLOW_48_in_rule__Chord__Group__3__Impl5987); 
             after(grammarAccess.getChordAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group__3__Impl"


    // $ANTLR start "rule__Chord__Group__4"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2963:1: rule__Chord__Group__4 : rule__Chord__Group__4__Impl ;
    public final void rule__Chord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2967:1: ( rule__Chord__Group__4__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2968:2: rule__Chord__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Chord__Group__4__Impl_in_rule__Chord__Group__46018);
            rule__Chord__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group__4"


    // $ANTLR start "rule__Chord__Group__4__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2974:1: rule__Chord__Group__4__Impl : ( ( rule__Chord__NameAssignment_4 ) ) ;
    public final void rule__Chord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2978:1: ( ( ( rule__Chord__NameAssignment_4 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2979:1: ( ( rule__Chord__NameAssignment_4 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2979:1: ( ( rule__Chord__NameAssignment_4 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2980:1: ( rule__Chord__NameAssignment_4 )
            {
             before(grammarAccess.getChordAccess().getNameAssignment_4()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2981:1: ( rule__Chord__NameAssignment_4 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:2981:2: rule__Chord__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Chord__NameAssignment_4_in_rule__Chord__Group__4__Impl6045);
            rule__Chord__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChordAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__Group__4__Impl"


    // $ANTLR start "rule__ChordParams__Group__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3001:1: rule__ChordParams__Group__0 : rule__ChordParams__Group__0__Impl rule__ChordParams__Group__1 ;
    public final void rule__ChordParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3005:1: ( rule__ChordParams__Group__0__Impl rule__ChordParams__Group__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3006:2: rule__ChordParams__Group__0__Impl rule__ChordParams__Group__1
            {
            pushFollow(FOLLOW_rule__ChordParams__Group__0__Impl_in_rule__ChordParams__Group__06085);
            rule__ChordParams__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChordParams__Group__1_in_rule__ChordParams__Group__06088);
            rule__ChordParams__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChordParams__Group__0"


    // $ANTLR start "rule__ChordParams__Group__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3013:1: rule__ChordParams__Group__0__Impl : ( ( rule__ChordParams__Alternatives_0 ) ) ;
    public final void rule__ChordParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3017:1: ( ( ( rule__ChordParams__Alternatives_0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3018:1: ( ( rule__ChordParams__Alternatives_0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3018:1: ( ( rule__ChordParams__Alternatives_0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3019:1: ( rule__ChordParams__Alternatives_0 )
            {
             before(grammarAccess.getChordParamsAccess().getAlternatives_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3020:1: ( rule__ChordParams__Alternatives_0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3020:2: rule__ChordParams__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ChordParams__Alternatives_0_in_rule__ChordParams__Group__0__Impl6115);
            rule__ChordParams__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getChordParamsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChordParams__Group__0__Impl"


    // $ANTLR start "rule__ChordParams__Group__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3030:1: rule__ChordParams__Group__1 : rule__ChordParams__Group__1__Impl ;
    public final void rule__ChordParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3034:1: ( rule__ChordParams__Group__1__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3035:2: rule__ChordParams__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ChordParams__Group__1__Impl_in_rule__ChordParams__Group__16145);
            rule__ChordParams__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChordParams__Group__1"


    // $ANTLR start "rule__ChordParams__Group__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3041:1: rule__ChordParams__Group__1__Impl : ( ( rule__ChordParams__Group_1__0 )* ) ;
    public final void rule__ChordParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3045:1: ( ( ( rule__ChordParams__Group_1__0 )* ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3046:1: ( ( rule__ChordParams__Group_1__0 )* )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3046:1: ( ( rule__ChordParams__Group_1__0 )* )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3047:1: ( rule__ChordParams__Group_1__0 )*
            {
             before(grammarAccess.getChordParamsAccess().getGroup_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3048:1: ( rule__ChordParams__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==44) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3048:2: rule__ChordParams__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ChordParams__Group_1__0_in_rule__ChordParams__Group__1__Impl6172);
            	    rule__ChordParams__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getChordParamsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChordParams__Group__1__Impl"


    // $ANTLR start "rule__ChordParams__Group_1__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3062:1: rule__ChordParams__Group_1__0 : rule__ChordParams__Group_1__0__Impl rule__ChordParams__Group_1__1 ;
    public final void rule__ChordParams__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3066:1: ( rule__ChordParams__Group_1__0__Impl rule__ChordParams__Group_1__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3067:2: rule__ChordParams__Group_1__0__Impl rule__ChordParams__Group_1__1
            {
            pushFollow(FOLLOW_rule__ChordParams__Group_1__0__Impl_in_rule__ChordParams__Group_1__06207);
            rule__ChordParams__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChordParams__Group_1__1_in_rule__ChordParams__Group_1__06210);
            rule__ChordParams__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChordParams__Group_1__0"


    // $ANTLR start "rule__ChordParams__Group_1__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3074:1: rule__ChordParams__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ChordParams__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3078:1: ( ( ',' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3079:1: ( ',' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3079:1: ( ',' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3080:1: ','
            {
             before(grammarAccess.getChordParamsAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__ChordParams__Group_1__0__Impl6238); 
             after(grammarAccess.getChordParamsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChordParams__Group_1__0__Impl"


    // $ANTLR start "rule__ChordParams__Group_1__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3093:1: rule__ChordParams__Group_1__1 : rule__ChordParams__Group_1__1__Impl ;
    public final void rule__ChordParams__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3097:1: ( rule__ChordParams__Group_1__1__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3098:2: rule__ChordParams__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ChordParams__Group_1__1__Impl_in_rule__ChordParams__Group_1__16269);
            rule__ChordParams__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChordParams__Group_1__1"


    // $ANTLR start "rule__ChordParams__Group_1__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3104:1: rule__ChordParams__Group_1__1__Impl : ( ( rule__ChordParams__Alternatives_1_1 ) ) ;
    public final void rule__ChordParams__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3108:1: ( ( ( rule__ChordParams__Alternatives_1_1 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3109:1: ( ( rule__ChordParams__Alternatives_1_1 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3109:1: ( ( rule__ChordParams__Alternatives_1_1 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3110:1: ( rule__ChordParams__Alternatives_1_1 )
            {
             before(grammarAccess.getChordParamsAccess().getAlternatives_1_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3111:1: ( rule__ChordParams__Alternatives_1_1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3111:2: rule__ChordParams__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__ChordParams__Alternatives_1_1_in_rule__ChordParams__Group_1__1__Impl6296);
            rule__ChordParams__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getChordParamsAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChordParams__Group_1__1__Impl"


    // $ANTLR start "rule__Note__Group__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3125:1: rule__Note__Group__0 : rule__Note__Group__0__Impl rule__Note__Group__1 ;
    public final void rule__Note__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3129:1: ( rule__Note__Group__0__Impl rule__Note__Group__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3130:2: rule__Note__Group__0__Impl rule__Note__Group__1
            {
            pushFollow(FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__06330);
            rule__Note__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Note__Group__1_in_rule__Note__Group__06333);
            rule__Note__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0"


    // $ANTLR start "rule__Note__Group__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3137:1: rule__Note__Group__0__Impl : ( ruleNoteLetter ) ;
    public final void rule__Note__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3141:1: ( ( ruleNoteLetter ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3142:1: ( ruleNoteLetter )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3142:1: ( ruleNoteLetter )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3143:1: ruleNoteLetter
            {
             before(grammarAccess.getNoteAccess().getNoteLetterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNoteLetter_in_rule__Note__Group__0__Impl6360);
            ruleNoteLetter();

            state._fsp--;

             after(grammarAccess.getNoteAccess().getNoteLetterParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__0__Impl"


    // $ANTLR start "rule__Note__Group__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3154:1: rule__Note__Group__1 : rule__Note__Group__1__Impl ;
    public final void rule__Note__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3158:1: ( rule__Note__Group__1__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3159:2: rule__Note__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__16389);
            rule__Note__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1"


    // $ANTLR start "rule__Note__Group__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3165:1: rule__Note__Group__1__Impl : ( ( ruleAccident )? ) ;
    public final void rule__Note__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3169:1: ( ( ( ruleAccident )? ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3170:1: ( ( ruleAccident )? )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3170:1: ( ( ruleAccident )? )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3171:1: ( ruleAccident )?
            {
             before(grammarAccess.getNoteAccess().getAccidentParserRuleCall_1()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3172:1: ( ruleAccident )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=25 && LA16_0<=26)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3172:3: ruleAccident
                    {
                    pushFollow(FOLLOW_ruleAccident_in_rule__Note__Group__1__Impl6417);
                    ruleAccident();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoteAccess().getAccidentParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Note__Group__1__Impl"


    // $ANTLR start "rule__CustomNoteParam__Group_0__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3186:1: rule__CustomNoteParam__Group_0__0 : rule__CustomNoteParam__Group_0__0__Impl rule__CustomNoteParam__Group_0__1 ;
    public final void rule__CustomNoteParam__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3190:1: ( rule__CustomNoteParam__Group_0__0__Impl rule__CustomNoteParam__Group_0__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3191:2: rule__CustomNoteParam__Group_0__0__Impl rule__CustomNoteParam__Group_0__1
            {
            pushFollow(FOLLOW_rule__CustomNoteParam__Group_0__0__Impl_in_rule__CustomNoteParam__Group_0__06452);
            rule__CustomNoteParam__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomNoteParam__Group_0__1_in_rule__CustomNoteParam__Group_0__06455);
            rule__CustomNoteParam__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_0__0"


    // $ANTLR start "rule__CustomNoteParam__Group_0__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3198:1: rule__CustomNoteParam__Group_0__0__Impl : ( ( rule__CustomNoteParam__OctaveAssignment_0_0 ) ) ;
    public final void rule__CustomNoteParam__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3202:1: ( ( ( rule__CustomNoteParam__OctaveAssignment_0_0 ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3203:1: ( ( rule__CustomNoteParam__OctaveAssignment_0_0 ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3203:1: ( ( rule__CustomNoteParam__OctaveAssignment_0_0 ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3204:1: ( rule__CustomNoteParam__OctaveAssignment_0_0 )
            {
             before(grammarAccess.getCustomNoteParamAccess().getOctaveAssignment_0_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3205:1: ( rule__CustomNoteParam__OctaveAssignment_0_0 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3205:2: rule__CustomNoteParam__OctaveAssignment_0_0
            {
            pushFollow(FOLLOW_rule__CustomNoteParam__OctaveAssignment_0_0_in_rule__CustomNoteParam__Group_0__0__Impl6482);
            rule__CustomNoteParam__OctaveAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomNoteParamAccess().getOctaveAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_0__0__Impl"


    // $ANTLR start "rule__CustomNoteParam__Group_0__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3215:1: rule__CustomNoteParam__Group_0__1 : rule__CustomNoteParam__Group_0__1__Impl rule__CustomNoteParam__Group_0__2 ;
    public final void rule__CustomNoteParam__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3219:1: ( rule__CustomNoteParam__Group_0__1__Impl rule__CustomNoteParam__Group_0__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3220:2: rule__CustomNoteParam__Group_0__1__Impl rule__CustomNoteParam__Group_0__2
            {
            pushFollow(FOLLOW_rule__CustomNoteParam__Group_0__1__Impl_in_rule__CustomNoteParam__Group_0__16512);
            rule__CustomNoteParam__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomNoteParam__Group_0__2_in_rule__CustomNoteParam__Group_0__16515);
            rule__CustomNoteParam__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_0__1"


    // $ANTLR start "rule__CustomNoteParam__Group_0__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3227:1: rule__CustomNoteParam__Group_0__1__Impl : ( ',' ) ;
    public final void rule__CustomNoteParam__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3231:1: ( ( ',' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3232:1: ( ',' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3232:1: ( ',' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3233:1: ','
            {
             before(grammarAccess.getCustomNoteParamAccess().getCommaKeyword_0_1()); 
            match(input,44,FOLLOW_44_in_rule__CustomNoteParam__Group_0__1__Impl6543); 
             after(grammarAccess.getCustomNoteParamAccess().getCommaKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_0__1__Impl"


    // $ANTLR start "rule__CustomNoteParam__Group_0__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3246:1: rule__CustomNoteParam__Group_0__2 : rule__CustomNoteParam__Group_0__2__Impl ;
    public final void rule__CustomNoteParam__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3250:1: ( rule__CustomNoteParam__Group_0__2__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3251:2: rule__CustomNoteParam__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomNoteParam__Group_0__2__Impl_in_rule__CustomNoteParam__Group_0__26574);
            rule__CustomNoteParam__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_0__2"


    // $ANTLR start "rule__CustomNoteParam__Group_0__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3257:1: rule__CustomNoteParam__Group_0__2__Impl : ( ruleTn ) ;
    public final void rule__CustomNoteParam__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3261:1: ( ( ruleTn ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3262:1: ( ruleTn )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3262:1: ( ruleTn )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3263:1: ruleTn
            {
             before(grammarAccess.getCustomNoteParamAccess().getTnParserRuleCall_0_2()); 
            pushFollow(FOLLOW_ruleTn_in_rule__CustomNoteParam__Group_0__2__Impl6601);
            ruleTn();

            state._fsp--;

             after(grammarAccess.getCustomNoteParamAccess().getTnParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_0__2__Impl"


    // $ANTLR start "rule__CustomNoteParam__Group_1__0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3280:1: rule__CustomNoteParam__Group_1__0 : rule__CustomNoteParam__Group_1__0__Impl rule__CustomNoteParam__Group_1__1 ;
    public final void rule__CustomNoteParam__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3284:1: ( rule__CustomNoteParam__Group_1__0__Impl rule__CustomNoteParam__Group_1__1 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3285:2: rule__CustomNoteParam__Group_1__0__Impl rule__CustomNoteParam__Group_1__1
            {
            pushFollow(FOLLOW_rule__CustomNoteParam__Group_1__0__Impl_in_rule__CustomNoteParam__Group_1__06636);
            rule__CustomNoteParam__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomNoteParam__Group_1__1_in_rule__CustomNoteParam__Group_1__06639);
            rule__CustomNoteParam__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_1__0"


    // $ANTLR start "rule__CustomNoteParam__Group_1__0__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3292:1: rule__CustomNoteParam__Group_1__0__Impl : ( ruleTn ) ;
    public final void rule__CustomNoteParam__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3296:1: ( ( ruleTn ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3297:1: ( ruleTn )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3297:1: ( ruleTn )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3298:1: ruleTn
            {
             before(grammarAccess.getCustomNoteParamAccess().getTnParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTn_in_rule__CustomNoteParam__Group_1__0__Impl6666);
            ruleTn();

            state._fsp--;

             after(grammarAccess.getCustomNoteParamAccess().getTnParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_1__0__Impl"


    // $ANTLR start "rule__CustomNoteParam__Group_1__1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3309:1: rule__CustomNoteParam__Group_1__1 : rule__CustomNoteParam__Group_1__1__Impl rule__CustomNoteParam__Group_1__2 ;
    public final void rule__CustomNoteParam__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3313:1: ( rule__CustomNoteParam__Group_1__1__Impl rule__CustomNoteParam__Group_1__2 )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3314:2: rule__CustomNoteParam__Group_1__1__Impl rule__CustomNoteParam__Group_1__2
            {
            pushFollow(FOLLOW_rule__CustomNoteParam__Group_1__1__Impl_in_rule__CustomNoteParam__Group_1__16695);
            rule__CustomNoteParam__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomNoteParam__Group_1__2_in_rule__CustomNoteParam__Group_1__16698);
            rule__CustomNoteParam__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_1__1"


    // $ANTLR start "rule__CustomNoteParam__Group_1__1__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3321:1: rule__CustomNoteParam__Group_1__1__Impl : ( ',' ) ;
    public final void rule__CustomNoteParam__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3325:1: ( ( ',' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3326:1: ( ',' )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3326:1: ( ',' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3327:1: ','
            {
             before(grammarAccess.getCustomNoteParamAccess().getCommaKeyword_1_1()); 
            match(input,44,FOLLOW_44_in_rule__CustomNoteParam__Group_1__1__Impl6726); 
             after(grammarAccess.getCustomNoteParamAccess().getCommaKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_1__1__Impl"


    // $ANTLR start "rule__CustomNoteParam__Group_1__2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3340:1: rule__CustomNoteParam__Group_1__2 : rule__CustomNoteParam__Group_1__2__Impl ;
    public final void rule__CustomNoteParam__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3344:1: ( rule__CustomNoteParam__Group_1__2__Impl )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3345:2: rule__CustomNoteParam__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomNoteParam__Group_1__2__Impl_in_rule__CustomNoteParam__Group_1__26757);
            rule__CustomNoteParam__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_1__2"


    // $ANTLR start "rule__CustomNoteParam__Group_1__2__Impl"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3351:1: rule__CustomNoteParam__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__CustomNoteParam__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3355:1: ( ( RULE_INT ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3356:1: ( RULE_INT )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3356:1: ( RULE_INT )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3357:1: RULE_INT
            {
             before(grammarAccess.getCustomNoteParamAccess().getINTTerminalRuleCall_1_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CustomNoteParam__Group_1__2__Impl6784); 
             after(grammarAccess.getCustomNoteParamAccess().getINTTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__Group_1__2__Impl"


    // $ANTLR start "rule__Midi__NameAssignment_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3375:1: rule__Midi__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Midi__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3379:1: ( ( RULE_ID ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3380:1: ( RULE_ID )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3380:1: ( RULE_ID )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3381:1: RULE_ID
            {
             before(grammarAccess.getMidiAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Midi__NameAssignment_16824); 
             after(grammarAccess.getMidiAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__NameAssignment_1"


    // $ANTLR start "rule__Midi__BodyAssignment_3"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3390:1: rule__Midi__BodyAssignment_3 : ( ruleMidiBody ) ;
    public final void rule__Midi__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3394:1: ( ( ruleMidiBody ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3395:1: ( ruleMidiBody )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3395:1: ( ruleMidiBody )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3396:1: ruleMidiBody
            {
             before(grammarAccess.getMidiAccess().getBodyMidiBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMidiBody_in_rule__Midi__BodyAssignment_36855);
            ruleMidiBody();

            state._fsp--;

             after(grammarAccess.getMidiAccess().getBodyMidiBodyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Midi__BodyAssignment_3"


    // $ANTLR start "rule__MidiBody__ParamAssignment_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3405:1: rule__MidiBody__ParamAssignment_1 : ( ruleParameter ) ;
    public final void rule__MidiBody__ParamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3409:1: ( ( ruleParameter ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3410:1: ( ruleParameter )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3410:1: ( ruleParameter )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3411:1: ruleParameter
            {
             before(grammarAccess.getMidiBodyAccess().getParamParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__MidiBody__ParamAssignment_16886);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMidiBodyAccess().getParamParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidiBody__ParamAssignment_1"


    // $ANTLR start "rule__MidiBody__TracksAssignment_2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3420:1: rule__MidiBody__TracksAssignment_2 : ( ruleTrack ) ;
    public final void rule__MidiBody__TracksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3424:1: ( ( ruleTrack ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3425:1: ( ruleTrack )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3425:1: ( ruleTrack )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3426:1: ruleTrack
            {
             before(grammarAccess.getMidiBodyAccess().getTracksTrackParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTrack_in_rule__MidiBody__TracksAssignment_26917);
            ruleTrack();

            state._fsp--;

             after(grammarAccess.getMidiBodyAccess().getTracksTrackParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MidiBody__TracksAssignment_2"


    // $ANTLR start "rule__Parameter__BeatAssignment_0_1_2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3435:1: rule__Parameter__BeatAssignment_0_1_2 : ( RULE_INT ) ;
    public final void rule__Parameter__BeatAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3439:1: ( ( RULE_INT ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3440:1: ( RULE_INT )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3440:1: ( RULE_INT )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3441:1: RULE_INT
            {
             before(grammarAccess.getParameterAccess().getBeatINTTerminalRuleCall_0_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Parameter__BeatAssignment_0_1_26948); 
             after(grammarAccess.getParameterAccess().getBeatINTTerminalRuleCall_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__BeatAssignment_0_1_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_0_2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3450:1: rule__Parameter__TypeAssignment_0_2 : ( ( 'bpm' ) ) ;
    public final void rule__Parameter__TypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3454:1: ( ( ( 'bpm' ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3455:1: ( ( 'bpm' ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3455:1: ( ( 'bpm' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3456:1: ( 'bpm' )
            {
             before(grammarAccess.getParameterAccess().getTypeBpmKeyword_0_2_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3457:1: ( 'bpm' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3458:1: 'bpm'
            {
             before(grammarAccess.getParameterAccess().getTypeBpmKeyword_0_2_0()); 
            match(input,50,FOLLOW_50_in_rule__Parameter__TypeAssignment_0_26984); 
             after(grammarAccess.getParameterAccess().getTypeBpmKeyword_0_2_0()); 

            }

             after(grammarAccess.getParameterAccess().getTypeBpmKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_0_2"


    // $ANTLR start "rule__Parameter__TsigAssignment_1_0_2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3473:1: rule__Parameter__TsigAssignment_1_0_2 : ( ruleTimeSignature ) ;
    public final void rule__Parameter__TsigAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3477:1: ( ( ruleTimeSignature ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3478:1: ( ruleTimeSignature )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3478:1: ( ruleTimeSignature )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3479:1: ruleTimeSignature
            {
             before(grammarAccess.getParameterAccess().getTsigTimeSignatureParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_ruleTimeSignature_in_rule__Parameter__TsigAssignment_1_0_27023);
            ruleTimeSignature();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTsigTimeSignatureParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TsigAssignment_1_0_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_1_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3488:1: rule__Parameter__TypeAssignment_1_1 : ( ( 'time_sig' ) ) ;
    public final void rule__Parameter__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3492:1: ( ( ( 'time_sig' ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3493:1: ( ( 'time_sig' ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3493:1: ( ( 'time_sig' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3494:1: ( 'time_sig' )
            {
             before(grammarAccess.getParameterAccess().getTypeTime_sigKeyword_1_1_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3495:1: ( 'time_sig' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3496:1: 'time_sig'
            {
             before(grammarAccess.getParameterAccess().getTypeTime_sigKeyword_1_1_0()); 
            match(input,51,FOLLOW_51_in_rule__Parameter__TypeAssignment_1_17059); 
             after(grammarAccess.getParameterAccess().getTypeTime_sigKeyword_1_1_0()); 

            }

             after(grammarAccess.getParameterAccess().getTypeTime_sigKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_1_1"


    // $ANTLR start "rule__Parameter__TnAssignment_2_0_2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3511:1: rule__Parameter__TnAssignment_2_0_2 : ( ruleTn ) ;
    public final void rule__Parameter__TnAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3515:1: ( ( ruleTn ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3516:1: ( ruleTn )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3516:1: ( ruleTn )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3517:1: ruleTn
            {
             before(grammarAccess.getParameterAccess().getTnTnParserRuleCall_2_0_2_0()); 
            pushFollow(FOLLOW_ruleTn_in_rule__Parameter__TnAssignment_2_0_27098);
            ruleTn();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTnTnParserRuleCall_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TnAssignment_2_0_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_2_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3526:1: rule__Parameter__TypeAssignment_2_1 : ( ( 'time_note' ) ) ;
    public final void rule__Parameter__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3530:1: ( ( ( 'time_note' ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3531:1: ( ( 'time_note' ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3531:1: ( ( 'time_note' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3532:1: ( 'time_note' )
            {
             before(grammarAccess.getParameterAccess().getTypeTime_noteKeyword_2_1_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3533:1: ( 'time_note' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3534:1: 'time_note'
            {
             before(grammarAccess.getParameterAccess().getTypeTime_noteKeyword_2_1_0()); 
            match(input,52,FOLLOW_52_in_rule__Parameter__TypeAssignment_2_17134); 
             after(grammarAccess.getParameterAccess().getTypeTime_noteKeyword_2_1_0()); 

            }

             after(grammarAccess.getParameterAccess().getTypeTime_noteKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_2_1"


    // $ANTLR start "rule__Parameter__TpAssignment_3_0_2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3549:1: rule__Parameter__TpAssignment_3_0_2 : ( ruleTp ) ;
    public final void rule__Parameter__TpAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3553:1: ( ( ruleTp ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3554:1: ( ruleTp )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3554:1: ( ruleTp )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3555:1: ruleTp
            {
             before(grammarAccess.getParameterAccess().getTpTpParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_ruleTp_in_rule__Parameter__TpAssignment_3_0_27173);
            ruleTp();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTpTpParserRuleCall_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TpAssignment_3_0_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_3_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3564:1: rule__Parameter__TypeAssignment_3_1 : ( ( 'time_pause' ) ) ;
    public final void rule__Parameter__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3568:1: ( ( ( 'time_pause' ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3569:1: ( ( 'time_pause' ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3569:1: ( ( 'time_pause' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3570:1: ( 'time_pause' )
            {
             before(grammarAccess.getParameterAccess().getTypeTime_pauseKeyword_3_1_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3571:1: ( 'time_pause' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3572:1: 'time_pause'
            {
             before(grammarAccess.getParameterAccess().getTypeTime_pauseKeyword_3_1_0()); 
            match(input,53,FOLLOW_53_in_rule__Parameter__TypeAssignment_3_17209); 
             after(grammarAccess.getParameterAccess().getTypeTime_pauseKeyword_3_1_0()); 

            }

             after(grammarAccess.getParameterAccess().getTypeTime_pauseKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_3_1"


    // $ANTLR start "rule__Parameter__OctaveAssignment_4_0_2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3587:1: rule__Parameter__OctaveAssignment_4_0_2 : ( RULE_INT ) ;
    public final void rule__Parameter__OctaveAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3591:1: ( ( RULE_INT ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3592:1: ( RULE_INT )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3592:1: ( RULE_INT )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3593:1: RULE_INT
            {
             before(grammarAccess.getParameterAccess().getOctaveINTTerminalRuleCall_4_0_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Parameter__OctaveAssignment_4_0_27248); 
             after(grammarAccess.getParameterAccess().getOctaveINTTerminalRuleCall_4_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__OctaveAssignment_4_0_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_4_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3602:1: rule__Parameter__TypeAssignment_4_1 : ( ( 'octave' ) ) ;
    public final void rule__Parameter__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3606:1: ( ( ( 'octave' ) ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3607:1: ( ( 'octave' ) )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3607:1: ( ( 'octave' ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3608:1: ( 'octave' )
            {
             before(grammarAccess.getParameterAccess().getTypeOctaveKeyword_4_1_0()); 
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3609:1: ( 'octave' )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3610:1: 'octave'
            {
             before(grammarAccess.getParameterAccess().getTypeOctaveKeyword_4_1_0()); 
            match(input,54,FOLLOW_54_in_rule__Parameter__TypeAssignment_4_17284); 
             after(grammarAccess.getParameterAccess().getTypeOctaveKeyword_4_1_0()); 

            }

             after(grammarAccess.getParameterAccess().getTypeOctaveKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_4_1"


    // $ANTLR start "rule__Track__NameAssignment_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3625:1: rule__Track__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Track__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3629:1: ( ( RULE_ID ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3630:1: ( RULE_ID )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3630:1: ( RULE_ID )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3631:1: RULE_ID
            {
             before(grammarAccess.getTrackAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Track__NameAssignment_17323); 
             after(grammarAccess.getTrackAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__NameAssignment_1"


    // $ANTLR start "rule__Track__TbodyAssignment_5"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3640:1: rule__Track__TbodyAssignment_5 : ( ruleTrackBody ) ;
    public final void rule__Track__TbodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3644:1: ( ( ruleTrackBody ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3645:1: ( ruleTrackBody )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3645:1: ( ruleTrackBody )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3646:1: ruleTrackBody
            {
             before(grammarAccess.getTrackAccess().getTbodyTrackBodyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTrackBody_in_rule__Track__TbodyAssignment_57354);
            ruleTrackBody();

            state._fsp--;

             after(grammarAccess.getTrackAccess().getTbodyTrackBodyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Track__TbodyAssignment_5"


    // $ANTLR start "rule__TrackBody__BodyAssignment_0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3655:1: rule__TrackBody__BodyAssignment_0 : ( ruleBodyComponent ) ;
    public final void rule__TrackBody__BodyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3659:1: ( ( ruleBodyComponent ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3660:1: ( ruleBodyComponent )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3660:1: ( ruleBodyComponent )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3661:1: ruleBodyComponent
            {
             before(grammarAccess.getTrackBodyAccess().getBodyBodyComponentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_rule__TrackBody__BodyAssignment_07385);
            ruleBodyComponent();

            state._fsp--;

             after(grammarAccess.getTrackBodyAccess().getBodyBodyComponentParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBody__BodyAssignment_0"


    // $ANTLR start "rule__TrackBody__MoreAssignment_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3670:1: rule__TrackBody__MoreAssignment_1 : ( ruleMoreTrackBody ) ;
    public final void rule__TrackBody__MoreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3674:1: ( ( ruleMoreTrackBody ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3675:1: ( ruleMoreTrackBody )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3675:1: ( ruleMoreTrackBody )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3676:1: ruleMoreTrackBody
            {
             before(grammarAccess.getTrackBodyAccess().getMoreMoreTrackBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMoreTrackBody_in_rule__TrackBody__MoreAssignment_17416);
            ruleMoreTrackBody();

            state._fsp--;

             after(grammarAccess.getTrackBodyAccess().getMoreMoreTrackBodyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBody__MoreAssignment_1"


    // $ANTLR start "rule__MoreTrackBody__MorebodyAssignment_1_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3685:1: rule__MoreTrackBody__MorebodyAssignment_1_1 : ( ruleBodyComponent ) ;
    public final void rule__MoreTrackBody__MorebodyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3689:1: ( ( ruleBodyComponent ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3690:1: ( ruleBodyComponent )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3690:1: ( ruleBodyComponent )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3691:1: ruleBodyComponent
            {
             before(grammarAccess.getMoreTrackBodyAccess().getMorebodyBodyComponentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_rule__MoreTrackBody__MorebodyAssignment_1_17447);
            ruleBodyComponent();

            state._fsp--;

             after(grammarAccess.getMoreTrackBodyAccess().getMorebodyBodyComponentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoreTrackBody__MorebodyAssignment_1_1"


    // $ANTLR start "rule__BodyComponent__CnoteAssignment_0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3700:1: rule__BodyComponent__CnoteAssignment_0 : ( ruleCustomNote ) ;
    public final void rule__BodyComponent__CnoteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3704:1: ( ( ruleCustomNote ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3705:1: ( ruleCustomNote )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3705:1: ( ruleCustomNote )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3706:1: ruleCustomNote
            {
             before(grammarAccess.getBodyComponentAccess().getCnoteCustomNoteParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCustomNote_in_rule__BodyComponent__CnoteAssignment_07478);
            ruleCustomNote();

            state._fsp--;

             after(grammarAccess.getBodyComponentAccess().getCnoteCustomNoteParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyComponent__CnoteAssignment_0"


    // $ANTLR start "rule__BodyComponent__NoteAssignment_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3715:1: rule__BodyComponent__NoteAssignment_1 : ( ruleNote ) ;
    public final void rule__BodyComponent__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3719:1: ( ( ruleNote ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3720:1: ( ruleNote )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3720:1: ( ruleNote )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3721:1: ruleNote
            {
             before(grammarAccess.getBodyComponentAccess().getNoteNoteParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNote_in_rule__BodyComponent__NoteAssignment_17509);
            ruleNote();

            state._fsp--;

             after(grammarAccess.getBodyComponentAccess().getNoteNoteParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyComponent__NoteAssignment_1"


    // $ANTLR start "rule__BodyComponent__BlockAssignment_2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3730:1: rule__BodyComponent__BlockAssignment_2 : ( ruleBlock ) ;
    public final void rule__BodyComponent__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3734:1: ( ( ruleBlock ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3735:1: ( ruleBlock )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3735:1: ( ruleBlock )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3736:1: ruleBlock
            {
             before(grammarAccess.getBodyComponentAccess().getBlockBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__BodyComponent__BlockAssignment_27540);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBodyComponentAccess().getBlockBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyComponent__BlockAssignment_2"


    // $ANTLR start "rule__BodyComponent__ChordAssignment_3"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3745:1: rule__BodyComponent__ChordAssignment_3 : ( ruleChord ) ;
    public final void rule__BodyComponent__ChordAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3749:1: ( ( ruleChord ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3750:1: ( ruleChord )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3750:1: ( ruleChord )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3751:1: ruleChord
            {
             before(grammarAccess.getBodyComponentAccess().getChordChordParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleChord_in_rule__BodyComponent__ChordAssignment_37571);
            ruleChord();

            state._fsp--;

             after(grammarAccess.getBodyComponentAccess().getChordChordParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BodyComponent__ChordAssignment_3"


    // $ANTLR start "rule__Block__NameAssignment_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3760:1: rule__Block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3764:1: ( ( RULE_ID ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3765:1: ( RULE_ID )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3765:1: ( RULE_ID )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3766:1: RULE_ID
            {
             before(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Block__NameAssignment_17602); 
             after(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__NameAssignment_1"


    // $ANTLR start "rule__Block__BlockbodyAssignment_3"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3775:1: rule__Block__BlockbodyAssignment_3 : ( ruleTrackBody ) ;
    public final void rule__Block__BlockbodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3779:1: ( ( ruleTrackBody ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3780:1: ( ruleTrackBody )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3780:1: ( ruleTrackBody )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3781:1: ruleTrackBody
            {
             before(grammarAccess.getBlockAccess().getBlockbodyTrackBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTrackBody_in_rule__Block__BlockbodyAssignment_37633);
            ruleTrackBody();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getBlockbodyTrackBodyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__BlockbodyAssignment_3"


    // $ANTLR start "rule__TimeSignature__QuantityAssignment_0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3790:1: rule__TimeSignature__QuantityAssignment_0 : ( RULE_INT ) ;
    public final void rule__TimeSignature__QuantityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3794:1: ( ( RULE_INT ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3795:1: ( RULE_INT )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3795:1: ( RULE_INT )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3796:1: RULE_INT
            {
             before(grammarAccess.getTimeSignatureAccess().getQuantityINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TimeSignature__QuantityAssignment_07664); 
             after(grammarAccess.getTimeSignatureAccess().getQuantityINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__QuantityAssignment_0"


    // $ANTLR start "rule__TimeSignature__NoteAssignment_2"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3805:1: rule__TimeSignature__NoteAssignment_2 : ( RULE_INT ) ;
    public final void rule__TimeSignature__NoteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3809:1: ( ( RULE_INT ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3810:1: ( RULE_INT )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3810:1: ( RULE_INT )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3811:1: RULE_INT
            {
             before(grammarAccess.getTimeSignatureAccess().getNoteINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TimeSignature__NoteAssignment_27695); 
             after(grammarAccess.getTimeSignatureAccess().getNoteINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSignature__NoteAssignment_2"


    // $ANTLR start "rule__Chord__NameAssignment_4"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3820:1: rule__Chord__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Chord__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3824:1: ( ( RULE_ID ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3825:1: ( RULE_ID )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3825:1: ( RULE_ID )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3826:1: RULE_ID
            {
             before(grammarAccess.getChordAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Chord__NameAssignment_47726); 
             after(grammarAccess.getChordAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chord__NameAssignment_4"


    // $ANTLR start "rule__ChordParams__CnotesAssignment_1_1_1"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3835:1: rule__ChordParams__CnotesAssignment_1_1_1 : ( ruleCustomNote ) ;
    public final void rule__ChordParams__CnotesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3839:1: ( ( ruleCustomNote ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3840:1: ( ruleCustomNote )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3840:1: ( ruleCustomNote )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3841:1: ruleCustomNote
            {
             before(grammarAccess.getChordParamsAccess().getCnotesCustomNoteParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleCustomNote_in_rule__ChordParams__CnotesAssignment_1_1_17757);
            ruleCustomNote();

            state._fsp--;

             after(grammarAccess.getChordParamsAccess().getCnotesCustomNoteParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChordParams__CnotesAssignment_1_1_1"


    // $ANTLR start "rule__CustomNoteParam__OctaveAssignment_0_0"
    // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3850:1: rule__CustomNoteParam__OctaveAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__CustomNoteParam__OctaveAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3854:1: ( ( RULE_INT ) )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3855:1: ( RULE_INT )
            {
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3855:1: ( RULE_INT )
            // ../ufscar.Compiladores2.ui/src-gen/ufscar/compiladores2/ui/contentassist/antlr/internal/InternalMusy.g:3856:1: RULE_INT
            {
             before(grammarAccess.getCustomNoteParamAccess().getOctaveINTTerminalRuleCall_0_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CustomNoteParam__OctaveAssignment_0_07788); 
             after(grammarAccess.getCustomNoteParamAccess().getOctaveINTTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomNoteParam__OctaveAssignment_0_0"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA2_eotS =
        "\16\uffff";
    static final String DFA2_eofS =
        "\1\uffff\7\15\2\uffff\2\15\2\uffff";
    static final String DFA2_minS =
        "\10\22\2\uffff\2\22\2\uffff";
    static final String DFA2_maxS =
        "\10\61\2\uffff\2\61\2\uffff";
    static final String DFA2_acceptS =
        "\10\uffff\1\3\1\4\2\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\24\uffff\1\10\3\uffff\1\11",
            "\7\15\1\12\1\13\11\uffff\1\15\7\uffff\2\15\1\uffff\1\14\1\uffff\1\15",
            "\7\15\1\12\1\13\11\uffff\1\15\7\uffff\2\15\1\uffff\1\14\1\uffff\1\15",
            "\7\15\1\12\1\13\11\uffff\1\15\7\uffff\2\15\1\uffff\1\14\1\uffff\1\15",
            "\7\15\1\12\1\13\11\uffff\1\15\7\uffff\2\15\1\uffff\1\14\1\uffff\1\15",
            "\7\15\1\12\1\13\11\uffff\1\15\7\uffff\2\15\1\uffff\1\14\1\uffff\1\15",
            "\7\15\1\12\1\13\11\uffff\1\15\7\uffff\2\15\1\uffff\1\14\1\uffff\1\15",
            "\7\15\1\12\1\13\11\uffff\1\15\7\uffff\2\15\1\uffff\1\14\1\uffff\1\15",
            "",
            "",
            "\7\15\13\uffff\1\15\7\uffff\2\15\1\uffff\1\14\1\uffff\1\15",
            "\7\15\13\uffff\1\15\7\uffff\2\15\1\uffff\1\14\1\uffff\1\15",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "632:1: rule__BodyComponent__Alternatives : ( ( ( rule__BodyComponent__CnoteAssignment_0 ) ) | ( ( rule__BodyComponent__NoteAssignment_1 ) ) | ( ( rule__BodyComponent__BlockAssignment_2 ) ) | ( ( rule__BodyComponent__ChordAssignment_3 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\14\uffff";
    static final String DFA4_eofS =
        "\1\uffff\11\13\2\uffff";
    static final String DFA4_minS =
        "\1\22\7\31\2\54\2\uffff";
    static final String DFA4_maxS =
        "\1\30\11\60\2\uffff";
    static final String DFA4_acceptS =
        "\12\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\14\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\10\1\11\21\uffff\1\13\2\uffff\1\12\1\13",
            "\1\10\1\11\21\uffff\1\13\2\uffff\1\12\1\13",
            "\1\10\1\11\21\uffff\1\13\2\uffff\1\12\1\13",
            "\1\10\1\11\21\uffff\1\13\2\uffff\1\12\1\13",
            "\1\10\1\11\21\uffff\1\13\2\uffff\1\12\1\13",
            "\1\10\1\11\21\uffff\1\13\2\uffff\1\12\1\13",
            "\1\10\1\11\21\uffff\1\13\2\uffff\1\12\1\13",
            "\1\13\2\uffff\1\12\1\13",
            "\1\13\2\uffff\1\12\1\13",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "732:1: rule__ChordParams__Alternatives_0 : ( ( ruleNote ) | ( ruleCustomNote ) );";
        }
    }
    static final String DFA5_eotS =
        "\14\uffff";
    static final String DFA5_eofS =
        "\1\uffff\11\12\2\uffff";
    static final String DFA5_minS =
        "\1\22\7\31\2\54\2\uffff";
    static final String DFA5_maxS =
        "\1\30\11\60\2\uffff";
    static final String DFA5_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\14\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\10\1\11\21\uffff\1\12\2\uffff\1\13\1\12",
            "\1\10\1\11\21\uffff\1\12\2\uffff\1\13\1\12",
            "\1\10\1\11\21\uffff\1\12\2\uffff\1\13\1\12",
            "\1\10\1\11\21\uffff\1\12\2\uffff\1\13\1\12",
            "\1\10\1\11\21\uffff\1\12\2\uffff\1\13\1\12",
            "\1\10\1\11\21\uffff\1\12\2\uffff\1\13\1\12",
            "\1\10\1\11\21\uffff\1\12\2\uffff\1\13\1\12",
            "\1\12\2\uffff\1\13\1\12",
            "\1\12\2\uffff\1\13\1\12",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "754:1: rule__ChordParams__Alternatives_1_1 : ( ( ruleNote ) | ( ( rule__ChordParams__CnotesAssignment_1_1_1 ) ) );";
        }
    }
    static final String DFA9_eotS =
        "\15\uffff";
    static final String DFA9_eofS =
        "\1\uffff\1\11\7\13\4\uffff";
    static final String DFA9_minS =
        "\1\4\10\54\4\uffff";
    static final String DFA9_maxS =
        "\1\21\10\60\4\uffff";
    static final String DFA9_acceptS =
        "\11\uffff\1\3\1\1\1\4\1\2";
    static final String DFA9_specialS =
        "\15\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\6\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12\3\uffff\1\11",
            "\1\14\3\uffff\1\13",
            "\1\14\3\uffff\1\13",
            "\1\14\3\uffff\1\13",
            "\1\14\3\uffff\1\13",
            "\1\14\3\uffff\1\13",
            "\1\14\3\uffff\1\13",
            "\1\14\3\uffff\1\13",
            "",
            "",
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
            return "934:1: rule__CustomNoteParam__Alternatives : ( ( ( rule__CustomNoteParam__Group_0__0 ) ) | ( ( rule__CustomNoteParam__Group_1__0 ) ) | ( RULE_INT ) | ( ruleTn ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleMidi_in_entryRuleMidi61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMidi68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Midi__Group__0_in_ruleMidi94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMidiBody_in_entryRuleMidiBody121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMidiBody128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MidiBody__Group__0_in_ruleMidiBody154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Alternatives_in_ruleParameter214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrack_in_entryRuleTrack241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrack248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Track__Group__0_in_ruleTrack274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrackBody_in_entryRuleTrackBody301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrackBody308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrackBody__Group__0_in_ruleTrackBody334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoreTrackBody_in_entryRuleMoreTrackBody361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMoreTrackBody368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoreTrackBody__Group__0_in_ruleMoreTrackBody394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyComponent__Alternatives_in_ruleBodyComponent454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeSignature_in_entryRuleTimeSignature541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeSignature548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeSignature__Group__0_in_ruleTimeSignature574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTp_in_entryRuleTp601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTp608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Tp__Alternatives_in_ruleTp634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTn_in_entryRuleTn661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTn668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTp_in_ruleTn694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNote_in_entryRuleCustomNote720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomNote727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNote__Group__0_in_ruleCustomNote753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_entryRuleChord780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChord787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__0_in_ruleChord813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChordParams_in_entryRuleChordParams840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChordParams847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChordParams__Group__0_in_ruleChordParams873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoteLetter_in_entryRuleNoteLetter900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoteLetter907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoteLetter__Alternatives_in_ruleNoteLetter933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccident_in_entryRuleAccident960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccident967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Accident__Alternatives_in_ruleAccident993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_entryRuleNote1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNote1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0_in_ruleNote1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_entryRuleInstrument1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstrument1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instrument__Alternatives_in_ruleInstrument1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNoteParam_in_entryRuleCustomNoteParam1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomNoteParam1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Alternatives_in_ruleCustomNoteParam1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0__0_in_rule__Parameter__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__0_in_rule__Parameter__Alternatives1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0_in_rule__Parameter__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__0_in_rule__Parameter__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_4__0_in_rule__Parameter__Alternatives1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyComponent__CnoteAssignment_0_in_rule__BodyComponent__Alternatives1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyComponent__NoteAssignment_1_in_rule__BodyComponent__Alternatives1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyComponent__BlockAssignment_2_in_rule__BodyComponent__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyComponent__ChordAssignment_3_in_rule__BodyComponent__Alternatives1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Tp__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Tp__Alternatives1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Tp__Alternatives1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Tp__Alternatives1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Tp__Alternatives1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Tp__Alternatives1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Tp__Alternatives1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__ChordParams__Alternatives_01556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNote_in_rule__ChordParams__Alternatives_01573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__ChordParams__Alternatives_1_11605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChordParams__CnotesAssignment_1_1_1_in_rule__ChordParams__Alternatives_1_11622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NoteLetter__Alternatives1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NoteLetter__Alternatives1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NoteLetter__Alternatives1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__NoteLetter__Alternatives1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NoteLetter__Alternatives1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NoteLetter__Alternatives1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NoteLetter__Alternatives1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Accident__Alternatives1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Accident__Alternatives1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Instrument__Alternatives1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Instrument__Alternatives1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Instrument__Alternatives1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Instrument__Alternatives1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Instrument__Alternatives1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Instrument__Alternatives1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Instrument__Alternatives1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_0__0_in_rule__CustomNoteParam__Alternatives2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_1__0_in_rule__CustomNoteParam__Alternatives2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CustomNoteParam__Alternatives2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTn_in_rule__CustomNoteParam__Alternatives2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Midi__Group__0__Impl_in_rule__Midi__Group__02103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Midi__Group__1_in_rule__Midi__Group__02106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Midi__Group__0__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Midi__Group__1__Impl_in_rule__Midi__Group__12165 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Midi__Group__2_in_rule__Midi__Group__12168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Midi__NameAssignment_1_in_rule__Midi__Group__1__Impl2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Midi__Group__2__Impl_in_rule__Midi__Group__22225 = new BitSet(new long[]{0x00000FA000000000L});
    public static final BitSet FOLLOW_rule__Midi__Group__3_in_rule__Midi__Group__22228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Midi__Group__2__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Midi__Group__3__Impl_in_rule__Midi__Group__32287 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Midi__Group__4_in_rule__Midi__Group__32290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Midi__BodyAssignment_3_in_rule__Midi__Group__3__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Midi__Group__4__Impl_in_rule__Midi__Group__42347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Midi__Group__4__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MidiBody__Group__0__Impl_in_rule__MidiBody__Group__02416 = new BitSet(new long[]{0x00000FA000000000L});
    public static final BitSet FOLLOW_rule__MidiBody__Group__1_in_rule__MidiBody__Group__02419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MidiBody__Group__1__Impl_in_rule__MidiBody__Group__12477 = new BitSet(new long[]{0x00000FA000000000L});
    public static final BitSet FOLLOW_rule__MidiBody__Group__2_in_rule__MidiBody__Group__12480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MidiBody__ParamAssignment_1_in_rule__MidiBody__Group__1__Impl2507 = new BitSet(new long[]{0x000007A000000002L});
    public static final BitSet FOLLOW_rule__MidiBody__Group__2__Impl_in_rule__MidiBody__Group__22538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MidiBody__TracksAssignment_2_in_rule__MidiBody__Group__2__Impl2565 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0__0__Impl_in_rule__Parameter__Group_0__02602 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0__1_in_rule__Parameter__Group_0__02605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0__1__Impl_in_rule__Parameter__Group_0__12663 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0__2_in_rule__Parameter__Group_0__12666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0_1__0_in_rule__Parameter__Group_0__1__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0__2__Impl_in_rule__Parameter__Group_0__22723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_0_2_in_rule__Parameter__Group_0__2__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0_1__0__Impl_in_rule__Parameter__Group_0_1__02786 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0_1__1_in_rule__Parameter__Group_0_1__02789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Parameter__Group_0_1__0__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0_1__1__Impl_in_rule__Parameter__Group_0_1__12848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0_1__2_in_rule__Parameter__Group_0_1__12851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Parameter__Group_0_1__1__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_0_1__2__Impl_in_rule__Parameter__Group_0_1__22910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__BeatAssignment_0_1_2_in_rule__Parameter__Group_0_1__2__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__0__Impl_in_rule__Parameter__Group_1__02973 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__1_in_rule__Parameter__Group_1__02976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1_0__0_in_rule__Parameter__Group_1__0__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__1__Impl_in_rule__Parameter__Group_1__13033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_1_in_rule__Parameter__Group_1__1__Impl3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1_0__0__Impl_in_rule__Parameter__Group_1_0__03094 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1_0__1_in_rule__Parameter__Group_1_0__03097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Parameter__Group_1_0__0__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1_0__1__Impl_in_rule__Parameter__Group_1_0__13156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1_0__2_in_rule__Parameter__Group_1_0__13159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Parameter__Group_1_0__1__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1_0__2__Impl_in_rule__Parameter__Group_1_0__23218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TsigAssignment_1_0_2_in_rule__Parameter__Group_1_0__2__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__0__Impl_in_rule__Parameter__Group_2__03281 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1_in_rule__Parameter__Group_2__03284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2_0__0_in_rule__Parameter__Group_2__0__Impl3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2__1__Impl_in_rule__Parameter__Group_2__13341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_2_1_in_rule__Parameter__Group_2__1__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2_0__0__Impl_in_rule__Parameter__Group_2_0__03402 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2_0__1_in_rule__Parameter__Group_2_0__03405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Parameter__Group_2_0__0__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2_0__1__Impl_in_rule__Parameter__Group_2_0__13464 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2_0__2_in_rule__Parameter__Group_2_0__13467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Parameter__Group_2_0__1__Impl3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_2_0__2__Impl_in_rule__Parameter__Group_2_0__23526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TnAssignment_2_0_2_in_rule__Parameter__Group_2_0__2__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__0__Impl_in_rule__Parameter__Group_3__03589 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__1_in_rule__Parameter__Group_3__03592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_0__0_in_rule__Parameter__Group_3__0__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3__1__Impl_in_rule__Parameter__Group_3__13649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_3_1_in_rule__Parameter__Group_3__1__Impl3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_0__0__Impl_in_rule__Parameter__Group_3_0__03710 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_0__1_in_rule__Parameter__Group_3_0__03713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Parameter__Group_3_0__0__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_0__1__Impl_in_rule__Parameter__Group_3_0__13772 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_0__2_in_rule__Parameter__Group_3_0__13775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Parameter__Group_3_0__1__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_3_0__2__Impl_in_rule__Parameter__Group_3_0__23834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TpAssignment_3_0_2_in_rule__Parameter__Group_3_0__2__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_4__0__Impl_in_rule__Parameter__Group_4__03897 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_4__1_in_rule__Parameter__Group_4__03900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_4_0__0_in_rule__Parameter__Group_4__0__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_4__1__Impl_in_rule__Parameter__Group_4__13957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_4_1_in_rule__Parameter__Group_4__1__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_4_0__0__Impl_in_rule__Parameter__Group_4_0__04018 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group_4_0__1_in_rule__Parameter__Group_4_0__04021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Parameter__Group_4_0__0__Impl4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_4_0__1__Impl_in_rule__Parameter__Group_4_0__14080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group_4_0__2_in_rule__Parameter__Group_4_0__14083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Parameter__Group_4_0__1__Impl4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_4_0__2__Impl_in_rule__Parameter__Group_4_0__24142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__OctaveAssignment_4_0_2_in_rule__Parameter__Group_4_0__2__Impl4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Track__Group__0__Impl_in_rule__Track__Group__04205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Track__Group__1_in_rule__Track__Group__04208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Track__Group__0__Impl4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Track__Group__1__Impl_in_rule__Track__Group__14267 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Track__Group__2_in_rule__Track__Group__14270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Track__NameAssignment_1_in_rule__Track__Group__1__Impl4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Track__Group__2__Impl_in_rule__Track__Group__24327 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_rule__Track__Group__3_in_rule__Track__Group__24330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Track__Group__2__Impl4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Track__Group__3__Impl_in_rule__Track__Group__34389 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Track__Group__4_in_rule__Track__Group__34392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstrument_in_rule__Track__Group__3__Impl4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Track__Group__4__Impl_in_rule__Track__Group__44448 = new BitSet(new long[]{0x0002200001FC0000L});
    public static final BitSet FOLLOW_rule__Track__Group__5_in_rule__Track__Group__44451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Track__Group__4__Impl4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Track__Group__5__Impl_in_rule__Track__Group__54510 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Track__Group__6_in_rule__Track__Group__54513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Track__TbodyAssignment_5_in_rule__Track__Group__5__Impl4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Track__Group__6__Impl_in_rule__Track__Group__64570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Track__Group__6__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrackBody__Group__0__Impl_in_rule__TrackBody__Group__04643 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__TrackBody__Group__1_in_rule__TrackBody__Group__04646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrackBody__BodyAssignment_0_in_rule__TrackBody__Group__0__Impl4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrackBody__Group__1__Impl_in_rule__TrackBody__Group__14703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrackBody__MoreAssignment_1_in_rule__TrackBody__Group__1__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoreTrackBody__Group__0__Impl_in_rule__MoreTrackBody__Group__04765 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__MoreTrackBody__Group__1_in_rule__MoreTrackBody__Group__04768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoreTrackBody__Group__1__Impl_in_rule__MoreTrackBody__Group__14826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoreTrackBody__Group_1__0_in_rule__MoreTrackBody__Group__1__Impl4855 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__MoreTrackBody__Group_1__0_in_rule__MoreTrackBody__Group__1__Impl4867 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__MoreTrackBody__Group_1__0__Impl_in_rule__MoreTrackBody__Group_1__04904 = new BitSet(new long[]{0x0002200001FC0000L});
    public static final BitSet FOLLOW_rule__MoreTrackBody__Group_1__1_in_rule__MoreTrackBody__Group_1__04907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MoreTrackBody__Group_1__0__Impl4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoreTrackBody__Group_1__1__Impl_in_rule__MoreTrackBody__Group_1__14966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MoreTrackBody__MorebodyAssignment_1_1_in_rule__MoreTrackBody__Group_1__1__Impl4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05027 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Block__Group__0__Impl5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15089 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__15092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__NameAssignment_1_in_rule__Block__Group__1__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__25149 = new BitSet(new long[]{0x0002201001FC0000L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__25152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Block__Group__2__Impl5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__35211 = new BitSet(new long[]{0x0002201001FC0000L});
    public static final BitSet FOLLOW_rule__Block__Group__4_in_rule__Block__Group__35214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__BlockbodyAssignment_3_in_rule__Block__Group__3__Impl5241 = new BitSet(new long[]{0x0002200001FC0002L});
    public static final BitSet FOLLOW_rule__Block__Group__4__Impl_in_rule__Block__Group__45272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Block__Group__4__Impl5300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeSignature__Group__0__Impl_in_rule__TimeSignature__Group__05341 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TimeSignature__Group__1_in_rule__TimeSignature__Group__05344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeSignature__QuantityAssignment_0_in_rule__TimeSignature__Group__0__Impl5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeSignature__Group__1__Impl_in_rule__TimeSignature__Group__15401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeSignature__Group__2_in_rule__TimeSignature__Group__15404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TimeSignature__Group__1__Impl5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeSignature__Group__2__Impl_in_rule__TimeSignature__Group__25463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeSignature__NoteAssignment_2_in_rule__TimeSignature__Group__2__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNote__Group__0__Impl_in_rule__CustomNote__Group__05526 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__CustomNote__Group__1_in_rule__CustomNote__Group__05529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__CustomNote__Group__0__Impl5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNote__Group__1__Impl_in_rule__CustomNote__Group__15585 = new BitSet(new long[]{0x000000000003F810L});
    public static final BitSet FOLLOW_rule__CustomNote__Group__2_in_rule__CustomNote__Group__15588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__CustomNote__Group__1__Impl5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNote__Group__2__Impl_in_rule__CustomNote__Group__25647 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__CustomNote__Group__3_in_rule__CustomNote__Group__25650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNoteParam_in_rule__CustomNote__Group__2__Impl5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNote__Group__3__Impl_in_rule__CustomNote__Group__35706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__CustomNote__Group__3__Impl5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__0__Impl_in_rule__Chord__Group__05773 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Chord__Group__1_in_rule__Chord__Group__05776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Chord__Group__0__Impl5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__1__Impl_in_rule__Chord__Group__15835 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_rule__Chord__Group__2_in_rule__Chord__Group__15838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Chord__Group__1__Impl5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__2__Impl_in_rule__Chord__Group__25897 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Chord__Group__3_in_rule__Chord__Group__25900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChordParams_in_rule__Chord__Group__2__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__3__Impl_in_rule__Chord__Group__35956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Chord__Group__4_in_rule__Chord__Group__35959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Chord__Group__3__Impl5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__Group__4__Impl_in_rule__Chord__Group__46018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Chord__NameAssignment_4_in_rule__Chord__Group__4__Impl6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChordParams__Group__0__Impl_in_rule__ChordParams__Group__06085 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ChordParams__Group__1_in_rule__ChordParams__Group__06088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChordParams__Alternatives_0_in_rule__ChordParams__Group__0__Impl6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChordParams__Group__1__Impl_in_rule__ChordParams__Group__16145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChordParams__Group_1__0_in_rule__ChordParams__Group__1__Impl6172 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__ChordParams__Group_1__0__Impl_in_rule__ChordParams__Group_1__06207 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_rule__ChordParams__Group_1__1_in_rule__ChordParams__Group_1__06210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ChordParams__Group_1__0__Impl6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChordParams__Group_1__1__Impl_in_rule__ChordParams__Group_1__16269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChordParams__Alternatives_1_1_in_rule__ChordParams__Group_1__1__Impl6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__0__Impl_in_rule__Note__Group__06330 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Note__Group__1_in_rule__Note__Group__06333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoteLetter_in_rule__Note__Group__0__Impl6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Note__Group__1__Impl_in_rule__Note__Group__16389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccident_in_rule__Note__Group__1__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_0__0__Impl_in_rule__CustomNoteParam__Group_0__06452 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_0__1_in_rule__CustomNoteParam__Group_0__06455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__OctaveAssignment_0_0_in_rule__CustomNoteParam__Group_0__0__Impl6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_0__1__Impl_in_rule__CustomNoteParam__Group_0__16512 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_0__2_in_rule__CustomNoteParam__Group_0__16515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__CustomNoteParam__Group_0__1__Impl6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_0__2__Impl_in_rule__CustomNoteParam__Group_0__26574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTn_in_rule__CustomNoteParam__Group_0__2__Impl6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_1__0__Impl_in_rule__CustomNoteParam__Group_1__06636 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_1__1_in_rule__CustomNoteParam__Group_1__06639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTn_in_rule__CustomNoteParam__Group_1__0__Impl6666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_1__1__Impl_in_rule__CustomNoteParam__Group_1__16695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_1__2_in_rule__CustomNoteParam__Group_1__16698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__CustomNoteParam__Group_1__1__Impl6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomNoteParam__Group_1__2__Impl_in_rule__CustomNoteParam__Group_1__26757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CustomNoteParam__Group_1__2__Impl6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Midi__NameAssignment_16824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMidiBody_in_rule__Midi__BodyAssignment_36855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__MidiBody__ParamAssignment_16886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrack_in_rule__MidiBody__TracksAssignment_26917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Parameter__BeatAssignment_0_1_26948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Parameter__TypeAssignment_0_26984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeSignature_in_rule__Parameter__TsigAssignment_1_0_27023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Parameter__TypeAssignment_1_17059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTn_in_rule__Parameter__TnAssignment_2_0_27098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Parameter__TypeAssignment_2_17134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTp_in_rule__Parameter__TpAssignment_3_0_27173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Parameter__TypeAssignment_3_17209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Parameter__OctaveAssignment_4_0_27248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Parameter__TypeAssignment_4_17284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Track__NameAssignment_17323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrackBody_in_rule__Track__TbodyAssignment_57354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_rule__TrackBody__BodyAssignment_07385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMoreTrackBody_in_rule__TrackBody__MoreAssignment_17416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_rule__MoreTrackBody__MorebodyAssignment_1_17447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNote_in_rule__BodyComponent__CnoteAssignment_07478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNote_in_rule__BodyComponent__NoteAssignment_17509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__BodyComponent__BlockAssignment_27540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChord_in_rule__BodyComponent__ChordAssignment_37571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Block__NameAssignment_17602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrackBody_in_rule__Block__BlockbodyAssignment_37633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TimeSignature__QuantityAssignment_07664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TimeSignature__NoteAssignment_27695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Chord__NameAssignment_47726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomNote_in_rule__ChordParams__CnotesAssignment_1_1_17757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CustomNoteParam__OctaveAssignment_0_07788 = new BitSet(new long[]{0x0000000000000002L});

}