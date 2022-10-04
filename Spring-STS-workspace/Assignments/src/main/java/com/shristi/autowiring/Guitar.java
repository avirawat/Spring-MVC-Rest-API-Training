package com.shristi.autowiring;

import org.springframework.stereotype.Component;

@Component("ginstrument")
public class Guitar implements Instrument {

	@Override
	public void play(String song) {
		System.out.println("Song name is"+song);
		
	}

}
