package academy.learnprogramming.interfaces.game_simulator.character;

import academy.learnprogramming.interfaces.game_simulator.weapon.KnifeBehaviorImpl;
import academy.learnprogramming.interfaces.game_simulator.weapon.WeaponBehavior;

/**
 * Created by IShklyar on 21.02.2017.
 */
public class Queen extends Character {
    public Queen(String name) {
        super(name, new KnifeBehaviorImpl());
    }

    public Queen(String name, WeaponBehavior weaponBehavior) {
        super(name, weaponBehavior);
    }
}
