
import java.util.ArrayList;

public class Goods implements Product{
    private ArrayList<Product> goodslist = new ArrayList<>();
    public void add(Product goods){
        goodslist.add(goods);
    }
    public void remove(Product goods){
        goodslist.remove(goods);
    }
    public ArrayList<Product> getGoodsList(){
        return goodslist;
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
        System.out.println("All Goods: ");
        for (Product p : goodslist){
            System.out.println(" - " + p.info());
        }
    }
}
