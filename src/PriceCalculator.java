public class PriceCalculator {

    public static void main() {

        double discount = 10;
        double basePrice = 100;
        double finalPrice = calculateFinalPrice(basePrice, discount);
        System.out.println("Slutpris: " + finalPrice + "kr");

    }

    public static double addTax(double price) {
        return price * 1.25;
    }

    public static double applyDiscount(double price, double discountPercent) {
        return price - (price * (discountPercent/100));

    }

    public static double calculateFinalPrice(double basePrice, double discount) {
       double newPrice = applyDiscount(basePrice, discount);
       return addTax(newPrice);

    }




}
