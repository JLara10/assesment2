public abstract class Employee extends Customer implements Payable{
    final double DISCOUNT = 0.10;
    public Employee(String name, Size size) {
        super(name, size);
    }
}
