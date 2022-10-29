import java.util.Scanner;

public class BocBi {
    public int soBiCon=100;
    public static int nguoiChoi=1;
    public int nguoiChoiHienTai=nguoiChoi;
    public boolean nayBi(int nayBi) {
        soBiCon -= nayBi;
        return soBiCon==0;
    }

}
