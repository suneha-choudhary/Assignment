//Write a Java program to create a class called "Dog" with a name and breed attribute. 
//Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

class Dog{
    public String name;
    public String breed;
    
    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    
    // void setter(String name,String breed){                  //Getters and Setters are used when the variables are private 
    //     this.Name = name;
    //     this.Breed = breed;
    // }
}
}
public class QuestionPractice {
    public static void main(String[] args) {
        Dog mydog =new Dog("Marlo", "Bull Dog");
        System.out.println("The name of the " + mydog.breed +" dog is "+mydog.name);

        mydog.name = "Palma";
        mydog.breed = "German Shepherd";
        System.out.println("The updated name of the " + mydog.breed + " dog is " + mydog.name);
    }
}
