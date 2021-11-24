package casterbattle.objects;

public class PlayerStats {

	private int player1Health;
	private int player2Health;
	
	private int player1Mana;
	private int player2Mana;	

	private boolean player1Turn;
	
	private void createNewRep() {
		
		this.player1Health = 10;
		this.player2Health = 10;
		
		this.player1Mana = 1;
		this.player2Mana = 1;
		
		this.player1Turn = true;	
	}
	
	public PlayerStats() {
		createNewRep();
	}
	
	/*
	 * Setter methods
	 */
	
	public void damagePlayer1() {
		this.player1Health -= 1;
	}
	
	public void damagePlayer1(int amount) {
		this.player1Health -= amount;
	}
	
	public void damagePlayer2() {
		this.player2Health -= 1;
	}
	
	public void damagePlayer2(int amount) {
		this.player2Health -= amount;
	}
	
	public void healPlayer1() {
		this.player1Health += 1;
		if (this.player1Health > 10) {
			this.player1Health = 10;
		}
	}
	
	public void healHealth1(int amount) {
		this.player1Health += amount;
		if (this.player1Health > 10) {
			this.player1Health = 10;
		}
	}
	
	public void healPlayer2() {
		this.player2Health += 1;
		if (this.player2Health > 10) {
			this.player2Health = 10;
		}
	}
	
	public void healHealth2(int amount) {
		this.player2Health += amount;
		if (this.player2Health > 10) {
			this.player2Health = 10;
		}
	}
	
	public void changeManaPlayer1(int amount) {
		this.player1Health += amount;
	}
	
	public void changeManaPlayer2(int amount) {
		this.player1Health += amount;
	}
	
	public void changeTurn() {
		this.player1Turn = !this.player1Turn;
	}
	
	/*
	 * Getter methods
	 */
	
	public int player1Health() {
		return this.player1Health;
	}
	public int player2Health() {
		return this.player2Health;
	}
	
	public int player1Mana() {
		return this.player1Mana;
	}
	public int player2Mana() {
		return this.player2Mana;
	}

	public boolean player1Turn() {
		return this.player1Turn;
	}
}
