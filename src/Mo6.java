import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Mo6 {
  public static void main(String[] args) {
	try{

		int id; //ID
		String name; //支店名
		
		Map<int, String> map = new HashMap<int, String>();
		map.put(001, name);
		int id = id++;
		File file = new  File(args[0] + File.separator + "branch.list");
		FileReader fr = new FileReader(file);

		
		

		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s = br.readLine()) != null) {
			System.out.println(s + "を読み込みました");
			
			
		}
		br.close();

		} catch(IOException e) {
		  System.out.println("支店定義ファイルが存在しません");
		  
		
		  
		}
	}
 }




