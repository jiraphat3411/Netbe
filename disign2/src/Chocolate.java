
public class Chocolate implements Product{
    private String name;
    private int price;
    public Chocolate(String name, int price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}
