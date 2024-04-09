public class HourlyEmployee extends Employee{
    private float hoursWorked;
    private double hourlyWage;
    public HourlyEmployee(String name, Size size) {
        super(name, size);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
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
