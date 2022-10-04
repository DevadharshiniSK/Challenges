import java.util.*;
class Fact{
    public int fact(int n){
       int res = 1;
       for(int i=1;i<=n;i++){
        res*=i;
       }
       return res;
    }
}


public class prg2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        Fact f = new Fact();
        double result = (1/Math.pow(2, n)*(f.fact(n)/(f.fact(r)*f.fact(n-r))));
        System.out.println(result);
        sc.close();
    }
    
    
}
