package academy.learnprogramming.interfaces.game_simulator.character;

import academy.learnprogramming.interfaces.game_simulator.weapon.SwordBehaviorImpl;
import academy.learnprogramming.interfaces.game_simulator.weapon.WeaponBehavior;

/**
 * Created by IShklyar on 21.02.2017.
 */
public class King extends Character {

    public King(String name) {
        super(name, new SwordBehaviorImpl());
    }

    public King(String name, WeaponBehavior weaponBehavior) {
        super(name, weaponBehavior);
    }

}
