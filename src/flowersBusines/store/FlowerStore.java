package store;

import flowers.Chamomile;
import flowers.FlowersSaver;
import flowers.Rose;
import flowers.Tulip;


public class FlowerStore implements Show {

    private int wallet;

    public FlowerStore() {
        this.wallet = 0;
    }

    public Bouquet sell(int roseCount, int chamomileCount, int tulipCount) {
        Bouquet bouquet = new Bouquet();

        for (int i = 0; i < roseCount; i++) bouquet.add(new Rose());
        for (int i = 0; i < chamomileCount; i++) bouquet.add(new Chamomile());
        for (int i = 0; i < tulipCount; i++) bouquet.add(new Tulip());

        wallet += bouquet.getPrice();
        FlowersSaver.save("flowers.txt", bouquet);

        return bouquet;
    }

    public Bouquet sellSequence(int roseCount, int chamomileCount, int tulipCount) {
        Bouquet bouquet = new Bouquet();

        for (int i = 0; i < Math.max(tulipCount, Math.max(roseCount, chamomileCount)); i++) {

            if (i<roseCount) bouquet.add(new Rose());
            if (i<chamomileCount) bouquet.add(new Chamomile());
            if (i<tulipCount) bouquet.add(new Tulip());
        }

        wallet += bouquet.getPrice();
        FlowersSaver.save("flowers.txt", bouquet);

        return bouquet;
    }

    @Override
    public void show() {
        System.out.println("Касса: " + wallet);
    }
}
