package com.sujata.producer;

import java.util.List;

public class Stage {

	private List<Performer> performers;

	public void setPerformers(List<Performer> performers) {
		this.performers = performers;
	}
	
	public void performances() {
		for(Performer performer:performers) {
			performer.perform();
		}
	}
	
}
