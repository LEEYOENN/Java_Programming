interface OperateCar{
	void start();
	void stop();
	void setSpeed(int speed);
	void turn(int degree);
}
public class AutoCar implements OperateCar{
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를"+ speed+"km/h로 바꿉니다.");
	}
	public void turn(int degree) {
		System.out.println("자동차가 방향을"+ degree+"도 만큼 바꿉니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
