import java.util.ArrayList;
import java.lang.Math;
import java.util.Objects;

public abstract class Alive {
    String name;
    Moods mood;

    public Alive(String Name) {
        this.name = Name;
        this.mood = Moods.BAD;
    }

    public ArrayList<Alive> seen = new ArrayList<Alive>();
    public int strength = (int) (Math.random() * 500);

    public void punch(Alive whom) {
        System.out.println(this.toString() + " ударил " + whom.toString());
        if (Math.random() > 0.5) {
            System.out.println(whom.toString() + " нокаутирован " + this.toString());
            System.out.println("Отдохнули, подлечились, помирились. Продолжили загружать машину дальше.");
        } else {
            whom.punch(this);
        }
    }

    public void cargoSlip(Alive onWhom) {
        System.out.println(this.toString() + " уронил груз на ногу " + onWhom.toString());
        if (Math.random() > 0.7) {
            onWhom.punch(this);
        } else {
            System.out.println(onWhom.toString() + " затерпел.");
        }
    }

    public void see(Alive whom) {
        if (!this.seen.contains(whom)) {
            this.seen.add(whom);
            System.out.println(this.toString() + " увидел " + whom.toString());
        }
    }

    public void setMood(Moods mood) {
        if (this.mood == Moods.BAD) {
            System.out.println("У " + this.toString() + " теперь хорошее настроение");
        }
        this.mood = mood;
    }
    public void restoreStrength(){
        this.strength = 300;
    }

    abstract void wave(Alive whom);

    abstract void getScared();

    abstract void load(Cargo cargo) throws NeznaykaUneasyException;

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Alive object = (Alive) obj;
        return this.name.equals(object.name) && this.mood == object.mood;
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.mood);
    }

}
