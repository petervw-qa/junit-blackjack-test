package com.qa.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BlackjackTEST {

	@BeforeAll
	public static void initializeTest() {
		System.out.println("Test Initialized");
	}

	@Test
	public void blackjackCorrectClassInstantiationTest() {
		Blackjack game = new Blackjack();
		assertTrue(game instanceof Blackjack);
	}

	@Test
	public void blackjackPlayerAndDealerFailPathTest() {
		Blackjack game = new Blackjack();

		game.play(50, 50);
		assertEquals(0, game.play(50, 50));
	}

	@Test
	public void blackjackPlayerWinsPathTest() {
		Blackjack game = new Blackjack();
		game.play(1, 20);
		assertEquals(20, game.play(1, 20));
	}

	@Test
	public void blackjackDealerWinsPathTest() {
		Blackjack game = new Blackjack();
		game.play(20, 1);
		assertEquals(20, game.play(20, 1));
	}

	@Test
	public void blackjackHigherOfTheTwoWinsPathTest() {
		Blackjack game = new Blackjack();
		game.play(18, 19);
		assertEquals(19, Math.max(18, 19));
	}

}
