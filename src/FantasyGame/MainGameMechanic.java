package FantasyGame;

import java.util.Random;
import java.util.Scanner;
public class MainGameMechanic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Character character = new Character();
        System.out.println("- Welcome to arena");
        System.out.println("- From mist you can see shape of your enemy...");
        Random r = new Random();
        Ork ork = new Ork();
        Goblin goblin = new Goblin();
        Skeleton skeleton = new Skeleton();
        int enemy = r.nextInt(3);

        if (enemy == 0) {
            System.out.println("- your enemy is ork");
            while (character.charakterHP > 0 && ork.orkHP > 0) {
                System.out.println("choose your attack");
                System.out.println("1 : Fast Attack - high hit chance, low damage");
                System.out.println("2 : Heavy Attack - low hit chance, high damage");
                int hit = s.nextInt();
                int hitChance = r.nextInt(100);
                switch (hit) {
                    case 1:
                        if (hitChance > 40) {
                            character.fastHitToOrk();
                        } else {
                            character.orkHit();
                        }
                        break;
                    case 2:
                        if (hitChance > 80) {
                            character.criticalHitOrk();
                        } else if (hitChance > 60) {
                            character.heavyHitToOrk();
                        } else {
                            character.orkHit();
                        }
                        break;
                }
            } if (ork.orkHP<=0 && character.charakterHP > 0){
                System.out.println("you win!!!");
            } else if ( character.charakterHP == 0) {
                System.out.println("you lost!!! your HP = 0");
            }
        }
        if (enemy == 1) {
            System.out.println("- your enemy is goblin");
            while (character.charakterHP > 0 && goblin.goblinHP > 0) {
                System.out.println("choose your attack");
                System.out.println("1 : Fast Attack - high hit chance, low damege");
                System.out.println("2 : Heavy Attack - low hit chance, high damage");
                int hit = s.nextInt();
                int hitChance = r.nextInt(100);
                switch (hit) {
                    case 1:
                        if (hitChance > 60) {
                            character.fastHitToGoblin();
                        } else {
                            character.goblinHit();
                        }
                        break;
                    case 2:
                        if (hitChance > 90) {
                            character.criticalHitGoblin();
                        } else if (hitChance > 70) {
                            character.heavyHitToGoblin();
                        } else {
                            character.goblinHit();
                        }
                        break;
                }
                if (goblin.goblinHP<=0 && character.charakterHP > 0){
                    System.out.println("you win!!!");
                } else if (goblin.goblinHP> 0 && character.charakterHP <= 0) {
                    System.out.println("you lost!!! your HP = 0");
                }
            }
        }
        if (enemy == 2) {
            System.out.println("- your enemy is skeleton");
            while (character.charakterHP > 0 && skeleton.skeletonHP > 0) {
                System.out.println("choose your attack");
                System.out.println("1 : Fast Attack - high hit chance, low damege");
                System.out.println("2 : Heavy Attack - low hit chance, high damage");
                int hit = s.nextInt();
                int hitChance = r.nextInt(100);
                switch (hit) {
                    case 1:
                        if (hitChance > 30) {
                            character.fastHitToSkeleton();
                        } else {
                            character.skeletonHit();
                        }
                        break;
                    case 2:
                        if (hitChance > 80) {
                            character.criticalHitSkeleton();
                        } else if (hitChance > 60) {
                            character.heavyHitToOrk();
                        } else {
                            character.skeletonHit();
                        }
                        break;
                }if (skeleton.skeletonHP<=0 && character.charakterHP > 0){
                    System.out.println("you win!!!");
                } else if (skeleton.skeletonHP > 0 && character.charakterHP <= 0) {
                    System.out.println("you lost!!! your HP = 0");
                }
            }

            }
    }
}
