import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.UIManager;

class GameButton extends JButton {
    private char symbol;

    public GameButton() {
        setPreferredSize(new Dimension(100, 100));
        setFont(new Font("Arial", Font.BOLD, 40));
        
        // Add mouse listener to handle hover effects
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Color.white); // Change background color on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(UIManager.getColor("Button.background")); // Restore original background color
            }
        });
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
        repaint(); // Redraw the button to update its appearance
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (symbol == 'X') {
            // Draw X symbol
            g.drawLine(10, 10, getWidth() - 10, getHeight() - 10);
            g.drawLine(getWidth() - 10, 10, 10, getHeight() - 10);
        } else if (symbol == 'O') {
            // Draw O symbol
            g.drawOval(10, 10, getWidth() - 20, getHeight() - 20);
        }
    }
}
