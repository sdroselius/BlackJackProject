package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
//	Create a class Deck. It will hold a List of Cards.
	private List<Card> cards = new ArrayList<>();
	
//	In the constructor, initialize the List with all 52 cards.
	public Deck() {
//		Suit[] suits = Suit.values();
//		for (Suit suit : suits) {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				Card c = new Card(rank, suit);
				cards.add(c);
			}
		}
	}
	
//	Add a method checkDeckSize which returns the number of cards still in the deck.
	public int checkDeckSize() {
		if (cards == null) {
			return -1;
		}
		return cards.size();
	}
	
//	Add a method dealCard that removes a Card from the deck.
	public Card dealCard() {
		return cards.remove(0);
	}
	
//	Add a method shuffle to shuffle the deck.
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	

}
