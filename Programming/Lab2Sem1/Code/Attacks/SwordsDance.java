package Attacks;
import ru.ifmo.se.pokemon.*;

public final class SwordsDance extends StatusMove{
    public SwordsDance() {
        super(Type.NORMAL, 0, 0);
    }
    public void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().stat(Stat.ATTACK, 2));
    }
    public String describe(){
        return "использует атаку SwordsDance";
    }
}
