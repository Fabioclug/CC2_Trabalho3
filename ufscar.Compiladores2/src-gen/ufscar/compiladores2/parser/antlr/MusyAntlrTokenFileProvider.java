/*
 * generated by Xtext
 */
package ufscar.compiladores2.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MusyAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("ufscar/compiladores2/parser/antlr/internal/InternalMusy.tokens");
	}
}