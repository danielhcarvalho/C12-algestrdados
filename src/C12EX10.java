import javax.swing.JOptionPane;

public class C12EX10 
{
    public static void main(String[] args) 
    {
        String nomes[] = new String[50];
        double notas[] = new double[nomes.length], maior_nota = Double.MIN_VALUE;
        int qnt_maior = 0;

        //armazena os dados informados e verifica qual a maior nota
        for (int i = 0; i < nomes.length; i++) 
        {
            nomes[i] = JOptionPane.showInputDialog(null,
                    "Informe o nome do aluno:",
                    "",
                    JOptionPane.QUESTION_MESSAGE);

            notas[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe a nota do aluno:",
                    "",
                    JOptionPane.QUESTION_MESSAGE));

            if (notas[i] > maior_nota) 
            {
                maior_nota = notas[i];
            }
        }
    
        //defina quantos alunos tiraram a maior nota
        for (int i = 0; i < nomes.length; i++) 
        {
            if (notas[i] == maior_nota)
            {
                qnt_maior++;
            }
        }

        String nomes_maior_nota[] = new String[qnt_maior];
        qnt_maior = 0;
        
        //percorre a array notas e verifica quais aunos tiraram a maior nota
        for (int i = 0; i < nomes.length; i++) 
        {
            if (notas[i] == maior_nota)
            {
                nomes_maior_nota[qnt_maior] = nomes[i];
                qnt_maior++;
            }
        }
        //imprime o nome de um dos alunos que tirou a maior nota
        System.out.printf(nomes_maior_nota[(int) Math.round(Math.random() * nomes_maior_nota.length)]);

    }
}