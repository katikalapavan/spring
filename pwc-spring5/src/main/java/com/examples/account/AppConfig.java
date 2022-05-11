package com.examples.account;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.examples.account.repository.AccountRepository;
import com.examples.account.repository.InMemoryAccountRepository;
import com.examples.account.service.TransferServiceImpl;

@Component
@ComponentScan("com")
public class AppConfig {
@Bean
public InMemoryAccountRepository accountRepository() {
	
	return new InMemoryAccountRepository();
}
@Bean
public TransferServiceImpl transferService(){
	return new TransferServiceImpl(accountRepository() );
}

}
