import java.util.Scanner;
public class CircleAndColorTest {
	public static void main(String[] args) {
		Circle circle1 = new Circle(26);
		Circle circleB = new Circle(2.5);
		Circle circleC = new Circle();

		System.out.print("Area of circle1 of radius 26 is ");
		System.out.println(circle1.getArea());
		System.out.print("Area of circleB of radius 2.5 is ");
		System.out.println(circleB.getArea());
		System.out.print("Area of circle1 radius 1 is ");
		System.out.println(circle1.getArea());
		System.out.print("Area of circle C is ");
		System.out.println(circleC.getArea());
		
		System.out.println("\nAssign Data Field value of circleB to circleC:");
		System.out.print("Area of circleB of radius 2.5 is ");
		System.out.println(circleB.getArea());
		System.out.print("Area of circleC is ");
		circleC.setRadius(circleB.getRadius());
		System.out.println(circleC.getArea());
		System.out.print("Circumference of circleC is ");
		System.out.println(circleC.getCircumference());
		
		System.out.println("\nRadius of circleC to 100.");
		
		System.out.println("\nSet the radius of circleC to 100.");
		circleC.setRadius(100);
		System.out.print("Raidus of circleC is: ");
		System.out.println(circleC.getRadius());
		System.out.print("The color of circleC: ");
		System.out.println(circleC.getColor());
		circleC.setColor("BLUISH");
		System.out.print("The color of circleC: ");
		System.out.println(circleC.getColor());
		System.out.print("The color of circleB: ");
		System.out.println(circleB.getColor());
		
	}
	
}
