package lotr;
import java.util.Random;


public class Warrior extends Character{

    public Warrior(int a, int b){
        super(random(a, b), random(a, b));
    }

    private static int random(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;
    }

    @Override
	public void kick(Character c) {
		c.setHp(c.getHp() - random(0, getPower()));
	}
}
