package cullicurumB;

import java.util.Scanner;

public class Question4 {
    

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        //Q1																									
        //int 型の配列 を作成し、1, 2, 3, 4, 5 を格納する																								
        //配列の全要素を 順番に表示	
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //																								
        //Q2	int 型の配列 {10, 20, 30, 40, 50} を用意する																								
        //配列の要素を 逆順 に表示	
        int[] arr1 = {10, 20, 30, 40, 50};
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //																								
        //																								
        //Q3	int 型の配列 {3, 5, 7, 9, 11} を用意する																								
        //配列の全要素の 合計値 を計算し、表示	
        int[] arr2 = {3, 5, 7, 9, 11};
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        System.out.println("合計値: " + sum);

        //																								
        //																								
        //Q4	int 型の配列 {12, 7, 9, 21, 5, 18} を用意する																								
        //配列の 最大値と最小値 を求めて表示	
        int[] arr4 = {12, 7, 9, 21, 5, 18};
        int max = arr4[0];
        int min = arr4[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr4[i] > max) max = arr4[i];
            if (arr4[i] < min) min = arr4[i];
        }
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);

        //																								
        //																								
        //Q5	int 型の配列 {1, 2, 3, 4, 5} を用意する																								
        //配列のすべての要素を 2 倍 し、結果を表示																								
        //結果を表示する際の処理に拡張for文を使用してください	
        int[] arr5 = {1, 2, 3, 4, 5};
        for (int num : arr5) {
            System.out.print((num * 2) + " ");
        }
        System.out.println();

        //																								
        //																								
        //Q6	int 型の配列 {4, 7, 10, 15, 20} を用意する																								
        //ユーザーが入力した数が 配列に含まれているか を判定し、結果を表示																								
        //結果：（”入力した値”は配列に含まれています／含まれていません）	
    
        

        int[] arr6 = {4, 7, 10, 15, 20};
        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力してください: ");
        int input = scanner.nextInt();

        boolean found = false;
        for (int num : arr6) {
            if (num == input) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(input + " は配列に含まれています");
        } else {
            System.out.println(input + " は配列に含まれていません");
        }
        scanner.close();

        //																								
        //																								
        //Q7	2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意する								配列を使うと、複数のデータをまとめて管理 できます。																
        //配列の すべての要素を表示 	しかし、「表」や「座標」などのデータを扱う場合、1次元配列 だけでは不便なことがあります。			
        //								「行」と「列」のようにデータを2次元的に扱いたいとき に便利なのが 多次元配列 です！																
        //								多次元配列を理解できると、表データ、ゲームの盤面、画像データなど、応用範囲が広がります	
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //Q8	2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意する
        //配列の すべての要素の合計値を表示
        int[][] array1 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                sum1 += array1[i][j];
            }
        }
        System.out.println("合計値: " + sum1);
                                                                                                
        //																								
        //																								
        //Q9	2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意する																								
        //配列内の 最大値と最小値 を求めて表示	
        int[][] array2 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
        int max1 = array2[0][0];
        int min1 = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] > max1) max1 = array2[i][j];
                if (array2[i][j] < min1) min1 = array2[i][j];
            }
        }
        
        //																								
        //																								
        //Q10	3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意する																								
        //配列内のすべての要素を 表示																								
        System.out.println("最大値: " + max1);
        System.out.println("最小値: " + min1);
        int[][][] array3 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                for (int k = 0; k < array3[i][j].length; k++) {
                    System.out.print(array3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
