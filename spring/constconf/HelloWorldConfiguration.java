package com.capgemini.assignment.spring.annotate;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;
import com.capgemini.assignment.spring.provider.*;
import com.capgemini.assignment.spring.renderer.*;

	@Configuration
	public class HelloWorldConfiguration {
		@Bean
		public MessageProvider provider() {
		return new HelloWorld();
	}
		@Bean
		public MessageRenderer renderer(){
		MessageRenderer renderer = new MessageRenderer(provider());
	
		return renderer;
	}

}




