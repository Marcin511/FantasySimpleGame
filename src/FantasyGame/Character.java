package FantasyGame;
import java.util.Random;
public class Character {
    Ork ork = new Ork();
    Goblin goblin = new Goblin();
    Skeleton skeleton = new Skeleton();
    public int charakterHP = 100;
    Random r = new Random();
    public int fastDamage = r.nextInt(5,12);
    public int heavyDamage = r.nextInt(10,25);
    public int criticalHit = r.nextInt(20,35);

    public int fastHitToOrk(){
        ork.orkHP = ork.orkHP - fastDamage;
        System.out.println("you hit by : " + fastDamage + " damage" );
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + ork.orkHP);
        return ork.orkHP;
    }
    public int heavyHitToOrk(){
        ork.orkHP = ork.orkHP - fastDamage;
        System.out.println("you hit by : " + heavyDamage + " damage" );
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + ork.orkHP);
        return ork.orkHP;
    }
    public int fastHitToGoblin(){
        goblin.goblinHP = goblin.goblinHP - fastDamage;
        System.out.println("you hit by : " + fastDamage + " damage" );
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + goblin.goblinHP);
        return goblin.goblinHP;

    }
    public int heavyHitToGoblin(){
        goblin.goblinHP = goblin.goblinHP - heavyDamage;
        System.out.println("you hit by : " + heavyDamage + " damage" );
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + goblin.goblinHP);
        return goblin.goblinHP;

    }public int fastHitToSkeleton(){
        skeleton.skeletonHP = skeleton.skeletonHP - fastDamage;
        System.out.println("you hit by : " + fastDamage + " damage" );
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + skeleton.skeletonHP);
        return skeleton.skeletonHP;
    }
    public int heavyHitToSkeleton(){
        skeleton.skeletonHP = skeleton.skeletonHP - heavyDamage;
        System.out.println("you hit by : " + heavyDamage + " damage" );
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + skeleton.skeletonHP);
        return skeleton.skeletonHP;
    }
    public int criticalHitOrk(){
        ork.orkHP = ork.orkHP - criticalHit;
        System.out.println("Critical Hit!!! you hit by : " + criticalHit + " damage" );
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + ork.orkHP);
        return ork.orkHP;
    }
    public int criticalHitGoblin(){
        goblin.goblinHP = goblin.goblinHP - criticalHit;
        System.out.println("Critical Hit!!! you hit by : " + criticalHit + " damage" );
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + goblin.goblinHP);
        return goblin.goblinHP;
    }
    public int criticalHitSkeleton(){
        skeleton.skeletonHP = skeleton.skeletonHP - criticalHit;
        System.out.println("Critical Hit!!! you hit by : " + criticalHit + " damage" );
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + skeleton.skeletonHP);
        return skeleton.skeletonHP;
    }
    public int orkHit(){
        System.out.println("you miss, enemy hit you :" + ork.orkDamage + " damage");
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + ork.orkHP);
        charakterHP = charakterHP - ork.orkDamage;
        return charakterHP;
    }
    public int goblinHit(){
        System.out.println("you miss, enemy hit you: " + goblin.goblinDamage + " damage");
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + goblin.goblinHP);
        charakterHP = charakterHP - goblin.goblinDamage;
        return charakterHP;
    }
    public int skeletonHit(){

        System.out.println("you miss, enemy hit you : " + skeleton.skeletonDamage + " damage");
        System.out.println("your HP : "+ charakterHP + " Enemy HP :" + skeleton.skeletonHP);
        charakterHP = charakterHP - skeleton.skeletonDamage;
        return charakterHP;
    }
}
