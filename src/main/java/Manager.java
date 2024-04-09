public class Manager extends Employee{
    private final double EXTRA_DISCOUNT = 0.05;
    private double salary;
    public Manager(String name, Size size) {
        super(name, size);
    }

    @Override
    public void printPriceAfterDiscount(Cloth cloth) {

    }

    @Override
    public void printInfo() {

    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
