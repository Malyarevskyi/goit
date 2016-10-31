package core.modul8;

import java.util.*;

public class Run {
    private static Bouquet bouquet = new Bouquet();
    private static Rosebush rosebush = new Rosebush();

    public static void main(String[] args) {

        Map<String, Integer> mapBouquet = new HashMap<>();
        mapBouquet.put("roses", 1);
        mapBouquet.put("tulips", 3);
        mapBouquet.put("asters", 7);
        System.out.println("Map bouquet: " + mapBouquet + "\n");

        ArrayList<Flower> arrayListBouquet = new ArrayList<>();
        arrayListBouquet.add(new Aster("asters", "blue", 2, 1));
        arrayListBouquet.add(new Rose("roses", "yellow", 3, 5));
        arrayListBouquet.add(new Tulip("tulips", "violet", 4, 3));
        arrayListBouquet.add(new Chamomile("chamomile", "white", 6, 1));
        bouquet.setFlowersList(arrayListBouquet);
        System.out.println("ArrayList bunch: " + arrayListBouquet);

        List<Rose> bouquetrose = new LinkedList<>();
        bouquetrose.add(new Rose("roses", "red", 1001, 10));
        rosebush.setNewRoseBush(bouquetrose);
        System.out.println("\nRosebush contains " + bouquetrose + "\n");

        Set<Rose> setBuoquet = new TreeSet<>();
        setBuoquet.add(new Rose("roses", "red", 5, 3));
        setBuoquet.add(new Rose("roses", "black", 4, 2));
        setBuoquet.add(new Rose("roses", "violet", 2, 4));
        setBuoquet.add(new Rose("roses", "pink", 13, 1));
        setBuoquet.add(new Rose("roses", "white", 4, 2));
        System.out.println("TreeSet buoquet: " + setBuoquet + "\n");

        System.out.println("ArrayList bouquet presented as table:");
        for (Flower element : arrayListBouquet) {
            System.out.println(element.getQuantity() + "\t" + element.getColour() + "\t" + element.getName() + "\t" + element.getSize());
        }

        System.out.println("\nMap bouquet presented as table:");
        for (Map.Entry element : mapBouquet.entrySet()) {
            System.out.println(element.getKey() + "\t" + element.getValue());
        }
    }
}
