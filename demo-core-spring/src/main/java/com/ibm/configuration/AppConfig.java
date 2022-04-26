package com.ibm.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({EmployeeConfig.class,HelloWorldConfig.class})
public class AppConfig {

	
}
