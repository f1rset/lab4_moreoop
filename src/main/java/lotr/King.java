package lotr;

import java.util.Random;

public class King extends Character{

    public King(){
        super(random(5, 15), random(5, 15));
    }

	@Override
	public void kick(Character c) {
		c.setHp(c.getHp() - random(0, getPower()));
	}

    private static int random(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;
    }

    @Override
    public String toString(){
        return "King{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
