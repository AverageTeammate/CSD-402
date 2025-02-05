// Jacob Cannamela
// CSD 402
//2.5.2025
// module 4 assignment redo

public class cannamelamod4 {

    // Method to calculate average for short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate average for int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average for long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average for double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Testing short array
        short[] shortArray = {100, 35, 77};
        System.out.println("Short Array: " + java.util.Arrays.toString(shortArray));
        System.out.println("Average (short): " + average(shortArray));

        // Testing int array
        int[] intArray = {4, 8, 44, 67};
        System.out.println("Int Array: " + java.util.Arrays.toString(intArray));
        System.out.println("Average (int): " + average(intArray));

        // Testing long array
        long[] longArray = {111L, 332L, 487L, 694L, 876L};
        System.out.println("Long Array: " + java.util.Arrays.toString(longArray));
        System.out.println("Average (long): " + average(longArray));

        // Testing double array
        double[] doubleArray = {3, 5, 7, 9, 10, 18};
        System.out.println("Double Array: " + java.util.Arrays.toString(doubleArray));
        System.out.println("Average (double): " + average(doubleArray));
    }
}
