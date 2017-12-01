package flowers;

import store.GetPrice;
import store.Show;

public class Flowers implements Show, GetPrice {

    private static final int ROSE = 100;
    private static final int CHAMOMILE = 70;
    private static final int TULIP = 45;

    private int price;

    public Flowers() {
        if (this instanceof Rose) this.price = ROSE;
        if (this instanceof Chamomile) this.price = CHAMOMILE;
        if (this instanceof Tulip) this.price = TULIP;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + price;
    }

    @Override
    public void show() {

    }
}
