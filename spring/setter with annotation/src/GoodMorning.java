package com.capgemini.assignment.spring.provider;

import org.springframework.stereotype.*;


@Component("gm")
public class GoodMorning implements MessageProvider {



public String getMessage(){

 return "GoodMorning.....!!!!";

}
}
