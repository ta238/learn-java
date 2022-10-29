import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTocToe tic = new TicTocToe();
        System.out.println(tic);

        Scanner scanner=new Scanner(System.in);
        while (true){
           System.out.println("nguoi choi hien tai:"+tic.nguoiChoiHienTai());
           // yeu cau nhap hang 0-2
            int hang= scanner.nextInt();
            System.out.println(hang);
            // nguoi choi nhap cot
            System.out.println("nhap cot 0-2");
            int cot= scanner.nextInt();
            System.out.println(cot);
            // nguoi choi hien tai danh vi tri hang cot0-2
            tic.setSymbol(hang,cot,tic.nguoiChoiHienTai);
            //hien thi ra ban co
            System.out.println(tic);
            if(tic.checkWinner(tic.nguoiChoiHienTai)){
                System.out.println("nguoi thang cuoc"+tic.nguoiChoiHienTai());
                return;
            }else{
                tic.nguoiChoi();
            }
        }

    }
}
