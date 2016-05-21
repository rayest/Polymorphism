package adventure;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/5/21 0021.
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;
    public void setWeapon(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }
    public void fight(){
        weaponBehavior.useWeapon();
    }
}

class King extends Character{
    public King(){
        weaponBehavior = new KnifeBehavior();
    }
    @Override
     public void fight(){
         print("King is assassinating!");
     }
}

class Queen extends Character{
    public Queen(){
        weaponBehavior = new BowAndArrowBehavior();
    }
    @Override
    public void fight(){
       print("Queen is assassinating!");
   }
}

class Knight extends Character{

    public Knight(){
        weaponBehavior = new AxeBehavior();
    }
    @Override
    public void fight(){
       print("Knight is assassinating!");
   }
}

class Troll extends Character{
    public Troll(){
        weaponBehavior = new SwordBehavior();
    }
    @Override
    public void fight(){
       print("Troll is assassinating!");
   }
}
