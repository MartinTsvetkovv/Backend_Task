package app;


public class PayDesk {

    public static void result(Card card) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Purchase value: $%.2f%n", card.getPurchaseValue()));
        sb.append(String.format("Discount Rate : %.2f%%%n", card.getDiscountRate()));
        sb.append(String.format("Discount: $%.2f%n", card.calculateDiscount()));
        sb.append(String.format("Total: $%.2f%n", card.totalPurchaseValue()));
        System.out.println(sb.toString());
    }

}
