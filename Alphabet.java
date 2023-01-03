public class Alphabet
{
    static boolean isAlphabet(String t) {
        String alphabet = "abcdefghijklmnoprstuwqyz";
        char[] chars = t.toCharArray();
        
        for(int i = 0; i<chars.length-1; i++) {
            if(chars[i+1] > chars[i]) {
            }
            else {
                return false;
            }
        }   
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("abcdefghj"));
        System.out.println(Alphabet.isAlphabet("azbcdefghj"));

    }
}
