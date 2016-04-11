package sample_0411;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv = new Television();
		Television yourtv = new Television();
		Television testtv = mytv;
		
		mytv.channel = 18;
		mytv.volume = 20;
		mytv.onOff = true;
		//mytv.onOff=false;
		
		//mytv.volume = mytv.volumeup(30);
		mytv.volumeUP(30);
		mytv.volumeUP();
		//System.out.println(mytv.channel+" "+mytv.volume+" "+mytv.onOff);
		mytv.pr();
		
		
		yourtv.channel = 18;
		yourtv.volume = 20;
		yourtv.onOff = true;
		
		
		yourtv.pr();
		//System.out.println(yourtv.channel+" "+yourtv.volume+" "+yourtv.onOff);
		mytv.channel = 231;
		
		
		//testtv=null;
		testtv.pr();
		//System.out.println(testtv.channel+" "+testtv.volume+" "+testtv.onOff);
		testtv=null;
		
	}

}
