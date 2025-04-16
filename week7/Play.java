package week7;
import week2.Character;

public class Play {
   public static void main(String[] args) {
        Character charater1 = new Character();
        Enemy enemy1 = new Enemy("Goblin", 10, 1, 3);

        System.out.println("Nama Character 1: " + charater1.getNama());
        System.out.println("HP Character 1: " + charater1.getHp());
        System.out.println("Level Character 1: " + charater1.getLevel());
        System.out.println("EXP Character 1: " + charater1.getExp());

        System.out.println("===================================");
        
        System.out.println("Nama Enemy 1: " + enemy1.getNama());
        System.out.println("HP Enemy 1: " + enemy1.getHp());
        System.out.println("Level Enemy 1: " + enemy1.getLevel());
        System.out.println("EXP Enemy 1: " + enemy1.getExp());
   }
}
