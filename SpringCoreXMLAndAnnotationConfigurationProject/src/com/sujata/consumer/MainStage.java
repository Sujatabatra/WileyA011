package com.sujata.consumer;


import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;
import com.sujata.producer.Singer;
import com.sujata.producer.Stage;

public class MainStage {

	public static void main(String[] args) {

		ApplicationContext springContainer= new ClassPathXmlApplicationContext("perform.xml");
		
		Performer performer1=(Performer)springContainer.getBean("Jamie");
		
		performer1.perform();
	}

}
