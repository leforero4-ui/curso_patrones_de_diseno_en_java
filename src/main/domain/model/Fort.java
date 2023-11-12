package main.domain.model;

public class Fort extends Enemy {
	private Enemy enemy;

	public Fort(final Enemy enemy) {
		super(enemy.life, enemy.attackLevel, enemy.skill);
		this.enemy = enemy;
	}

	@Override
	public String getAvatar(final String prefix) {
		return enemy.getAvatar(prefix + "F");
	}

	@Override
	public void move(int direction) {
	}

}
