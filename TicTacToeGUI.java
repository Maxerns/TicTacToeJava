import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeGUI 
{

    private JFrame frame;
    private Board board;
    
    private JPanel boardPanel;
    private JButton[][] squares;

    private JPanel statusBar;
    private JLabel status;

    private boolean isWhoseTurn; 

    public TicTacToeGUI() 
    {

        
        frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        statusBar = new JPanel();
        status = new JLabel("X's Turn");

        boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(3,3));

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Game");
        JMenuItem newGame = new JMenuItem("New Game");
        JMenuItem quit = new JMenuItem("Quit");
    
        menu.add(newGame);
        menu.add(quit);
        menuBar.add(menu);
        
        board = new Board();

        squares = new JButton[3][3];
        for(int i=0; i<3; i++) 
        {
            for(int j=0; j<3; j++)
            {
                squares[i][j] = new GameButton();
                boardPanel.add(squares[i][j]);

                int finalI = i;
                int finalJ = j;

                squares[i][j].addActionListener(new ActionListener() 
                {
                    @Override
                    public void actionPerformed(ActionEvent e) 
                    {
                        JButton clickedButton = (JButton)e.getSource();

                        Square s;
                        if(isWhoseTurn) 
                        {
                            s = new Square("X", finalI + 1, finalJ + 1); 
                        }
                        else 
                        {
                            s = new Square("O", finalI + 1, finalJ + 1);
                        }
                    
                         String result = board.placeMove(s);
                    
                        updateBoard(s);

                      
                        if(board.isWinner("X")) 
                        {
                            status.setText("X wins!");
                            disableButtons();
                        }
                        else if(board.isWinner("O")) 
                        {
                            status.setText("O wins!");
                            disableButtons();
                        }
                        else if(board.isBoardFull()) 
                        {
                            status.setText("It's a draw!");  
                            disableButtons();
                        }
                        else 
                        {
                            
                            isWhoseTurn = !isWhoseTurn;
                            if(isWhoseTurn) 
                            {
                                status.setText("X's Turn");
                            }
                            else 
                            {
                                status.setText("O's Turn");
                            }
                        }
                        clickedButton.setEnabled(false);
                    }
                });
            }
        }

        newGame.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                resetBoard(); 
            }
        });

        quit.addActionListener(new ActionListener() 
        {
           public void actionPerformed(ActionEvent e)
           {
             System.exit(0);
           }    
        });
        
        frame.setLayout(new BorderLayout());

        frame.add(boardPanel, BorderLayout.CENTER);
        frame.add(statusBar, BorderLayout.SOUTH);
        statusBar.add(status);
        frame.setJMenuBar(menuBar);

        // Initialize the turn randomly at the start
        isWhoseTurn = (int)(Math.random() * 2) == 0;

        // Update status label accordingly
        if(isWhoseTurn) 
        {
            status.setText("X's Turn");
        } else 
        {
            status.setText("O's Turn");
        }

        frame.setVisible(true);
    }

    public void updateBoard(Square s) 
    {

        int x = s.getYpos()-1;
        int y = s.getXpos()-1;
    
        String player = s.getPlayer();
            
        if(player.equals("X")) 
        {
            squares[y][x].setText("X"); 
            squares[y][x].setForeground(Color.RED);
        }
        else if (player.equals("O")) 
        {
            squares[y][x].setText("O");
            squares[y][x].setForeground(Color.BLUE);
        }
    }

    public void disableButtons()
     {
        for (int i=0; i<3; i++) 
        {
            for (int j=0; j<3; j++) 
            {
                squares[i][j].setEnabled(false);
            }
        }
    }

    public void reset() 
    {
        for(int i=0; i<3; i++)
        {
           for(int j=0; j<3; j++)
           {
               squares[i][j].setEnabled(true);
               squares[i][j].setText("");
           }
        }
    }

    public void resetBoard() 
    {
        reset(); 
        board.reset(); 
      

        
        isWhoseTurn = (int)(Math.random() * 2) == 0;

        
        if(isWhoseTurn) 
        {
            status.setText("X's Turn");
        } else 
        {
            status.setText("O's Turn");
        }
    }

}
