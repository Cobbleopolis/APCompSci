import java.util.*;   // for Arrays class

public class ReferenceMystery1 {
    static int b[] = {1, 2, 3, 4, 5};
    static int i,j,temp;

    public static void main(String[] args) {
        for(i = 0; i < b.length; i++){
            j = b.length - 1 - i;
            temp = b[i]; b[i] = b[j]; b[j] = temp;
        }
        for(int k : b){
            System.out.println(k);
        }
    }
}