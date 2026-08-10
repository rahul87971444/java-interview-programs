public class ReverseWordsWithoutSplit {
    public static void main(String[] args) {
        String str = "Java is very easy";
        StringBuilder result = new StringBuilder();
        int i = str.length() - 1;
        while (i >= 0) {
            // Skip spaces
            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }
            int end = i;
            // Find beginning of word
            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }
            int start = i + 1;
            result.append(str, start, end + 1);
            result.append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
