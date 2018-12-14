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

	@Override
	public String enemyType(String type) {
		String goblin = "goblin";
		String knight = "knight";
		String raider = "raider";
		String tree = "tree";
		String flyingMan = "flying man";
		String witch = "witch";
		/**
		 * If statement to cycle through the enemy types
		 */

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
		// TODO Auto-generated method stub
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

}
