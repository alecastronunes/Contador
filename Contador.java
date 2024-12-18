import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        System.out.println("Digte o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            //chamando o metodo contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!!!");
        }

        sc.close();
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }else {
            int contagem = parametroDois - parametroUm;

            for (int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
