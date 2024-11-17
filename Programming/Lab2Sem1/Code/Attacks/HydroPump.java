package Attacks;
import ru.ifmo.se.pokemon.*;

public final class HydroPump extends SpecialMove {
    public HydroPump(){
        super(Type.WATER, 110, 80);
    }
    @Override
    public String describe(){
        return "Использует атаку Hydro Pump";
    }
}
