import java.util.Scanner;

public class Bai4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();

        // Kiểm tra mảng rỗng
        if (size <= 0) {
            System.out.println("Kích thước rỗng");
            return;
        }

        // Tạo mảng và nhập giá trị
        int[] array = new int[size];
        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị mảng ban đầu
        System.out.print("Mảng ban đầu: ");
        printArray(array);

        // Đảo ngược mảng
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }

        // Hiển thị mảng sau khi đảo ngược
        System.out.print("Mảng sau khi đảo ngược: ");
        printArray(array);
    }

    // Hàm in mảng theo dạng [a, b, c]
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
