package edu.kirkwood.week01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the main method");
        sayHello(); // calling a static method
        new Main().sayGoodbye(); // creates an instance of the class, an object
        Demo.sayHello(); // calling a static method
        Demo demo = new Demo(); // creating an object and assigning it to a variable
        demo.sayGoodbye(); // calling a non-static method
    }

    public static void sayHello() {
        System.out.println("Hello from the Main class");
    }

    public void sayGoodbye() {
        System.out.println("Goodbye from the Main class");
    }

}