import java.util.*;
class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count+=1;
            }
            else if(str.charAt(i)==')'){
                count-=1;
            }
        }
        if(count==0){
            System.out.println("0");
        }
        else{
           System.out.println("1"); 
        }
        sc.close();
    }
}
