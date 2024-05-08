import java.util.ArrayList;
import javax.swing.JOptionPane;

public class C12EX01 
{
    public static void main(String[] args)
    {
        int num[] = new int[10];
        //array para armazenar os números divisíveis por 5 e 7
        ArrayList<Integer> numSelecionados = new ArrayList<>();

        for (int i = 0; i < num.length; i++) 
        {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Informe o número " + (i + 1) + ": ",
            "",
            JOptionPane.QUESTION_MESSAGE));
            
            //Verifica se o número é diferente de 0 e divisíveis por 5 e 7
            if (num[i] != 0 && num[i] % 5 == 0 && num[i] % 7 == 0) 
            {
                numSelecionados.add(num[i]); 

            }
        }  
              
        //verifica se ArrayList está vazia
        if (!numSelecionados.isEmpty())
        {
            System.out.printf("Foram digitados %d números divisíveis por 5 e 7:\n", numSelecionados.size());
            for (int i = 0; i < numSelecionados.size(); i++) 
            {                    
                System.out.printf("%d", numSelecionados.get(i));

                if (i < numSelecionados.size() - 1) 
                {
                    System.out.printf(" -- ");

                }
            }
        
        } else
        {
            System.out.println("Não foi digitado nenhum número divisível por 5 e 7");
        }
    }
}
