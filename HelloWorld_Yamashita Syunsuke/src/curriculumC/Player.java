package curriculumC;

import java.util.Scanner;

public class Player {
    private Scanner scanner = new Scanner(System.in);
    private int hand;

    public int chooseHand() {
        System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
        hand = scanner.nextInt();
        return hand;
    }

    public String getHandName(int hand) {
        switch (hand) {
            case 0: return "グー";
            case 1: return "チョキ";
            case 2: return "パー";
            default: return "不明";
        }
    }
}

