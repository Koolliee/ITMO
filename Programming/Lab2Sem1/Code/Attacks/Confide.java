package Attacks;
import ru.ifmo.se.pokemon.*;

public final class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().stat(Stat.SPECIAL_ATTACK, -1));
    }
    public String describe(){
        return "Использует атаку Confide";
    }

}
