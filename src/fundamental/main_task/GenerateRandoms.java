package fundamental.main_task;

import java.util.Random;

public class GenerateRandoms {
    public static void main(String[] args) {

        String str = args[0];

        int counter = Integer.parseInt(str);

        Random rnum = new Random();
        int[] randomArr = new int[counter];

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = rnum.nextInt(0, 100);
        }
        for (int i = 0; i < randomArr.length; i++) {
            System.out.print(randomArr[i] + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < randomArr.length; i++) {
            System.out.println(randomArr[i]);
        }
    }
}
