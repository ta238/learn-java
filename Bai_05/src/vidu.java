import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri a=");
        a = scanner.nextDouble();
        System.out.println("nhap gia tri b=");
        b = scanner.nextDouble();
        // ham tri tuyet doi
        System.out.println("|a|="+Math.abs(a));
        // tim min
        System.out.println("min(a,b)="+Math.min(a,b));
        // tim max
        System.out.println("max(a,b)="+Math.max(a,b));
        //a^b
        System.out.println("a^b="+Math.pow(a,b));
    }
}
