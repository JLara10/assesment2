public class Main {
    public static void main(String[] args) {
       Cloth cloth1 = new Cloth("jeans", 30.00, Size.L);
        Cloth cloth2 = new Cloth("T-shirt", 20.00, Size.S);
        Cloth cloth3 = new Cloth("shorts", 20.00, Size.M);
       Cloth[] clothing = {cloth1, cloth2, cloth3};
       double totalPrice = ShopApp.calculateSubTotal(clothing);
        System.out.println(totalPrice);


    }
}