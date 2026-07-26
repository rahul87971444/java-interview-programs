public class ReverseWordsOptimized {
    public static void main(String[] args) {
        String str = "Java is Awesome";
        StringBuilder answer = new StringBuilder();
        for(String word : str.split(" ")){
            answer.append(new StringBuilder(word).reverse());
            answer.append(" ");
        }
        System.out.println(answer);

    }

}
