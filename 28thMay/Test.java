interface Printable{
    void print();
}
interface Showable{
    void show();
}
class Test implements Printable, Showable{
    public void print(){
        System.out.println("Printing");
    }
    public void show(){
        System.out.println("Reading");
    }
public static void main(String[]args){
    Printable obj1 = new Test();
    obj1.print();
}
}
