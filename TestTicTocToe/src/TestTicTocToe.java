import java.util.Scanner;

public class TestTicTocToe {
    public int[][] board = new int[3][3];
    public static int empty = 0;
    public static int x = 1;
    public static int o = 2;
    public int nguoiChoiHienTai = x;

    public void setBoard(int[][] board) {
        this.board = board;
    }

    // gán lại giá trị trong ô bàn cờ bằng X hoặc O hoặc rỗng
    // row: hàng
    // col: cột
    // symbol: ký tự: empty, O hoặc X (0, 1, 2)
    public void setSymbol(int hang, int cot, int kyTu) {
        this.board[hang][cot] = kyTu;
    }

    // false: nếu tại hang, cot đã điền X hoặc O (tức là ko thể điển được nữa)
    // true: nếu ng lại (tức là có thể điền)
    public boolean checkSymbol(int hang, int cot) {
        if (hang < 0 || hang > 2) return false;
        if (cot < 0 || cot > 2) return false;

        int kyTu = this.board[hang][cot];

        return kyTu != x && kyTu != o;
    }

    // true: nếu người chơi ký tự này win
    // false: nếu chưa win.
    // checkWinner(x) = true tức là người chơi X win
    public boolean checkWinner(int kyTu) {
        if (this.board[0][0] == kyTu && this.board[0][1] == kyTu && this.board[0][2] == kyTu) {
            return true;
        }
        // 7 hang
        if (this.board[1][0] == kyTu && this.board[1][1] == kyTu && this.board[1][2] == kyTu) {
            return true;
        }
        //6 hang
        if (this.board[2][0] == kyTu && this.board[2][1] == kyTu && this.board[2][2] == kyTu) {
            return true;
        }
        //5hang
        if (this.board[0][0] == kyTu && this.board[1][0] == kyTu && this.board[2][0] == kyTu) {
            return true;
        }
        //4hang
        if (this.board[0][1] == kyTu && this.board[1][1] == kyTu && this.board[2][1] == kyTu) {
            return true;
        }
        //3hang
        if (this.board[0][2] == kyTu && this.board[1][2] == kyTu && this.board[2][2] == kyTu) {
            return true;
        }
        //2hang
        if (this.board[0][0] == kyTu && this.board[1][1] == kyTu && this.board[2][2] == kyTu) {
            return true;
        }
        //1
        if (this.board[0][2] == kyTu && this.board[1][1] == kyTu && this.board[2][0] == kyTu) {
            return true;
        }
        return false;

    }

    // gọi hàm này sẽ đổi người chơi sang người khác
    // nếu người chơi x đánh xong thì sẽ tới lượt người chơi o
    // nếu người chơi o đánh xong thì sẽ tới lượt người chơi x
    public void doiNguoiChoi() {
        if (this.nguoiChoiHienTai == x) {
            this.nguoiChoiHienTai = o;
        } else {
            this.nguoiChoiHienTai = x;
        }
    }

    // trả về X nếu ng chơi hiện tại là x
    // trả về O nếu ng chơi hiện tại là o
    public String getNguoiChoiHienTai() {
        if (this.nguoiChoiHienTai == x) {
            return "X";
        } else {
            return "O";
        }
    }

    @Override
    public String toString() {
        String result = "";
        result += "+---+---+---+\n";
        for (int i = 0; i < 3; i++) {
            result += "|";
            for (int j = 0; j < 3; j++) {
                if (this.board[i][j] == this.empty) {
                    result += "   ";
                } else if (this.board[i][j] == this.x) {
                    result += " X ";
                } else if (this.board[i][j] == this.o) {
                    result += " O ";
                }
                result += "|";
            }
            result += "\n+---+---+---+\n";
        }
        return result;
    }
}
