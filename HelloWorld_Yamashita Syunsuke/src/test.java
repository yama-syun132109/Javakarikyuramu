
public class test {
	

	    // Q1: Hello, World! を表示するメソッド
	    public static void helloWorld() {
	        System.out.println("Hello, World!");
	    }

	    // Q2: 引数の2倍の値を返すメソッド
	    public static int doubleValue(int num) {
	        return num * 2;
	    }

	    // Q3: 偶数かどうかを判定するメソッド
	    public static boolean isEven(int num) {
	        return num % 2 == 0;
	    }

	    // Q4: Greeting クラス（内部クラスとして定義）
	    static class Greeting {
	        public void sayHello() {
	            System.out.println("こんにちは！");
	        }
	    }

	    // Q5: Animal クラス（内部クラスとして定義）
	    static class Animal {
	        private String name;
	        private double length;
	        private int speed;

	        public void setName(String name) {
	            this.name = name;
	        }

	        public void setLength(double length) {
	            this.length = length;
	        }

	        public void setSpeed(int speed) {
	            this.speed = speed;
	        }

	        public String getName() {
	            return this.name;
	        }

	        public double getLength() {
	            return this.length;
	        }

	        public int getSpeed() {
	            return this.speed;
	        }
	    }

	    // メインメソッド
	    public static void main(String[] args) {

	        // Q1 実行
	        helloWorld();

	        // Q2 実行
	        int original = 10;
	        int result = doubleValue(original);
	        System.out.println(original + " を 2 倍すると " + result + " です。");

	        // Q3 実行
	        int num1 = 7;
	        int num2 = 10;
	        System.out.println(num2 + " は" + (isEven(num2) ? "偶数" : "奇数") + "です。");
	        System.out.println(num1 + " は" + (isEven(num1) ? "偶数" : "奇数") + "です。");

	        // Q4 実行
	        Greeting greeting = new Greeting();
	        greeting.sayHello();

	        // Q5 実行
	        Animal lion = new Animal();
	        lion.setName("ライオン");
	        lion.setLength(2.1);
	        lion.setSpeed(80);

	        System.out.println("動物名：" + lion.getName());
	        System.out.println("体長：" + lion.getLength() + "m");
	        System.out.println("速度：" + lion.getSpeed() + "km/h");
	    }}
	
//Q4	次の2つのクラスを作成し、Main クラスから Greeting クラスのメソッドを呼び出す ようにしてください。							
//
//Greeting.java (別のクラス)							
//sayHello() メソッドを持ち、"こんにちは！" を表示						
//
//Main.java							
//Greeting クラスをインポートして sayHello() を実行						
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
//Q5	次の2つのクラスを作成し、下記がコンソールに出力されるように作成してください							
//※thisとsetterとgetterとフィールドを使ってください						
//
//動物名：ライオン						
//体長：2.1m						
//速度：80km/h						
//
//Animal .java (別のクラス)							
//動物名、体長、速度の変数を持ち各変数のgetterとsetterを作成						
//
//Main.java							
//変数の中身を設定し、出力の処理を行う						




