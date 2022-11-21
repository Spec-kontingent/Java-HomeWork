public class HeavyBox {
    private  int weight;
    private  String owner;

    HeavyBox(){}
    HeavyBox(String owner, int weight){
        this.owner=owner;
        this.weight=weight;
    }
    @Override
    public String toString (){
        return "owner="+owner+"; weight="+weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
