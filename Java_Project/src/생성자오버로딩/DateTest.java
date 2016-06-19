package 생성자오버로딩;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1= new Date();
		Date date2= new Date(2020);
		Date date3= new Date(2015, "8월", 10);
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}

}
