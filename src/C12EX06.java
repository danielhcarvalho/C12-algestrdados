import javax.swing.JOptionPane;

public class C12EX06 
{
    public static void main(String[] args) 
    {
        String nomes[] = new String[50], conceito[] = new String[nomes.length];
        double notas[] = new double[nomes.length];

        //solicita um nome e uma nota ao usuário e armazena nos arrays nomes e notas respectivamente
        for (int i = 0; i < notas.length; i++) 
        {
            nomes[i] = JOptionPane.showInputDialog(null,
            "Informe o nome do " + (i + 1) + "° aluno:",
            "",
            JOptionPane.QUESTION_MESSAGE);

            //verifica se o campo nome está vazio
            while (nomes[i].equals(""))
            {
                JOptionPane.showMessageDialog(null,
                "O nome não poder estar em branco",
                "NOME INVÁLIDO!",
                JOptionPane.ERROR_MESSAGE);
                
                nomes[i] = JOptionPane.showInputDialog(null,
                "Informe o nome do " + (i + 1) + "° aluno:",
                "",
                JOptionPane.QUESTION_MESSAGE);
            }

            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Informe a nota do aluno:",
            "",
            JOptionPane.QUESTION_MESSAGE));

            //verifica se a nota está entre 0 e 100
            while (notas[i] > 0 && notas[i] < 100) 
            {                    
                JOptionPane.showMessageDialog(null, 
                "A nota deve estar entre 0 e 100", 
                "NOTA INVÁLIDA!",
                JOptionPane.ERROR_MESSAGE);

                notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Informe a nota do aluno:",
                "",
                JOptionPane.QUESTION_MESSAGE));

                
            }

            //armazena um dado na array conceito com base na nota do aluno
            if (notas[i] >= 0 && notas[i] <= 30) 
            {
                conceito[i] = "D";
            } else if (notas[i] > 30 && notas[i] <= 60) 
            {
                conceito[i] = "C";
            } else if (notas[i] > 60 && notas[i] <= 80) 
            {
                conceito[i] = "B";    
            } else if (notas[i] > 80 && notas[i] <= 100) 
            {
                conceito[i] = "A";
            }
    
        }
        //imprime o nome dos alunos junto de suas respectivas notas e conceitos em uma tabela
        System.out.println("----------------------------------");
        System.out.println("|   NOME   |   NOTA   | CONCEITO |");

        for (int i = 0; i < notas.length; i++) 
        {
            System.out.println("----------------------------------");
            System.out.printf("| %8s | %8.2f | %8s |", nomes[i].toUpperCase(), notas[i], conceito[i]);
            System.out.println();
        }
        System.out.println("----------------------------------");


    }
}
