package app.cards;

public class Silver extends BaseCard {

    public Silver(int turnover, double purchaseValue) {
        super(turnover, purchaseValue);
        this.setDiscountRate(getDiscountRate());
    }

    @Override
    protected void setDiscountRate(double discountRate) {
        if (this.getTurnOver() > 300) {
            discountRate = 3.5;
        } else {
            discountRate = 2.0;
        }
        super.setDiscountRate(discountRate);
    }
}
