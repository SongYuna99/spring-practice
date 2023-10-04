package com.poscodx.container.soundsystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:com/poscodx/container/config/soundsystem/applicationContext.xml")
public class CDPlayerXmlConfigTest {
	@Autowired
	private CDPlayer cdPlayer;

	@Test
	public void testCDPlayerNotNull() {
		assertNotNull(cdPlayer);
	}

	@Test
	public void testPlay() {
		String stream = cdPlayer.play();
		assertEquals("Playig 붕붕 by 김하온", stream);
	}
}
