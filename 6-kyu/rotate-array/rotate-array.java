public class Rotator {
​
  public Object[] rotate(Object[] data, int n) {
    n = n%(data.length);
    if (data.length == 0) {return data;}
    if (n<0){n=n+data.length;}
    
    Object[] result = new Object[data.length];
    int index = 0;
    for(int i=data.length-n; i<data.length; i++){
      result[index] = data[i];
      index++;
    }
    
    for(int i=0; i<data.length-n;i++){
      result[index] = data[i];
      index++;
    }
    return result;
  }
}