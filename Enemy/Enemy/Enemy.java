package Enemy;

/**
 * This class is to define the types of enemies that the player will encounter
 * in the game. It also has all the logic with enemies scaling in later dungeons
 * 
 * @author Victor Sansing
 *
 */
public class Enemy implements EnemyDef {

	private String enemyType;
	private int enemyHealth;
	private String enemeyDrop;
	private String enemyLevel;
	private int newHealth;

	public Enemy() {

	}

	public String getEnemyType() {
		return enemyType;
	}

	public int getEnemyHealth() {
		return enemyHealth;
	}

	public String getEnemeyDrop() {
		return enemeyDrop;
	}

	public String getEnemyLevel() {
		return enemyLevel;
	}

	public int getNewHealth() {
		return newHealth;
	}

	@Override
	public String enemyType(String type) {
		String enemy;
		String goblin = "goblin";
		String knight = "knight";
		String raider = "raider";
		String tree = "tree";
		String flyingMan = "flying man";
		String witch = "witch";
		/**
		 * If statement to cycle through the enemy types
		 * 
		 * 1/5/19 Changed if statement to switch statement to cycle through for
		 * type of enemy that appears
		 */
		switch (type) {
		case "goblin":
			enemy = goblin;
			break;
		case "knight":
			enemy = knight;
			break;
		case "raider":
			enemy = raider;
			break;
		case "tree":
			enemy = tree;
			break;
		case "flyingMan":
			enemy = flyingMan;
			break;
		case "witch":
			enemy = witch;
			break;
		default:
			enemy = null;
			break;

		}

		/**
		 * Add logic to pull and choose each enemyType
		 */
		return type;
	}

	@Override
	/**
	 * Each enemy has a unique health and scales as the game goes along
	 */
	public int enemyHealth() {
		switch (enemyType) {
		case "goblin":
			enemyHealth = 40;
			break;
		case "knight":
			enemyHealth = 55;
			break;
		case "raider":
			enemyHealth = 25;
			break;
		case "tree":
			enemyHealth = 60;
			break;
		case "flyingMan":
			enemyHealth = 35;
			break;
		case "witch":
			enemyHealth = 30;
			break;
		default:
			enemyHealth = 0;
			break;

		}
		return enemyHealth;

	}

	@Override
	/**
	 * Each enemy has a unique drop
	 */
	public String enemyDrop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/**
	 * Each enemy has a unique health and scales as the game goes along
	 */
	public int healthGenerator(int lvlNum) {

		return (int) (enemyHealth * 1.2);
	}

	public int enemyDamageTaken() {
		/**
		 * Method that calculates the current enemy health then subtracts damage
		 * from combat. Method will update each enemy's health
		 */
		return newHealth;
	}

}
