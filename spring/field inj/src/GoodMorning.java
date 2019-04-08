package com.capgemini.assignment.spring.provider;
import com.capgemini.assignment.spring.*;
import org.springframework.stereotype.Component;

@Component
public class GoodMorning implements MessageProvider {

public String getMessage(){

 return "GoodMorning.....!!!!";

}
}
