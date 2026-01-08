import java.util.Set;
import java.util.HashSet;
public class isogram {
    public static boolean  isIsogram(String str) {
      Set<Character> s = new HashSet<>();
      str = str.toLowerCase();
      char[] arr = str.toCharArray();
      for(char c : arr){
        s.add(c);
      }
​
      if (s.size() == str.length()){
        return true;
      }
      else {
        return false;
      }
          
    } 
}