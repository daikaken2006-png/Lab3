import javax.swing.JOptionPane;

public class CalculateDouble {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first number:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second number:"));

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;

        String result = "Sum: " + sum +
                        "\nDifference: " + diff +
                        "\nProduct: " + prod;

        if (num2 != 0) {
            result += "\nQuotient: " + (num1 / num2);
        } else {
            result += "\nCannot divide by zero!";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}