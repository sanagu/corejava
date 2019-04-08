package com.capgemini.assignment.spring.provider;
import com.capgemini.assignment.spring.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Component

@Lazy

public class HelloWorld implements MessageProvider{

public String getMessage(){

 return "HelloWorld..!!";

}
}