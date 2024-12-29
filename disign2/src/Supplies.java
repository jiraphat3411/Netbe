
import java.util.ArrayList;

public class Supplies implements Product{
    private ArrayList<Product> supplies = new ArrayList<>();
    public void add(ArrayList products){
        supplies.addAll(products);
    }
    public void add(Product products) {
         supplies.add(products);
    }
    public void remove(Product products){
        supplies.remove(products);
    }
    public int size(){
        return supplies.size();
    }
    public ArrayList<Product> getSuppliesList(){
        return supplies;
    }
    @Override
    public String getName() {
        return null;
    }
    @Override
    public int getPrice() {
        return 0;
    }
    public void print() {
        System.out.println("Current Supplies: ");
        for (Product p : supplies){
            System.out.println(" - " + p.info());
        }
    }
}
