package academy.learnprogramming.interfaces.game_simulator.character;

import academy.learnprogramming.interfaces.game_simulator.weapon.WeaponBehavior;

/**
 * Created by IShklyar on 21.02.2017.
 */
public abstract class Character {
    private String name;
    private WeaponBehavior weapon;

    public Character(String name, WeaponBehavior weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        System.out.print(name + ": ");
        weapon.useWeapon();
    }
}
