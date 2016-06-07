package thinkingInJava.compositeUse;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/6/7 0007.
 */

//继承：子类继承父类所有的方法，可以重载父类的方法，可以添加自己独有的方法
    //孩子总会继承父母的基因，却又显得与父母并不一样
    //基因重组优化使得人类甚至是自然界都在永无止境地前进着
class Cleanser {
    private String s = "Cleanser";

    public void append(String a){
        s += a;
    }

    public void dilute(){
        append(" dilute()");
    }

    public void apply(){
        append(" apply()");
    }

    public void scrub(){
        append(" scrub()");
    }

    public String toString(){
        return s;
    }
}

class Detergent extends Cleanser{

    @Override
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam(){
        append(" foam()");
    }
}

public class AppTheTwoClass{
    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        print(cleanser);


        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();

        detergent.foam();

        print(detergent);

    }
}
