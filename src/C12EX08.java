import javax.swing.JOptionPane;

public class C12EX08 
{
    public static void main(String[] args) 
    {
        long num[] = new long[10], soma = 0;
        int qntDivisores = 0;
        boolean unico = true;
        
        //armazena os números informados no array dados
        for (int i = 0; i < num.length; i++) 
        {
            num[i] = Long.parseLong(JOptionPane.showInputDialog(null,
            "Informe um número: ",
            "",
            JOptionPane.QUESTION_MESSAGE));
            soma += num[i];
        }

        System.out.printf("RESULTADO SOMA: %d", soma);
        System.out.println(); 
        System.out.printf("DIVISORES: ");

        for (int i = 0; i < num.length; i++) 
        {                
            if (num[i] != 0 && soma % (i + 1) == 0) 
            {                
                
                for (int j = 0; j < num.length; j++) 
                {
                    if (i != j && num[i] == num[j]) {
                        unico = false;
                        break;
                    }
                }
                

            }          
        }
    }
}
