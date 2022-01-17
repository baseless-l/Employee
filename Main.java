import java.util.InputMismatchException;
import javax.swing.JOptionPane;
/**
 * Main Driver Class for abstract Employee and all related classes
 * and interfaces. Assigns one Salesperson and one Executive to an Array and displays
 * each element in the array.
 * 
 *
 * @author Kian R Frawley 
 * @version 11/8/21
 */
public class Main
{
    public static void main(String[] args)
    {
    try{
        Employee[] e = 
        {
            new Salesperson(25,"Beverly","66 David Street",200),
            new Executive("Bill","89 Waver ave", 105000.05),
            
        };
    for( int index = 0; index < e.length; index++)
        {
            JOptionPane.showMessageDialog(null,e[index].toString());
        }
    }
    
    catch (InputMismatchException ex)
    {
      JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    catch (NotPositiveNumberException ex)
    {
      JOptionPane.showMessageDialog(null,ex.getMessage());
    }
 }
}
