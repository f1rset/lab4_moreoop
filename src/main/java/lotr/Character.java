package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;

    public abstract void kick(Character c);
    public boolean isAlive(){
        return hp > 0;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() +"{hp=" + getHp() + ", power=" + getPower() + "}";
    }
}
