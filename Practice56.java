import java.util.Scanner;
import java.util.Random;
class Movie {
		private String title, director, mid;
		private int score, year;
		@Override
		public String toString() {
			return "번호: "+mid+"\n제목: " + title + "\n감독: " + director + "\n개봉년도: " + year + "년";
		}
		public Movie() {
			this.mid = makeID();
			this.title = "";
			this.director = "";
			this.year = -1;
			this.score = -1;
		}
		private String makeID() {
			Random rand = new Random();
			int n1 = rand.nextInt(9000) + 1000;
			int n2 = rand.nextInt(9000) + 1000;
			return n1 + "-" +n2;
		}
		public void setTitle(String t) {title = t;}
		public void setDirector(String d) {director = d;}
		public void setScore(int s) {score = s;}
		public void setYear(int y) {year = y;}
		public String getTitle() {return title;}
		public String getDirector() {return director;}
		public int getScore() {return score;}
		public int getYear() {return year;}
		public String getMid() {return mid;}
		
		public static String compareMovies(Movie x, Movie y) {
			boolean rsltDirector = compareDirector(x, y);
			boolean rsltYear = compareYear(x, y);
			String rslt = "";
			if(rsltDirector) {
				rslt += "감독이 같고 ";	
				if(rsltYear)
					rslt += "재작년도도 같습니다.";
				else rslt += "재작년도가 다릅니다.";
			}
			else {
				rslt += "감독이 다르고 ";
				if(rsltYear)
					rslt += "재작년도가 같습니다.";
				else rslt += "재작년도도 다릅니다.";
			}
			return rslt;
		}
		private static boolean compareDirector(Movie x, Movie y) {
			if(x.getDirector() == y.getDirector())
				return true;
			else return false;
		}
		private static boolean compareYear(Movie x, Movie y) {
			if(x.getYear() == y.getYear())
				return true;
			else return false;
		}

}
public class Practice56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
			
		
		System.out.println("영화정보를 입력하세요.");
		System.out.print("영화제목은? ");
		String title = input.next();
		m1.setTitle(title);
		
		System.out.print("감독은? : ");
		String director = input.next();
		m1.setDirector(director);
		
		System.out.print("제작 년도는? ");
		int year = input.nextInt();
		m1.setYear(year);
		
		System.out.println("\n영화정보를 입력하세요.");
		System.out.print("영화제목은? ");
		title = input.next();
		m2.setTitle(title);
		
		System.out.print("감독은? : ");
		director = input.next();
		m2.setDirector(director);
		
		System.out.print("제작 년도는? ");
		year = input.nextInt();
		m2.setYear(year);
		
		
		System.out.println("\n영화정보를 입력하세요.");
		System.out.print("영화제목은? ");
		title = input.next();
		m3.setTitle(title);
		
		System.out.print("감독은? : ");
		director = input.next();
		m3.setDirector(director);
		
		System.out.print("제작 년도는? ");
		year = input.nextInt();
		m3.setYear(year);
		/*
		 * Movie movie2 = new Movie(); System.out.println("영화정보를 입력하세요.");
		 * System.out.print("영화제목은? "); title = input.next(); movie2.setTitle(title);
		 * System.out.print("평점은? "); score = input.nextInt(); movie2.setScore(score);
		 * 
		 * System.out.print("감독은? : "); director = input.next();
		 * movie2.setDirector(director);
		 * 
		 * System.out.print("개봉 년도는? "); year = input.nextInt(); movie2.setYear(year);
		 */
		
		System.out.println("\n입력한 영화의 정보입니다");
		System.out.println("\n"+m1);
		System.out.println("\n"+m2);
		System.out.println("\n"+m3);
		
		System.out.println("영화 "+m1.getMid()+"와 영화"+ m2.getMid()+"는 "+ Movie.compareMovies(m1, m2));
		System.out.println("영화 "+m1.getMid()+"와 영화"+ m3.getMid()+"는 "+ Movie.compareMovies(m1, m3));
		System.out.println("영화 "+m2.getMid()+"와 영화"+ m3.getMid()+"는 "+ Movie.compareMovies(m2, m3));
	}
}
