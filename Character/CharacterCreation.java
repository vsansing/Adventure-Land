package Character;

public class CharacterCreation {
	private String charName;
	private int charLevel;
	private String charClass;
	private int atkDamage;
	private int defense;
	private int charHealth;

	public CharacterCreation(String charName) {
		this.charName = charName;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public int getCharLevel() {
		return charLevel;
	}

	public void setCharLevel(int charLevel) {
		this.charLevel = charLevel;
	}

	public String getCharClass() {
		return charClass;
	}

	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}

	public int getAtkDamage() {
		return atkDamage;
	}

	public void setAtkDamage(int atkDamage) {
		this.atkDamage = atkDamage;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getCharHealth() {
		return charHealth;
	}

	public void setCharHealth(int charHealth) {
		this.charHealth = charHealth;
	}

	/**
	 * Method to update character when the xp point needs are met. After every
	 * level up, the needed xp increases by a set amount based on a log equation
	 * 
	 * 
	 * @param xpNeeded
	 * @return
	 */
	public boolean levelUp(boolean levelUp) {
		int xpNeeded = charLevel;
		int xpForLevelUp = 0;
		// have xpNeeded = charLevel * (formula)
		// something to the effect of increase by 100xp * log(100)
		// and have that for the loop
		for (int i = 0; i > xpNeeded; i++) {
			if (xpNeeded > xpForLevelUp) {
				return true;
			}
		}
		return true;
	}

	/**
	 * Calls the levelUp method. If the method returns true, then the charLevel
	 * will increase by 1. If levelUp returns false, then charLevel will remain
	 * the same.
	 * 
	 * Also increases health of the player by a set amount
	 * 
	 * @return
	 */
	public int increaseCharLevel() {
		return 0;
	}
}
