import java.util.*;
public class Vowels1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = s;
        s.toLowerCase();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        int k = 0;
        char vowels[] = new char[5];
        for(int j=0;j<s.length();j++) {
            switch(s.charAt(j)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        if(a<=1) {
            vowels[k] = 'a';
            k++;
        }
        if(e<=1) {
            vowels[k] = 'e';
            k++;
        }
        if(i<=1) {
            vowels[k] = 'i';
            k++;
        }
        if(o<=1) {
            vowels[k] = 'o';
            k++;
        }
        if(u<=1) {
            vowels[k] = 'u';
            k++;
        }
        for(int j=0;j<s.length();j++) {
            int cond = 1;
            for(int m=0;m<k;m++) {
                if(s.charAt(j) == vowels[m]) {
                    cond = 0;
                }
            }
            if(cond == 1) {
                System.out.print(s2.charAt(j));
            }
        }
    }
}