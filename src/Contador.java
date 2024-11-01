import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int var1 = scanner.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int var2= scanner.nextInt();

        try{
            contar(var1, var2);
        } catch (ParametrosInvalidosException e){
            e.printStackTrace();
        }


    }
    static void contar(int var1, int var2) throws ParametrosInvalidosException {
        if (var1 >= var2)
        throw new ParametrosInvalidosException("O primeiro numero tem que ser maior do que o segundo >:(");
        else {
            int contagem = var2 - var1; 
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o numero: " + i);
            }
        }
    }
}
