class Address{
    int pincode;
    String City;
    String State ;
    String Country;
    
    public Address(String city, String state, String country , int pincode){
        this.City = city;
        this.State = state;
        this.Country = country;
        this.pincode = pincode;
    }
}
class Student{
    int id;
    String name;
    int age;
    Address address;
    public Student(int id, String name,int age ,Address address) {
        this.id = id;
        this.name = name;
        this.age=age;
        this.address=address;
    }
    void display(){
        System.out.println("Id of the student is: "+ id+" "+" and the name is: "+ name +" "+" and the age is: "  + age);
        System.out.println("The address of the student name " + name  +" is: "+address.City+" "+address.State+" "+address.Country + " " + address.pincode);
        System.out.println();
    }

}

public class Aggregation{
    public static void main(String[] args) {
        Address address1=new Address("Agra","UP","India",303032);
        Address address2=new Address("Surat","Gujarat","India",302020);
        
        Student e1= new Student(20169009,"Nikita",22,address1);
        Student e2=new Student(201690014,"Arjun",24,address2);
            
        e1.display();
        e2.display();
    }
}
