import java.util.HashSet;
public class RemoveDuplicatesOptimized {
    public static void main(String[] args) {
        String str = "programming";
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}
