import java.lang.Math;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Vehicle {
    String name;
    int capacity;
    public Vehicle (String Name, int capacity){
        this.name = Name;
        this.capacity = capacity;
    }
    void makeSomeNoize(){
        if ((int) (Math.random()) + 1 == 1) {
            System.out.println(this.toString() + " издала громкий звук.");
            for (Alive man : Everyone.everyone) {
                man.getScared();
            }
        } else {
            System.out.println(this.toString() + " издал громкий звук.");
        }
    }
    int returnCapacity(){
        return this.capacity;
    }

    void toPullUp(){
        System.out.println(this.toString() + " подъехал.");
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Vehicle object = (Vehicle) obj;
        return this.name.equals(object.name) && this.capacity == object.capacity;
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.capacity);
    }


}
