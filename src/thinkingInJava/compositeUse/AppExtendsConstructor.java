package thinkingInJava.compositeUse;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/6/7 0007.
 */

//父类构造器总是被调用，父类构造器总是先于子类构造器被调用
 class Art {
    public Art(){
        print("Art()");
    }
}
class  Drawing extends Art{
    public Drawing(){
        print("Drawing()");
    }
}

class Cartoon extends Drawing{
    public Cartoon(){
        print("Cartoon()");
    }
}
public class AppExtendsConstructor{
    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
