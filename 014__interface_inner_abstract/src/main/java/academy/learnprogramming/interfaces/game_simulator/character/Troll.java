package academy.learnprogramming.interfaces.game_simulator.character;

import academy.learnprogramming.interfaces.game_simulator.weapon.AxeBehaviorImpl;
import academy.learnprogramming.interfaces.game_simulator.weapon.WeaponBehavior;

/**
 * Created by IShklyar on 21.02.2017.
 */
public class Troll extends Character {
    public Troll(String name) {
        super(name, new AxeBehaviorImpl());
    }

    public Troll(String name, WeaponBehavior weaponBehavior) {
        super(name, weaponBehavior);
    }
}
