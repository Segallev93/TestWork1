package ua.alevel.TW1;

public class TW1 {
   public static void main(String[] args) {
        int[] array = {1, 4, 5, 1, 1, 3};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
       findMaxUnique(array);
    }

    public static void findMaxUnique(int[] array) {
        int uniqueNumber = array.length;

        for (int i = 1; i < array.length ; i++) {
        if(array[i-1]==array[i]) uniqueNumber--;
        }
        System.out.println("the number of unique numbers in the array is "+uniqueNumber);
    }
}