import java.util.*;
 public class prg1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[][] = new int[10][10];
    int sum=0;
    for (int i=0;i<10;i++){
        for(int j=0;j<10;j++){
            arr[i][j]=sc.nextInt();

            if(i==j){
                sum+=arr[i][j];
            }
        }
    }

    System.out.println(sum);
    sc.close();
 }
}
