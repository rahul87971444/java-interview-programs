import java.util.HashMap;
public class FirstNonRepeatingOptimized {
    public static void main(String[] args) {
        String str = "aabbcdde";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                return;
            }

        }

        System.out.println("No Unique Character");

    }

}
