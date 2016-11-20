package groupproject;
/**
 *
 * @author Justin
 */
public class TicTacToe {
    
      char[] board = new char[9];
  
  String determineWinner(String [] values )
  {

      int [][] rows = 
      {
          {0,1,2},
          {3,4,5},
          {6,7,8},
          {0,3,6},
          {1,4,7},
          {2,5,8},
          {0,4,8},
          {2,4,6}
      };
      
      String determine;
      int counter = 0;
      
      for (int i = 0; i < rows.length; i++)
      {
          determine = values[rows[i][0]];
          
          for (int j = 0; j < rows[0].length; j++){
            if (values[rows[i][j]].equals(determine))
            {
              counter++;
            }
            else{}
          }
          if (counter == 3)
          {
              return values[rows[i][0]] + " is the winner!";
          }
          else 
              counter = 0;
      }
     
      return "";
  }
    String chooseSpace(String symbol, String [] values, int place)
  {
      if (values[place].equals(""))
        return symbol;
      else 
          return values[place];
  }
    
    

}
