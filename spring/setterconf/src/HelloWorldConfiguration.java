package com.capgemini.assignment.spring.annotate;

import org.springframework.context.annotation.*;

//org.springframework.context.annotation
import com.capgemini.assignment.spring.provider.*;
import com.capgemini.assignment.spring.renderer.*;

	@Configuration
	public class HelloWorldConfiguration {
		
		@Lazy
		@Bean
		public MessageRenderer renderer(){
		System.out.println("im lazy");
		MessageRenderer renderer = new MessageRenderer();
		renderer.setMessageProvider(new HelloWorld());
		return renderer;
		}

}




