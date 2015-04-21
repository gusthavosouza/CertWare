/*
 * generated by Xtext
 */
package net.certware.state.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import net.certware.state.ui.internal.StateAnalysisActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StateAnalysisExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return StateAnalysisActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return StateAnalysisActivator.getInstance().getInjector(StateAnalysisActivator.NET_CERTWARE_STATE_STATEANALYSIS);
	}
	
}