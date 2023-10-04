package com.poscodx.container.videosystem;

import org.springframework.stereotype.Component;

@Component
public class Avengers implements DigitalVideoDisc {
	private String title = "어벤져스";
	private String studio = "MARVEL";

	@Override
	public String play() {
		return "Playing Movie " + studio + "'s " + title;
	}

}
