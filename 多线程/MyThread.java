import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread extends Thread {
	private String name;
	MyThread(){
		
	}
	MyThread(String name){
		this.name=name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		int i=1;
		while(i<1000){
		System.out.println(this.name+":"+i++);
		}
	}

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	MyThread t1=new MyThread("线程1");
	t1.start();
	ThreadTest t2=new ThreadTest("线程2");
	Thread tt1=new Thread(t2);
	tt1.start();
	try {
		t1.sleep(10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ThreadTest t3=new ThreadTest("线程3");
	Thread tt2=new Thread(t3);
	tt2.start();
	try {
		tt2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		tt2.yield();
		
		
		
		
		
		
		
		
		
		
		//MyThread.class.getClass().getClassLoader().getResource(null);
	  //ExecutorService executor = Executors.newFixedThreadPool(3);
	  //System.out.println(Date.class);
	  //System.out.println(executor.getClass());
	 // System.out.println(Date.class.getClass());
	}

}
