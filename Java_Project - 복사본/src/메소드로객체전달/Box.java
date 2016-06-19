package 메소드로객체전달;
//메소드에서 객체 반환하기
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
			return box1;	//객체 반환
		else
			return box2;
	}
}
