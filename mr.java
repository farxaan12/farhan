package boss;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class mr {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5};
        int[] result = removeDuplicates(input);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int element : array) {
            uniqueElements.add(element);
        }

        int[] uniqueArray = new int[uniqueElements.size()];
        int index = 0;
        for (int element : uniqueElements) {
            uniqueArray[index++] = element;
        }

        return uniqueArray;
    }
}