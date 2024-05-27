class Employee{
    int Salary_JE = 40000;
    int Salary_SE = 80000;
}
class Junior_Engineer extends Employee{
    int Bonus = 10000;
}
class Senior_Engineer extends Employee{
    int Bonus = 20000;
}
class A{
    public static void main(String []args){
        Junior_Engineer JE = new Junior_Engineer();
        Senior_Engineer SE = new Senior_Engineer();
        System.out.println("The Salary of Junior_Engineer is: " + JE.Salary_JE);
        System.out.println("The Bonus of Junior_Engineer is: " + JE.Bonus);
        System.out.println("The Salary of Senior_Engineer is: " + SE.Salary_SE);
        System.out.println("The Bonus of Senior_Engineer is: " + SE.Bonus);
    }
}