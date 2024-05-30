class Vehicle{
    protected String TypeOfVehicle;
    protected String BrandName;
    protected int ModelYear;

    public Vehicle(String type,String brand,int year){
        this.TypeOfVehicle = type;
        this.BrandName = brand;
        this.ModelYear = year;
    }

    public void displayInfo(){
        System.out.println("The type of vehicle is : " + TypeOfVehicle);
        System.out.println("Brand name is: " + BrandName);
        System.out.println("Model year is : "+ ModelYear);
    }
}
class Car extends Vehicle{
    int Doors;

    public Car(String TypeOfVehicle,String BrandName, int ModelYear,int doors){
        super(TypeOfVehicle, BrandName,ModelYear);
        this.Doors = doors;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("The number of doors in the car is: " + Doors);
    }
}
class ElectricCar extends Car{
    int Battery;

    public ElectricCar(String TypeOfVehicle,String BrandName, int ModelYear,int doors, int Battery){
        super(TypeOfVehicle, BrandName, ModelYear, doors);
        this.Battery = Battery;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The Battery consumption of electric car is : " + Battery +"kWh");
    }
    public void charge(){
        System.out.println("The car is on charging mode.....");
    }
}

public class MultilevelInheritance {
    public static void main(String[]args){
        ElectricCar tesla = new ElectricCar("Electric","Tesla",2020,4,120);
        tesla.displayInfo();
        tesla.charge();
    }
}
