package lotr;

public class Hobbit extends Character{

    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        System.out.println("Hobbit doesn't fight. They try to avoid conflicts.");
    }

    @Override
    public String toString() {
        return "Hobbit{hp=" + getHp() + ", power=" + getPower() + "}";
    }

    @Override
    public void setHp(int hp){
        super.setHp(Math.max(hp, 0));
    }
}
