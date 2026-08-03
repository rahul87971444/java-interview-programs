public class DuplicateCharacters {

    public static void main(String[] args) {

        String str = "programming";

        boolean[] printed = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {

            if (printed[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    count++;
                    printed[j] = true;
                }
            }

            if (count > 1) {

                System.out.println(
                    str.charAt(i) + " = " + count
                );
            }
        }
    }
}
