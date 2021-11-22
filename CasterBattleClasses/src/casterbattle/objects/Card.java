package casterbattle.objects;

/**
 * 
 */
public class Card extends CardDatabase {
	
	/**
	 * public constructor
	 * @param cardName the name of the card
	 */
    public Card(String cardName) {
		super(cardName);

	}

	/*
     * Private members --------------------------------------------------------
     */

    /*
     * Secondary methods ---------------------------------------------------------
     */
    
    @Override
    public boolean equals(Object c) {
        if (c == this) {
            return true;
        }
 
        if (!(c instanceof Card)) {
            return false;
        }
         
        Card x = (Card) c; 
        return x.getName().equals(this.getName());
    }
    
    // TODO look here logee
    //any methods for convenince (any printing related to a card could be here)

	//something like this
	public void printCard() {
		// TODO prints card information
	}
    
    
    
  
    public static void main(String[] args) {
    	//main is just for testing purposes
        Deck player = new Deck();
        System.out.println(player.toString());
    }
}