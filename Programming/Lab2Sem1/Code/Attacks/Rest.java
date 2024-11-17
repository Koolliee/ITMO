package Attacks;
import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC, 0, 100);
    }
    @Override
    public void applySelfEffects(Pokemon p) {
        p.setCondition(new Effect().turns(2).condition(Status.SLEEP));
        p.setMod(Stat.HP, (int) p.getStat(Stat.HP));
    }
    @Override
    public String describe() {
        return "Лечит себя с помощью Rest";
    }

}
