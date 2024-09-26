package week05;

public class SpacedLogger implements Logger {

  @Override
  public void log(String str) {
    
    // convert string to char array for enhanced for loop in print method
    char[] info = str.toCharArray();
    
    // print the string with spaces
    print(info);
  }

  @Override
  public void error(String error) { 
    
    // convert string for enhanced for loop in print method
    char[] info = error.toCharArray();
    
    // leading string
    System.out.print("ERROR: ");
    
    // print the spaced string
    print(info);
  }
  
  
  /*
   * iterates over the string converted to char array and prints each with a trailing space
   */
  private void print(char[] info) {
    for (char ch : info) {
      System.out.print(ch + " ");
    }
  }
}
