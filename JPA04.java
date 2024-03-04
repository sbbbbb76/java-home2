import java.util.Scanner;
public class JPA04 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        for(int x=1 ; x<=2 ; x++){
            System.out.println("Input:");
            int x1 = a.nextInt();
            if (x1 % 5 == 0  && x1 % 9 ==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
    }
    
}