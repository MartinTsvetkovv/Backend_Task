package app;

public interface Card {
    double getDiscountRate();

    double getPurchaseValue();

    double calculateDiscount();

    double totalPurchaseValue();

    int getTurnOver();

}
