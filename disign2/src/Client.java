
public class Client {
    public static void main(String[] args) {
        Client.storeProduct();
    }
    public static void storeProduct(){
        Snacks snacks = new Snacks();
        Drinks drinks = new Drinks();
        Goods goods = new Goods();
        snacks.add(new Popcorn("Popcorn", 20));
        snacks.add(new Chocolate("Chocolate", 10));
        drinks.add(new Coffee("Coffee", 40));
        drinks.add(new Milk("Milk", 15));
        goods.add(new Shampoo("Shampoo", 30));
        goods.add(new Toothpaste("Toothpaste", 12));
        snacks.print();
        drinks.print();
        goods.print();

        Supplies supplies = new Supplies();
        supplies.add(snacks.getSnacksList());
        supplies.add(drinks.getDrinksList());
        supplies.add(goods.getGoodsList());
        supplies.add(new Milk("Milk2",70));
        supplies.add(snacks.getSnacksList());
        supplies.print();
    }
    public static void sellProduct(){

    }
}
