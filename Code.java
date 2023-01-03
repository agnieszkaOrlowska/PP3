import java.util.*;
import java.io.*;
import java.lang.*;


public class Code
{
    public static void main(){
    int counter=0;
    while( counter<6){
    Random random = new Random();
    int code = random.nextInt(900) + 100;
    System.out.println("Secret code: "+code);
    Scanner sc = new Scanner(System.in);
    int guess = sc.nextInt();
    System.out.println("Your guess: "+guess);
    if(code==guess){
        System.out.println("Win");
        break;
    }
    else{
    int[] arrCode = new int[3];
    for( int i=0; i<3;i++){
        int digit=code%10;
        arrCode[2-i]=digit;
        code=code/10;
    }
    int[] arrGuess = new int[3];
        for( int i=0; i<3;i++){
        int digit=guess%10;
        arrGuess[2-i]=digit;
        guess=guess/10;
    }
    int marker=0;
    int sum=0;
    for( int i=0; i<3; i++){

        if(arrCode[i]==arrGuess[i]){
            marker+=1;
            sum+=arrCode[i];
        }
    }
    System.out.println("Trafione cyfry: " + marker+ ", ich suma to: "+ sum);
    
    counter+=1;
}

        
    }
}
}
