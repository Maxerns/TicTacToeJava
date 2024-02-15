public class Square	  	 	  	         	      	      	   	
{	  	 	  	         	      	      	   	
  private int xpos;	  	 	  	         	      	      	   	
  private int ypos;	  	 	  	         	      	      	   	
  private String player;	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
  public Square(String player, int xpos, int ypos)	  	 	  	         	      	      	   	
  {	  	 	  	         	      	      	   	
    this.player = player;	  	 	  	         	      	      	   	
    this.xpos = xpos;	  	 	  	         	      	      	   	
    this.ypos = ypos;	  	 	  	         	      	      	   	
  }	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
  public Square(int xpos, int ypos, String player)	  	 	  	         	      	      	   	
  {	  	 	  	         	      	      	   	
    this.xpos = xpos;	  	 	  	         	      	      	   	
    this.ypos = ypos;	  	 	  	         	      	      	   	
    this.player = player;	  	 	  	         	      	      	   	
  }	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
  public void setXpos(int xpos)	  	 	  	         	      	      	   	
  {	  	 	  	         	      	      	   	
     this.xpos = xpos;	  	 	  	         	      	      	   	
  }	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
  public int getXpos()	  	 	  	         	      	      	   	
  {	  	 	  	         	      	      	   	
     return this.xpos;	  	 	  	         	      	      	   	
  }	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
  public void setYpos(int ypos)	  	 	  	         	      	      	   	
  {	  	 	  	         	      	      	   	
     this.ypos = ypos;	  	 	  	         	      	      	   	
  }	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
  public int getYpos()	  	 	  	         	      	      	   	
  {	  	 	  	         	      	      	   	
     return this.ypos;	  	 	  	         	      	      	   	
  }	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
  public void setPlayer(String player)	  	 	  	         	      	      	   	
  {	  	 	  	         	      	      	   	
     this.player = player;	  	 	  	         	      	      	   	
  }	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
  public String getPlayer()	  	 	  	         	      	      	   	
  {	  	 	  	         	      	      	   	
     return this.player;	  	 	  	         	      	      	   	
  }	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
	  	 	  	         	      	      	   	
}