package com.capgemini.assignment.spring.renderer;
import com.capgemini.assignment.spring.provider.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class MessageRenderer{

	@Autowired
	private MessageProvider provider;
	
	
	public void render(){
		System.out.println(provider.getMessage());
	}
}