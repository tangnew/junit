package com.jw.study.junit;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SayServiceTest {

	@Test
	public void testSay() {
		SayService sayService = new SayService();
		sayService.say("lisi");
	}

	@Test
	public void testSay1() {
		SayService sayService = new SayService();
		sayService.say("lisi");
	}
	
	@BeforeClass
	public static void beforeStaticClass() {
		System.out.println("beforeStaticClass");
	}
	
	//@Ignore
	@Test(timeout=1000, expected=InterruptedException.class)
	public void testTimeout() {
		System.out.println("time out start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("time out end");
	}
	
	
}
