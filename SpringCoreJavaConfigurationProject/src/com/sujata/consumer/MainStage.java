package com.sujata.consumer;


import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.config.PerformanceConfiguration;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Stage;

public class MainStage {

	public static void main(String[] args) {
//		Stage stage=new Stage();
//		
//		stage.setPerformers(Arrays.asList(new Singer("LALALALA"),new Juggler(),new Instrumentalist()));
//		stage.performances();

		/*
		 * Spring Container will read .xml configuration file
		 * will run the life cycyle of the classes mentioned in <bean>tag
		 * 
		 * Life : Object creation and setter in this case
		 */
//		ApplicationContext springContainer= new ClassPathXmlApplicationContext("performance.xml");
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(PerformanceConfiguration.class);
		Stage stage=(Stage)springContainer.getBean("stageA");
		
		stage.performances();
	}

}
