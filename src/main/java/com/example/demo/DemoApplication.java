package com.example.demo;
import com.example.demo.application.HelloWorldController;
import com.foreach.across.core.annotations.AcrossDepends;
import com.foreach.across.core.context.configurer.ApplicationContextConfigurer;
import com.foreach.across.core.context.configurer.ComponentScanConfigurer;
import com.foreach.across.modules.web.AcrossWebModule;


import java.util.Set;


@AcrossDepends(
		required = { AcrossWebModule.NAME,  }
)

public class DemoApplication extends AcrossWebModule {

	public static final String NAME = "DemoApplication";

		@Override
	public String getName() {
		return NAME;
	}

	@Override
	public String getDescription() {
		return "provide a greeting controller";
	}

	public DemoApplication() {
	}

	@Override
	protected void registerDefaultApplicationContextConfigurers(Set<ApplicationContextConfigurer> contextConfigurers) {
		contextConfigurers.add(new ComponentScanConfigurer(HelloWorldController.class));
	}
}