
class MyClient extends Thread{
	
	private Counter counter;
	
	MyClient(Counter counter) {
		this.counter = counter;
	}
	
	public void run() {
		String a = new String();
		
		for (int i = 0; i < 100000000;i++) {
			counter.increment();
		}
	}
}

class Counter {
	private int amount;
	
	private static Counter my;
	
	public synchronized void increment() {
		amount++;
	}
	
	private Counter() {
		
	}
	
	public static synchronized Counter getInstance() {
		synchronized(my) {
			if (my == null) {
				my = new Counter();
			}
		}
		return my;
	}
}

public class MyCounter {//classクラスのインスタンス
	
	
	

	public static void main(String[] args) throws Exception{
		/* MyCounterインスタンスcounterを生成
		 * MyClientインスタンスを生成するときcounterを引数にしたコンストラクタを実行
		 * MyClientのcounterにMyCounterインスタンスが入っている*/
		//MyCounter counter = new MyCounter();
		//MyCounter counter2 = new MyCounter();
		
		
		MyClient cl1 = new MyClient(Counter.getInstance());
		MyClient cl2 = new MyClient(Counter.getInstance());
		MyClient cl3 = new MyClient(Counter.getInstance());
		
		cl1.start();
		cl2.start();
		cl3.start();
		
		cl1.join();
		cl2.join();
		cl3.join();
		
		//System.out.println(counter.amount);
	}
}
