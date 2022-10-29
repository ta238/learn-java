import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BocBi bocBi=new BocBi();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("con"+bocBi.soBiCon+"vien bi nhap so bi can nay");
            int NayBi=scanner.nextInt();
            if (NayBi<=0&&NayBi>=10){
                System.out.println("chi dc boc 1-10 vien");
                return;
            }
            if(NayBi> bocBi.soBiCon){
                System.out.println(bocBi.soBiCon);
                return;
            }
            if(bocBi.nayBi(NayBi)){
                System.out.println("ban da boc het bi");
                return;
            }

        }
    }
}