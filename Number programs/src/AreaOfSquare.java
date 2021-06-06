import java.util.Scanner;
public class AreaOfSquare {
	public static void main(String[] args){
	 System.out.println("Enter Side of Square:");
	 @SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	 double side=scan.nextDouble();
	 double area=side*side; 
	 System.out.println("Area of Square is: "+area);
	 }
}
