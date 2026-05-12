import javax.swing.JOptionPane;

public class LinearEquation {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("b:"));

        if (a == 0) {
            if (b == 0)
                JOptionPane.showMessageDialog(null, "Infinite solutions");
            else
                JOptionPane.showMessageDialog(null, "No solution");
        } else {
            JOptionPane.showMessageDialog(null, "x = " + (-b / a));
        }
    }
}