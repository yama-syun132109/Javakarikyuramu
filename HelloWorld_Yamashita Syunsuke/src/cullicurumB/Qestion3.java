package cullicurumB;

import java.util.Random;
import java.util.Scanner;

public class Qestion3 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //		プログラムでは、同じ処理を繰り返す 場面がよくあります。																								
        //		繰り返しの処理 を効率よく書くために使うのが、for文 です！																								
        ////		for文を使うと、決まった回数の繰り返し処理を 簡潔に書く ことができ																								
        //		配列やリストのデータを順番に処理できます																								
        //																										
        //	Q1	for 文を使って 1 から 10 までの数字を 1 つずつ表示	
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //																										
        //																										
        //	Q2	for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        //																										
        //																										
        //	Q3	for 文を使って 10 から 1 まで カウントダウンして表示
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //																										
        //																										
        //	Q4	for 文を使って 1 から 100 までの合計 を表示	
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);

        //																										
        //																										
        //	Q5	for 文を使って 以下のような三角形を出力																								
        //		*																								
        //		**																								
        //		***																								
        //		****																								
        //		*****	
        for (int d = 1; d <= 5; d++) {

            for (int j = 1; j <= d; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        //																										
        //									「条件を満たしている間は、処理を繰り返す」という場面がよくあります																	
        //	Q6	while 文を使って 1 から 10 まで を 1 つずつ表示		「回数が決まっていない繰り返し処理」 に使えるのが while文 です！
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        //									「条件を満たす間、処理を繰り返す」仕組みを理解しましょう																	
        //									while文とfor文の使い分けを理解しましょう。																	
        //																										
        //	Q7	while 文を使って 2 から 20 までの偶数 を 1 つずつ表示
        int count2 = 2;
        while (count2 <= 20) {
            System.out.println(count2);
            count2 = count2 + 2;
        }
        //																										
        //																										
        //	Q8	while 文を使って 10 から 1 まで のカウントダウンを表示
        int count3 = 10;
        while (count3 >= 1) {
            System.out.println(count3);
            count3--;
        }

        //																										
        //																										
        //	Q9	while 文を使って 1 から 100 までの合計 を表示
        
        int i = 1;
        int total = 0;
        while (i <= 100) {
            total += i;
            i++;
        }   
            System.out.print(total);
            System.out.println();
           
            
        
        //																										
        //																										
        //	Q10	ユーザーから 数値を入力 してもらう																								
        //		入力が 0 になるまで 何度でも入力を受け付ける																								
        //		0が入力されたら「終了しました」と表示																								
        //		※Scannerを使用																								
        //		※While文を使用してください		
        {
            Scanner scanner = new Scanner(System.in); // Scannerの準備
            int num = 1; // 初期値を0以外にする（最初のループを実行するため）

            while (num != 0) {
                System.out.print("数値を入力してください（0で終了）：");
                num = scanner.nextInt(); // ユーザーから数値を受け取る
            }
            System.out.println("終了しました");

            //																										
            //																										
            //																										
            //	Q11	for文を使用して下記の通りに出力してください	

            for (int o = 1; o <= 9; o++) {
                for (int j = 1; j <= 9; j++) {
                    int result = o * j;
                    String strI = String.format("%02d", o);
                    String strJ = String.format("%02d", j);
                    String strN = String.format("%02d", result);
                    System.out.print(strI + "*" + strJ + "=" + strN + " || ");
                }
                System.out.println();
            }

            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //																										
            //	Q12																									
            //		入力した商品の残り台数が出力されるシステムを下記の条件で作成してください																								
            //		・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可																								
            //		・Switch文内でテレビとディスプレイは続けて書き、条件演算子で各項目を出力される値を変更してください																								
            //		・テレビとディスプレイは同じ商品扱いとし、二つの合計値は常に11になるようにしてください。 																								
            //		・例：テレビと受け取った場合、→「テレビの残り台数は〇台です」※〇はランダムで出た数字　ディスプレイは（11-〇）の値																								
            //		・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません									商品一覧															
            //		・入力された値は「、」区切りで指定してください									パソコン															
            //		・そのほかの値が入力された場合下記を出力されるようにしてください									冷蔵庫															
            //			『受け取った値』は指定の商品ではありません								扇風機															
            //		・残り台数は0〜11までのランダムな値が出力されるようにしてください									洗濯機															
            //											加湿器															
            //		入力例↓↓									テレビ															
            //		パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品									ディスプレイ															
            //																										
            //		出力例↓↓																								
            //		パソコンの残り台数は8台です																								
            //		冷蔵庫の残り台数は7台です																								
            //		扇風機の残り台数は7台です																								
            //		洗濯機の残り台数は10台です																								
            //		加湿器の残り台数は3台です																								
            //		テレビの残り台数は9台です																								
            //		ディスプレイの残り台数は2台です																								
            //		『 その他商品 』は指定の商品ではありません																								
            //

            Random random = new Random();
            scanner.nextLine(); // 改行残りの吸収（Q10の nextInt のあと）
            System.out.print("商品名を「、」区切りで入力してください：");
            String input = scanner.nextLine(); // 例：パソコン、テレビ、その他商品など
            String[] home_appliances = input.split("、");

            int tvStock = random.nextInt(12); // テレビ・ディスプレイ共通在庫

            for (String home_appliance : home_appliances) {
                int stock = random.nextInt(12); // 通常商品の在庫

                switch (home_appliance) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(home_appliance + "の残り台数は" + stock + "台です");
                    break;

                case "テレビ":
                case "ディスプレイ":
                    System.out.println(home_appliance + "の残り台数は" +
                            (home_appliance.equals("ディスプレイ") ? (11 - tvStock) : tvStock) +
                            "台です");
                    break;

                default:
                    System.out.println("『" + home_appliance + "』は指定の商品ではありません");
                    break;
                }
            }

            scanner.close();
        }
    }
}
