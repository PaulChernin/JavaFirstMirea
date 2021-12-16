package ru.mirea.task14;

public class Game {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 10, 9, 8, 7, 6 };

        Pile pile1 = new DequePile(array1);
        Pile pile2 = new DequePile(array2);

        int i;
        for (i = 0; i < 106 && !pile1.isEmpty() && !pile2.isEmpty(); i++) {
            int card1 = pile1.popFront();
            int card2 = pile2.popFront();
//            System.out.println(card1 + " " + card2);

            Pile winner = (card1 > card2)? pile1 : pile2;
            winner.pushBack(card1);
            winner.pushBack(card2);

//            pile1.print();
//            pile2.print();
//            System.out.println();
        }

        if (pile1.isEmpty()) {
            System.out.println("second wins " + i);
        } else if (pile2.isEmpty()) {
            System.out.println("first wins " + i);
        } else {
            System.out.println("botva");
        }
    }
}
