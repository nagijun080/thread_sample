
public class Test2 extends Thread{

	public void run() {
		try {
			int i = 0;
			while (i < 10) {
				Thread.sleep(2000);
				System.out.println("Test2クラスのメソッド" + i + "回目");
				i++;
			}
		} catch (Exception e) {
			System.out.println("エラー");
		}
		System.out.println("Test2クラスのメソッド終了");
	}
}
