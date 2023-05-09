import java.util.*;

public class square {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n>0){
            int sum=0;
            while(n!=0){
                sum+=n*n;
                n--;
            }
            System.out.println("The total no. of square matrix is:"+sum);
        }
        else{
            System.out.println("The total no. of square matrix is: 0");
        }
    }
}
