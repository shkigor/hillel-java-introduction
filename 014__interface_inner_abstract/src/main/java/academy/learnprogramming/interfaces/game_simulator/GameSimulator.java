package academy.learnprogramming.interfaces.game_simulator;

import academy.learnprogramming.interfaces.game_simulator.character.Character;
import academy.learnprogramming.interfaces.game_simulator.character.King;
import academy.learnprogramming.interfaces.game_simulator.character.Knight;
import academy.learnprogramming.interfaces.game_simulator.character.Queen;
import academy.learnprogramming.interfaces.game_simulator.character.Troll;
import academy.learnprogramming.interfaces.game_simulator.weapon.SwordBehaviorImpl;

public class GameSimulator {
    public static void main(String[] args) {
        Character king = new King("Король");
        Character knight = new Knight("Рыцарь");
        Character queen = new Queen("Королева");
        Character troll = new Troll("Тролль");

        king.fight();
        knight.fight();
        queen.fight();
        troll.fight();

        knight.setWeapon(new SwordBehaviorImpl());
        knight.fight();
    }
}
