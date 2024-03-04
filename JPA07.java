import java.util.Scanner;
public class JPA07 {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        for(int x=1 ; x<=4 ; x++){
            System.out.print("輸入三個整數: ");
            int a = d.nextInt();
            int b = d.nextInt();
            int c = d.nextInt();
            if (a + b > c && a+ c > b && b + c > a){
                if(a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b){
                    System.out.println("直角三角形");
                }else if((a * a < b * b + c * c && b * b < a * a + c * c )||( c * c < a * a + b * b && a * a < b * b + c * c )||(  b * b < a * a + c * c && c * c < a * a + b * b )){
                    System.out.println("銳角三角形");
                }else{
                    System.out.println("鈍角三角形");
                }
            }else{
                System.out.println("不可構成三角形");
            }
                
            
        }
        
    }
    
}