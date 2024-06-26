import java.util.ArrayList;

import javax.swing.JOptionPane;

public class C12EX02 
{
    public static void main(String[] args) 
    {
        int num[] = new int[10];
        //ArrayList para armazenar os números maior que 5 e menor que 10
        ArrayList<Integer> numSelecionados = new ArrayList<>();

        //for para preencher o array num
        for (int i = 0; i < num.length; i++) 
        {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Informe o " + (i + 1) + "° número",
            "",
            JOptionPane.QUESTION_MESSAGE));

            //verifica se o número é maior que 5 e menor que 10
            if (num[i] > 5 && num[i] < 10) 
            {
                numSelecionados.add(num[i]);
            }
        }

        //verifica se ArrayList está vazia
        if (!numSelecionados.isEmpty()) 
        {       
            System.out.print("Os números maiores que 5 e menores que 10 inseridos são: ");
            
            //for para imprimir os números maiores que 5 e menores que 10
            for (int i = 0; i < numSelecionados.size(); i++) 
            {
                System.out.printf("%d", numSelecionados.get(i));
                //adiciona uma vírgula entre os números
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
