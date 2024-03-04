import java.util.Scanner;
public class JPA02 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        for(int x=1 ; x<=2 ; x++){
            System.out.println("Input:");
            int x1 = a.nextInt();
            int x2 = a.nextInt();
            if (x>x1){
                System.out.println(x1+" is larger than "+ x2);
            }else{
                System.out.println(x2+" is larger than "+ x1);
            }
        }
        
    }
    
}
