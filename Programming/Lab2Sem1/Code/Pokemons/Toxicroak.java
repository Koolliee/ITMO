package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;

public final class Toxicroak extends Croagunk{
    public Toxicroak (String name, int level){
        super(name, level);
        this.setType(Type.POISON, Type.FIGHTING);
        this.addMove(new SwordsDance());
    }
}
