package lotr;

public class Hobbit extends Character{

    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    @Override
    public void setHp(int hp){
        super.setHp(Math.max(hp, 0));
    }

    private void toCry(){
        System.out.println("\u001B[34m" + "Hobbit cries(((" + "\u001B[0m");
    }
}
