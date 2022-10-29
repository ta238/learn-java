import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameBocBi game = new GameBocBi();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //ngoi choi hien tai
            // người chơi hiện tại phải in ra là: lượt người chơi A hoặc lượt người chơi B
            // nếu làm như này thì sẽ in ra là: nguoi choi hien tai la 1 hoặc nguoi choi hien tai la 0
            // không ai biết 1 và 0 là gì cả
            // tại sao luôn là lượt người chơi A, ô viết như này là sai rồi
            // phải in ra lượt của ng chơi nào chứ, lúc nào cũng là lượt của người chơi A là sai
            System.out.println("den luot nguoi choi " + game.getNguoiChoiHienTai());
            //cho nguoi choi chon nay bao nhieu bi
            System.out.println("con " + game.soBiConLai + " vien bi, vui long lua chon so bi muon boc:");

            // chỗ này cho người chơi bốc bi
            int layBi = scanner.nextInt();
            // kiểm tra số bi người chơi bốc có từ 1 tới 5 viên không, nếu không thì dừng chương trình vào thông báo
            // cho ng chơi
            if (layBi <= 0 || layBi > 5) {
                System.out.println("so bi can lay phai tu 1 toi 5 vien");
                return;
            }
            // nếu số bi bốc ra mà nhiều hơn số bi đang có trên bàn thì k cho bốc
            // ví dụ trên bàn còn có 3 viên bi, nhưng người chơi bốc 4 viên (vẫn thỏa mãn từ 1 tới 5) nhưng k hợp lệ
            // vì chỉ còn 3 viên thì k thể bốc nhiều hơn
            if (layBi > game.soBiConLai) {
                System.out.println("khong duoc boc nhieu hon " + game.soBiConLai + " vien bi");
                return;
            }

            // nếu người chơi hiện tại thua thì hiện lên bạn đã thua cuộc
            if (game.checkLose(layBi)) {
                // tại sao lại in ra màn hình checkWin, checkWin nó trả về true và false thì in ra true false để làm gì
                // người dùng họ ko biết true là gì và false là gì
                // số 1 truyền vào để làm gì?
                // chỗ này phải in ra là: người chơi thắng cuộc là A hoặc người chơi thằng cuộc là B
                System.out.println("ban da thua cuoc!");
                return;
            } else {
                game.doiLuot();
            }
        }
    }

}