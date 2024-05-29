import javax.swing.JOptionPane;

public class C12EX09 
{
    public static void main(String[] args) 
    {
        String nomes[] = new String[2];
        double notas[] = new double[nomes.length], media = 0;
        int qntAcima = 0;

        //armazena os dados informados na array nome e na array notas

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
            //soma todas as notas informadas
            media += notas[i];

        }
        //calcula a média das notas
        media /= nomes.length;
        //percorre a array notas e verifica quais notas estão acima da média
        for (int i = 0; i < nomes.length; i++) 
        {
            if (notas[i] > media)
            {
                qntAcima++;
            }
        }

        String nomesAcima[] = new String[qntAcima];
        double notasAcima[] = new double[qntAcima];
        qntAcima = 0;
        //armazena os nomes e notas dos alunos que estão acima da média
        for (int i = 0; i < nomes.length; i++) 
        {
            if (notas[i] > media) 
            {
                nomesAcima[qntAcima] = nomes[i];
                notasAcima[qntAcima] = notas[i];
                qntAcima++;
            }
        }

        //imprime os nomes e notas dos alunos acima da média
        System.out.printf("""
            ------------------------------
            |     NOME     |     NOTA    |
            ------------------------------
            """);
        for (int i = 0; i < nomesAcima.length; i++) 
        {
            System.out.printf("""
            |%14s|%13.2f|
            ------------------------------
            """, nomesAcima[i].toUpperCase(), notasAcima[i]);
        }
    }
}
