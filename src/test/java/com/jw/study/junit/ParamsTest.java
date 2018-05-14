package com.jw.study.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamsTest {

	int expected = 0;
	int input1 = 0;
	int input2 = 0;

	@Parameters
	public static Collection<Object[]> t() {
		return Arrays.asList(new Object[][] { { 1, 2, 3 }, { 2, 2, 4 } });
	}

	public ParamsTest(int input1, int input2, int expected) {
		this.input1 = input1;
		this.input2 = input2;
		this.expected = expected;
	}

	@Test
	public void testAdd() {
		assertEquals(expected, new Calculate().add(input1, input2));
	}
}
