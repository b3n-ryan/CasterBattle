package casterbattle.objects;

/**
 * yeah this is gonna get ugly im sorry to any soul who has to witness this
 * myself included.
 * @author nah not me bro
 *
 */
public class CardDatabase {
	
	//not doing effect yet since we will probably have a class for it
	/*
	 * The name of the card.
	 */
	private String name;
	/*
	 * The mana cost.
	 */
	private int mana;
	/*
	 * Whether it is a caster.
	 */
	private boolean isCaster;
	/*
	 * The attack of a caster, 0 otherwise.
	 */
	private int attack;
	/*
	 * The health of a caster, 0 otherwise.
	 */
	private int health;
	/*
	 * The maximum copies allowed in a deck.
	 */
	private int maxCopies;
	
    /**
     * Creator of initial representation.
     */
    private void createNewRep(String cardName) {
        accessCard(cardName);
    }
	
    /**
     * public constructor
     * 
     * @param cardName the name of the card 
     * <pre>
     * The case of the name does not matter
     * </pre>
     */
	public CardDatabase(String cardName) {
		this.createNewRep(cardName.toLowerCase());
	}
	
	// cry more
	private void accessCard(String cardName) {
		switch(cardName) {
			case "fireball": 
				this.name = "Fireball";
				this.mana = 2;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;
				break;
			case "heal":
				this.name = "Heal";
				this.mana = 0;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;
				
				// TODO have fun :)
		}

	}
	
	/*
	 * Kernel methods-------------------------------------------------
	 */
	
	/*
	 * public getter methods
	 */
	
	/**
	 * Returns the name of the card.
	 * 
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns the mana of the card.
	 * 
	 * @return the mana
	 */
	public int getMana() {
		return this.mana;
	}
	
	/**
	 * Returns whether the card is a caster.
	 * 
	 * @return whether this is a caster
	 */
	public boolean isCaster() {
		return this.isCaster;
	}
	
	/**
	 * Returns the attack of the card (0 if a spell).
	 * 
	 * @return the atttack of this
	 */
	public int getAttack() {
		return this.attack;
	}
	
	/**
	 * Returns the health of the card (0 if a spell).
	 * 
	 * @return the health of this
	 */
	public int getHealth() {
		return this.health;
	}
	
	/**
	 * Returns the maximum allowed copies of the card.
	 * 
	 * @return the max copies of this
	 */
	public int maxCopies() {
		return this.maxCopies;
	}

	/*
	 * public setter methods
	 */
	
	/**
	 * Sets the name of the card to {@code name}
	 * 
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Sets the mana of the card to {@code mana}
	 * 
	 * @param mana the new mana cost
	 */
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	/**
	 * Sets the caster state of the card to {@code caster}
	 * 
	 * @param caster the new caster state
	 */
	public void setIsCaster(boolean caster) {
		this.isCaster = caster;
	}
	
	/**
	 * Sets the attack of the card to {@code attack}
	 * 
	 * @param the new attack
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	/**
	 * Sets the health of the card to {@code health}
	 * 
	 * @param the new health
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
	/**
	 * Sets the maximum copies of the card to {@code copies}
	 * 
	 * @param the new max copies
	 */
	public void setMaxCopies(int max) {
		this.maxCopies = max;
	}
}
