package Attacks;
import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        if (def.getCondition() == Status.BURN || def.getCondition() == Status.POISON || def.getCondition() == Status.PARALYZE) {
            return (0.4 * (double)att.getLevel() + 2.0) * (this.power * 2) / 150.0;
        }
        return (0.4 * (double)att.getLevel() + 2.0) * this.power / 150.0;
    }
    @Override
    protected String describe() {
        return "использует атаку Facade";
    }
}