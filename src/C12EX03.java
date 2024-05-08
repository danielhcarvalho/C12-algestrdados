
import javax.swing.JOptionPane;

public class C12EX03 
{
    public static void main(String[] args) 
    {
        int num[] = new int[10];
        double quadrado;

        //for para receber um número
        for (int i = 0; i < num.length; i++) 
        {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Informe o " + (i + 1) + "° número",
            "",
            JOptionPane.QUESTION_MESSAGE));
        }

        //for para imprimir o quadrado dos números da array
        for (int i = 0; i < num.length; i++) 
        {
            quadrado = Math.pow(num[i], 2);
            System.out.printf("%.0f", quadrado);
            System.out.println();
        }
        
    }
}
