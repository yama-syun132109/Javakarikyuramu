package curriculumC;

import java.util.Random;

public class CPU {
    private Random random = new Random();

    public int generateHand() {
        return random.nextInt(3); // 0〜2のランダムな数値を返す
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

