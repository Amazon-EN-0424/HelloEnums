package com.ironhack;

import java.util.ArrayList;
import java.util.List;

import static com.ironhack.TeaType.GREEN;
import static com.ironhack.TeaType.OOLONG;

public class Main {
    public static void main(String[] args) {

        Tea whiteTea = new Tea("White Lotus", TeaType.WHITE);
        Tea greenTea = new Tea("Green Tiger", GREEN);
        Tea oolongTea = new Tea("Blue Dragon", OOLONG);

        var teaList = new ArrayList<>(List.of(whiteTea, greenTea, oolongTea));

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " =======");
            var pickedTea = pickRandomTea(teaList);

            boolean isWhiteTea = pickedTea.getType() == TeaType.WHITE;
            if (isWhiteTea){
                System.out.println(pickedTea);
                System.out.println("It's for royalties");
            } else {
                System.out.println(pickedTea);
            }
        }
    }

    private static Tea pickRandomTea(ArrayList<Tea> teaList) {
        var randomIndex = Math.random() * teaList.size();
        var pickedTea = teaList.get((int)randomIndex);
        return pickedTea;
    }
}