package com.capgemini.spring.clientconfig;
import com.capgemini.bankapp.service.impl;
import com.capgemini.bankapp.dao.impl;
import com.capgemini.bankapp.util;

import org.springframework.context.annotation.*;

@Configuration
public class ClientConfig{
	@Bean
	public class DbUtil dbUtil(){
		return new dbUtil();
	}
	@Bean
	public class BankAccountDaoImpl bankAccountDaoImpl(){
		return new bankAccountDaoImpl();
	}
	@Bean
	public class BankAccountServiceImpl bankAccountServiceImpl(){
		return new bankAccountServivceImpl();
	}
}