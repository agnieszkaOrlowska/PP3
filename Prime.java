
public class Prime
{
    static int natural;
    
    public static void main(String[] args){
        checker(7);
    }
    
    public static int checker(int natural){
        boolean isNotPrime=false;
        if(natural>1 && natural<100){
            for( int i=2; i<natural; i++){
                if(natural%i==0){
                    isNotPrime = true;
                    break;
                }
            }
             if (isNotPrime==true){
            System.out.println(natural+" is not prime");
        }
        else{
            System.out.println(natural+" is prime");
        }
        }
       
        return checker(natural+1);
    }
}
