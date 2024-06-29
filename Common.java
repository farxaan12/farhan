package boss;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Common {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 3, 4};
        int[] commonElements = findCommonElements(array1, array2);

        System.out.println(Arrays.toString(commonElements));  // Output: [2, 3]
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        Set<Integer> commonSet = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                commonSet.add(num);
            }
        }

        int[] result = new int[commonSet.size()];
        int i = 0;
        for (int num : commonSet) {
            result[i++] = num;
        }

        return result;
    }
}

