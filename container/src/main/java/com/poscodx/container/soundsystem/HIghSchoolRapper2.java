package com.poscodx.container.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class HIghSchoolRapper2 implements CompactDisc {
	private String title = "붕붕";
	private String artist = "김하온";

	@Override
	public String play() {
		return "Playig " + title + " by " + artist;
	}

}
