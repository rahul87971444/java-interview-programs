public class StringRotationOptimized {

    public static void main(String[] args) {

        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        System.out.println(
            s1.length()==s2.length() &&
            (s1+s1).contains(s2)
            ? "Rotation"
            : "Not Rotation"
        );

    }

}
