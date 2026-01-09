public class Rotator {
​
  public Object[] rotate(Object[] data, int n) {
    int length = data.length;
    n = n % length;
    if(n<0) n = n + length;
    
    Object[] result = new Object[length];
    
    for (int i = 0; i<length; i++){
      int newIndex = (i+n) % length;
      result[newIndex] = data[i]; 
    }
    return result;
  }
​
}