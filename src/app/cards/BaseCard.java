package app.cards;

import app.Card;

public abstract class BaseCard implements Card {
    private int turnOver;
    private double discountRate;
    private double purchaseValue;

    protected BaseCard(int turnOver, double purchaseValue) {
        this.turnOver = turnOver;
        this.purchaseValue = purchaseValue;
    }

    @Override
    public int getTurnOver() {
        return this.turnOver;
    }

    protected void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double getDiscountRate() {
        return this.discountRate;
    }

    @Override
    public double getPurchaseValue() {
        return this.purchaseValue;
    }

    @Override
    public double calculateDiscount() {
        return (this.purchaseValue * this.discountRate) / 100;
    }

    @Override
    public double totalPurchaseValue() {
        return this.purchaseValue - calculateDiscount();
    }

}
