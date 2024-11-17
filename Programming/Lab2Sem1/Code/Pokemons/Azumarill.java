package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;

public final class Azumarill extends Marill{
    public Azumarill(String name, int level){
        super(name, level);
        this.addMove(new HydroPump());
    }

}
