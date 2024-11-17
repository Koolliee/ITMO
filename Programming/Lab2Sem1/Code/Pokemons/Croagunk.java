package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;

public class Croagunk extends Pokemon{
    public Croagunk(String name, int level){
        super(name, level);
        this.setType(Type.POISON, Type.FIGHTING);
        this.addMove(new SludgeWave());
        this.addMove(new Flatter());
        this.addMove(new Facade());

    }
}
