
public interface Product {
    // Execute
    public String getName();
    public int getPrice();
    public default String info(){
        return getName() + ", " + getPrice() + " baht.";
    }
}
