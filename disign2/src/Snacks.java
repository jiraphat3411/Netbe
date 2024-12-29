
import java.util.ArrayList;

public class Snacks implements Product{
    private ArrayList<Product> snacksList = new ArrayList<>();
    public void add(Product snack){
        snacksList.add(snack);
    }
    public void remove(Product snack){
        snacksList.remove(snack);
    }
    public ArrayList<Product> getSnacksList(){
        return snacksList;
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
        System.out.println("All Snacks: ");
        for (Product p : snacksList){
            System.out.println(" - " + p.info());
        }
    }
}
