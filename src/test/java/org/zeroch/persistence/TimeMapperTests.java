package org.zeroch.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zeroch.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.zeroch.config.RootConfig.class})
@Log4j
public class TimeMapperTests {

	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		log.info("=====testGetTime=====");
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());
		log.info("=================");
	}
	
	@Test
	public void testGetTime2() {
		log.info("=====testGetTime2=====");
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime2());
		log.info("==================");
	}
}
