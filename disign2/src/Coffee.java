
public class Coffee implements Product{
    private String name;
    private int price;
    public Coffee(String name, int price){
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
