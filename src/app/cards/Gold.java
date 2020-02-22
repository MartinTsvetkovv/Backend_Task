package app.cards;

public class Gold extends BaseCard {

    public Gold(int turnover, double purchaseValue) {
        super(turnover, purchaseValue);
        this.setDiscountRate(getDiscountRate());
    }

    @Override
    protected void setDiscountRate(double discountRate) {
        int currentDiscount = 1;
        discountRate = 2;

        for (int i = 2; i <= 10; i++) {
            if (currentDiscount * 100 < getTurnOver() * (1 - (i / 100))) {
                currentDiscount++;
                discountRate = i;
            }
        }
        super.setDiscountRate(discountRate);
    }
}
