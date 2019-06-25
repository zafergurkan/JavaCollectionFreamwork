package com.company;


import java.util.*;

public class Main {
    public enum Suit{
        CLUBS("\u2663"), //sinek
        DIAMONDS("\u2666"), //Karo
        HEARTS("\u2665"), //Kupa
        SPADES("\u2660"); //Maça
        private String symbol;
        private Suit(String symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return symbol;
        }
    }
    public enum Rank{
        TWO("2"),THREE("3"),FOUR("4"),FIVE("5"),SIX("6"),SEVEN("7"),
        EIGHT("8"),NINE("9"),TEN("10"),JACK("J"),QUEEN("Q"),KING("K"),ACE("A");

        private String symbol;

        private Rank(String symbol){
            this.symbol=symbol;
        }

        @Override
        public String toString() {
            return symbol;
        }
    }



    public static class Card{
        private Suit suit;
        private Rank rank;
        public  Card(Suit suit,Rank rank){
            this.suit=suit;
            this.rank=rank;
        }

        public Rank getRank() {
            return rank;
        }

        public Suit getSuit() {
            return suit;
        }

        @Override
        public String toString() {
            return "{"+suit+","+rank+"}"+"\n";
        }
    }

    public static void main(String[] args) {

        List deck = new ArrayList();

        for (Suit suit:Suit.values()){
            for (Rank rank:Rank.values()){
                Card card = new Card(suit,rank);
                deck.add(card);
            }
        }
        Collections.shuffle(deck);
        System.out.println("deck:"+"\n"+deck);
    }
}
