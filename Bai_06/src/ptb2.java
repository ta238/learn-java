import java.util.Scanner;

public class ptb2 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        float delta;
        float x1;
        float x2;
        Scanner in = new Scanner(System.in);
        System.out.println("nhap a=");
        a = Integer.parseInt(in.nextLine());
        while (a == 0) {
            System.out.println("nhap so khac 0");
            System.out.println("nhap a=");
            a = Integer.parseInt(in.nextLine());
        }
        System.out.println("nhap so b=");
        b = Integer.parseInt(in.nextLine());
        System.out.println("nhap c=");
        c = Integer.parseInt(in.nextLine());
        delta = (float) (Math.pow(b, 2) - 4 * a * c);
        if (delta > 0) {
            x1 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            String s=String.format("x1=%f,x2=%f",x1,x2);
            System.out.println(s);
//            System.out.println("phuong trinh co x1=" + x1);
//            System.out.println("phuong trinh co x2=" + x2);
        } else if (delta == 0){
            x1 = -b / (2 * a);
            System.out.println("phuong trinh co nghiem kep x1=x2=" + x1);

        }else {
            System.out.println("phuong trinh vo nghiem");
        }


    }
}

