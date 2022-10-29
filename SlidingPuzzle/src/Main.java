import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SlidingPuzzle s = new SlidingPuzzle();
        Scanner scanner = new Scanner(System.in);

        System.out.println(s);
        while (true) {
            System.out.println("chon cac lua chon sau day:");
            System.out.println("1. sang trai");
            System.out.println("2. sang phai");
            System.out.println("3. len tren");
            System.out.println("4. xuong duoi");
            int nguoichoichon = scanner.nextInt();
            if (nguoichoichon == 1) {
                s.sangTrai();
            } else if (nguoichoichon == 2) {
                s.sangPhai();
            } else if (nguoichoichon == 3) {
                s.lenTren();
            } else if (nguoichoichon == 4) {
                // đang bị lỗi xuống dưới k xuống
                s.xuongDuoi();
            }
            System.out.println(s);

        }


    }
}