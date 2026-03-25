package CardGame;

/**
 * Name:
 * Date:
 * Period:
 *
 * CardGame.DeckOfCardsTest.java
 *
 * Tester program to shuffle and deal a deck of Card objects
 */

public class DeckOfCardsTest {
    public static void main(String[] args) {
        while (true) {
            DeckOfCards myDeckOfCards = new DeckOfCards();
            myDeckOfCards.shuffle(); // put Card objects in random order

            Hand player = new Hand();
            Hand dealer = new Hand();

            player.addCard(new Card("Ace", "Spades"));

            dealer.addCard(myDeckOfCards.dealCard());

            player.addCard(myDeckOfCards.dealCard());

            dealer.addCard(myDeckOfCards.dealCard());

            System.out.println("dealer has: ");
            System.out.println(dealer.showCard(0));
            System.out.println("second card hidden");
            System.out.println("");

            while (true) {
                System.out.println("player has: ");
                // System.out.println(player.showCard(0));
                // System.out.println(player.showCard(1));
                // System.out.println("player has: ");
                System.out.println(player);
                System.out.println(player.countTotal());

                String playerchoice = Tools.MyTools.readString("do you want another card y/n: ");
                if (playerchoice.equalsIgnoreCase("n")) {
                    break;
                }

                player.hitdeck(playerchoice, myDeckOfCards.dealCard());
                System.out.println();

            }

            // String playerchoice1 = Tools.MyTools.readString("do you want another card
            // y/n");

            // player.hitdeck(playerchoice1,myDeckOfCards.dealCard());

            System.out.println("player has: ");
            System.out.println(player);
            System.out.println(player.countTotal());

            System.out.println(dealer.dealerPlays("y", myDeckOfCards.dealCard()));
            System.out.println(dealer);
            System.out.println(dealer.dealerPlays("y", myDeckOfCards.dealCard()));
            System.out.println(dealer);
            System.out.println(dealer.dealerPlays("y", myDeckOfCards.dealCard()));
            System.out.println(dealer);
            System.out.println(dealer.dealerPlays("y", myDeckOfCards.dealCard()));

            System.out.println(player.whoWins(player.countTotal(), dealer.dealerPlays("y", myDeckOfCards.dealCard())));

            String playerchoice = Tools.MyTools.readString("do you want to play again? : ");
            if (playerchoice.equalsIgnoreCase("n")) {
                break;
            }

        }
    }
}
