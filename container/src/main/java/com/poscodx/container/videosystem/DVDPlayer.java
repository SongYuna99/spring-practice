package com.poscodx.container.videosystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DVDPlayer {
	@Autowired
	private DigitalVideoDisc dvd;
	
	public String play() {
		return dvd.play();
	}
}
