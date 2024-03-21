interface Drawable{
	void draw();
	public default void getSize() {
		System.out.println("1024X768 해상도");
	}
}
class Circle implements Drawable{
	int radius;
	public void draw() {System.out.println("Circle Draw");}
	public void getSize() { System.out.println("3000X2000 해상도");}
}
public class TestClass{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d = new Circle();
		d.getSize();
		d.draw();
	}

}
