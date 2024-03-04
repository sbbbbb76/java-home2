import java.util.Scanner;
public class JPA05 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        for(int x=1 ; x<=4 ; x++){
            System.out.println("Input:");
            int x1 = a.nextInt();
            if (x1 % 2 == 0 || x1 %3 == 0 || x1 %6 == 0){
                if (x1 % 2 == 0 && x1 % 3 != 0){
                    System.err.println(x1 + "是2的倍數");
                }else if(x1 % 3 == 0 && x1 % 2 != 0){
                    System.err.println(x1 + "是3的倍數");
                }else if(x1 % 3 == 0 && x1 % 2 == 0){
                    System.err.println(x1 + "是2,3,6的倍數");
                }
            }else{
                System.out.println(x1 + "不是2,3,6的倍數");
            }
        }
        
    }
    
}