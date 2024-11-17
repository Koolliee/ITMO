package Attacks;
import ru.ifmo.se.pokemon.*;

public final class Flatter extends StatusMove{
    public Flatter(){
        super(Type.DARK, 0, 100);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().stat(Stat.SPECIAL_ATTACK, 1));
        p.confuse();
    }
    public String describe(){
        return "использует атаку Flatter";
    }

}
