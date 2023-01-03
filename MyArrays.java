public class MyArrays
{
    public int even(int[] array) {
        int counter = 0;
        
        for (int i =0; i<array.length; i++){
            if(array[i]%2==0) {
                counter++;
            }
        }
        return counter;
    }
    
    public int positiveOdd(int[] array) {
        int counter = 0;
        
        for (int i=0; i<array.length; i++){
            if(array[i]%2==1 && array[i]>0) {
                counter++;
            }
        }
        
        return counter;
    }
    
    public static int maxValue(int[] array) {
        int counter = 0;
        
        for (int i=0; i<array.length-1; i++) {
            if (array[i+1]>array[i]) {
                counter = array[i];
            }
        }
        
        return counter;
    }
    
    public static void main(String[] args) {
        int[] randomNum1 = {1,2,3,4,5,6};
        int[] randomNum2 = {-1,-2,-3,-4,-5,-6};
        System.out.println(MyArrays.maxValue(randomNum2));
        
    }
}
