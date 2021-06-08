
// Написать программу «Задача о рюкзаке» с помощью рекурсии.

import java.util.ArrayList;
import java.util.List;

public class TaskBackpack {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Книга", 1, 600));
        items.add(new Item("Бинокль", 2, 5000));
        items.add(new Item("Аптечка", 4, 1500));
        items.add(new Item("Ноутбук", 2, 40000));
        items.add(new Item("Котелок", 1, 500));
        Backpack bag = new Backpack(8);
        bag.recursMakeItem(items);
        for (Item i : bag.getBestItem()) {
            System.out.println(i.getName() + " цена: " + i.getPrice() + " вес: " + i.getWeight());
        }
        System.out.println("общий вес: " + bag.getMaxWeight() + " общая цена: "+ bag.getSuperPrice());
        ;
    }
}
