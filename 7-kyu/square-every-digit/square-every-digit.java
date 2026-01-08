import java.util.LinkedList;
​
public class SquareDigit {
​
  public int squareDigits(int n) {
    LinkedList<Integer> stack = new LinkedList<>();
    if (n == 0) return 0;
    
while (n > 0) {
        stack.push(n % 10);
        n /= 10;
    }
​
    StringBuilder resultStr = new StringBuilder();
    
    for (int digit : stack) {
        int squared = digit * digit; 
        resultStr.append(squared);
    }
​
// convert string to integer back again
    return Integer.parseInt(resultStr.toString());
  }
}