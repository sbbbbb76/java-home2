import java.util.Scanner;
public class JPA03 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        for(int x=1 ; x<=2 ; x++){
            System.out.println("Input:");
            int x1 = a.nextInt();
            if (x1 % 2 == 0){
                System.out.println("The number is odd");
            }else{
                System.out.println("The number is even");
            }
        }
        
    }
    
}