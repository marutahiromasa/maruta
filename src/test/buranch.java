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
		try{
			//支店定義処理開始
			Map<String, String> branchName = new HashMap<String, String>();
			/*型は大文字から.longはx Longが正解同じ名前のクラス定義は１つだけ
			 * branchNameは１つで同じ名前はNg
			 * */
			Map<String, Long> branchSelce = new HashMap<String, Long>();
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

			Map<String, String> commodityName = new HashMap<String, String>();
			Map<String, Long>   commoditySelce = new HashMap<String, Long>(); //同じ名前をつけない。型の文頭は大文字



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
				//確認用				System.out.println(items[0]);
				//確認用				System.out.println(0L);
			}
			br.close();
		}
		catch(IOException e) {
			System.out.println("商品定義ファイルが存在しません");
		}
				//売上ファイル
			List<File> list = new ArrayList();
			Map<String, String> FileName = new HashMap<String, String>(); //FileNameの箱作成
			Map<String, Long> FileCode = new HashMap<String, Long>();
			Map<String, Long>  FileSelce = new HashMap<String, Long>();  //FileSelceの箱作成

			FileName.put("001", "SFT000001");
			FileName.put("002", "SFT000002");
			FileName.put("003", "SFT000003");
			FileName.put("004", "SFT000004");
			FileCode.put("SFT000001", 0L); //数値は上書きされていく
			FileCode.put("SFT000002", 0L);
			FileCode.put("SFT000003", 0L);
			FileCode.put("SFT000004", 0L);
			FileSelce.put("001", 0L);
			FileSelce.put("002", 0L);
			FileSelce.put("003", 0L);
			FileSelce.put("004", 0L);


			File dir = new File(args[0]);
			for(File f : dir.listFiles()) {
				if(f.getName().matches("^\\d{8}.rcd$")){ /*ファイル名が半角数字8桁,文末がrcd以外は
			                                                表示させない*/
					list.add(f); //listにファイルを格納
				}
			}
					for(int i = 0; i <list.size(); i++){
					}
						FileReader fr = new FileReader(f);
						BufferedReader br = new BufferedReader(fr);
						String s;
						//ファイルの中身を1行ずつ読み込む 中身がない場合はnull
						while((s = br.readLine()) != null) {
							for(int i = 0; i < 1000000000; ++i){
								if( i < 1000000000){
								System.out.println(FileCode.get(i));
								System.out.println(FileSelce.get(i));
								}
								else{
									System.out.println("合計金額が10桁を超えました");
									return;
									if(//支店･商品に該当が無かった場合あった場合)
											System.out.println(FileName.get(  ));
									}
									else{
										System.out.println("<該当ファイル名>のフォーマットが不正です");
										return;
								}


							}  //whileの中に書くとまた一行ずつ読み込みから開始になるからNg?


					}

//
//				}
//				br.close();
//
//
//
//		}
//		catch (IOException e){
//			System.out.println("エラー");
//			}
	}
}






