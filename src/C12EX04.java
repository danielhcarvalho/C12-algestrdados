import javax.swing.JOptionPane;

public class C12EX04 
{
    public static void main(String[] args) 
    {
        int vencedores01[] = new int[20], corredor;

        //for para receber o número dos 20 primeiros corredores a cruzar a linha de chegada
        for (int i = 0; i < vencedores01.length; i++) 
        {
            corredor = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Informe o número do corredor:",
            "",
            JOptionPane.QUESTION_MESSAGE));

            //array recebe o número do corredor
            vencedores01[i] = corredor;
        }

        System.out.println("VENCEDORES BATERIA 01: ");

        //for para imprimir a posição dos corredores
        for (int i = 0; i < vencedores01.length; i++) 
        {
            System.out.printf("%d° lugar - %d\n", i + 1, vencedores01[i]);
        }

        System.out.println();
        System.out.println("Saída de duplas: ");

        //for para imprimir a orde de saida das duplas
        for (int i = 0; i < vencedores01.length; i++) 
        {
            if (i < vencedores01.length / 2)
            {
                System.out.printf("%d / %d\n", vencedores01[i], vencedores01[i + 10]);
            }
        }
    }
}
