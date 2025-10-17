package curriculumC;

public class Person {
    // インスタンスフィールド
    String name;
    int age;
    double height;
    double weight;

    // クラスフィールド（人数カウント）
    static int count = 0;

    // コンストラクタ
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;
    }

    // BMI計算メソッド
    public double bmi() {
        return weight / (height * height);
    }

    // 自己紹介出力メソッド
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.printf("BMIは%.2fです\n", this.bmi());
    }

    // 合計人数出力メソッド
    public static void printCount() {
        System.out.println("合計" + count + "人です");
    }
}
