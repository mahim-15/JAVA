import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Associated class for UI components
class swingUI {
    private JFrame frame;
    private JLabel label;
    private JButton button;

    // Constructor initializes UI components
    public swingUI(String title) {
        frame = new JFrame(title);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().setBackground(new Color(240, 230, 250)); // Light pastel color

        label = new JLabel("Welcome to Swing!");
        label.setFont(new Font("Arial", Font.BOLD, 14));
        
        button = new JButton("Click Me");
        button.setBackground(new Color(180, 220, 255));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You clicked the button! ✨");
            }
        });

        frame.add(label);
        frame.add(button);
    }

    public void showWindow() {
        frame.setVisible(true);
    }
}

// Main class using Association
public class swingWindow {
    public static void main(String[] args) {
        swingUI ui = new swingUI(" Swing UI");
        ui.showWindow();
    }
}
