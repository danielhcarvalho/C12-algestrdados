import java.util.Scanner;

public class C12EX05 
{
    public static void main(String[] args) 
    {
        String mes[] = new String[12];

        //objeto Scanner para ler o arquivo
        Scanner arquivoMeses = new Scanner(C12EX05.class.getResourceAsStream("C12EX05.txt"));

        //percorre o arquivo e armazena os dados na array
        for (int i = 0; i < mes.length; i++) 
        {
            mes[i] = arquivoMeses.nextLine();
        }   
        for (int j = mes.length - 1; j >= 0; j--) 
        {
            System.out.println(mes[j]);
        }
        arquivoMeses.close();
    }
}