package cullicurumA;

public class Qestion1 {
    public static void main(String... args) {
        // Q1　各型の変数を宣言し、初期値を設定してください。					
        // byte 	変数byteNumの初期値を設定		
        byte number1 = 0;
        // short 	変数shortNumの初期値を設定	
        short number2 = 0;
        // int	変数intNumの初期値を設定		
        int number3 = 0;
        // long 	変数longNumの初期値を設定	
        long number4 = 0L;
        // float	変数floatNumの初期値を設定	
        float number5 = 0.0f;
        // double	変数doubleNumの初期値を設定	
        double number6 = 0.0d;
        // char	変数letterの初期値を設定	
        char letter = '\u0000';
        // String 	変数lettersの初期値を設定		
        String letters = null;
        // boolean	変数isBooleanの初期値を設定				
        boolean isBoolean = false;

        // Q2 1で宣言した各型の変数に指定された値を代入してください					
        // 変数byteNumに10を代入		
        number1 = 10;
        // 変数shortNumに100を代入		
        number2 = 100;
        // 変数intNumに1000を代入	
        number3 = 1000;
        // 変数longNumに10000を代入	
        number4 = 10000;
        // 変数floatNumに9.5fを代入
        number5 = 9.5f;
        // 変数doubleNumに10.5を代入	
        number6 = 10.5;
        // 変数letterに"a"を代入		
        letter = 'a';
        // 変数lettersに"ハロー"を代入		
        letters = "ハロー";
        // 変数isBooleanにtrueを代入
        isBoolean = true;

        // Q3	値を代入した変数を用いて出力をしてください										
        // 11110	11110を出力							
        System.out.println(number1 + number2 + number3 + number4);

        // 20	20を出力	
        System.out.println(number5 + number6);

        // a ハロー true	a ハロー trueを出力	
        System.out.println(letter + " " + letters + " " + isBoolean);

        // 11130	数字を全て足して出力	
        System.out.println(number1 + number2 + number3 + number4 + number5 + number6);

        // 10000000000	小数点以外の数字を全てかけて出力
        System.out.println(number1 * number2 * number3 * number4);

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
        System.out.println("こんにちは、" + name + "さん!");

        // Q5	age という int型の変数 を宣言し		
        // その変数に 25 を代入してください。										
        // age変数を使用してコンソールに  年齢: 25歳 という表示してください。										
        int age = 25;
        System.out.println("年齢: " + age + "歳");

        // Q6	num1 という int型の変数 を宣言し、10 を代入										
        // num2 という int型の変数 を宣言し、5 を代入										
        // num1 と num2 を足した結果を sum という変数に代入し、コンソールに表示してください。										
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println(sum);

        // Q7	score という int型の変数 を宣言し、80 を代入										
        // score に 20 を加えて、更新する										
        // 最終スコア: 100 　をscoreを使用してコンソールに表示してください。										
        int score = 80;
        score = score + 20;
        System.out.println(score);

        //Q8	price という double型の変数 を宣言し、99.99 を代入							
        //price を int型 に変換し、整数価格: 99 とコンソールに表示してください。							
        double price = 99.99;
        int i = (int) price;
        System.out.println("整数価格: " + i);

        //Q9	String 型の変数 numStr に "123" を代入							
        //numStr を int 型に変換し、							
        //変換後の値: の後ろにnumStr + 10 した結果をコンソールに表示してください。							
        String numStr = "123";
        int v = Integer.parseInt(numStr);
        System.out.println(v + 10);

        //Q10	int 型の変数 num に 50 を代入							
        //num を String 型に変換し、"得点: 50点" の形で表示							
        int num = 50;
        String y = String.valueOf(num);
        System.out.println("得点: " + y + "点");

        // Q11	次の条件を満たすプログラムを条件演算子を使用して作成してください。						
        //int 型の変数 a に 10 を代入						
        //int 型の変数 b に 20 を代入						
        //a が b より小さいかどうかを boolean 変数 result に代入						
        //	result の値を表示							
        int a = 10, b = 20;
        boolean result = (a < b) ? true : false;
        System.out.println(result);

        //Q12	条件演算子（三項演算子）を使用してください。						
        //int 型の変数 x に 15 を代入						
        //x が 10 以上なら "OK"、そうでなければ "NG" を表示						
        int x = 15;
        String max = (x >= 10) ? "OK" : "NG";
        System.out.println(max);

        //Q13	String text = "私はJavaが好きです。Javaは楽しい！";という						
        //文章の中にある 「Java」 を 「Python」 に置き換えて表示させてください。						
        String text = "私はJavaが好きです。Javaは楽しい！";
        String newtext = text.replace("Java", "Python");
        System.out.println(newtext);

    }
}