/*
 * generated by Xtext
 */
package ufscar.compiladores2.validation

import org.eclipse.xtext.validation.Check
import ufscar.compiladores2.musy.ParameterBeat
import ufscar.compiladores2.musy.ParameterOctave
import ufscar.compiladores2.musy.ParameterTimePause
import ufscar.compiladores2.musy.ParameterTimeNote
import ufscar.compiladores2.musy.ParameterTimeSignature
import java.util.regex.Pattern
import java.util.regex.Matcher

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MusyValidator extends AbstractMusyValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	public String test
	
	@Check
	def void checkBPM(ParameterBeat pb) {
		if(pb.beat < 1 || pb.beat > 500)
			error("Beat must be between 1 and 500", null);
	}
	
	@Check
	def void checkOctave(ParameterOctave po) {
		if(po.octave  < 0 || po.octave > 7)
			error("Octave must be between 1 and 8", null);
	}
	
//
//	@Check
//	def void checkTimePause(ParameterTimePause ptm) {
//		if (! (ptm.getTp.equals("sb") || ptm.getTp.equals("m") || ptm.getTp.equals("sm") || ptm.getTp.equals("cl") || ptm.getTp.equals("sc") || ptm.getTp.equals("f") || ptm.getTp.equals("sf")) )
//			error("Expected values for TIME_PAUSE are 'sb','m','sm','cl','sc','f' or 'sf'", null);
//	}
	
//	@Check
//	def void checkTimeNote(ParameterTimeNote ptn) {
//		if(ptn.tn != "sb" || ptn.tn != "m" || ptn.tn != "sm" || ptn.tn != "cl" || ptn.tn != "sc" || ptn.tn != "f" || ptn.tn != "sf")
//			error("Valid values for TIME_NOTE are 'sb','m','sm','cl','sc','f' or 'sf'", null);
//	}
	
//	@Check
//	def void checkTimeSignature (ParameterTimeSignature pts) {
//		if (pts.tsig)	
//			error("Valid values for TIME_SIGNATURE are INT/INT format (e.g. 10/10)", null);
//	}
	
}
