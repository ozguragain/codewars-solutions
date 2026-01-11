class TimeUtils {
  public static String convertTime(int timeDiff) {
    long totalHours = timeDiff / 3600;
    long remainingSecs = timeDiff % 3600;
    
    int days = (int) totalHours/24;
    int netHours = (int) totalHours%24;
    int minutes = (int) remainingSecs/60;
    int seconds = (int) remainingSecs%60;
    
    return String.format("%d %d %d %d", days, netHours, minutes, seconds);
    
  } 
}