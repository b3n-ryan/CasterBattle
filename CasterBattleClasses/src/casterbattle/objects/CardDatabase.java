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
	
	/*
	 * Constructor for blank card.
	 */
	private void createNewRep() {
    	this.setName("blank");
    	this.setMana(0);
    	this.setHealth(0);
    	this.setAttack(0);
    	this.setIsCaster(false);
    	this.setMaxCopies(0);
	}
	
    /**
     * Creator of initial representation.
     */
    private void createNewRep(String cardName) {
        accessCard(cardName);
    }
    
    public CardDatabase() {
    	createNewRep();
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
				break;
			case "off-hand counter":
				this.name = "Off-Hand Counter";
				this.mana = 0;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;
				break;
	        case "blossom":
				this.name = "Blossom";
				this.mana = 1;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;
				break;
	        case "flow":
				this.name = "Flow";
				this.mana = 1;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;
				break;
	        case "enhance":
				this.name = "Enhance";
				this.mana = 1;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;
				break;
	        case "demon bolt":
				this.name = "Demon Bolt";
				this.mana = 1;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2; 
				break;
	        case "blood for blood":
				this.name = "Blood For Blood";
				this.mana = 1;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;    
				break;
	        case "goblin bomb":
				this.name = "Goblin Bomb";
				this.mana = 1;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 5;  
				break;
	        case "joust":
				this.name = "Joust";
				this.mana = 1;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2; 
				break;
	        case "train":
				this.name = "Train";
				this.mana = 1;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;   
				break;
	        case "vampiric bite":
				this.name = "Vampiric Bite";
				this.mana = 2;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;
				break;
	        case "attack":
				this.name = "Attack";
				this.mana = 2;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;    
				break;
	        case "protection":
				this.name = "Protection";
				this.mana = 2;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;    
				break;
	        case "quiet":
				this.name = "Quiet";
				this.mana = 2;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;    
				break;
	        case "pyromancy tome":
				this.name = "Pyromancy Tome";
				this.mana = 2;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;     
				break;
	        case "sinister contract":
				this.name = "Sinister Contract";
				this.mana = 2;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;       
				break;
	        case "obliterate":
				this.name = "Obliterate";
				this.mana = 3;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;        
				break;
	        case "last ditch effort":
				this.name = "Last Ditch Effort";
				this.mana = 3;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;  
				break;
	        case "blessed assault":
				this.name = "Blessed Assault";
				this.mana = 3;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;            
				break;
	        case "snatch":
				this.name = "Snatch";
				this.mana = 3;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;            
				break;
	        case "sacrifice":
				this.name = "Sacrifice";
				this.mana = 3;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;          
				break;
	        case "barron's ritual":
				this.name = "Barron's Ritual";
				this.mana = 3;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;    
				break;
	        case "skitter bug":
				this.name = "Skitter Bug";
				this.mana = 3;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;    
				break;
	        case "knowledge":
				this.name = "Knowledge";
				this.mana = 3;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;         
				break;
	        case "fate":
				this.name = "Fate";
				this.mana = 3;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;         
				break;
	        case "flourish":
				this.name = "Flourish";
				this.mana = 3;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;         
				break;
	        case "counter spell":
				this.name = "Counter Spell";
				this.mana = 4;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;          
				break;
	        case "resurrect":
				this.name = "Recurrect";
				this.mana = 5;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;            
				break;
	        case "masterful counter":
				this.name = "Masterful Counter";
				this.mana = 5;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;             
				break;
	        case "time vance":
				this.name = "Time Vance";
				this.mana = 5;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;
				break;
	        case "reduce":
				this.name = "Reduce";
				this.mana = 5;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;            
				break;
	        case "utopia":
				this.name = "Utopia";
				this.mana = 5;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;            
				break;
	        case "arcane blast":
				this.name = "Arcane Blast";
				this.mana = 5;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;           
				break;
	        case "sky guard":
				this.name = "Sky Guard";
				this.mana = 6;
				this.isCaster = false;
				this.attack = 0;
				this.health = 0;
				this.maxCopies = 2;          
				break;
	        case "eadwin the pyromancer":
				this.name = "Eadwin, The Pyromancer";
				this.mana = 1;
				this.isCaster = true;
				this.attack = 1;
				this.health = 1;
				this.maxCopies = 1;            
				break;
	        case "siegmire the old king":
				this.name = "Siegmire, The Old King";
				this.mana = 2;
				this.isCaster = true;
				this.attack = 0;
				this.health = 1;
				this.maxCopies = 1;
				break;
	        case "zeph the wicked":
				this.name = "Zeph, The Wicked";
				this.mana = 2;
				this.isCaster = true;
				this.attack = 1;
				this.health = 2;
				this.maxCopies = 1;            
				break;
	        case "vez'nan the watchful eye":
				this.name = "Vez'nan, The Watchful Eye";
				this.mana = 3;
				this.isCaster = true;
				this.attack = 2;
				this.health = 3;
				this.maxCopies = 1;            
				break;
	        case "egmela barron's mistress":
				this.name = "Egmela, Barron's Mistress";
				this.mana = 3;
				this.isCaster = true;
				this.attack = 3;
				this.health = 3;
				this.maxCopies = 1;            
				break;
	        case "the rotting father":
				this.name = "The Rotting Father";
				this.mana = 3;
				this.isCaster = true;
				this.attack = 3;
				this.health = 4;
				this.maxCopies = 1;            
				break;
	        case "arnauld the knight":
				this.name = "Arnauld, The Knight";
				this.mana = 3;
				this.isCaster = true;
				this.attack = 2;
				this.health = 2;
				this.maxCopies = 1;             
				break;
	        case "rimorn the trickster":
				this.name = "Rimorn, The Trickster";
				this.mana = 4;
				this.isCaster = true;
				this.attack = 2;
				this.health = 4;
				this.maxCopies = 1;    
				break;
	        case "cidor nature's giant":
				this.name = "Cidor, Nature's Giant";
				this.mana = 5;
				this.isCaster = true;
				this.attack = 6;
				this.health = 4;
				this.maxCopies = 1;             
				break;
	        case "grook the goblin king":
				this.name = "Grook, The Goblin King";
				this.mana = 5;
				this.isCaster = true;
				this.attack = 1;
				this.health = 5;
				this.maxCopies = 1;
				break;
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
