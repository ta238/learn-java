public class GameBocBi {
    // ok biến này lưu số bi của từng game nhưng mà để tên hơi sai
    // phải là số bi còn lại, vì số bi ban đầu thì luôn luôn là 20
    // bốc 3 viên thì SỐ BI CÒN LẠI là 17 và SỐ BI BAN ĐẦU vẫn là 20 chứ?
    // cái này là sai cú pháp tiếng việt
    // dùng biến static là sai, biến static chỉ dùng cho những biến dùng chung thôi
    // cái này là thuộc tính của game thì k được dùng static
    // ==> rút kinh nghiệm ko được dùng static bừa bãi
    public int soBiConLai = 20;

    // ok chỗ này đúng nhưng tên biến phải bắt đầu bằng chữ in thường. ko ai để chữ in hoa cả
    public static int nguoiChoiA = 1;
    public static int nguoiChoiB = 2;
    public int nguoiChoiHienTai = nguoiChoiA;

    //dieu kien de thang
    //neu chua thang thi tiep tuc


    // tại sao checkWin lại truyền vào kết quả
    // kết quả này là kết quả gì
    // checkWin là phải kiểm tra xem còn bi hay không, nếu không còn bi thì kết thúc ván và người chơi hiện
    // tại là người thua cuộc (ngược với bên tictactoe)
    // phải là check người chơi thua vì ai bốc cuối là thua mà
    public boolean checkLose(int soBiBoc) {
        // trư số bi trên bàn đi số bi đã bôc
        this.soBiConLai -= soBiBoc;
        // nếu còn 0 viên bi thì người vừa bốc thua
        return this.soBiConLai == 0;
    }

    // ok hàm này đúng rồi, đổi tên lại cho dễ hình dung
    // phải là đổi lượt cho người chơi hiện tại
    public void doiLuot() {
        if (nguoiChoiHienTai == this.nguoiChoiA) {
            nguoiChoiHienTai = this.nguoiChoiB;
        } else {
            nguoiChoiHienTai = this.nguoiChoiA;
        }
    }

    // hàm này là hàm get không phải hàm set
    // hàm set phải là hàm void
    public String getNguoiChoiHienTai() {
        if (nguoiChoiHienTai == this.nguoiChoiA) {
            return "A";
        } else {
            return "B";
        }

    }

}





