package Dungeon;

import java.util.ArrayList;
import java.util.List;

import Enemy.Enemy;

public class Dungeon1 extends Enemy implements Dungeon {

	private List<Enemy> enemies = new ArrayList<Enemy>();

	@Override
	public String bossDifficulty() {
		return "easy";
	}

	@Override
	public int bossHealth() {
		return 150;
	}

	public int miniBossHealth() {
		return 90;
	}

	@Override
	public String bossItemDrop() {
		return "City Key";
	}

	@Override
	public String getBossName(String name) {
		return "Maximus";
	}

	@Override
	public String miniBoss() {
		String name = null;
		boolean miniBoss = true;
		if (miniBoss == true) {
			name = "Rogarth";
			System.out.println(name); // Debug statement
			return name;
		} else
			return null;
	}

	public List<Enemy> getEnemies() {
		return enemies;
	}

	public void setEnemies(ArrayList<Enemy> enemies) {
		this.enemies = enemies;
	}

	@Override
	/**
	 * The method will be the actual game the player interacts with. It will have
	 * the human readable garbage (or path) of the dungeon
	 */
	public String dungeonPath() {
		return "test it works correctly";
	}

}
