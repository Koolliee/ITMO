public record PileOfBricks(int weight) implements Cargo{
    public int returnWeight(){
        return weight;
    }
}
