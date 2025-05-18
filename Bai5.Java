import java.util.Scanner;

public class Bai5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng và cột
        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();

        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();

        // Kiểm tra nếu hàng hoặc cột không hợp lệ
        if (rows <= 0 || cols <= 0) {
            System.out.println("Kích thước mảng không hợp lệ.");
            return;
        }

        // Tạo mảng 2 chiều
        int[][] array = new int[rows][cols];

        // Nhập từng phần tử cho mảng
        System.out.println("Nhập các phần tử cho mảng (theo từng hàng):");
        for (int i = 0; i < rows; i++) {
            System.out.println("Hàng 1 ");
            for (int j = 0; j < cols; j++) {
                System.out.print("Hàng 2 ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Tính tổng chẵn và lẻ
        int tongChan = 0;
        int tongLe = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] % 2 == 0) {
                    tongChan += array[i][j];
                } else {
                    tongLe += array[i][j];
                }
            }
        }

        // In kết quả
        System.out.println("Tổng các số chẵn là: " + tongChan);
        System.out.println("Tổng các số lẻ là: " + tongLe);

    }
}
