import java.util.Scanner;
class Date1 {
	private int year;
	private int month;
	private int day;
	@Override
	public String toString() {
		String rslt = "";
		rslt += year + "년 " + month +  "월 " +  day + "일";
		return rslt;
	}
	public void setYear(int year) {this.year = year;};
	public void setMonth(int month) {this.month = month;};
	public void setDay(int day) {this.day = day;};
	public int getYear() {return year;}
	public int getMonth() {return month;}
	public int getDay() {return day;}
// 설정자 메소드 수정
// 접근자 메소드
	public Date1(int year, int month, int day){
	this.year = year;
	this.month = month;
	this.day = day;
	}
	public Date1(){
		this(1900, 1, 1);	
	}
	public static int compareDate(Date1 x, Date1 y) {
		if(x.year > y.year)
			return 1;
		else if(x.year < y.year)
			return -1;
		else {
			if(x.month > y.month)
				return 1;
			else if(x.year < y.year)
				return -1;
			else {
				if(x.day > y.day)
					return 1;
				else if(x.day< y.day)
					return -1;
				else
					return 0;
			}
		}
	}

}
public class Practice55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("첫 번째 날짜를 입력하세요.");
		System.out.printf("년도: ");
		int y = input.nextInt();
		
		System.out.printf("월: ");
		int m = input.nextInt();
		
		System.out.printf("일: ");
		int d = input.nextInt();
		
		Date1 d1 = new Date1(y,m,d);
		
		System.out.println("두 번째 날짜를 입력하세요.");
		System.out.printf("년도: ");
		y = input.nextInt();
		
		System.out.printf("월: ");
		m = input.nextInt();
		
		System.out.printf("일: ");
		d = input.nextInt();
		
		Date1 d2 = new Date1();
		d2.setYear(y);
		d2.setMonth(m);
		d2.setDay(d);
		if (d1.compareDate(d1, d2) == -1)
			System.out.println("첫 번째 날짜인 "+ d1 + "이 앞선 날짜입니다." );
		else if (d1.compareDate(d1, d2) == 1)
			System.out.println("두 번째 날짜인 "+ d2 + "이 앞선 날짜입니다." );
		else
			System.out.println("두 날짜는 같은 날짜입니다." );

		
	}

}