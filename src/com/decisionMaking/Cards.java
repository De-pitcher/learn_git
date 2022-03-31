package com.decisionMaking;

public class Cards {
    public final static  int SPADES=0;  // code for 4 suits, plus joker.
    public final static int HEARTS=1;
    public final static int DIAMONDS=2;
    public final static int CLUBS=3;
    public final static int JOKER=3;

    public final static int ACE=1;
    public final static int JACk=11;  // code for non-numeric cards.
    public final static int QUEEN=12;  // cards 2 through 10 have their
    public final static int KING=13;  //  numeric values for their codes
    /**
     * This is card's suit which is one of the constants SPADES, HEARTS, DIAMONDS,
     * CLUBS, or JOKER. The suit cannot be changed after the card is constructed.
     */
    private final int suit;
    /**
     * The card's value. For a normal card, this is one of the values
     * 1 through 13, with 1 representing ACE. For a JOKER, the value
     * can be anything. The value cannot be changed after the card is constructed.
     */
    private final int value;
    /**
     * Create a joker, with 1 as the associated value. (Note that
     * "new Card()" is equivalent to "new Card(1,Card.JOKER)".)
     */
    public Cards(){
        suit=JOKER;
        value=1;
    }
    /**
     * Create a card with a specific suit and value.
     * @param theValue the value of the new card. For a regular card (non-joker),
     * the value must be in the range 1 through 13, with 1 representing an Ace.
     * You can use the constants Card.AC, Card.JACK. Card.QUEEN, Card.KING.
     * For Joker the value can be anything
     * @param theSuit the suit of the new card. This must be one of the values
     *Card.SPADES,Card.HEARTS,Card.DIAMONDS,Card.CLUBS, of Card.JOKER.
     * @throws IllegalArgumentException if the parameter values are not the permissible
     * ranges
     */
    public Cards(int theValue,int theSuit){
        if(theSuit!=SPADES&&theSuit!=HEARTS&&theSuit!=DIAMONDS&&theSuit!=CLUBS&&theSuit!=JOKER)
            throw new IllegalArgumentException("Illegal playing card suit");
        if(theSuit!=JOKER&&(theSuit<1||theSuit>13))
            throw new IllegalArgumentException("Illegal playing card value");
        value=theValue;
        suit=theSuit;
    }
    /**
     * Return the suit of this card.
     * @returns the suit, which is one of the constants Cards.SPADES,
     * .HEARTS,Card.DIAMONDS,Card.CLUBS, of Card.JOKER.
     */
    public int getSuit() {
        return suit;
    }
    /**
     * Return the value of this card.
     * @return the value which is one of the number 1 through 13, inclusive for
     * a regular card, and which can be any value for a joker.
     */
    public int getValue() {
        return value;
    }
    /**
     * Returns a String representation of the Card's suit.
     * @return on of the Strings "Spades", "Hearts", "Diamonds", "Clubs"
     * or "Joker".
     */
    public String getSuitAsString(){
        switch (suit){
            case SPADES:    return "Spades";
            case HEARTS:    return "Hearts";
            case DIAMONDS:  return "Diamonds";
            case CLUBS:     return "Clubs";
            default:        return "Joker";
        }
    }
    /**
     * Returns a String representation of the card's value.
     * @return for a regular card, on of the String "Ace","2",
     * "3",...,"10", "Jack", "Queen", or "King". For a Joker, the
     * string is always numerical.
     */
    public String getValueAsString(){
        if(suit==JOKER)
            return ""+value;
        else {
            switch (value){
                case 1:     return "Ace";
                case 2:     return "2";
                case 3:     return "3";
                case 4:     return "4";
                case 5:     return "5";
                case 6:     return "6";
                case 7:     return "7";
                case 8:     return "8";
                case 9:     return "9";
                case 10:    return "10";
                case 11:    return "Jack";
                case 12:    return "Queen";
                default:    return "King";
            }
        }
    }
    /**
     * Return a string representation of this card, including both
     * it's suit and it's value (except that for a value 1,
     * the return is just "Joker"). Sample return values
     * are: "Queen of Hearts, "10 of Diamonds", "Ace of Spades",
     * "Joker", "Joker #"+ value
     */
    public String toString(){
        if(suit==JOKER){
            if(value==1)
                return "Joker";
            else
                return "Joker #"+ value;
        }
        else
            return getValueAsString()+" of "+getSuitAsString();
    }
}// end class Card
