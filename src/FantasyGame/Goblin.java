package FantasyGame;
import java.util.Random;
public class Goblin {
    Random r = new Random ();
    public int goblinHP = 80;
    public int goblinDamage = r.nextInt(8,16);

}
