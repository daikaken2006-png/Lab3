import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
        JOptionPane.showMessageDialog(null, "You chose: " + option);
        System.exit(0);
    }
}