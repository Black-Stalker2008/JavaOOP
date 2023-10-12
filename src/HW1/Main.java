package HW1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HotVendingMashine HVM = new HotVendingMashine();
        HVM.initProductName(List.of(new HotDrinks("Coffee", 100.0, 200, 70),
                                   (new HotDrinks("Tea", 60.0, 300, 80)),
                                   (new HotDrinks("Latte", 120.0, 150, 65))));
        System.out.println(HVM.getProductName());
    }
}