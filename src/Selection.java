import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Selection {

    public static void main(String[] args) {


        int[] massive = new int[100];
        Random random = new Random();

        for (int j = 0; j < massive.length; j++) {


            int min = massive[j];
            int index = j;

            for (int i = j; i < massive.length; i++) {
                massive[j] = random.nextInt(100);

                if (massive[i] < min) {
                    min = massive[i];
                    index = i;
                }

            }
            int temp = massive[j];
            massive[j] = massive[index];
            massive[index] = temp;
        }


        System.out.println(Arrays.toString(massive));


    }


}


//for (int i = 0; i < numb.length; i++) {
//
//            if (numb[i] < min) {
//                min = numb[i];
//            }
