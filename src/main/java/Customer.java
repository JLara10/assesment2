public abstract class Customer extends Person {
    Cloth[] clothingItems;
    public Customer(String name, Size size) {
        super(name, size);
    }
    public abstract void printPriceAfterDiscount(Cloth cloth);
}
