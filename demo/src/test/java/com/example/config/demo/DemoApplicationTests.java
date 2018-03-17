package com.example.config.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Duration;
import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testDuration() {
		SpringProperties properties = this.applicationContext.getBean(SpringProperties.class);
		Instant startTime = Instant.now();
		Instant endTime = startTime.plus(properties.getDuration());
		assertThat(Duration.between(startTime,endTime)).isEqualTo(Duration.ofDays(5));
	}

}
