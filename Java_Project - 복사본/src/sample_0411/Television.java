package sample_0411;

public class Television {
	int channel;
	int volume;
	boolean onOff;

	void pr(){
		if(onOff == false){
			System.out.println("TV Die");
			return;
			}
		System.out.println(channel+" "+volume+" "+onOff);
	}
	
	//int volumeup(int up){
	//	int vol=volume;
	//	vol+=up;
	//	return vol;
	//}
	
	
	void volumeUP(int data){
		if(onOff == false){
			System.out.println("TV Die");
			return;
		} 
		
		volume+=data;
	}
	
	void volumeUP(){
		if(onOff == false){
			System.out.print("TV Die");
			return;
			}
		
		volume+=2;
	}
		
}
