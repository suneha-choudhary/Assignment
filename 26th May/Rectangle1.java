
class Rect{
    private int length;
    private int width;

    Rect(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }

    public int area(){
        return this.length*this.width;
    }
    public int perimeter(){
        return 2*(this.length+this.width);
    }
}


public class Rectangle1 {
    public static void main(String[] args){
        Rect s1 = new Rect(5,6);
        int s1area = s1.area();
        int s1perimeter =s1.perimeter();
        System.out.println("the area of rectangle is : " + s1area);
        System.out.println("The perimeter of rectangle is : " + s1perimeter);
    }
}


// class Rectangle1{
//     public static void main(String[]args){
//     System.out.println("Hello World");
// }
// }

