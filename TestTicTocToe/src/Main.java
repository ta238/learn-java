import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TestTicTocToe ticTacToe=new TestTicTocToe();
        Scanner scanner = new Scanner(System.in);
        System.out.println(ticTacToe);

        while (true) {
            // hiển thị lên màn hình người chơi hiện tại
            System.out.println("Người chơi hiện tại là: " + ticTacToe.getNguoiChoiHienTai());
            // cho người chơi chọn hàng
            System.out.println("Nhập vào hàng muốn chọn [0->2]:");
            int hang = scanner.nextInt();
            System.out.println("Bạn đã chọn hàng: " + hang);

            // cho người chơi chọn cột
            System.out.println("Nhập vào cột muốn chọn [0->2]:");
            int cot = scanner.nextInt();
            System.out.println("Bạn đã chọn cột: " + cot);

            // cho người chơi hiện tại đánh vào vị trí [hang, cot]
            ticTacToe.setSymbol(hang, cot, ticTacToe.nguoiChoiHienTai);
            // hiển thị ra màn hình bàn cờ
            System.out.println(ticTacToe);

            if (ticTacToe.checkWinner(ticTacToe.nguoiChoiHienTai)) {
                // nếu người chơi hiện tại thắng cuộc thì dừng game và trả về người thắng cuộc
                System.out.println("Người thằng cuộc là: " + ticTacToe.getNguoiChoiHienTai());
                return;
            } else {
                // nếu người này đánh xong mà chưa win thì tới lượt người tiếp theo
                ticTacToe.doiNguoiChoi();
            }
        }
    }
}