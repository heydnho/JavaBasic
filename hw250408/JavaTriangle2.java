package hw250408;

class Triangle1 {
	private double width;
	private double height;

	public Triangle1(double width, double height) {
     this.width = width;
     this.height = height;
 }

	public double findArea() {
		return (width * height) / 2;
	}

	public boolean isSameArea(Triangle1 t) {
		return this.findArea() == t.findArea();
	}
}

public class JavaTriangle2 {
	public static void main(String[] args) {

		Triangle1 t1 = new Triangle1(10.0, 5.0);
		Triangle1 t2 = new Triangle1(5.0, 10.0);
		Triangle1 t3 = new Triangle1(8.0, 8.0);

		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}
}
