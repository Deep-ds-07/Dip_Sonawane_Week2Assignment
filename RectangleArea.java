package Week2_Assignment;

public class RectangleArea {
	
	 double length;
	 double width;

	public RectangleArea() {
		
		this.length = 1.0;
		this.width = 1.0;
	}

	public RectangleArea(double side) {
		this.length = side;
		this.width = side;
	}

	public RectangleArea(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		return length * width;
	}

	public double calculateArea(double multiplier) {
		return length * width * multiplier;
	}

	public void displayRectangle() {
		
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Area: " + calculateArea());
	}

	public static void main(String[] args) {
		RectangleArea R1 = new RectangleArea();
		R1.displayRectangle();

		RectangleArea R2 = new RectangleArea(5.0);
		R2.displayRectangle();

		RectangleArea R3 = new RectangleArea(4.0, 6.0);
		R3.displayRectangle();

		double areaWithMultiplier = R3.calculateArea(1.5);
		System.out.println("Area with multiplier: " + areaWithMultiplier);
	}
}
