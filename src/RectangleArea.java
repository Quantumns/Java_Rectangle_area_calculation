import java.util.Scanner;

// Variables for RectangleArea
public class RectangleArea {
    private double a;
    private double b;
    private double area;

    // getData to receive the information required to calculate the area of the rectangle
    public void getData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle that you desire");
        this.a = input.nextDouble();
        System.out.println("Enter the width of the rectangle that you desire");
        this.b = input.nextDouble();
        this.area = a*b;
    }
    // Basically to use the comp
    public double computeField() {
        return area;
    }

    // The reason that i use computeField is because it simply helps me to use it to display the area result
    public void displayResult() {
        System.out.println("The area of the rectangle is " + computeField());
    }


}
