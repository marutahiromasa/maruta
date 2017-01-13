package test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Earnings {
	public static void main(String[] args){


		File dir = new File(args[0]);
		for(File f : dir.listFiles()) {
			if(f.getName().matches   ("^\\d{8}.rcd$")) { /*ファイル名が半角数字8桁,文末がrcd以外は
			表示させない*/
				System.out.println(f.getName()); //ファイル名を表示





				Map<String, String> list = new HashMap<String, String>(); //mapでlistの箱を作成

				 try{

					FileReader fr = new FileReader(f);





					BufferedReader br = new BufferedReader(fr);
					String s;
					//ファイルの中身を1行ずつ読み込む 中身がない場合はnull
					while((s = br.readLine()) != null) {
						System.out.println(s); //確認用


					}
			    } catch (IOException e) {

			    }
			}
		}
	}
}



//
//				List<File> rcdList = new ArrayList<File>();
//				rcdList.add(); //8桁の半角数字と.rcdで構成されているファイルを入れた
//
//
//				String line;
//
//
//				String []  rcd =   line.split (   );//split内はどうわける 配列名は？
//				for(int i =0; i < rcd.length ; i++){
//					System.out.println(rcd[0]);
//					return;								//f.getNameは？
//				}
//
//
//
//			}
//			}
//		}
//
//
//	}
//
//
//
//
//
//		 FileSearch search = new FileSearch( );
//		 File[] file = search.listFiles("C:/pleiades/workspace/Mo6", "^\\d{8}$");
//
//		 System.out.println(args[0]);
//
//		 Map<String, String> rcdName = new HashMap<String, String>();
//
//
//
//
//
//		 File file = new File(args[0] );
//
//          FileReader fr = new FileReader(file);
//
//          BufferedReader br = new BufferedReader(fr);
//
//	        String s; //8桁の連番ファイル
//
//	        while((s = br.readLine()) != null) {
//	        	 System.out.println(s);
//
//
//	        }
//		}catch (Exception e) {
//		}
//
//	}
//}
