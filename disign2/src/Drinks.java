
import java.util.ArrayList;

public class Drinks implements Product{
    private ArrayList<Product> drinkslist = new ArrayList<>();
    public void add(Product drinks){
        drinkslist.add(drinks);
    }
    public void remove(Product drinks){
        drinkslist.remove(drinks);
    }
    public ArrayList<Product> getDrinksList(){
        return drinkslist;
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
        System.out.println("All Drinks: ");
        for (Product p : drinkslist){
            System.out.println(" - " + p.info());
        }
    }
}
