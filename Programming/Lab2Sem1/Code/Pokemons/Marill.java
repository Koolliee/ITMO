package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;

public class Marill extends Azurill{
    public Marill(String name, int level){
        super(name, level);
        this.addMove(new Supersonic());
    }
}
