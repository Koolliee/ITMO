package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;

public final class Guzzlord extends Pokemon {
    public Guzzlord (String name, int level) {
        super(name, level);
        this.setType(Type.DARK, Type.DRAGON);
        this.addMove(new VacuumWave());
        this.addMove(new Rest());
        this.addMove(new LeafBlade());
        this.addMove(new Confide());
    }
}
