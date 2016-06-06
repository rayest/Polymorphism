package thinkingInJava.smallFragments.this_;

/**
 * Created by Rayest on 2016/6/6 0006.
 */
public class Leaf {
    private int i = 0;

    Leaf increment(){
        i++;
        return this;
        //返回  对当前对象的引用
    }

    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print();
    }
}
