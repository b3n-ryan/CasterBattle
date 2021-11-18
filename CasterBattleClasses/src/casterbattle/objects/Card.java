package casterbattle.objects;

import casterbattle.objects.CardDatabase;

/**
 * 
 */
public class Card {
    /*
     * Private members --------------------------------------------------------
     */

    /**
     * Representation of {@code this}.
     */
	private CardDatabase rep;
	

    /**
     * Creator of initial representation.
     */
    private void createNewRep(String cardName) {
        CardDatabase rep = new CardDatabase(cardName);
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public Card(String cardName) {
        this.createNewRep(cardName);
    }
    
    /*
     * kernel methods ---------------------------------------------------------
     */
    
    /**
     * Adds {@code cardName} to the top of the deck.
     */
    public void addCard(String cardName) {
    	this.rep.add(0, cardName);
    }
    
    /**
     * Adds {@code cardName} to the deck a number of times equal to {@code copies}
     * 
     * @requires the number of copies of a card will not exceed the max allowed 
     * for that card
     */
    public void addCard(int copies, String cardName) {
    	int i = 0;
    	while (i < copies) {
    		this.rep.add(0, cardName);
    		i++;
    	}
    }
    
    /**
     * Removes the top card from the deck.
     * @requires this.size > 0
     * @return the card removed.
     */
    public String removeTop() {
    	String top = this.rep.remove(0);
    	return top;
    }
    
    /**
     * Removes {@code cardName} from the deck.
     * @requires cardName is in the deck
     * @return the card removed
     */
    public String removeCard(String cardName) {
    	int i = 0;
    	boolean cardIsRemoved = false;
    	String removeCard = "";
    	while (i < this.rep.size()) {
    		String card = this.rep.remove(0);
    		if (!cardIsRemoved) {
    			if (card.equals(cardName)) {
    				cardIsRemoved = true;
    				removeCard = card;
    			} else {
    				this.rep.add(this.rep.size(), card);
    			}
    		}else {
    			this.rep.add(this.rep.size(), card);
    		}
    	}
    	
    	return removeCard;
    }
    
    /**
     * Counts the amount of times a card is in {@code this}.
     * @param cardName the card to check for
     * @return the amount of copies of {@code cardName}
     */
    public int cardCount(String cardName) {
    	int count = 0;
    	List<String> temp = new ArrayList<>();
    	while (this.rep.contains(cardName)) {
    		int index = this.rep.indexOf(cardName);
    		String copy = this.rep.remove(index);
    		temp.add(copy);
    		count++;
    	}
    	
    	return count;
    }
    
    /**
     * The size of {@code this}
     * @return the size of the deck
     */
    public int size() {
    	return this.rep.size();
    }
     
    
    // fingers crossed everything works and we don't need to override toString :)
//    @Override
//    public String toString() {
//    }
    
    /*
     * Secondary methods ----------------------------------------------------
     */
    

    
    /**
     * Shuffles the order of all cards in @{code this}.
     */
    public void shuffle() {
    	List<String> temp = new ArrayList<>();
    	
    	//empty this.rep into temp
    	while (this.size() > 0) {
    		temp.add(this.removeTop());
    	}
    	
    	//randomly move cards from temp into this.rep
    	Random rand = new Random();
    	while (temp.size() > 0) {
    		int index = rand.nextInt(temp.size());
    		this.addCard(temp.remove(index));
    	}
    }
    
    // TODO if card is used instead of String, method to check for obeying copy limit
    
    // TODO B4B type draw effects
    
    public static void main(String[] args) {
    	//main is just for testing purposes
        Deck player = new Deck();
        System.out.println(player.toString());
    }
}