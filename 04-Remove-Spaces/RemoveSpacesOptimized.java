public class RemoveSpacesOptimized {
    public static void main(String[] args) {
        String str = "Java Interview Preparation";
        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch != ' '){
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
