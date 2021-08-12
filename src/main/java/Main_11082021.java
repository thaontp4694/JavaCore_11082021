import java.util.Scanner;

public class Main_11082021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bài 2b");
        int n2b;
        do {
            System.out.print("Input n > 0: ");
            n2b = scanner.nextInt();
        } while (n2b <= 0);
        int[] arr2b = new int[n2b];
        for (int i = 0; i < n2b; i++) {
            System.out.format("a[%d] = ", i);
            arr2b[i] = scanner.nextInt();
        }
        ThucHanh05.printArray(arr2b);

        boolean checkPrimeArr = ThucHanh05.isPrimeArr(arr2b);
        if (checkPrimeArr) {
            System.out.println("Là mảng toàn số nguyên tố");
        } else {
            System.out.println("Mảng KHÔNG chứa toàn số nguyên tố");
        }

        System.out.println("Bài 2c");
        int n2c;
        do {
            System.out.print("Input n > 0: ");
            n2c = scanner.nextInt();
        } while (n2c <= 0);
        int[] arr2c = new int[n2c];
        for (int i = 0; i < n2c; i++) {
            System.out.format("a[%d] = ", i);
            arr2c[i] = scanner.nextInt();
        }
        ThucHanh05.printArray(arr2c);
        boolean isAscending = ThucHanh05.isAscendingArray(arr2c);
        if (isAscending) {
            System.out.println("Mảng tăng dần");
        } else {
            System.out.println("Mảng KHÔNG tăng dần");
        }

        System.out.println("Bài 3a");
        int n3a;
        do {
            System.out.print("Input n > 0: ");
            n3a = scanner.nextInt();
        } while (n3a <= 0);
        int[] arr3a = new int[n3a];
        for (int i = 0; i < n3a; i++) {
            System.out.format("a[%d] = ", i);
            arr3a[i] = scanner.nextInt();
        }
        ThucHanh05.printArray(arr3a);
        int count = ThucHanh05.countDivisible(arr3a);
        System.out.format("Có %d số chia hết cho 4 nhưng không chia hết cho 5\n", count);

        System.out.println("Bài 3b");
        int n3b;
        do {
            System.out.print("Input n > 0: ");
            n3b = scanner.nextInt();
        } while (n3b <= 0);
        int[] arr3b = new int[n3b];
        for (int i = 0; i < n3b; i++) {
            System.out.format("a[%d] = ", i);
            arr3b[i] = scanner.nextInt();
        }
        ThucHanh05.printArray(arr3b);
        int sum = ThucHanh05.sumPrimeArr(arr3b);
        System.out.format("Tổng các số nguyên tố trong mảng là %d",sum);
    }

}

