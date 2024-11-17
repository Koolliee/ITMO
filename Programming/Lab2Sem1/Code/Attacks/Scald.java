package Attacks;
import ru.ifmo.se.pokemon.*;

import java.util.Arrays;

public final class Scald extends SpecialMove{
    public Scald(){
        super(Type.WATER, 80, 100);
    }
    @Override
    public void applyOppEffects (Pokemon p){
        if (Arrays.stream(p.getTypes()).noneMatch(element -> element == Type.FIRE)) {
            p.setCondition(new Effect().condition(Status.BURN));
        }
    }
    @Override
    public String describe(){
        return "использует атаку Scald";
    }
}