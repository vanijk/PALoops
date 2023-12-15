import java.util.Scanner;
public class PA_Two_GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two Numbers");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int bigNum = a;
        if(b>a) bigNum = b;

        int gcd = 1;
        for(int i = 1; i <= bigNum;i++){
            if(a%i == 0 && b%i == 0)
                gcd=i;
        }
        System.out.println(gcd);
    }
}
