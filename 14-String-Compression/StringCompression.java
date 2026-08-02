public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbccccd";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            result = result + str.charAt(i) + count;
        }
        System.out.println(result);
    }
}
