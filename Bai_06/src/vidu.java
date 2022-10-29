import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
        //giai phuong trinh bac 2 :ax^2+bx+c=0
        double a,b,c,x1,x2,delta;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a=");
        a = scanner.nextDouble();
        System.out.println("nhap b=");
        b = scanner.nextDouble();
        System.out.println("nhap c=");
        c = scanner.nextDouble();
        // xet dk a>0
        delta =Math.pow(b,2)-4*a*c;
        if(a==0){
            System.out.println("nhap so lon hon 0");
        }else if(delta>0){
            x1 = (-b-Math.sqrt(delta))/(2*a);
            x2 = (-b+Math.sqrt(delta))/(2*a);
           System.out.println("phuong trinh co x1="+x1);
           System.out.println("phuong trinh co x2="+x2);
        }else if(delta==0){
            x1 = -b/(2*a);
            System.out.println("phuong trinh co nghiem kep x1=x2="+x1);

        }else{
            System.out.println("phuong trinh vo nghiem");
        }



    }

}
