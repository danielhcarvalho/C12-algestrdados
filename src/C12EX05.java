import java.util.Scanner;

public class C12EX05 
{
    public static void main(String[] args) 
    {
        int i = 0;
        Scanner arquivoMeses;

        arquivoMeses = new Scanner(C12EX05.class.getResourceAsStream("C12EX05.txt"));

        while (arquivoMeses.hasNextLine()) 
        {
            i++;
            arquivoMeses.nextLine();

        }        
        arquivoMeses.close();

        String mes[] = new String[i];

        arquivoMeses = new Scanner(C12EX05.class.getResourceAsStream("C12EX05.txt"));

        for (int j = 0; j < mes.length; j++) 
        {
            mes[j] = arquivoMeses.nextLine();
        }
        arquivoMeses.close();

        for (int j = mes.length - 1; j >= 0; j--) 
        {
            System.out.println(mes[j]);
        }

    }
}
