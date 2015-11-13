/**
 * @author
 *
 */

public class DirectlyInsertSort {

    public int[] directlyInsertSort(int[] origin) {

        if (null == origin || 1 == origin.length) return null;

        int size = origin.length;
        //int[] result = new int [size];

        //result[0] = origin[0];
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (origin[i] >= origin[j]) {
                    if (j == i - 1) {
                        //result[j + 1] = origin[i];
                        break;
                    } else {
                        continue;
                    }
                } else {
                    int temp = origin[i];
                    for (int k = i; k > j ; k--) {
                        origin[k]= origin[k - 1];
                    }
                        
                    origin[j] = temp;
                    break;
                }
            }
        }

        return origin;

    }

    public static void main(String[] args) {

        DirectlyInsertSort dis = new DirectlyInsertSort();

        int input[] = {10,3,5,2,4,6,9,7};
        int result[] = dis.directlyInsertSort(input);
        for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));
        }
    }

}
