import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;


public class CallableTest implements Callable{
	private static int count=0;
    private final int id=count++;
    
    
    @Override
	public Object call() throws Exception {
    	int i=0;
		while(i++<100){
			System.out.println(id+"¸ãËÀÄã:"+i);
			
		}
    	
    	
    	
		return null;
	}
    
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ThreadTest t1=new ThreadTest("cnm");
		Thread th=new Thread(t1);
		th.start();
		Thread.sleep(6);
		for(int i=0;i<100;i++){
		CallableTest c=new CallableTest();
		FutureTask f=new FutureTask(c);
		Thread t=new Thread(f);
		t.start();
		
		}

	}

	

}
