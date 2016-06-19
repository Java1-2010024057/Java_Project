package 생성자오버로딩;

public class Time {
	private int hour;
	private int minutes;
	private int second;
	
	//첫번째 생성자
	public Time(){
		this(0,0,0);
	}
	//두번째 생성자
	public Time(int h, int m, int s) {
		hour = ((h>=0 && h<24)? h:0);
		minutes = ((m>=0 && m<60)? m:0);
		second = ((s>=0 && s<60)? s:0);
	}
	
	public String toString(){
		return String.format("%02d:%02d:%02d", hour, minutes, second);
	}

}
