/*
 * generated by Xtext
 */
package ufscar.compiladores2;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MusyUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return ufscar.compiladores2.ui.internal.MusyActivator.getInstance().getInjector("ufscar.compiladores2.Musy");
	}
	
}
