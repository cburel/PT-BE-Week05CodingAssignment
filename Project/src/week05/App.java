package week05;

public class App {

  public static void main(String[] args) {
    // instantiate loggers
    Logger asteriskLogger = new AsteriskLogger();
    Logger spacedLogger = new SpacedLogger();
    
    // test the asterisk logger
    asteriskLogger.log("Hello");
    asteriskLogger.error("Hello");
    
    // test the spaced logger
    spacedLogger.log("Hello");
    System.out.println();
    spacedLogger.error("Hello");
    
  }

}
