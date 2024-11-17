package Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;

public class Azurill extends Pokemon{
    public Azurill(String name, int level){
        super(name, level);
        this.addMove(new Scald());
        this.addMove(new Confide());
    }

}
