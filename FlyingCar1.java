interface Drivable{void drive();}
interface Flyable{void fly();}
class Car{
	int speed;
	void setSpeed(int speed) {this.speed = speed;}
}
public class FlyingCar1 extends Car implements Drivable, Flyable{
	public void drive() {System.out.println("I'm driving");}
	public void fly() {System.out.println("I'm flying");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingCar1 obj = new FlyingCar1();
		obj.drive();
		obj.fly();
		obj.setSpeed(300);
		System.out.println(obj.speed);
	}

}
