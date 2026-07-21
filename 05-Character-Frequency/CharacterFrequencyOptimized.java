import java.util.LinkedHashMap;
public class CharacterFrequencyOptimized {
    public static void main(String[] args) {
        String str = "banana";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        map.forEach((k,v)-> System.out.println(k+" = "+v));

    }

}
