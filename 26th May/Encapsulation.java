class Student{
    private int Roll_No;
    private String Name;

    Student(int rollno, String name){
        this.Roll_No = rollno;
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name){
        this.Name = name;
    }

    public int getRoll_No() {
        return Roll_No;
    }

    public void setRoll_No(int roll_No) {
        Roll_No = roll_No;
    }
}

    public class Encapsulation{
    public static void main(String[] args) {
        Student s1 = new Student(0, null);
        s1.setName("Suneha");
        s1.setRoll_No(12);

        System.out.println("The name of the student is : " + s1.getName() + " and the roll number is :" + s1.getRoll_No());
    }
}