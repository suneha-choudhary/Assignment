class Student{
    private int rollNo;
    private String name;
    private String standard;
    private String address;

    // Constructor
    public Student(int rollNo, String name, String standard, String address){
        this.rollNo = rollNo;
        this.name = name;
        this.standard = standard;
        this.address = address;
    }

    // Getter and Setter methods

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        // Create a new student
        Student student = new Student(1, "John Doe", "10th Grade", "123 Main St, Springfield");

        // Print the student's details
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Name: " + student.getName());
        System.out.println("Standard: " + student.getStandard());
        System.out.println("Address: " + student.getAddress());

        // Update the student's address
        student.setAddress("456 Elm St, Springfield");

        // Print the updated address
        System.out.println("Updated Address: " + student.getAddress());
    }
}


