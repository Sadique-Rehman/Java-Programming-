
// Question 1
class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("MEOOOOOOOOOOOOOOOOOOooooooooooooooooooooooooooooooooooooooooooooW");
    }
}

// Question 2
class Vehicle {

    void drive() {
        System.out.println("Are we repairing a car!");
    }
}

class Car extends Vehicle {

    @Override
    void drive() {
        System.out.println("Repairing a car!");
    }
}

//Question 3
class Shape {

    void getArea() {
        System.out.println("This method Calculate Area");
    }
}

class Rectangle extends Shape {

    @Override
    void getArea() {
        int a = 7;
        int b = 8;
        System.out.println(a*b);
    }
}

public class Main {

    public static void main(String[] args) {

        Cat ob = new Cat();
        ob.makeSound(); // Printing for 1

        Car ob1 = new Car();
        ob1.drive(); // Printing for 2
        
        Rectangle ob2 = new Rectangle();
        ob2.getArea(); // Printing for 3
    }
}