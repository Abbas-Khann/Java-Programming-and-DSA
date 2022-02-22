public class ArrayQ10 {

    public static boolean checkIfPangram(String sentence) {
        boolean [] arr = new boolean [26];
        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 97 ] = true;
        }
        for (int i = 0; i < 26; i++) {
            if(!arr[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }
}
