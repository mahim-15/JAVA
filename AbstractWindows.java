import java.awt.*;
import java.awt.event.*;

public abstract class AbstractWindows extends Frame {

    public AbstractWindows(String title) {
        super(title);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(new Color(230, 240, 250)); // Light pastel background

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public abstract void setupUI();

    public static void main(String[] args) {
        AbstractWindow window = new AbstractWindow("Enhanced Abstract AWT Window") {
         
            public void setupUI() {
                Label label = new Label("Welcome to AWT!", Label.CENTER);
                label.setBounds(150, 100, 200, 30);
                label.setFont(new Font("Arial", Font.BOLD, 14));
                add(label);

                Button button = new Button("Click Me");
                button.setBounds(180, 200, 120, 40);
                button.setFont(new Font("Arial", Font.PLAIN, 14));
                button.setBackground(new Color(180, 220, 255)); // Light blue button

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label.setText("Button Clicked!");
                    }
                });

                add(button);
            }
        };

        window.setupUI();
        window.setVisible(true);
    }
}
