public class StringRotationOptimized {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        boolean isRotation =
                s1.length() == s2.length()
                &&
                (s1 + s1).contains(s2);
        if (isRotation) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}
