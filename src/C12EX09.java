import javax.swing.JOptionPane;

public class C12EX09 
{
    public static void main(String[] args) 
    {
        String nomes[] = new String[50];
        double notas[] = new double[nomes.length], media = 0;
        int qntAcima = 0;

        for (int i = 0; i < nomes.length; i++) 
        {
            nomes[i] = JOptionPane.showInputDialog(null,
            "Informe o nome do aluno:",
            "",
            JOptionPane.QUESTION_MESSAGE);
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Informe o nome do aluno:",
            "",
            JOptionPane.QUESTION_MESSAGE));
            media += notas[i];

        }

        media /= nomes.length;
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

        for (int i = 0; i < nomes.length; i++) 
        {
            if (notas[i] > media) 
            {
                nomesAcima[qntAcima] = nomes[i];
                notasAcima[qntAcima] = notas[i];
                qntAcima++;
            }
        }
        for (int i = 0; i < nomesAcima.length; i++) 
        {
            
        }
    }
}
