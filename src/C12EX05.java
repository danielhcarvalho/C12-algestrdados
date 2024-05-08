import java.util.ArrayList;
import java.util.Scanner;

public class C12EX05 
{
    public static void main(String[] args) 
    {
        ArrayList <String> mes = new ArrayList<>();
        Scanner arquivoMeses;

        //objeto Scanner para ler o arquivo
        arquivoMeses = new Scanner(C12EX05.class.getResourceAsStream("C12EX05.txt"));

        //percorre o arquivo e armazena os dados na ArrayList
        while (arquivoMeses.hasNextLine()) 
        {
            mes.add(arquivoMeses.nextLine());

        }   
        //imprime os dados da ArrayList (do último dado até o primeiro)
        for (int j = mes.size() - 1; j >= 0; j--) 
        {
            System.out.println(mes.get(j));
        }
        arquivoMeses.close();
    }
}