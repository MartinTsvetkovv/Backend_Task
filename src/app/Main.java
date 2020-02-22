package app;

import app.cards.Bronze;
import app.cards.Gold;
import app.cards.Silver;

public class Main {
    public static void main(String[] args) {

        Card bronzeCard = new Bronze(0, 150);
        PayDesk.result(bronzeCard);
        Card silverCard = new Silver(600, 850);
        PayDesk.result(silverCard);
        Card goldCard = new Gold(1500, 1300);
        PayDesk.result(goldCard);
    }
}
