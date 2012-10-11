import java.io.File;
import java.io.FileOutputStream;


public class FileSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO 自動生成されたメソッド・スタブ
		try {
			File file = new File("hoge.txt");
			FileOutputStream fo = new FileOutputStream(file);
			fo.flush();
			fo.close();
		} catch (Exception ex) {
			System.out.println(ex.getStackTrace());
		}
	}

}
