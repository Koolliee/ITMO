import ru.ifmo.se.pokemon.*;
import Attacks.*;
import Pokemons.*;

public class Main{
    public static void main(String[] args){
        Battle b = new Battle();
        Guzzlord p1 = new Guzzlord("Чужой", 1);
        Guzzlord p2 = new Guzzlord("Хищник", 10);
        Croagunk p3 = new Croagunk("p3", 5);
        Toxicroak p4 = new Toxicroak("p4", 3);
        Azurill p5 = new Azurill("p5", 10);
        Marill p6 = new Marill("p6", 4);
        Azumarill p7 = new Azumarill("p7", 4);
        b.addAlly(p1);
        b.addAlly(p4);
        b.addAlly(p7);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}