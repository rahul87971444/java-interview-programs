public class StringCompressionOptimized {
    public static void main(String[] args) {
        String str = "aaabbccccd";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length()
                    && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }
        System.out.println(result);
    }
}
