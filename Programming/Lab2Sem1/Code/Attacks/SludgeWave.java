package Attacks;
import ru.ifmo.se.pokemon.*;

import java.util.Arrays;

public final class SludgeWave extends SpecialMove {
    public SludgeWave(){
        super(Type.POISON, 95, 100);
    }
    @Override
    public void applyOppEffects (Pokemon p){
        if (Arrays.stream(p.getTypes()).anyMatch(element -> element == Type.POISON || element == Type.STEEL)){
        p.setCondition(new Effect().chance(0.1).condition(Status.POISON));
        }
    }
    @Override
    public String describe(){
        return "Использует атаку Sludge Wave";
    }
}
