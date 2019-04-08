package com.capgemini.assignment.spring.renderer;
import com.capgemini.assignment.spring.provider.*;
import org.springframework.stereotype.Component;

	
@Component
public class MessageRenderer{
	private MessageProvider provider;
	
	

	@Autowired
	@Qualifier("hw")
	public void setMessageProvider(MessageProvider provider){
		this.provider=provider;
	}
	public void render(){
		System.out.println(provider.getMessage());
	}
}