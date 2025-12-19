import javax.swing.JOptionPane;
public class Tri {
public static void main(String[] args) {
    
    //Getting the base and height measurement of the triangle in centimeter
    String baseInput = JOptionPane.showInputDialog(null, "Enter the base measurement in centimeter: ", "Triangle Input", JOptionPane.QUESTION_MESSAGE);
    String heightInput = JOptionPane.showInputDialog(null, "Enter the height mesurement in centimeter: ", "Triangle Input", JOptionPane.QUESTION_MESSAGE);

    //Convert String to double
    double base = Double.parseDouble(baseInput);
    double height = Double.parseDouble(heightInput);

    //Formula in finding the area of the triangle
    double area = 0.5 * base * height;

    //Printing the result of the area of the triangle
    JOptionPane.showMessageDialog(null, "The area of the trieangel is: " + area + " square centimeter", "Triangle Result", JOptionPane.INFORMATION_MESSAGE);
}
}