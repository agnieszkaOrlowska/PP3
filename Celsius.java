import java.util.ArrayList;
import java.util.Scanner;

public class Celsius
{
    public static double meanTemp(){
        double mean=0;
        for(int i=0;i<7;i++){ 
            mean+=i;
            
            
            }
            return mean/7;
       }
   public static void main (String[] args){
       double temp;
       ArrayList arrTemp = new ArrayList();
       
       for(int i=0;i<7;i++){
       Scanner sc = new Scanner(System.in);
       temp = sc.nextDouble();
       arrTemp.add(temp);
       System.out.println(temp);
    
    }
    
    meanTemp();

    System.out.println(arrTemp);
   }
}
