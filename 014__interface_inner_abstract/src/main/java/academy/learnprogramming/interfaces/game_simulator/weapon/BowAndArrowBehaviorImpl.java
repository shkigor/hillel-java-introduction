package academy.learnprogramming.interfaces.game_simulator.weapon;

/**
 * Created by IShklyar on 21.02.2017.
 */
public class BowAndArrowBehaviorImpl implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Выстрел из лука");
    }
}
