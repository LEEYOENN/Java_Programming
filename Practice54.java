import java.util.Scanner;
class Plane{
	private int id;
	private String model;
	private int capacity;
	private static int planes=0;
	
	Plane(int id, String model, int capacity){
		this.id = id;
		this.model = model;
		this.capacity = capacity;
		planes+=1;
	}
	
	
	public String toString() {
		return "식별번호:"+ id + "편\n모델:"+model+"\n승객수:" +capacity+"명\n현재까지 추가된 비행기는 모두" + getPlanes()+ "대입니다.\n";
	}
	public void setId(int id) {this.id = id;}
	public void setModel(String model) {this.model = model;}
	public void setCapacity(int capacity) {this.capacity = capacity;}
	public static int getPlanes() {return planes;}
	
}
public class Practice54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Plane p1 = new Plane(0, "모름", 0);
		
		System.out.println("제주행 비행기의 정보를 입력하세요.");
		System.out.print("식별번호: ");
		int id = input.nextInt();
		p1.setId(id);
		
		System.out.print("모델: ");
		String model = input.next();
		p1.setModel(model);
		
		System.out.print("승객수: ");
		int capacity = input.nextInt();
		p1.setCapacity(capacity);
		
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.print(p1);
		
		
		System.out.println("서울행 비행기의 정보를 입력하세요.");
		System.out.print("식별번호: ");
		id = input.nextInt();
		
		System.out.print("모델: ");
		model = input.next();
		
		
		System.out.print("승객수: ");
		capacity = input.nextInt();
		
		Plane p2 = new Plane(id, model, capacity);
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.print(p2);
		
	}

}
