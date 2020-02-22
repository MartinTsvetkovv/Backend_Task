package app.cards;

public class Bronze extends BaseCard {

    public Bronze(int turnover, double purchaseValue) {
        super(turnover, purchaseValue);
        this.setDiscountRate(getDiscountRate());
    }

    @Override
    protected void setDiscountRate(double discountRate) {
        if (this.getTurnOver() < 100) {
            discountRate = 0;
        } else if (this.getTurnOver() >= 100 && this.getTurnOver() <= 300) {
            discountRate = 1.0;
        } else {
            discountRate = 2.5;
        }
        super.setDiscountRate(discountRate);
    }
}
