package com.kiteflo.simpsons.testcases;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import static org.junit.Assert.*;

import com.kiteflo.simpsons.dummyrepos.MovieRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =
{ "/applicationContext.xml" })
@TransactionConfiguration(defaultRollback = false)
public class TestNeo
{
	@Autowired
	private MovieRepository movieRepository;

	@Test
	public void test()
	{
		movieRepository.findAll();
	}

	@Test
	public void testFail()
	{
		System.out.println("dasd");
		Assert.assertEquals(1, 2);
	}

}
