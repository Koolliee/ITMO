import java.lang.Math;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NeznaykaUneasyException {
        ArrayList<Alive> everyone = new ArrayList<Alive>(); // Создаем массив всех персонажей
        Neznayka neznayka = new Neznayka("Neznayka");
        Shortie shortie1 = new Shortie("Shortie1");
        Shortie shortie2 = new Shortie("Shortie2");
        everyone.add(neznayka);
        everyone.add(shortie1);
        everyone.add(shortie2);
        LumpOfWool wool = new LumpOfWool(20);
        PileOfBricks bricks = new PileOfBricks(40);
        Log log = new Log(100);

        Truck truck = new Truck("Semi Truck", 1000);
        Helicopter helicopter = new Helicopter("Helicopter Helly", 600);
        Cargo cargo = wool;
        switch ((int) (Math.random() * 3) + 1) { // выбираем какуй груз повезут коротышки
            case 1:
                break;
            case 2:
                cargo = bricks;
                break;
            case 3:
                cargo = log;
                break;
        }

        Vehicle vehicle = truck;
        switch ((int) (Math.random() * 2) + 1) { // выбираем машину коротышек
            case 1:
                break;
            case 2:
                vehicle = helicopter;
                break;
        }
        neznayka.feelUneasy();
        vehicle.makeSomeNoize();
        shortie1.wave(neznayka);
        neznayka.wave(shortie1);
        int k = 0;
        int m = Everyone.everyone.size();
        int ins = 0;
        boolean flag = true;
        while (vehicle.capacity > 0) {
            int inspection = vehicle.capacity;
            Everyone.everyone.get(k).load(cargo);
            vehicle.capacity -= cargo.returnWeight();
            k++;
            if (k == m) {
                k = k % m;
            }
        }
        System.out.println("Машину загрузили. И жили они долго и счастливо.");




    }
}