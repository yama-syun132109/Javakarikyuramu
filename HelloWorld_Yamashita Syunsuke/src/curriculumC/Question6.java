package curriculumC;

public class Question6 {
    public static void main(String[] args) {
        Player player = new Player();
        CPU cpu = new CPU();

        while (true) {
            int playerHand = player.chooseHand();
            int cpuHand = cpu.generateHand();

            System.out.println("あなたの手: " + player.getHandName(playerHand));
            System.out.println("CPUの手: " + cpu.getHandName(cpuHand));

            int result = (playerHand - cpuHand + 3) % 3;

            if (result == 0) {
                System.out.println("あいこです。もう一度！");
            } else if (result == 1) {
                System.out.println("あなたの負け！");
            } else {
                System.out.println("あなたの勝ち！");
                break;
            }

            System.out.println(); // 改行で見やすく
        }
    }
}

