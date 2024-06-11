class Animal{
    void eat(){
        System.out.println("Every animal eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog Barks.......");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("The cat Meows......");
    }
}
public class HierarchicalInherit{
    public static void main(String[] args) {
    Cat c = new Cat();
    Dog d = new Dog();
    c.meow();
    c.eat();
    d.bark();
    d.eat();
    }
}

