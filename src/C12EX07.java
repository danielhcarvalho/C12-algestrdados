import javax.swing.JOptionPane;

public class C12EX07 
{
    public static void main(String[] args) 
    {
        int num[] = new int[20], soma;

        //armazena dados na array num
        for (int i = 0; i < num.length; i++) 
        {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Informe um número: ",
            "",
            JOptionPane.QUESTION_MESSAGE));
        }

        //cria o cabeçalho de uma tabela
        System.out.println("------------------------------------");
        System.out.println("|      SOMA      |    RESULTADO    |");
        //calcula o resultado da soma entre cada elemento da primeira metade da array e o elemento correspondente na segunda metade do array
        for (int i = 0; i < num.length; i++) 
        {          
            if (i < num.length / 2) 
            {            
                soma = num[i] + num[i + num.length / 2];
                //imprime em formato de tabela a soma que está sendo feita e o resultado da soma
                System.out.println("------------------------------------");
                System.out.printf("|%12d + %d|%17d|", num[i], num[i + num.length / 2], soma);
                System.out.println();
            }
        }
        System.out.println("------------------------------------");
    }
}
