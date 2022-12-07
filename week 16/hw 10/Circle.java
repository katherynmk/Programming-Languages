import java.lang.Math;
public class Circle extends ColoredFig{
private double radius;
private ColoredFig c;

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

Circle(){
	
	radius = 1.0;
}

Circle(double radius){
	setRadius(radius);

}

Circle(String color){
	c.setColor(color);

}

Circle(double radius, String color){
	setRadius(radius);
	c.setColor(color);
}

public double getArea() {
	return radius*radius*Math.PI;
}

public double getCircumference() {
	return 2*Math.PI*radius;
}

@Override
public String toString() {
	return String.format("Radius: %6d\n", radius);
}

}
