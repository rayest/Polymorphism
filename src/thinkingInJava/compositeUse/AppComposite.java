package thinkingInJava.compositeUse;

/**
 * Created by Rayest on 2016/6/7 0007.
 */
class WaterSource {
    private String s;
    public WaterSource(){
        System.out.println("WaterSource()");
        s = "长白山融化的雪";
    }

    public String toString(){
        return s;
    }
}

class SprinklerSystem {
    private WaterSource waterSource = new WaterSource();

    public String toString(){
        return "waterSource: " + waterSource;
    }
}
public class AppComposite{
    public static void main(String[] args) {
        SprinklerSystem sprinkler = new SprinklerSystem();
        System.out.println(sprinkler);
    }

}

