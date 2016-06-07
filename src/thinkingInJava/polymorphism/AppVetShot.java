package thinkingInJava.polymorphism;

import static net.mindview.util.Print.print;

/**
 * Created by Administrator on 2016/5/20 0020.
 */

class Vet {
    public void giveShot(Animal animal) {
        animal.makeNoise();
    }
}

class Animal {
    public void makeNoise() {
        print("Animal bark!");
    }
}

class Dog extends Animal {
    @Override
    public void makeNoise() {
        print("Dog bark!");
    }
}

class Duck extends Animal {
    @Override
    public void makeNoise() {
        print("Duck bark!");
    }
}

class Chicken extends Animal{
    @Override
    public void makeNoise(){
        print("Chicken bark!");
    }
}

class Pig extends Animal{
    @Override
    public void makeNoise(){
        print("Pig bark!");
    }
}


public class AppVetShot {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal[] animals = {
                new Dog(),
                new Duck(),
                new Pig(),
                new Chicken()
        };
        for (Animal animal: animals){
            vet.giveShot(animal);
        }
    }
}
