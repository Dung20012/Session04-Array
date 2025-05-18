import java.util.Scanner;

public class Bai6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // Nhập kích thước mảng
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Nhập giá trị mảng
        System.out.println("Nhập các phần tử cho mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sắp xếp mảng theo thứ tự giảm dần bằng sắp xếp chọn
        selectionSortDescending(array);

        // Hiển thị mảng đã sắp xếp
        System.out.println("\nMảng sau khi sắp xếp giảm dần:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Nhập số cần tìm
        System.out.print("\nNhập số cần tìm: ");
        int target = scanner.nextInt();

        // Tìm kiếm tuyến tính
        int linearIndex = linearSearch(array, target);

        // Tìm kiếm nhị phân (mảng giảm dần)
        int binaryIndex = binarySearchDescending(array, target);

        // Kết quả
        System.out.println("\nKết quả tìm kiếm:");

        if (linearIndex != -1) {
            System.out.println(" - Tìm kiếm tuyến tính: Phần tử  " + linearIndex + "tìm thấy tại chỉ so: " + linearIndex);
        } else {
            System.out.println(" - Tìm kiếm tuyến tính: Không tìm thấy");
        }

        if (binaryIndex != -1) {
            System.out.println(" - Tìm kiếm nhị phân: Phần tử " + binaryIndex + " tìm thấy tại chỉ số: " + binaryIndex);
        } else {
            System.out.println(" - Tìm kiếm nhị phân: Không tìm thấy");
        }

        scanner.close();
    }

    // Hàm sắp xếp chọn giảm dần
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Hoán đổi
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
    }

    // Tìm kiếm tuyến tính
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Tìm kiếm nhị phân trong mảng giảm dần
    public static int binarySearchDescending(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) {
                right = mid - 1; // vì mảng giảm dần
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
