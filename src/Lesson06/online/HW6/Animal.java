package Lesson06.online.HW6;

public class Animal {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 10, 0, 200, 0, 0 );
        Dog dog = new Dog("Bobik", 20, 5, 500, 10, 0, 0);

        cat.run();
        dog.maxRun();
        cat.jogging(50);
        dog.jogging(1000);
        cat.noSwim();
        dog.maxSwim(20);



    }

}
