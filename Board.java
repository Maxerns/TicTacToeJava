public class Board 
{
  private String[][] grid;
  
  public Board() 
  {
      grid = new String[3][3];
     
      for (int i = 0; i < 3; i++) 
      {
          for (int j = 0; j < 3; j++) 
          {
              grid[i][j] = "";
          }
      }
  }
  
  public String placeMove(Square s) 
  {
      int x = s.getXpos() - 1;
      int y = s.getYpos() - 1;
      grid[x][y] = s.getPlayer();
      
      if (isWinner(s.getPlayer())) 
      {
          return s.getPlayer(); 
      }
      
      if (isBoardFull()) 
      {
          return "stalemate"; 
      }
      return ""; 
  }
  
  public boolean isWinner(String player) 
  {
      
      for (int i = 0; i < 3; i++) 
      {
          if (grid[i][0].equals(player) && grid[i][1].equals(player) && grid[i][2].equals(player)) 
          {
              return true;
          }
      }
      
      for (int j = 0; j < 3; j++) 
      {
          if (grid[0][j].equals(player) && grid[1][j].equals(player) && grid[2][j].equals(player))
           {
              return true;
          }
      }
      
      if (grid[0][0].equals(player) && grid[1][1].equals(player) && grid[2][2].equals(player)) 
      {
          return true;
      }
      if (grid[0][2].equals(player) && grid[1][1].equals(player) && grid[2][0].equals(player)) 
      {
          return true;
      }
      return false;
  }
  
  public boolean isBoardFull() 
  {
      
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) 
          {
              if (grid[i][j].isEmpty()) 
              {
                  return false; 
              }
          }
      }
      return true; 
  }
  
  public void reset() 
  {
      for (int i = 0; i < 3; i++) 
      {
          for (int j = 0; j < 3; j++) 
          {
              grid[i][j] = "";
          }
      }
  }
}
