import java.util.*;
public class PerfectNumber {
    boolean divisor(int n,int d){
        return n % d == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PerfectNumber ob= new PerfectNumber();
        int n,sum=0,i;
        System.out.println("Enter a number");
        n= sc.nextInt();
        for(i=1;i<n;i++){
            if(ob.divisor(n,i))
                sum+=i;
        }
        if(sum == n)
            System.out.println("Perfect Number");
        else System.out.println("Not A Perfect Number");
    }
}
