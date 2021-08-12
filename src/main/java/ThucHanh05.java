public class ThucHanh05 {

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.format("%d, ", arr[i]);
        }
        System.out.println();
    }

    public static boolean isPrimeNumber(int n) {
        boolean result = true;
        if (n <= 1) {
            result = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    result = false;
                }
            }
        }
        return result;
    }

    public static boolean isPrimeArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if ( !isPrimeNumber(arr[i]))
                return false;
        }
        return true;
    }

    public static boolean isAscendingArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1])
                return false;
        }
        return true;
    }

    public static int countDivisible(int[] arr) {
        int count3a = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 4 == 0) && (arr[i] % 5 != 0)) {
                count3a += 1;
            }
        }
        return count3a;
    }

    static int sumPrimeArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
