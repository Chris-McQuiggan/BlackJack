package com.bae.blackjack.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.bae.blackjack.main.BlackJack;

public class UnitTests {

	static BlackJack blackJack;

	@BeforeClass
	public static void setup() {
		blackJack = new BlackJack();

	}
	//
	// @Test
	// public void test1() {
	// assertEquals(-1, blackJack.play(0, 0));
	// }
	//
	// @Test
	// public void test2() {
	// assertEquals(21, blackJack.play(3, 21));
	// }
	//
	// @Test
	// public void test3() {
	// assertEquals(21, blackJack.play(21, 10));
	// }
	//
	// @Test
	// public void test4() {
	// assertEquals(10, blackJack.play(10, 10));
	// }
	//
	// @Test
	// public void test5() {
	// assertEquals(21, blackJack.play(30, 21));
	// }
	//
	// @Test
	// public void test6() {
	// assertEquals(-1, blackJack.play(31, 22));
	// }
	//
	// @Test
	// public void test7() {
	// assertEquals(0, blackJack.play(30, 22));
	// }

	@Test
	@Ignore
	public void test8() {
		assertEquals(10, blackJack.play(25, 10));
	}

	@Test
	public void test8a() {
		assertEquals(16, blackJack.play(25, 16));
	}

	@Test
	public void test9() {
		assertEquals(10, blackJack.play(10, 25));
	}

	@Test
	public void test10() {
		assertEquals(0, blackJack.play(25, 25));
	}

	@Test
	public void test11() {
		assertEquals(21, blackJack.play(10, 21));
	}

	@Test
	@Ignore
	public void test12() {
		assertEquals(21, blackJack.play(21, 10));
	}

	@Test
	public void test12a() {
		assertEquals(21, blackJack.play(21, 16));
	}

	@Test
	public void test13() {
		assertEquals(-1, blackJack.play(31, 31));
	}

	@Test
	public void test14() {
		assertEquals(-1, blackJack.play(1, 1));
	}

	@Test
	public void test15() {
		assertEquals(-1, blackJack.play(10, 32));
	}

	@Test
	public void test16() {
		assertEquals(-1, blackJack.play(10, 1));
	}

	@Test
	@Ignore
	public void test17() {
		assertEquals(-1, blackJack.play(31, 10));
	}

	@Test
	public void test17a() {
		assertEquals(-1, blackJack.play(31, 16));
	}

	@Test
	@Ignore
	public void test18() {
		assertEquals(10, blackJack.play(30, 10));
	}

	@Test
	public void test18a() {
		assertEquals(16, blackJack.play(30, 16));
	}

	@Test
	@Ignore
	public void test19() {
		assertEquals(-1, blackJack.play(1, 10));
	}

	@Test
	public void test19a() {
		assertEquals(-1, blackJack.play(1, 16));
	}

	@Test
	@Ignore
	public void test20() {
		assertEquals(10, blackJack.play(4, 10));
	}

	@Test
	public void test20a() {
		assertEquals(16, blackJack.play(4, 16));
	}

}
