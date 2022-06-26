package FantasyGame;
import java.util.Random;
public class Skeleton {
    Random r = new Random ();
    public int skeletonHP = 150;
    public int skeletonDamage = r.nextInt(8,25);
}
