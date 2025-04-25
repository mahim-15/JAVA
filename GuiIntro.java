import javax.swing.JOptionPane;

public class GuiIntro {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hey " + name +" Welcome!");

        // Fixed spacing and added a space in message
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        // Fixed syntax error: "nullJOptionPane" should just be "JOptionPane"
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
        JOptionPane.showMessageDialog(null, "Your height is: " + height);
        
    }
}
