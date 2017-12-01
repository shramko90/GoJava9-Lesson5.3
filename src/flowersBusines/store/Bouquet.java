package store;

import flowers.Flowers;

import java.util.ArrayList;

public class Bouquet implements Show, GetPrice{
    private ArrayList<Flowers> flowers;

    public Bouquet(){
        flowers = new ArrayList<>();
    }

    @Override
    public void show() {

        int i;

        System.out.println("Букет");
        for (i=0; i< flowers.size() -1; i++){
            flowers.get(i).show();
        }

        flowers.get(i).show();
        System.out.println();
    }

    public void add(Flowers flower){
        flowers.add(flower);
    }

    @Override
    public int getPrice() {
        int res =0;

        for (Flowers flower:flowers){
            res += flower.getPrice();
        }

        return res;
    }

    public ArrayList<Flowers> getFlowers(){
        return flowers;
    }
}
