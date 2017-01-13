package test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class buranch {
	public static void main(String[] args) {
		Map<String, String> branchName = new HashMap<String, String>();
		Map<String, Long> branchSelce = new HashMap<String, Long>();
		Map<String, String> commodityName = new HashMap<String, String>();
		Map<String, Long>   commoditySelce = new HashMap<String, Long>(); //同じ名前をつけない。型の文頭は大文字
		try{
			//支店定義処理開始
			File file = new  File(args[0] + File.separator + "branch.lst");//fileにargs[0]とbranch.lst代入
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s;
			//sにbranch.lstを一行ずつ読み込ませる読み込めない場合null

			while((s = br.readLine()) != null) {
				String[] items = s.split(",", 0); //splitでsを","分けする。変数itemsに代入

				if(items.length != 2) { //もしitemsの要素数が2つじゃなかったら
					System.out.println("支店定義ファイルのフォーマットが不正です");
					return;
				}

				if(!items[0].matches(("^\\d{3}$"))) { //もしitems[0]が半角数字3桁にマッチしなかったら
					System.out.println("支店定義ファイルのフォーマットが不正です1");
					return;
				}
				branchName.put(items[0], items[1]); //branchNameに[0][1]のデータを格納
				branchSelce.put(items[0], 0L);

			}
			br.close();
		}
		catch(IOException e) {
			System.out.println("支店定義ファイルが存在しません");
		}

		//支店定義処理終了
		//商品定義開始
		try{
			File file = new  File(args[0] + File.separator + "commodity.lst");//args[0]にcommodity.lstを入れる
			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine()) != null) { /*sはbr(ファイルを一行ずつ読む)
													もし読み込めなかったらnullで処理終了*/
				String[] items = s.split(",", 0);


				if(items.length != 2){  //もしitemsの要素数が2つがなかったら
					System.out.println("商品定義ファイルのフォーマットが不正です");
					return; //戻り値を返す
				}
				if(!items[0].matches(("^\\w{8}$"))) { //もしitems[0]が8桁の半角数字じゃなかったら
					System.out.println("商品定義ファイルのフォーマットが不正です");
					return;
				}
				commodityName.put(items[0], items[1]); //commodityに[0][1]のデータを格納
				commoditySelce.put(items[0],0L);
			}
			br.close();
		}
		catch(IOException e) {
			System.out.println("商品定義ファイルが存在しません");
		}
				//売上ファイル
		List<File> list = new ArrayList();
		Map<String, Long> FileCode = new HashMap<String, Long>();	 //商品コード･売上額格納
		Map<String, Long>  FileSelce = new HashMap<String, Long>();

		File dir = new File(args[0]);
		for(File f : dir.listFiles()) {
			if(f.getName().matches("^\\d{8}.rcd$")) {
				list.add(f);
			}
		}
		for(int i = 0; i < list.size(); i++){ //rcdファイルを指定したい
			File fileName = list.get(i);
			BufferedReader br;
			try{
				br = new BufferedReader(new FileReader(fileName));
				String branch = br.readLine();
				String commodity = br.readLine();
				String  rcd = br.readLine();
//				System.out.println(branch);
//				System.out.println(commodity);
//				System.out.println(rcd);
				Long.parseLong(rcd);
				branchSelce.put(branch , rcd);




				br.close();
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}









