import javax.swing.*;
import java.awt.*;

class BaseWindow extends JFrame {

    public BaseWindow(String title) {
        super(title);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    public void setupUI() {
        // This method can be overridden by subclasses
    }
}

class CustomWindow extends BaseWindow {

    public CustomWindow() {
        super("Swing Inheritance Example");
    }

    //@Override
    public void setupUI() {
        JLabel label = new JLabel("Hello, Swing with Inheritance!");
        JButton button = new JButton("Click Me");

        add(label);
        add(button);
    }
}

public class SwingInheritanceExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CustomWindow window = new CustomWindow();
            window.setupUI();
            window.setVisible(true);
        });
    }
}
