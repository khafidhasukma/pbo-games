package week2;

public class Character {
    protected String name;
    protected int hp = 100;
    protected int level = 1;
    protected int exp = 0;

    // constructor
    public Character() {
        this.name = "Soekma";
    }

    // overloaded constructor
    public Character(String name, int hp, int level, int exp) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.exp = exp;
    }

    // display character info
    public void displayInfo() {
        System.out.println("Character Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Level: " + level);
        System.out.println("EXP: " + exp);
    }

    // set data name
    public void setData(String name)
    {
        this.name = name;
    }

    // get data name
    public String getNama()
    {
        return this.name;
    }

    // attack method
    public void attack()
    {
        System.out.println(this.name + " menyerang lawan");
        expUp();
    }

    // get HP
    public int getHp()
    {
        return this.hp;
    }

    // attacked method
    public void attacked()
    {
        this.hp -= 1;
    }

    // drink potion method
    public void minumRamuan()
    {
        this.hp += 1;
    }

    // level up method
    public void levelUp()
    {
        this.level += 1;
    }

    // experience up method
    public void expUp()
    {
        this.exp += 1;
    }

    // get level
    public int getLevel()
    {
        return this.level;
    }

    // get experience points
    public int getExp()
    {
        return this.exp;
    }
}