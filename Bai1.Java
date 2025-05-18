import java.util.Scanner;

public class Bai1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Kích thước mảng phải lớn hơn 0.");
            return;
        }

        int[] array = new int[size];

        // Nhập giá trị cho từng phần tử
        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Giá trị thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sắp xếp mảng bằng thuật toán sắp xếp chọn
        selectionSort(array);

        // Hiển thị mảng sau khi sắp xếp
        System.out.print("Mảng đã sắp xếp theo thứ tự giảm dần: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Phần tử lớn nhất là phần tử đầu tiên sau khi sắp xếp
        System.out.println("Phần tử lớn nhất trong mảng: " + array[0]);

        scanner.close();
    }

    // Hàm sắp xếp chọn (selection sort) giảm dần
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Hoán đổi phần tử lớn nhất với phần tử đầu tiên chưa sắp xếp
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
}
