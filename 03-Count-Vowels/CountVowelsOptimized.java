public class CountVowelsOptimized {
    public static void main(String[] args) {
        String str = "Education".toLowerCase();
        int count = 0;
        for(char ch : str.toCharArray()){
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        System.out.println(count);

    }
}
