package Attacks;
import ru.ifmo.se.pokemon.*;

public final class LeafBlade extends PhysicalMove {
    public LeafBlade(){
        super(Type.GRASS, 90, 100);
    }
    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (var1.getStat(Stat.SPEED) / 512.0 * 3 > Math.random()) {
            System.out.println("critical");
            return 2.0;
        } else {
            return 1.0;
        }
    }
    public String describe() {
        return "Использует атаку Leaf Blade";
    }
}
