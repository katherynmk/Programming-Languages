
public class ColoredFig {
	private String color;

	ColoredFig(){
		color = "white";
	}
	ColoredFig(String c){
		setColor(c);
	}
	
	
public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}



@Override
public String toString() {
	return String.format("Color: %s\n", color);
}

}
