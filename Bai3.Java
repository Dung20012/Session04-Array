import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo mảng
        System.out.println("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Kích thước mảng phải lớn hơn 0.");
            return;
        }

        int[] array = new int[size];

        System.out.println("Nhập các phần tử cho mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Giá trị thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sắp xếp mảng theo thứ tự giảm dần (selection sort)
        for (int i = 0; i < size - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Hoán đổi
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }

        // Tính tổng mảng
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        // In mảng đã sắp xếp
        System.out.print("Mảng sau khi sắp xếp theo thứ tự giảm dần: [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
