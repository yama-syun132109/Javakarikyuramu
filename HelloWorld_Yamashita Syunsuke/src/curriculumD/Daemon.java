package curriculumD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Daemon extends Character {

    public Daemon(int HP, int AT, int SP) {
        super(HP, AT, SP);
    }

    public static Daemon loadDaemon(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            br.readLine(); // 1行目「Daemon」スキップ
            int HP = Integer.parseInt(br.readLine());
            int AT = Integer.parseInt(br.readLine());
            int SP = Integer.parseInt(br.readLine());
            return new Daemon(HP, AT, SP);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Daemonのステータスファイルの読み込みに失敗しました。");
            e.printStackTrace();
            return null;
        }
    }
}
