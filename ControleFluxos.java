import java.util.Scanner;

public class ControleFluxos {
    public static void main(String Args[]){

        Scanner s = new Scanner(System.in);
        String situacao;

        System.out.println("Vamos calcular a média das notas.");
        System.out.println("Digite a primeira nota: ");
        double nota1 = s.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = s.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = s.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = s.nextDouble();

        double mediaNota = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A média das suas notas é: " + mediaNota);

        if (mediaNota >= 7) {
            System.out.println("Parabéns! Você foi aprovado! ");
        } else if (mediaNota >= 5) {
            System.out.println("Cuidado! Você está de recuperação! ");
        } else {
            System.out.println("Você foi reprovado!");
        }

    }
}
