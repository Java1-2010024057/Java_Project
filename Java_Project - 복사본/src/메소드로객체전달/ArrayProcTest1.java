package �޼ҵ�ΰ�ü����;


public class ArrayProcTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3,4,5};
		ArrayProc1 obj = new ArrayProc1();
		
		obj.inc(list); //inc() �޼ҵ�� �迭 �����ϸ� ������ ����
		
		for (int i =0; i<list.length; i++)
			System.out.print(list[i]+" ");
	}

}
