import java.util.ArrayList;
import java.util.List;

//Рюкзак
public class Backpack {
    private List<Item> superItem = null; //лучший набор предметов
    private final int maxWeight;  // максимальный вес
    private int superPrice; //лучшая цена набора

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int maxWeightItem(List<Item> list) {
        int weightItem = 0;
        for (Item i : list) {
            weightItem += i.getWeight();
        }
        return weightItem;
    }

    public int maxPriceItem(List<Item> list) {
        int priceItem = 0;
        for (Item i : list) {
            priceItem += i.getPrice();
        }
        return priceItem;
    }

    public void Check(List<Item> list) {
        if (superItem == null) {
            if (maxWeightItem(list) <= maxWeight) {
                superItem = list;
                superPrice = maxPriceItem(list);
            }
        } else {
            if (maxWeightItem(list) <= maxWeight && maxPriceItem(list) > superPrice) {
                superItem = list;
                superPrice = maxPriceItem(list);
            }
        }
    }

    public void recursMakeItem(List<Item> list) {
        if (list.size() > 0)
            Check(list);
        for (int i = 0; i < list.size(); i++) {
            List<Item> newList = new ArrayList<>(list);
            newList.remove(i);
            recursMakeItem(newList);
        }
    }

    public List<Item> getBestItem() {
        return superItem;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getSuperPrice() {
        return superPrice;
    }
}