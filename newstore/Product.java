package newstore;

public enum Product {
    Fruits(11),
    Vegetables(5),
    Clothing(37),
    Technics(88),
    Chemistry(24),
    Other(19);

    public int price;

    Product(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }
}
