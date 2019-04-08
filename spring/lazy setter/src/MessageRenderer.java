package com.capgemini.assignment.spring.renderer;
import com.capgemini.assignment.spring.provider.*;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

@Lazy
@Component
public class MessageRenderer{
	private MessageProvider provider;
	
	public MessageRenderer(){}

	
	public void setMessageProvider(MessageProvider provider){
		this.provider=provider;
}
	public void render(){
		System.out.println(provider.getMessage());
	}
}