package com.bae.blackjack.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bae.blackjack.main.BlackJack;

public class TwistTest {

	static BlackJack blackJack;

	@BeforeClass
	public static void setup() {
		blackJack = new BlackJack();
	}

	@Test
	public void test1() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			myList.add(blackJack.twist());
		}
		for (int a : myList) {
			if (a > 0 && a < 11) {
				continue;
			} else {
				fail("Fail: Number returned: " + a);
			}
		}
		assertTrue(true);
	}

	@Test
	public void test2() {
		assertEquals(52, blackJack.newDeck().size());
	}

	// @Test
	// public void test1() {
	// assertEquals(2, blackJack.twist());
	// }
	//
	// @Test
	// public void test2() {
	// assertEquals(3, blackJack.twist());
	// }
	//
	// @Test
	// public void test3() {
	// assertEquals(4, blackJack.twist());
	// }
	//
	// @Test
	// public void test4() {
	// assertEquals(5, blackJack.twist());
	// }
	//
	// @Test
	// public void test5() {
	// assertEquals(6, blackJack.twist());
	// }
	//
	// @Test
	// public void test6() {
	// assertEquals(7, blackJack.twist());
	// }
	//
	// @Test
	// public void test7() {
	// assertEquals(8, blackJack.twist());
	// }
	//
	// @Test
	// public void test8() {
	// assertEquals(9, blackJack.twist());
	// }
	//
	// @Test
	// public void test9() {
	// assertEquals(10, blackJack.twist());
	// }
	//
	// @Test
	// public void test10() {
	// assertEquals(11, blackJack.twist());
	// }

}
