public class ReverseWords {
    public static void main(String[] args) {
        String str = "Java is very easy";
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        System.out.println(result);
    }
}
