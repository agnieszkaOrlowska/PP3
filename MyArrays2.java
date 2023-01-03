
public class MyArrays2
{
    public static int max(int[] array){
        int marker= array[0];
        
        for(int i=0;i<array.length;i++){
            if(marker<array[i]){
                marker=array[i];
            }
        }
        return marker;
    }
    
    public static int odd(int[] array){
       int counter=0;
       for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                counter+=1;
            }
        }
        return counter;
        
    }
   
}
