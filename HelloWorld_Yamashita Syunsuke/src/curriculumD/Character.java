package curriculumD;

public class Character {
    protected int HP;
    protected int AT;
    protected int SP;

    public Character(int HP, int AT, int SP) {
        this.HP = HP;
        this.AT = AT;
        this.SP = SP;
    }

    public int getHP() { return HP; }
    public void reduceHP(int damage) { this.HP -= damage; }
    public int getAT() { return AT; }
    public int getSP() { return SP; }
}
