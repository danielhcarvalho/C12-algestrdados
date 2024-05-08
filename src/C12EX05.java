import java.util.Scanner;

public class C12EX05 
{
    public static void main(String[] args) 
    {
        int i = 0;
        Scanner meses = new Scanner(C12EX05.class.getResourceAsStream("C12EX05.txt"));

        while (meses.hasNextLine()) 
        {
            i++;
        }

        String mes[] = new String[i];

            for (int j = 0; j < mes.length; j++) 
            {        
                while (meses.hasNextLine()) 
                {
                    mes[j] = meses.nextLine();

                }
            } 
        


        for (int j = mes.length - 1; j >= 0; j--)
        {
            System.out.println(mes[j]);
        }

    }
}
