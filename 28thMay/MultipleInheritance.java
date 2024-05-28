interface printable{
    void print();
}
class Drawing implements printable{
    public void print(){
        System.out.println("This is interface program");
    }
    public static void main(String[]args){
        Drawing obj = new Drawing();
        obj.print();
    }
}