package 메소드로객체전달;

public class BoxTest {

	public static void main(String[] args) {
		Box box1 = new Box(10, 20, 30);
		Box box2 = new Box(5, 6, 7);
		
		Box largest = box1.whosLargest(box1, box2);
		System.out.println("(" + largest.w + "," + largest.l + "," + largest.h + ")");

	}

}
