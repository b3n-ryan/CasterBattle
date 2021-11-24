package casterbattle.objects;

public class Field {
	
	/*
	 * private members
	 */
	
	private Card player1Caster;
	private Card player1Attacking;
	private Card player2Caster;
	private Card player2Attacking;
	
	private Deck deck;
	private Deck hand;
	private Deck grave;
	
	/**
	 * Creates initial representation.
	 */
	private void createNewRep() {
		this.player1Caster = new Card();
		this.player1Attacking = new Card();
		this.player2Caster = new Card();
		this.player2Attacking = new Card();
		this.deck = new Deck();
		this.hand = new Deck();
		this.deck = new Deck();
	}
	
	/**
	 * No argument constructor.
	 */
	public Field() {
		createNewRep();
	}
	
	/**
	 * replaces the current deck with a new deck. Used for adding the players deck
	 * to the field.
	 * @param newDeck the new deck.
	 */
	public void replaceDeck(Deck newDeck) {
		this.deck.transferFrom(newDeck);
	}
	
	/**
	 * Moves the top card of the deck to the hand.
	 */
	public void drawFromDeck() {
		this.hand.addCard(this.deck.removeTop());
	}
	
	/**
	 * Moves {@code name} from hand to grave.
	 * @param name the card to move
	 */
	public void handToGrave(String name) {
		this.grave.addCard(this.hand.removeCard(name));
	}
	
	/**
	 * Moves {@code name} from grave to hand.
	 * @param name the card to move
	 */
	public void graveToHand(String name) {
		this.hand.addCard(this.hand.removeCard(name));
	}
	
	/**
	 * Moves {@code name} from hand to player1's caster slot.
	 * @param name the card to move
	 */
	public void handToCaster(String name) {
		this.player1Caster = this.hand.removeCard(name);
	}
	
	/**
	 * Moves {@code name} from hand to player1's attacking slot.
	 * @param name the card to move
	 */
	public void handToAttacking(String name) {
		this.player1Attacking = this.hand.removeCard(name);
	}
	
	/**
	 * Moves {@code name} from grave to player1's caster slot.
	 * @param name the card to move
	 */
	public void graveToCaster(String name) {
		this.player1Caster = this.grave.removeCard(name);
	}
	
	/**
	 * Moves {@code name} from grave to player1's attacking slot.
	 * @param name the card to move
	 */
	public void graveToAttacking(String name) {
		this.player1Attacking = this.grave.removeCard(name);
	}
	
	/**
	 * Moves {@code name} from grave to the top of the deck.
	 * @param name the card to move
	 */
	public void graveToDeck(String name) {
		this.deck.addCard(this.grave.removeCard(name));
	}
	
	/**
	 * Moves {@code name} from hand to the top of the deck.
	 * @param name the card to move
	 */
	public void handToDeck(String name) {
		this.deck.addCard(this.hand.removeCard(name));
	}
	
	/**
	 * Plays this card for player 2 in the caster slot.
	 * @param name the card to play
	 */
	public void playForPlayer2Caster(Card name) {
		this.player2Caster = name;
	}
	
	/**
	 * Plays this card for player 2 in the attacking slot.
	 * @param name the card to play
	 */
	public void playForPlayer2Attacking(Card name) {
		this.player2Attacking = name;
	}
	
	/**
	 * Empties the caster slot for player 2.
	 */
	public void removePlayer2Caster() {
		this.player2Caster = new Card();
	}
	
	/**
	 * Empties the caster slot for player 2.
	 */
	public void removePlayer2Attacking() {
		this.player2Attacking = new Card();
	}
	
	/**
	 * Moves the card in the player 1 caster slot to grave.
	 */
	public void casterToGrave() {
		Card add = this.player1Caster;
		this.player1Caster = new Card();
		this.grave.addCard(add);
	}
	
	/**
	 * Moves the card in the player 1 attacking slot to grave.
	 */
	public void attackingToGrave() {
		Card add = this.player1Attacking;
		this.player1Caster = new Card();
		this.grave.addCard(add);
	}
	
	/*
	 * Getter methods for the caster and attacking slots
	 */
	
	/**
	 * The card in player1's caster slot.
	 * @return the card
	 */
	public Card player1Caster() {
		return this.player1Caster;
	}
	
	/**
	 * The card in player1's attacking slot.
	 * @return the card
	 */
	public Card player1Attacking() {
		return this.player1Attacking;
	}
	
	/**
	 * The card in player2's caster slot.
	 * @return the card
	 */
	public Card player2Caster() {
		return this.player2Caster;
	}
	
	/**
	 * The card in player2's attacking slot.
	 * @return the card
	 */
	public Card player2Attacking() {
		return this.player2Attacking;
	}
	
	/**
	 * The deck.
	 * @return the deck
	 */
	public Deck deck() {
		return this.deck;
	}
	
	/**
	 * The grave.
	 * @return the grave
	 */
	public Deck grave() {
		return this.grave;
	}
	
	/**
	 * The hand.
	 * @return the hand
	 */
	public Deck hand() {
		return this.hand;
	}
	
}
