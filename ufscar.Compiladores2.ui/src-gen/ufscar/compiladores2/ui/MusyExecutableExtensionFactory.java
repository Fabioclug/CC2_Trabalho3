/*
 * generated by Xtext
 */
package ufscar.compiladores2.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import ufscar.compiladores2.ui.internal.MusyActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MusyExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MusyActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MusyActivator.getInstance().getInjector(MusyActivator.UFSCAR_COMPILADORES2_MUSY);
	}
	
}
