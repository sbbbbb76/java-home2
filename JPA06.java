import java.util.Scanner;
public class JPA06 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        for(int x=1 ; x<=4 ; x++){
            System.out.print("Input Chinese score: ");
            int x1 = a.nextInt();
            System.out.print("Input English score: ");
            int x2 = a.nextInt();
            System.out.print("Input Math score: ");
            int x3 = a.nextInt();
            if (x1 >= 60 && x2 >= 60 && x3 >=60){
                System.out.println("ALL pass");
            }else if (x1 <60 || x2 <60 || x3 <60){
                if (x1 <60){
                    System.out.println("Chinese failed");
                }
                if (x2 <60){
                    System.out.println("English failed");
                }
                if (x3 <60){
                    System.out.println("Math failed");
                }
                
            }
            
            
        }
        
    }
    
}