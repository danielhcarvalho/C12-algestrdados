import java.util.ArrayList;

import javax.swing.JOptionPane;

public class C12EX02 
{
    public static void main(String[] args) 
    {
        int num[] = new int[10];
        ArrayList<Integer> numSelecionados = new ArrayList<>();

        for (int i = 0; i < num.length; i++) 
        {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Informe o " + (i + 1) + "° número",
            "",
            JOptionPane.QUESTION_MESSAGE));

            if (num[i] > 5 && num[i] < 10) 
            {
                numSelecionados.add(num[i]);
            }
        }

        if (!numSelecionados.isEmpty()) 
        {       
            System.out.print("Os números maiores que 5 e menores que 10 inseridos são: ");
            
            for (int i = 0; i < numSelecionados.size(); i++) 
            {
                System.out.printf("%d", numSelecionados.get(i));
                if (i < numSelecionados.size() - 1) 
                {
                    System.out.print(", ");
                }
                
            }

        } else
        {
            System.out.println("Não foi inserido nenhum número maior que 5 e menor que 10");
        }


    }
}
