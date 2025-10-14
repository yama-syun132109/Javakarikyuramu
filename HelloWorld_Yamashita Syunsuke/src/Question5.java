
public class Question5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Q1	次の条件を満たす メソッド helloWorld を作成してください。							
//		引数なし							
//		戻り値なし							
//		"Hello, World!" を表示							
//									
//			実行例						
//			Hello, World!	
		  helloWorld();
	

//									
//									
//	Q2	次の条件を満たす メソッド doubleValue を作成してください。							
//		引数：整数 (int num)　							
//		戻り値：整数（引数の2倍の値）							
//									
//		戻り値をもとに実行例のように表示							
//									
//			実行例						
//			10 を 2 倍すると 20 です。
	        int num = 10;
	        int result = doubleValue(num);
	        System.out.println(num + " を 2 倍すると " + result + " です。");
		
//									
//									
//	Q3	次の条件を満たす メソッド isEven を作成してください。							
//									
//		引数：整数 (int num)							
//		戻り値：true（偶数なら）、false（奇数なら）							
//									
//		num1に7,num2に10を設定し以下の実行例になるように表示							
//									
//			実行例						
//			10 は偶数です。						
//			7 は奇数です。	
	        int num1 = 7;
	        int num2 = 10;

	        if (isEven(num2)) {
	            System.out.println(num2 + " は偶数です。");
	        } else {
	            System.out.println(num2 + " は奇数です。");
	        }

	        if (isEven(num1)) {
	            System.out.println(num1 + " は偶数です。");
	        } else {
	            System.out.println(num1 + " は奇数です。");
	        }
	    }
	 public static void helloWorld() {
	        System.out.println("Hello, World!");
	    }
	 public static int doubleValue(int num) {
	        return num * 2;
	    }
	 public static boolean isEven(int num) {
	        return num % 2 == 0;
	    }
	}

//									
//									
//									
//	
	
