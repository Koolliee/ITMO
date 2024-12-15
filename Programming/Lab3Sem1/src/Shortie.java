public class Shortie extends Alive {
    public Shortie(String Name) {
        super(Name);
        Everyone.everyone.add(this);
    }

    @Override
    void wave(Alive whom) {
        this.see(whom);
        System.out.println("Hi, " + whom.toString() + "! *" + this.toString() + " помахал " + whom.toString() + "*");
        whom.see(this);
        whom.setMood(Moods.GOOD);

    }

    public void getScared() {
        System.out.println(this.toString() + " испугался.");
    }

    public void load(Cargo cargo) {
        this.strength = this.strength - cargo.returnWeight();
        System.out.println(this.toString() + " загрузил " + cargo.toString());
        if (this.strength < 0) {
            this.restoreStrength();
            for (Alive a : Everyone.everyone) {
                if (!a.equals(this)) {
                    this.cargoSlip(a);
                }
            }
        }
    }

}
