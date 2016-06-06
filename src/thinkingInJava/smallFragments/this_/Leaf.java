package thinkingInJava.smallFragments.this_;

/**
 * Created by Rayest on 2016/6/6 0006.
 */
public class Leaf {
    private int i = 0;

    public Leaf increment(){
        i++;
        return this;
        //返回  对当前对象的引用
    }

    public void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        //因为返回了对当前对象的引用，所以可以对一个对象执行多次操作
        leaf.increment().increment().increment().print();
    }
}
