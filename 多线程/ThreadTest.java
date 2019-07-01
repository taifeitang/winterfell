
public class ThreadTest implements Runnable{
    private String name;
    ThreadTest(String name){
    	this.name=name;
   }
	@Override
	public void run() {
		int i=1;
		while(i<1000){
			System.out.println(this.name+":"+i++);
		}
		
	}

}
