class Info{
    int radius;

    double area(int radius){
        return (double) 3.14*radius*radius;
    }
    double circumference(int radius){
        return (double) 2* 3.14 * radius;
    }
}
    
    public class Circle {
    public static void main(String[] args) {
        Info c1 =new Info();
        c1.radius = 5;
        System.out.println("The area of the circle is : "+ c1.area(c1.radius));
        System.out.println("The circumference of the circle is : "+ c1.circumference(c1.radius));
    }
}
