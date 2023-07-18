package HW4;

import HW4.gb.list.GBLinkedList;
import HW4.gb.list.GBNode;

public class Main {
    public static void main(String[] args) {
//      Первое задание
        GBLinkedList<Integer> integers = new GBLinkedList<>(1);
//      С цепью вызовов добавлять удобнее, добавил ее только на add
        integers
                .add(2)
                .add(3)
                .add(4)
                .add(10, 11); // Не добавится
        integers.addFirst(5);
        integers.addLast(10);

        System.out.println(integers);
        integers.remove(3);
        System.out.println(integers);
        integers.removeFirst();
        System.out.println(integers);
        integers.removeLast();
        System.out.println(integers);

        integers.update(0, 10);
        System.out.println(integers);

        System.out.println("Current size: " + integers.size());
        System.out.println("El at 0 index: " + integers.get(0));

        for (Integer el : integers) System.out.println(el);
    }
}