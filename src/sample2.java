
public class sample2 {

	public static void main (String[] args) {
		Test2 test2 = new Test2();
		test2.start();
		int i = 0;
		try {
			while (i < 10) {
				Thread.sleep(1000);
				System.out.println("mainメソッド" + i + "回目");
				i++;
			}
			
			test2.join();
		} catch (Exception e){
			System.out.println("エラー");
		}
		System.out.println("mainメソッド終了！！！");
	}
}
