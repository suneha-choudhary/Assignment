public class Questionprac {
    public static void main(String[] args) {
        
        double x = 2;
        double y = 4;
        double z = -8.34;
        

        System.out.println("The maximum number out of x and y is : " + Math.max(x, y));
        System.out.println("The squareroot of y is : " + Math.sqrt(y));
        System.out.println("The value of x raised to the power to y is: " + Math.pow(x, y));
        System.out.println("The floating-point number adjacent to the x in the direction of the y is: " + Math.nextAfter(x, y));
        System.out.println("The cuberoot of x is : " + Math.cbrt(x));
        System.out.println("Returns the random value between 0 and 1 : "+Math.random());
        System.out.println("The natural logarithm of a double value x is: " + Math.log(x));
        System.out.println("The trigonometric Sine value of a double value x is: " + Math.sin(x));
        System.out.println("The trigonometric Tangent value of a double value y is: " + Math.tan(y));
        System.out.println("The trigonometric Cosine value of a double value x is: " + Math.cos(x));
        System.out.println("The smallest integer value that is greater than or equal to the z is : " + Math.ceil(z));
        System.out.println("THe sign of the value z is: " + Math.signum(z));
        System.out.println("The Absolute value of y along with sign specified in z : " + Math.copySign(y,z));
        System.out.println();
    }
}
