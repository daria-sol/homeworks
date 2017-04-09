
package store;


public enum Product {
    Fruits(5),
    Vegetables(6),
    Clothing(15),
    Technics(22),
    Chemistry(11),
    Other(18);

    public int price;

    Product(int p) {
        price = p;
    }
     public int getPrice() {
        return price;
    }
}
