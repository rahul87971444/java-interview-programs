public class FinalizeExample {

    /*
    @Override
    protected void finalize() throws Throwable {

        System.out.println("finalize() called");

    }
    */

    public static void main(String[] args) {

        System.out.println(
            "finalize() is deprecated and should not be used."
        );
    }
}
