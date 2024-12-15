import java.lang.Math;

public class Neznayka extends Alive {
    public boolean uneasy;

    public Neznayka(String Name) {
        super(Name);
        Everyone.everyone.add(this);
    }

    public void wave(Alive whom) {
        this.see(whom);
        System.out.println("Hello, " + whom.toString() + "! *" + this.toString() + " помахал " + whom.toString() + "*");
        whom.see(this);
        whom.setMood(Moods.GOOD);
    }

    public void feelUneasy() {
        if (((int) (Math.random() * 6) + 1) == 6) {
            System.out.println("От этой мысли Незнайке стало не по себе.");
            this.uneasy = true;
        } else {
            this.uneasy = false;
        }
    }

    public void getScared() {
        this.uneasy = true;
        System.out.println(this.toString() + " испугался и ему стало не по себе");
    }

    public void load(Cargo cargo) throws NeznaykaUneasyException{
        try{
            if (this.uneasy){
                throw new NeznaykaUneasyException("Ошибка в NeznaykaUneasyException");

            }
            System.out.println(this.toString() + " загрузил " + cargo.toString());
            this.strength = this.strength - cargo.returnWeight();
        } catch (NeznaykaUneasyException e) {
            System.out.println("Незнайке не по себе, он не может сейчас грузить.");
            System.out.println("Кооротышки помогли Незнайке, и ему стало по себе.");
            this.uneasy = false;
            }

        }

}
