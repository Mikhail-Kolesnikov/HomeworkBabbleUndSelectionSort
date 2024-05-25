import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Selection {

    public static void main(String[] args) {
        int[]massive= new int[100];
        Random random= new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i]= random.nextInt(100);
        }
        System.out.println("Исходный элемент"+ Arrays.toString(massive));




        System.out.println("Отсортированный массив"+ Arrays.toString(massive));

    }
}

//for (int i = 0; i < numb.length; i++) {
//
//            if (numb[i] < min) {
//                min = numb[i];
//            }
