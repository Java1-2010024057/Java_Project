package �޼ҵ�ΰ�ü����;
//�޼ҵ忡�� ��ü ��ȯ�ϱ�
public class Box {
	int w, l, h;
	int v;
	
	Box(int w1, int l2, int h2)
	{
		w=w1;
		l=l2;
		h=h2;
		v=w*l*h;
		
	}
	
	Box whosLargest(Box box1, Box box2){
		if (box1.v>box2.v)
			return box1;	//��ü ��ȯ
		else
			return box2;
	}
}
