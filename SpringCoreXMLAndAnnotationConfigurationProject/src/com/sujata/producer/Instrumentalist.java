package com.sujata.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Jamie")
public class Instrumentalist implements Performer {

	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;
	
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing : ");
		instrument.play();

	}

}
