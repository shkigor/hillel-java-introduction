package academy.learnprogramming.interfaces.game_simulator.character;

import academy.learnprogramming.interfaces.game_simulator.weapon.BowAndArrowBehaviorImpl;
import academy.learnprogramming.interfaces.game_simulator.weapon.WeaponBehavior;

/**
 * Created by IShklyar on 21.02.2017.
 */
public class Knight extends Character {
    public Knight(String name) {
        super(name, new BowAndArrowBehaviorImpl());
    }

    public Knight(String name, WeaponBehavior weaponBehavior) {
        super(name, weaponBehavior);
    }
}
