package lotr;

public class Elf extends Character {

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (this.getPower() == 0) {
            System.out.println("\u001B[34m" + "Elf cries(((" + "\u001B[0m");
        } else {
            if (c.getPower() < this.getPower()) {
                c.setHp(0);
            } else {
                c.setPower(getPower() - 1);
            }
        }
    }
}
