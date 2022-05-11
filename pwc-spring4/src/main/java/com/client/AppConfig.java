package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.FixedAccount;
import com.model.SavingAccount;
import com.service.CalculatorService;
@Configuration
@ComponentScan("com")
public class AppConfig {
@Bean
public FixedAccount fda() {
	return new FixedAccount();
}
@Bean

public SavingAccount sa() {
	return new SavingAccount();
}
@Bean
public CalculatorService service() {
	return new CalculatorService(fda());
}
}
