import javax.swing.JOptionPane;

public class App 
{
    public static void main(String[] args)
    {
        int num[] = new int[10], qntPares = 0, numPares[] = new int[qntPares];

        for (int i = 0; i < num.length; i++) 
        {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Informe o número " + i + 1 + ": ",
            "",
            JOptionPane.QUESTION_MESSAGE));
            
        }
        for (int i = 0; i < num.length; i++) 
        {
            if (num[i] % 2 == 0)
            {
                
            }
        }

        
    }
}
