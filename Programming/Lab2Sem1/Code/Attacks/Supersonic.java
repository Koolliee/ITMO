package Attacks;
import ru.ifmo.se.pokemon.*;

public final class Supersonic extends StatusMove{
    public Supersonic(){
        super(Type.NORMAL, 0, 55);
    }
    @Override
    public void applyOppEffects (Pokemon p){
        p.confuse();
    }
    @Override
    public String describe(){
        return "использует атаку Supersonic";
    }

}
