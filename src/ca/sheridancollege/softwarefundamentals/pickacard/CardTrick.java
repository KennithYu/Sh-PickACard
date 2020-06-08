/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner scan = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)((Math.random() * 13) + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);//c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Pick a card, enter value (1-13):");
        int userValue = scan.nextInt();
        
        System.out.println("Enter suit:");
        String userSuit = scan.next();
        
        boolean found = false;
        
        // and search magicHand here
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getSuit().equalsIgnoreCase(userSuit) && magicHand[i].getValue() == userValue) {
                found = true;
                break;
            } else {
                found = false;
            }
        }
        
        //Then report the result here
        if (found) {
            System.out.println("Your card is here! The " + userValue + " of " + userSuit);
        } else {
            System.out.println("Sorry your card is not here!");
        }
    }
    
}
