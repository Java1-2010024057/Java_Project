package Sample_0502;

public class First {
	private int w, l, h, v;
	
	public First(int w, int l, int h){
		super();
		this.w=w;
		this.l=l;
		this.h=h;
		this.v =w*l*h;
				
	}

	First method1(First obj1, First obj2, int x){
		System.out.println(obj1.h+" "+obj2.h+" "+x);
		obj1.setH(99);
		obj2.setH(99999);
		x = 123456;
		
		
		
		return obj1;
			
	}
	void method2(First obj1){
		First temp = new First(7,8,9);
		temp.h = obj1.h;
		temp.l = obj1.l;
		temp.w = obj1.w;
		temp.v = obj1.v;
	
	}
	

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}
	
	
	
}
