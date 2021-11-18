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
	 * public getter methods
	 */
	
	public String getName() {
		return this.name;
	}
	
	// TODO repeat for all other private fields
	// yes i know it looks stupid but it's necessary
	
	/*
	 * public setter methods
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	//TODO repeat for all other private fields
	//we technically only need for health and maybe mana at first but let's just make the setters
	//now so that they exist
}
