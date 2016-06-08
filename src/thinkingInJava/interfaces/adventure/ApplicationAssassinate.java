package thinkingInJava.interfaces.adventure;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/5/21 0021.
 */
public class ApplicationAssassinate {
    public static void main(String[] args) {
        Character knight = new Knight();
        print("I am a knight:");
        knight.weaponBehavior.useWeapon();
        knight.fight();

        Character queen = new Queen();
        print("I am Queen:");
        queen.weaponBehavior.useWeapon();
        queen.fight();

        Character troll = new Troll();
        print("I am a Troll");
        troll.weaponBehavior.useWeapon();
        troll.fight();

        Character king = new King();
        print("I am King:");
        king.weaponBehavior.useWeapon();
        king.fight();
        print("Weapon failed to assassinate, change weapon:");
        king.setWeapon(new BowAndArrowBehavior());
        king.weaponBehavior.useWeapon();
        king.fight();
    }
}
