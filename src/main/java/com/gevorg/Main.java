package com.gevorg;

public class Main {

    public static void main(String[] args) {
        int number = 100;
        System.out.println(solveQuestRewardGenerator(number));
    }


    public static String solveQuestRewardGenerator(int n) {

        StringBuilder stringBuilder = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            double number = (double) i / n;

            if (number > Math.random()) {
                stringBuilder.append('s');
            } else {
                stringBuilder.append('b');
            }
        }

        return stringBuilder.toString();
    }


}
