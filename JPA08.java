import java.util.Scanner;
public class JPA08 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        for(int x=1 ; x<=5 ; x++){
            System.out.println("Input:");
            int x1 = a.nextInt();
            if (x1 >=90){
                System.out.println("Your grade is A");
            }else if (90 > x1 && x1 >=80){
                System.out.println("Your grade is B");
            }else if (80 > x1 && x1 >=70){
                System.out.println("Your grade is C");
            }else if (70 > x1 && x1 >=60){
                System.out.println("Your grade is D");
            }else if (60 > x1 ){
                System.out.println("Your grade is F");
            }

        
    }
    

}}
