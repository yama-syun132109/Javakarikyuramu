package cullicurumA;

public class kadai3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//Q8	price という double型の変数 を宣言し、99.99 を代入							
		//price を int型 に変換し、整数価格: 99 とコンソールに表示してください。							
	double price = 99.99;
	int i = (int) price;
	System.out.println("整数価格: " + i);
	
									
	//Q9	String 型の変数 numStr に "123" を代入							
		//numStr を int 型に変換し、							
		//変換後の値: の後ろにnumStr + 10 した結果をコンソールに表示してください。							
	String numStr = "123";
	int a = Integer.parseInt(numStr);
	System.out.println(a+10);
	
	
									
	//Q10	int 型の変数 num に 50 を代入							
		//num を String 型に変換し、"得点: 50点" の形で表示							
	int num = 50;
	String b =String.valueOf(num);
	System.out.println("得点: " + b + "点");
	

	}

}
