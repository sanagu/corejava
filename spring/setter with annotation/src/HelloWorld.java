package com.capgemini.assignment.spring.provider;
import com.capgemini.assignment.spring.*;
import org.springframework.stereotype.*;

@Component("hw")
public class HelloWorld implements MessageProvider{


public String getMessage(){

 return "HelloWorld..!!";

}
}