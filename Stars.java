public class Stars
{
    public static String start(int n) {
        String star = "*";
        String container = "";
        
        for(int i = 1; i<n; i++) {
            container += star.repeat(i);
            container += "\n";
        }
        
        return container;
    }
    
    public static void main(String[] args) {
        System.out.println(Stars.start(6));
    }
}