package com.utopia.jumpin.service;

import com.utopia.jumpin.model.Balloon;
import com.utopia.jumpin.model.Jumper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JumperServiceTests {

	@Autowired
	private JumperService jumperService;

	
	@Test
	public void testSUT() throws Exception{
		Assert.assertNotNull(jumperService);
	}
	
	@Test
	public void testDependency() throws Exception{
		Assert.assertNotNull(jumperService);
	}
	
	@Test
	public void testJumpIn() throws Exception{
		Balloon balloon = new Balloon();
		balloon.setId(new Long(1L));
		Set jumpers = new HashSet<Jumper>();
		jumpers.add(new Jumper("shuta", "321"));
		balloon.setJumpers(jumpers);

		Balloon baln = jumperService.jumpIn(new Jumper("shooter", "123"), balloon);
		Assert.assertNotNull(baln);
		Assert.assertEquals(2, baln.getJumpers().size());
	}
}
