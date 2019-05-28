package com.bae.blackjack.main;

import java.util.ArrayList;

public class BlackJack {
	public static void main(String[] args) {

	}

	public ArrayList<Integer> newDeck() {
		ArrayList<Integer> deck = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 11; j++) {
				deck.add(j);
			}
			deck.add(10);
			deck.add(10);
			deck.add(10);
		}

		return deck;

	}

	public int twist() {
		int cardNumber = ((int) (Math.random() * 51) + 1);
		int card = newDeck().get(cardNumber);
		newDeck().remove(cardNumber);
		return card;
	}

	public int play(int player, int dealer) {
		if (player < 4 || player > 30 || dealer < 4 || dealer > 25) {
			return -1;
		} else {
			if (dealer < 16) {
				int card = twist();
				if (card == 11 & dealer + card < 21) {
					card = 1;
				}
				dealer += card;

			}
			if (player > 21 && dealer > 21) {
				return 0;
			} else if (dealer > 21) {
				return player;
			} else if (player > 21 || player < dealer) {
				return dealer;
			}
		}
		return player;
	}
}
