import java.util.Arrays;

public class LongestCommonPrefixOptimized {

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;

        while(i < first.length() &&
              i < last.length() &&
              first.charAt(i) == last.charAt(i)) {

            i++;

        }

        System.out.println(first.substring(0, i));

    }

}
