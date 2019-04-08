package com.capgemini.assignment.spring.renderer;
import com.capgemini.assignment.spring.provider.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
	
@Component
public class MessageRenderer{
	private MessageProvider provider;
	
	

	@Autowired
	public MessageRenderer(MessageProvider provider){
		this.provider=provider;
	}
	public void render(){
		System.out.println(provider.getMessage());
	}
}