public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        if (s1.length() != s2.length()) {
            System.out.println("Not Rotation");
            return;
        }
        boolean isRotation = false;
        for (int i = 0; i < s1.length(); i++) {
            String rotated =
                    s1.substring(i) + s1.substring(0, i);
            if (rotated.equals(s2)) {
                isRotation = true;
                break;
            }
        }
        if (isRotation) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}
