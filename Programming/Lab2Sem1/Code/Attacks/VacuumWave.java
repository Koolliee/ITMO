package Attacks;
import ru.ifmo.se.pokemon.*;

public final class VacuumWave extends SpecialMove {
    public VacuumWave() {
        super(Type.FIGHTING, 40, 100);
    }
    @Override
    public String describe(){
        return "использует атаку Vaccuum Wave";
    }
}
