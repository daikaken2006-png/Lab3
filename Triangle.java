import javax.swing.JOptionPane;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("c:"));

        if (a == 0) {
            if (b == 0)
                JOptionPane.showMessageDialog(null, "No solution");
            else
                JOptionPane.showMessageDialog(null, "x = " + (-c / b));
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\nx2 = " + x2);
        } else if (delta == 0) {
            JOptionPane.showMessageDialog(null, "x = " + (-b / (2 * a)));
        } else {
            JOptionPane.showMessageDialog(null, "No real solution");
        }
    }
}