import java.util.Scanner;

class Student{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the marks of 1st subject: ");
    int s1 = sc.nextInt();
    System.out.println("Enter the marks of 2nd subject: ");
    int s2 = sc.nextInt();
    System.out.println("Enter the marks of 3rd subject: ");
    int s3 = sc.nextInt();
    System.out.println("Enter the marks of 4th subject: ");
    int s4 = sc.nextInt();
    System.out.println("Enter the marks of 5th subject: ");
    int s5 = sc.nextInt();

    if (s1<100 && s2<100 && s3<100 && s4<100 && s5<100){
    int Marks = s1+s2+s3+s4+s5;
    double Percentage = (Marks*100/500);
    System.out.println("The percentage of a student is: " + Percentage);
    }
    else{
    System.out.println("Invalid Input");
    }
    sc.close();

}
}