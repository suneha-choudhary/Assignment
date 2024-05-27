// HIERARCHICAL INHERITANCE
import java.util.ArrayList;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("This is a Dog.");
            } else if (animal instanceof Cat){
                System.out.println("This is a Cat.");
            }
        }
    }
}
