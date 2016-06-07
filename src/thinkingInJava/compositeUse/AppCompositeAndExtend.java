package thinkingInJava.compositeUse;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/6/7 0007.
 */

class Plate{
    public Plate(int i){
        print("Plate constructor");
    }
}

class DinnerPlate extends Plate{

    public DinnerPlate(int i) {
        super(i);
        print("DinnerPlate constructor");
    }
}

class Utensils{
    public Utensils(int i){
        print("Utensils constructor");
    }
}

class Spoon extends Utensils{
    public Spoon(int i) {
        super(i);
        print("Spoon constructor");
    }
}

class Fork extends Utensils{
    public Fork(int i) {
        super(i);
        print("Fork constructor");
    }
}

class Knife extends Utensils {
    public Knife(int i) {
        super(i);
        print("Knife constructor");
    }
}

class Custom{
    public Custom(int i){
        print("Custom constructor");
    }
}

class PlaceSetting extends Custom{
    private Spoon spoon;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinnerPlate;

    public PlaceSetting(int i) {
        super(i + 1);
        spoon = new Spoon(i + 2);
        fork = new Fork(i + 3);
        knife = new Knife(i + 4);
        dinnerPlate = new DinnerPlate(i + 5);

        print("PlateSetting constructor");

    }
}

public class AppCompositeAndExtend {
    public static void main(String[] args) {
        PlaceSetting placeSetting = new PlaceSetting(9);
    }
}
