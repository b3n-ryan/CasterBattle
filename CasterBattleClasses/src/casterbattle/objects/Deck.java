package casterbattle.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *A deck represented by an arrayList of cards. The card at this.size - 1 is the top 
 * of the deck while the element at 0 is the bottom card.
 *
 * @author Dr. Mundo
 *
 */
public final class Deck {

    /*
     * Private members --------------------------------------------------------
     */

    /**
     * Representation of {@code this}.
     */
    private List<Card> rep;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.rep = new ArrayList<>();
    }

    /*
     * Constructors -----------------------------------------------------------
     */

    /**
     * No-argument constructor.
     */
    public Deck() {
        this.createNewRep();
    }
    
    /*
     * kernel methods ---------------------------------------------------------
     */
    
    /**
     * Replaces this with newDeck and sets newDeck to a new Deck.
     */
    public void transferFrom(Deck newDeck) {
        Deck localSource = (Deck) newDeck;
        this.rep = localSource.rep;
        localSource.createNewRep();
    }
    
    /**
     * Adds Card {@code cardName} to the top of the deck.
     */
    public void addCard(Card cardName) {
    	this.rep.add(this.rep.size(), cardName);
    }
    
    /**
     * Adds Card from {@code cardName} to the top of the deck.
     */
    public void addCard(String cardName) {
    	Card add = new Card(cardName);
    	this.rep.add(this.rep.size(), add);
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
    		Card add = new Card(cardName);
    		this.rep.add(this.rep.size(), add);
    		i++;
    	}
    }
    
    /**
     * Removes the top card from the deck.
     * @requires this.size > 0
     * @return the card removed.
     */
    public Card removeTop() {
    	Card top = this.rep.remove(this.size() - 1);
    	return top;
    }
    
    /**
     * Removes {@code cardName} from the deck.
     * @requires cardName is in the deck
     * @return the card removed
     */
    public Card removeCard(String cardName) {
    	
    	Card remove = new Card(cardName);
    	boolean removed = false;
    	int index = this.rep.size() - 1;
    	while (!removed) {
    		if (this.rep.get(index).equals(remove)) {
    			removed = true;
    		} else {
    			index--;
    		}
    	}
    	
    	
    	return remove;
    }
    
    /**
     * Removes the card at the given deck position.
     * @param index the position of the card in this.rep
     * @requires 0 <= index < this.size
     * @return the card removed
     */
    public Card removeAtIndex(int index) {
    	Card remove = this.rep.get(index);
    	this.rep.remove(index);
    	
    	return remove;
    }
    
    /**
     * Returns the index of next copy of {@code cardName} in the deck.
     * @param cardName the name of the card to be found
     * @return the first index of {@code cardName} or -1 if this does not contain {@code cardName}
     */
    public int indexOf(String cardName) {
    	int index = -1;
    	boolean foundIndex = false;
    	int i = this.rep.size() - 1;
    	while (!foundIndex && i >= 0) {
    		String card = this.rep.get(i).getName();
    		if (card.equals(cardName)) {
    			foundIndex = true;
    			index = i;
    		}
    		i--;
    	}
    	
    	return index;
    }
    
    /**
     * Returns true when this has at least 1 copy of {@code cardName}.
     * 
     * @param cardName the card to check for
     * @return {@code cardName} is in this
     */
    public boolean contains(Card cardName) {
    	boolean contains = false;
    	int i = 0;
    	while (!contains && i < this.rep.size()) {
    		if (cardName.equals(this.rep.get(i))) {
    			contains = true;
    		}
    		i++;
    	}
    	
    	return contains;
    }
    
    /**
     * Returns the index of the closest caster to the top of this.
     * @return the index of the top caster or -1 if there are no casters
     */
    public int indexOfNextCaster() {
    	int index = -1;
    	boolean foundIndex = false;
    	int i = this.rep.size() - 1;
    	while (!foundIndex && i >= 0) {
    		boolean checkCaster = this.rep.get(i).isCaster();
    		if (checkCaster) {
    			foundIndex = true;
    			index = i;
    		}
    	}
    	
    	return index;
    }
    
    /**
     * Returns the index of the closest 3 mana card to the top of this.
     * @return the index of the top 3 mana card or -1 if there are no such cards
     */
    public int indexOfNext3Mana() {
    	int index = -1;
    	boolean foundIndex = false;
    	int i = this.rep.size() - 1;
    	while (!foundIndex && i >= 0) {
    		int checkMana = this.rep.get(i).getMana();
    		if (checkMana == 3) {
    			foundIndex = true;
    			index = i;
    		}
    	}
    	
    	return index;
    }
    
    /**
     * Counts the amount of times a card is in {@code this}.
     * 
     * @param cardName the card to check for
     * @return the amount of copies of {@code cardName}
     */
    public int cardCount(String cardName) {
    	int count = 0;
    	Card check = new Card(cardName);
    	for (Card c : this.rep) {
    		if (c.equals(check)) {
    			count++;
    		}
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
    
    /*
     * Secondary methods ----------------------------------------------------
     */
    
    /**
     * Shuffles the order of all cards in @{code this}.
     */
    public void shuffle() {
    	List<Card> temp = new ArrayList<>();
    	
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
    
    public static void main(String[] args) {
    	//main is just for testing purposes

    }
}