package lotr;

public class GameManager {

    public static void main(String[] args) {
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();
        System.out.println("First chatracter:" + "\u001B[32m" + character1.toString() + "\u001B[0m");
        System.out.println("Second chatracter:" + "\u001B[32m" + character2.toString() + "\u001B[0m");

        while (character1.isAlive() && character2.isAlive()) {
            if (character2.isAlive()) {
                System.out.println("Character one kicks character two!!!");
                character1.kick(character2);
                if (character2.isAlive()) {
                    System.out.println("Character two:"+"\u001B[32m" + character2.toString() + "\u001B[0m");
                }else{
                    System.out.println("\u001B[31m" + "Character two died" + "\u001B[0m");
                    break;
                }
            }
            if (character1.isAlive()) {
                System.out.println("Character two kicks character one!!!");
                character2.kick(character1);
                if (character1.isAlive()) {
                    System.out.println("Character one:"+"\u001B[32m" + character1.toString() + "\u001B[0m");
                }else{
                    System.out.println("\u001B[31m" + "Character one died" + "\u001B[0m");
                    break;
                }
            }
        }
    }
}
