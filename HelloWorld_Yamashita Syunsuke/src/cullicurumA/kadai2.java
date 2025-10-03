package cullicurumA;

public class kadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Q3	値を代入した変数を用いて出力をしてください										
		// 11110	11110を出力							
		int x =11110;
		System.out.println(x);
		
		// 20	20を出力	
		int x1 = 20;
		System.out.println(x1);
		
		// a ハロー true	a ハロー trueを出力	
		
		char letter = 'a';
		String greeting = "ハロー";
		boolean flag = true;
		
		System.out.println( letter + "" + greeting + "" + flag );
		
		// 11130	数字を全て足して出力	
		int a = 1+1+1+3+0;
		System.out.println(a);
		
		// 10000000000	小数点以外の数字を全てかけて出力
		int b =1*0*0*0*0*0*0*0*0*0*0;
		System.out.println(b);
		
		// 0.105	10.5割る100をして出力		
		double c = 10.5 / 100;
		System.out.println(c);
		// -90	10引く100をすして出力	
		int d = 10 - 100;
		System.out.println(d);
												
												
	// Q4	name という String型の変数 を宣言し										
		// その変数に "山田太郎" という値を代入してください。										
		// name変数を使用してコンソールに こんにちは、山田太郎さん！ と表示してください。										
		String name = "山田太郎";
		System.out.println("こんにちは、"+ name+"さん!");
				
												
	// Q5	age という int型の変数 を宣言し		
		// その変数に 25 を代入してください。										
		// age変数を使用してコンソールに  年齢: 25歳 という表示してください。										
		int age = 25;
		System.out.println("年齢: "+age+"歳");
												
	// Q6	num1 という int型の変数 を宣言し、10 を代入										
		// num2 という int型の変数 を宣言し、5 を代入										
		// num1 と num2 を足した結果を sum という変数に代入し、コンソールに表示してください。										
		int num1 =10;
		int num2 = 5;
		int sum = num1+num2;
		System.out.println(sum);
												
	// Q7	score という int型の変数 を宣言し、80 を代入										
		// score に 20 を加えて、更新する										
		// 最終スコア: 100 　をscoreを使用してコンソールに表示してください。										
        int score = 80;
        score=score+20;
        System.out.println(score);
	}

}
