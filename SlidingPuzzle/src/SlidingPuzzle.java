public class SlidingPuzzle {

    public int[][] board = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    public static int Empty = 0;

    public int[][] getBoard() {
        return this.board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public boolean num(int hang, int cot) {
        if (hang <= 0 || hang >= 2) return false;
        if (cot <= 0 || cot >= 2) return false;
        return true;
    }

    public void sangTrai() {
        int n;
        for (int i = 0; i < board.length; i++) {
            // tại j = 0 thì k sang trái được vì j - 1 sẽ = -1 là số âm board[i][-1] ko hợp lệ
            for (int j = 1; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    n = board[i][j];
                    board[i][j] = board[i][j - 1];
                    board[i][j - 1] = n;
                    return;
                }
            }
        }

    }

    public void sangPhai() {
        int n;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length-1; j++) {
                if (board[i][j] == 0) {
                    n = board[i][j];
                    board[i][j] = board[i][j + 1];
                    board[i][j + 1] = n;
                    return;
                }
            }
        }

    }

    public void lenTren() {
        int n;
        // ô 0 ở hàng 0 (tức là trên cùng) thì ko thể đi lên được nữa, nên i = 1 trở đi
        for (int i = 1; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    n = board[i][j];
                    // sai nhé, chỗ i - 1, chỗ i + 1 loạn lên
                    board[i][j] = board[i - 1][j];
                    board[i - 1][j] = n;
                    return;
                }
            }
        }

    }

    public void xuongDuoi() {
        int n;
        for (int i = 0; i < board.length-1; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // chỗ này sai nhé, phải di chuyển ô có giá trị = 0 chứ sao lại = 1?
                if (board[i][j] == 0) {
                    n = board[i][j];
                    // lỗi chỗ này nhé, boar[i+1] thì lại ghi thành board[i-1]
                    board[i][j] = board[i + 1][j];
                    board[i + 1][j] = n;
                    // tại sao phải thêm return ở đây?
                    // bởi vì nếu ko return (tức là kết thúc hàm luôn) thì câu lệnh for sẽ tiếp tục thực hiện
                    // và khi ô số 0 bị đẩy sang bên ô bên cạnh rồi mà for lại quét tiếp ô bên cạnh thì nó có thể thực hiện
                    // đẩy tiếp ô số 0 đi kết quả là dẫn đến ô số 0 bị đẩy tới cuối cùng
                    // tốt nhất là thực hiện xong nhiệm vụ thì return để tránh rủi ro
                    return;
                }
            }
        }

    }


    @Override
    public String toString() {
        String result = "";
        result += "+....+....+....+\n";
        for (int i = 0; i < 3; i++) {
            result += "|";
            for (int j = 0; j < 3; j++) {
                if (this.board[i][j] == this.Empty) {
                    result += "    ";
                } else if (this.board[i][j] == 1) {
                    result += " 1  ";
                } else if (this.board[i][j] == 2) {
                    result += " 2  ";
                } else if (this.board[i][j] == 3) {
                    result += " 3  ";
                } else if (this.board[i][j] == 4) {
                    result += " 4  ";
                } else if (this.board[i][j] == 5) {
                    result += "  5 ";
                } else if (this.board[i][j] == 6) {
                    result += " 6  ";
                } else if (this.board[i][j] == 7) {
                    result += " 7  ";
                } else if (this.board[i][j] == 8) {
                    result += " 8  ";
                }
                result += "|";
            }
            result += "\n+....+....+....+\n";
        }
        return result;
    }

}
