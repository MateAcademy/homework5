package test;

/**
 * @author Serhii Klunniy
 */
public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        test(cat);
    }

   static void test (Animal animal) {
        animal.say();
    }

}

class Animal {
    void say() {
    }
}

class Cat extends Animal {
    @Override
    void say() {
        System.out.println("Мяу");
    }
}

class Dog extends Animal {
    @Override
    void say() {
        System.out.println("Гав");
    }
}
