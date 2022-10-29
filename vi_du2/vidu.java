public class vidu {
    public static int check_primes(int x){
        if(x<=1)return 0;
        for(int i = 2;i<=x-1;i++){
            if(x%i==0)return 0;
        }
    }
    return 1;
}
    public static void main(String[]args) {
        int n;
        System.out.println("enter number n=");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int kq = check_primes(n);
        if (kq == 1) {
            System.out.println("is number primes" + n);
        } else {
            System.out.println("no number primes");
        }
    }