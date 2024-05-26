import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.Random;

public class Bubble {
    public static void main(String[] args) {
        int[] massive = new int[100];
        Random random = new Random();
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(100);
        }
        System.out.println("Обычный массив" + Arrays.toString(massive));
//        for (int i = 0; i < massive.length - 1; i++) {
//            for (int j = 0; j < massive.length - 1; j++) {
//                if (massive[j] > massive[j + 1]) {
//                    int buffer;
//                    buffer = massive[j];
//                    massive[j] = massive[j + 1];
//                    massive[j + 1] = buffer;
//                }
//            }
//        }
//        System.out.println("Отсортированный массив" + Arrays.toString(massive));

//        int[] mass = new int[100];
//        Random random1 = new Random();
//        boolean sort = false;
//        while (!sort) {
//            sort = true;
        for (int i = 0; i < massive.length - 1; i++) {
            boolean sort = false;
            for (int j = 0; j < massive.length - 1; j++) {

                int buffer;
                if (massive[j] > massive[j + 1]) {
//                        sort = false;
                    buffer = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = buffer;
                    sort = true;
                }
            }
            if (!sort) {
                break;
            }
        }
        System.out.println("Отсортированный массив" + Arrays.toString(massive));
    }


}






