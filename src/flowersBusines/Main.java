import flowers.FlowersLoader;
import store.Bouquet;
import store.FlowerStore;

import java.io.File;

public class Main {

    private static final String FILE = "flowers.txt";
    public static final String PATH = "file/" + FILE;

    public static void main(String[] args) {

        File flowers = new File(PATH);
        if (flowers.exists()) {
            flowers.delete();
        }

        FlowerStore flowerStore = new FlowerStore();

        Bouquet bouquet1 = flowerStore.sell(2, 3, 2);
        bouquet1.show();

        Bouquet bouquet2 = flowerStore.sellSequence(4, 2, 1);
        bouquet2.show();

        flowerStore.show();

        Bouquet bouquet3 = FlowersLoader.load(PATH);
        if (bouquet3 != null) bouquet3.show();
    }
}
