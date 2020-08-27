import java.util.*;
import javax.swing.*;

/*
 *This is to randomly seclect a Nation for HOI4 
 * */

public class RandomNation {
  
  private static String nation;
  private static String nationResult;
  private static int answer;
  private static String[] nationList = {
    "UK", 
    "US",
    "France",
    "Germany",
    "Russia",
    "Romania",
    "Poland",
    "Czechs",
    "Nederland",
    "Italy",
    "Mexico",
    "Hungary",
    "China",
    "India",
    "Japan",
    "South Africa",
    "Canada",
    "Brazil",
    "Venezuela",
    "Finland",
    "Spain",
    "Portugal",
    "Sweeden"
  };
  
  public static void main(String[] args) {
     
    Object[] options1 = {"New country",
      "Quit"};
    
    do{
      
      nation = pickNation( );
      
      JPanel panel = new JPanel();
      
      panel.add(new JLabel("You get to play:"
                             + " " + nation));
      
      answer = JOptionPane.showOptionDialog(null, panel, null,
                                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                                            null, options1, null);
      
    }while(answer == JOptionPane.YES_OPTION);
    
    // requesting JVM for running Garbage Collector 
    System.gc(); 
    
    // requesting JVM for running Garbage Collector 
    Runtime.getRuntime().gc(); 
  }
  
  private static String pickNation( )
  {
    //lists strings
    List<String> strList = Arrays.asList(nationList);
    
    
    //shuffle list
    Collections.shuffle(strList);
    
    
    //random picker
    int rnd = new Random().nextInt(nationList.length);
    
    
    return nationList[rnd];
  }
}