package curriculumD;

import java.util.Random;

public class Player extends Character {
    private String name;

    public Player(String name) {
        super(0, 0, 0);
        this.name = name;

        Random rand = new Random();
        this.HP = rand.nextInt(51) + 50; // 50〜100
        this.AT = rand.nextInt(11) + 10; // 10〜20
        this.SP = rand.nextInt(11) + 5;  // 5〜15
    }

    public String getName() { return name; }
}
