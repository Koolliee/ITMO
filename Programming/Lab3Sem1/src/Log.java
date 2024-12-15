public record Log(int weight) implements Cargo{
    public int returnWeight(){
        return weight;
    }
}
