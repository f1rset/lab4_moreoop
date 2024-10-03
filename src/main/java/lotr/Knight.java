package lotr;
import java.util.Random;

public class Knight extends Character{

    public Knight(){
        super(random(2, 12), random(2, 12));
    }

    private static int random(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;
    }

	@Override
	public void kick(Character c) {
		c.setHp(c.getHp() - random(0, getPower()));
	}

    @Override
    public String toString(){
        return "Knight{hp=" + getHp() + ", power=" + getPower() + "}";

    }
}
