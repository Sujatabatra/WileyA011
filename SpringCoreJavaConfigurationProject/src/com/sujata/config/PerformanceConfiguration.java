package com.sujata.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Stage;

@Configuration
public class PerformanceConfiguration {

	@Bean("Maria")
	Singer getSinger() {
		return new Singer("Let It Be");
	}
	
	@Bean("Yohannes")
	Juggler getJuggler() {
		Juggler juggler=new Juggler();
		juggler.setBalls(5);
		return juggler;
	}
	
	/*
	 * Either give the name in @Bean Annotation,
	 * otherwise name of the bean will be the name of the function
	 */
	@Bean
	Guitar guitar() {
		return new Guitar();
	}
	
	@Bean("drum")
	Drum getDrum() {
		return new Drum();
	}
	
	@Bean("Jamie")
	Instrumentalist getInstrumentalist() {
		Instrumentalist instrumentalist=new Instrumentalist();
		instrumentalist.setInstrument(guitar());
		return instrumentalist;
	}
	
	@Bean("stageA")
	Stage getStage() {
		Stage stage=new Stage();
		stage.setPerformers(Arrays.asList(getSinger(),getJuggler(),getInstrumentalist()));
		return stage;
	}
}
