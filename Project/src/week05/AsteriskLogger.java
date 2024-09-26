package week05;

public class AsteriskLogger implements Logger {

  @Override
  public void log(String str) {
    int length = str.length() + 6;
    
    // print the border
    printAsterisks(length);
    
    // print the string
    System.out.println("***" + str + "***");
    
    // print another border
    printAsterisks(length);
  }

  @Override
  public void error(String error) {
    int length = error.length() + 12;
    
    // print border
    printAsterisks(length);
    
    // print error string
    System.out.println("***Error: " + error + "***");
    
    // print border
    printAsterisks(length);
  }
  
  private static void printAsterisks(int length) {
    for (int i = 0; i <= length; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
  
}
