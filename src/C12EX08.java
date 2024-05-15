import javax.swing.JOptionPane;

public class C12EX08 
{
    public static void main(String[] args) 
    {

        int numeros[] = new int[10], soma = 0, qntDivisores = 0;

        //armazena um valor na array numeros e faz a soma de todos os números informados
        for (int i = 0; i < numeros.length; i++) 
        {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Informe um número:",
            "",
            JOptionPane.QUESTION_MESSAGE));

            soma += numeros[i];

        }

        //calcula quantos divisores da soma estão presentes na array numeros 
        for (int i = 0; i < numeros.length; i++) 
        {
            if (numeros[i] != 0 && soma % numeros[i] == 0)
            {
                qntDivisores++;

            }
        }

        if (qntDivisores != 0) 
        {      
            int divisores[] = new int[qntDivisores];
            qntDivisores = 0;

            //armazena os divisores da soma presentes na array numeros em uma array divisores
            for (int i = 0; i < numeros.length; i++) 
            {
                if (numeros[i] != 0 && soma % numeros[i] == 0)
                {
                    divisores[qntDivisores] = numeros[i];
                    qntDivisores++;
     
                }
            }
            //cria uma tabela para imprimir o resultado da soma e seus divisores presentes na array numeros
            System.out.printf("""
            ----------------------------------------
            |   RESULTADO SOMA   |    DIVISORES    |
            ----------------------------------------
            |%20d|%17d|
            ----------------------------------------
            """, soma, divisores[0]);;


            
            for (int i = 1; i < divisores.length; i++) 
            {
                System.out.printf("""
                \t\t     |%17d|
                \t\t     -------------------
                """, divisores[i]);
            }

        } else 
        {
            System.out.println("Nenhum divisor foi informado da soma total foi informado");
        }
        
    }

}
