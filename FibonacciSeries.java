import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= sc.nextInt();
        int a,b,c;
        a=0;
        b=1;
        if(n==1)
            System.out.print(a);
        else if (n==2) {
            System.out.print(a+" ");
            System.out.println(b);
        }
        else {
            System.out.print(a +" ");
            System.out.print(b+ " ");
            for(int i=3;i<=n;i++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
