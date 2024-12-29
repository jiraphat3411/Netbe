
public class Milk implements Product {
    private String name;
    private int price;
    public Milk(String name, int price){
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
