package main.domain.model;

public class MultipleShots implements Skillfull {
	private int numberOfSimultaneousShots;

	public MultipleShots(int numberOfSimultaneousShots) {
		this.numberOfSimultaneousShots = numberOfSimultaneousShots;
	}

	@Override
	public void activeSkill() {
	}

}
