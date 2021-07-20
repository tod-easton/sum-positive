package org.easton;

public class SumOfPositivesCLI {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        if (args.length == 0) {
            System.out.println("0");
            System.exit(1);
        }
        int calSum = 0;
        for (int i = 0; i < args.length; i++) {
            int curInd = Integer.parseInt(args[i]);
            if (curInd > 0) {
                calSum += curInd;
            }
        }

        System.out.println(calSum);
    }
}
