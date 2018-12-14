package Enemy;

public interface EnemyDef {

	public String enemyType(String type);

	public int enemyHealth();

	public String enemyDrop();
	
	public int healthGenerator(int lvlNum);

}
