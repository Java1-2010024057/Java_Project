package Á¤Àû¸â¹ö;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1, e2, e3;
		e1 = new Employee("±èÃ¶¼ö", 35000);
		e2 = new Employee("±èÃ¶¼ö1", 135000);
		e3 = new Employee("±èÃ¶¼ö1", 235000);
		
		int n = Employee.getCount();
		System.out.println("ÇöÀç Á÷¿ø¼ö=" + n);
	}

}
