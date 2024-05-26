import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Selection {

    public static void main(String[] args) {


        int[] massive = new int[100];
        Random random = new Random();
        int count =0;
        long before = System.nanoTime();

        for (int j = 0; j < massive.length; j++) {


            int min = massive[j];
            int index = j;

            for (int i = j; i < massive.length; i++) {
                massive[i] = random.nextInt(100);
                count++;

                if (massive[i] < min) {
                    min = massive[j];
                    index = i;
                }

            }
            int temp = massive[j];
            massive[j] = massive[index];
            massive[index] = temp;
        }
        long after = System.nanoTime();


        System.out.println(Arrays.toString(massive));
        System.out.println(count);
        System.out.println(after-before);


    }


}


//for (int i = 0; i < numb.length; i++) {
//
//            if (numb[i] < min) {
//                min = numb[i];
//            }
