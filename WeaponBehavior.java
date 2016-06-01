package adventure;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/5/21 0021.
 */
public interface WeaponBehavior {
    void useWeapon();
}
class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        print("Knife is assassinating!");
    }
}
class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        print("Axe is assassinating!");
    }
}
class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        print("BowAndArrow is assassinating!");
    }
}
class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        print("Sword is assassinating!");
    }
}