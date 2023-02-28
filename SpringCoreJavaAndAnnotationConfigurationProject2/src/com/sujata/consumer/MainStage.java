package com.sujata.consumer;


import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.config.PerformanceConfiguration;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Performer;
import com.sujata.producer.Singer;
import com.sujata.producer.Stage;

public class MainStage {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext springContainer= new AnnotationConfigApplicationContext(PerformanceConfiguration.class);
		
		Performer performer1=(Performer)springContainer.getBean("Yohannes");
		
		performer1.perform();
	}

}
