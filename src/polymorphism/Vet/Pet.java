package polymorphism.Vet;

/**
 * Created by Administrator on 2016/5/20 0020.
 */
public class Pet {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Dog dog = new Dog();
        Duck duck = new Duck();
        vet.giveShot(dog);
        vet.giveShot(duck);
    }
}
