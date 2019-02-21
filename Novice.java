import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Novice {
    private int level;
    private int hp;
    private int attack;
    private int defense;
    private int hpMonster;
    private int attackMonster;
    private int hpKing;
    private int attackKing;

    public Novice(){
        level = 1;
        hp = 100;
        attack = 30;
        defense = 20;
        hpMonster = 100;
        attackMonster = 50;
        hpKing = 2000;
        attackKing = 200;
    }
    public static void main(String[] args) {
        Novice novice = new Novice();
        Scanner scanner = new Scanner(System.in);
        int hp1 = novice.getHp();
        int hp2 = novice.getHpMonster();
        Bag items = new Bag();

        System.out.println("Yokoso!!!");
        System.out.print("Enter Your name: ");
        String noviceName = scanner.nextLine();
        System.out.println("-------------------------------------------");
        System.out.println("Names: " + noviceName);
        System.out.println("Level: " + novice.getLevel());    
        System.out.println("HP: " + novice.getHp());    
        System.out.println("Attack: " + novice.getAttack());
        System.out.println("Defense: " + novice.getDefense());
        System.out.println("Coin: " + items.coin);
        System.out.println("-------------------------------------------");
        System.out.println("Shoping");
        System.out.println("1.Sword + Attack: 70 >> price 1000");
        System.out.println("2.Armor + Defense: 40 >> price 1000");
        System.out.println("3.Skip");
        int a  = scanner.nextInt();
        if(a == 1){
            novice.attack += 70;
            items.coin -= 1000;
        }
        else if(a == 2){
            novice.defense += 40;
            items.coin -= 1000;
        }
        System.out.println("-------------------------------------------");
        System.out.println("Names: " + noviceName);
        System.out.println("Level: " + novice.getLevel());    
        System.out.println("HP: " + novice.getHp());    
        System.out.println("Attack: " + novice.getAttack());
        System.out.println("Defense: " + novice.getDefense());
        System.out.println("Coin: " + items.coin);
        System.out.println("-------------------------------------------");
        System.out.println("Will you go to attack the monster?");
        System.out.println("1.Yes");
        System.out.println("2.No");

        int awn  = scanner.nextInt();

        if(awn == 1){
            while (hp1 > 0 && hp2 > 0) {
            System.out.println("-------------------------------------------");
            System.out.println("Names: " + noviceName);
            System.out.println("Level: " + novice.getLevel());    
            System.out.println("HP: " + hp1);    
            System.out.println("Attack: " + novice.getAttack());
            System.out.println("Defense: " + novice.getDefense());
            System.out.println("-------------------------------------------");
            System.out.println("-------------------------------------------");
            System.out.println("Names: Monster");
            System.out.println("Level: 1");    
            System.out.println("HP: " + hp2);    
            System.out.println("Attack: " + novice.getAttackMonster());
            System.out.println("-------------------------------------------");
            System.out.println("1.Attack");
            System.out.println("2.Defense");
            int choice  = scanner.nextInt();
            if(choice == 1){
                hp2 -= novice.getAttack();
                hp1 -= novice.getAttackMonster();
            }else hp1 -= novice.getdf();
            }
        }
        else System.out.println("-fin-");
        if(awn == 1){
            System.out.println("Congrat!!! Your LevelUP+++ \n Get New intem 'EXcalibur' + Attack: 200");
            novice.level += 9;
            novice.hp += 900;
            novice.attack += 200;
            novice.defense += 80;
            System.out.println("Enter '1' for Get");
            int b  = scanner.nextInt();
            if(b == 1){
                items.item += 200;
            }
            System.out.println("-------------------------------------------");
            System.out.println("Names: " + noviceName);
            System.out.println("Level: " + novice.getLevel());    
            System.out.println("HP: " + novice.getHp());    
            System.out.println("Attack: " + novice.getAttac(items.item));
            System.out.println("Defense: " + novice.getDefense());
            System.out.println("Coin: " + items.coin);
            System.out.println("-------------------------------------------");
            novice.attack = novice.getAttac(items.item);
            System.out.println("Will you go to attack the DEMON KKING?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            int c  = scanner.nextInt();
            hp1 = novice.getHp();
            hp2 = novice.getHpKing();
            if(c == 1){
                while (hp1 > 0 && hp2 > 0) {
                    System.out.println("-------------------------------------------");
                    System.out.println("Names: " + noviceName);
                    System.out.println("Level: " + novice.getLevel());    
                    System.out.println("HP: " + hp1);    
                    System.out.println("Attack: " + novice.getAttack());
                    System.out.println("Defense: " + novice.getDefense());
                    System.out.println("-------------------------------------------");
                    System.out.println("-------------------------------------------");
                    System.out.println("Names: Monster");
                    System.out.println("Level: 1");    
                    System.out.println("HP: " + hp2);    
                    System.out.println("Attack: " + novice.getAttackKing());
                    System.out.println("-------------------------------------------");
                    System.out.println("1.Attack");
                    System.out.println("2.Defense");
                    int choice  = scanner.nextInt();
                    if(choice == 1){
                        hp2 -= novice.getAttack();
                        hp1 -= novice.getAttackKing();
                    }else hp1 -= novice.getdfking();
                    }
            }else System.out.println("-fin-");
            if(hp2 == 0){
                System.out.println("Congrat!!!");
            }else System.out.println("You lost!!!");
        }
    }
    public int getLevel() {
        return level;
    }
    public int getHp() {
        return hp;
    }
    public int getAttack() {
        return attack;
    }
    public int getAttac(int a) {
        return attack+a;
    }
    public int getDefense() {
        return defense;
    }
    public int getHpMonster() {
        return hpMonster;
    }
    public int getAttackMonster() {
        return attackMonster;
    }
    public int getdf() {
        return attackMonster - defense;
    }
    public int getHpKing() {
        return hpKing;
    }
    public int getAttackKing() {
        return attackKing;
    }
    public int getdfking() {
        return attackKing - defense;
    }

}
