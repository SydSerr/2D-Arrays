
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Create 2D array for the deck
        String[][] deckOfCards = new String[4][13];
        //number array and suits array to go into the 2D array
        String[] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        //nested loop to match up 4 suits with 13 number values
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                deckOfCards[j][i] = numbers[i] + " of " + suits[j];
            }
        }

        //create randomizer class
        Random rand = new Random();
        //array for diff hands
        String[] hands = {"Hand A: ", "Hand B: ", "Hand C: ", "Hand D: "};

        //4 different times for 4 "hands"
        for(int hand =0; hand < 4; hand++){
            //label each set with a hand
            System.out.println(hands[hand]);

            //draw 5 cards
            for (int c = 0; c < 5; c++) {

                //get random suit and random number from deck and pair together
                int randomSuit = rand.nextInt(deckOfCards.length);
                int randomNumber = rand.nextInt(deckOfCards[randomSuit].length);

                //if drawn card hasn't been drawn or marked "null"
                if (deckOfCards[randomSuit][randomNumber] != null) {
                    //print out drawn card then set to null
                    System.out.println(" "+ deckOfCards[randomSuit][randomNumber]);
                    deckOfCards[randomSuit][randomNumber] = null;

                } else {
                    //if not decrement the loop to repeat
                    c--;
                }
            }
            System.out.println("\n");
        }
        }}