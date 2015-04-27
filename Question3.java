public class Question3{

	public static void main (String[] args){
	
	}

}

class ThreadA extends Thread{
	public void run(){
		for(int i=0 ; i<0010 ;i++){
			System.out.println("ThreadA");
			try{this.sleep(1000);}catch(Exception e){}
		}
	}
}