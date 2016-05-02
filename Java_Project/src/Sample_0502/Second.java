package Sample_0502;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		First obj1 = new First(1,2,3);
		First obj2 = new First(4,5,6);
		
		System.out.println(obj1.getH()+" "+obj2.getH()+" "+x);
		
		First obj3= obj1.method1(obj1, obj2, x);
	
		System.out.println("after"+obj1.getH()+" "+obj2.getH()+" "+x);
	}

}
