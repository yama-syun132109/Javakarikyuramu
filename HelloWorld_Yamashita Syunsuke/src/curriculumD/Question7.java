package curriculumD;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Playerの名前を入力してください: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        Daemon daemon = Daemon.loadDaemon("daemon_status.txt");
        if (daemon == null) {
            System.out.println("Daemonの読み込みに失敗したため終了します。");
            return;
        }

        System.out.println("Playerステータス HP:" + player.getHP() + " AT:" + player.getAT() + " SP:" + player.getSP());
        System.out.println("Daemonステータス HP:" + daemon.getHP() + " AT:" + daemon.getAT() + " SP:" + daemon.getSP());

        boolean playerFirst;
        if (player.getSP() > daemon.getSP()) {
            playerFirst = true;
        } else if (player.getSP() < daemon.getSP()) {
            playerFirst = false;
        } else {
            playerFirst = random.nextBoolean();
        }

        System.out.println((playerFirst ? playerName : "Daemon") + "の先攻です。");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("battle_log.txt"))) {
            writer.write(playerName + " vs Daemon バトル開始\n");
            writer.write(playerName + " HP:" + player.getHP() + " AT:" + player.getAT() + " SP:" + player.getSP() + "\n");
            writer.write("Daemon HP:" + daemon.getHP() + " AT:" + daemon.getAT() + " SP:" + daemon.getSP() + "\n");
            writer.write((playerFirst ? playerName : "Daemon") + "が先攻\n\n");

            while (player.getHP() > 0 && daemon.getHP() > 0) {
                if (playerFirst) {
                    daemon.reduceHP(player.getAT());
                    String log = playerName + "の攻撃！DaemonのHPが" + Math.max(daemon.getHP(), 0) + "になった。\n";
                    System.out.print(log);
                    writer.write(log);

                    if (daemon.getHP() <= 0) break;

                    player.reduceHP(daemon.getAT());
                    log = "Daemonの攻撃！" + playerName + "のHPが" + Math.max(player.getHP(), 0) + "になった。\n";
                    System.out.print(log);
                    writer.write(log);
                } else {
                    player.reduceHP(daemon.getAT());
                    String log = "Daemonの攻撃！" + playerName + "のHPが" + Math.max(player.getHP(), 0) + "になった。\n";
                    System.out.print(log);
                    writer.write(log);

                    if (player.getHP() <= 0) break;

                    daemon.reduceHP(player.getAT());
                    log = playerName + "の攻撃！DaemonのHPが" + Math.max(daemon.getHP(), 0) + "になった。\n";
                    System.out.print(log);
                    writer.write(log);
                }
                writer.write("\n");
            }

            String result;
            if (player.getHP() <= 0 && daemon.getHP() <= 0) {
                result = "引き分け！両者とも倒れた。";
            } else if (player.getHP() <= 0) {
                result = "Daemonの勝ち！";
            } else {
                result = playerName + "の勝ち！";
            }
            System.out.println(result);
            writer.write(result + "\n");

        } catch (IOException e) {
            System.out.println("ログファイルの書き込みに失敗しました。");
            e.printStackTrace();
        }
    }
}
