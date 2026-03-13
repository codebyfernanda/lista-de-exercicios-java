import java.util.Scanner;
import java.util.Locale;
import java.util.Calendar;

public class ListaExerciciosADS {

    public static void main(String[] args) {
        // Configura o ponto como separador decimal (esse é o chamado "padrão US", que evita erros com vírgula)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        1. Faça um programa que lê o valor da cotação do dólar em um determinado dia e
        em seguida lê uma quantia em dólares. Realize a conversão para reais.
        */

        System.out.println("============================================================================");
        System.out.println("------------Algoritmo Conversão de Dólares (US$) para Reais (R$)------------");
        System.out.println("------------------------Escrito por: @codebyfernanda------------------------");
        System.out.println("============================================================================");

        System.out.print("Digite o valor da cotação do dólar hoje (Escreva o decimal com ponto): ");
        double cotacaoDol = sc.nextDouble();

        System.out.print("Digite a quantia em dólares (US$): ");
        double quantidadeDol = sc.nextDouble();

        double reais = quantidadeDol * cotacaoDol;

        System.out.printf("O valor de US$ %.2f convertido para reais é: R$ %.2f%n", quantidadeDol, reais);

        System.out.println("============================================================================\n");


        /*
        2. Ler dois valores para as variáveis A e B e efetue a troca dos valores.
        */

        System.out.println("============================================================================");
        System.out.println("---------------Algoritmo de Troca dos Valores de 2 Variáveis----------------");
        System.out.println("------------------------Escrito por: @codebyfernanda------------------------");
        System.out.println("============================================================================");

        System.out.print("Digite o valor de A: ");
        String A = sc.next();
        System.out.print("Digite o valor de B: ");
        String B = sc.next();

        System.out.println("\nAntes da troca: A = " + A + " e B = " + B);

        // Realizando a troca (Essa lógica PRECISA ser manual, porque o Java não tem a atribuição múltipla como o Python)
        String temp = A;
        A = B;
        B = temp;

        System.out.println("Depois da troca: A = " + A + " e B = " + B);
        System.out.println("============================================================================\n");


        /*
        3. Leia um valor inteiro e apresente os resultados do quadrado, do cubo e da raiz quadrada.
        */

        System.out.println("============================================================================");
        System.out.println("----------Algoritmo de Cálculos do Quadrado, Cubo e Raiz Quadrada-----------");
        System.out.println("------------------------Escrito por: @codebyfernanda------------------------");
        System.out.println("============================================================================");

        System.out.print("Digite um valor inteiro: ");
        int numero = sc.nextInt();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        double raizQuadrada = Math.sqrt(numero);

        System.out.println("---------------------------------");
        System.out.println("Número original: " + numero);
        System.out.println("Elevado ao quadrado: " + (int)quadrado);
        System.out.println("Elevado ao cubo: " + (int)cubo);
        System.out.printf("Raiz quadrada: %.2f%n", raizQuadrada);
        System.out.println("---------------------------------");
        System.out.println("Processado por @codebyfernanda\n");


        /*
        4. Receba o ano de nascimento e o ano atual, calcule idade e idade em 2050.
        */

        System.out.println("============================================================================");
        System.out.println("---------------Algoritmo de Cálculo da idade e idade em 2050----------------");
        System.out.println("------------------------Escrito por: @codebyfernanda------------------------");
        System.out.println("============================================================================");

        System.out.print("Digite o ano em que você nasceu (ex: 1998): ");
        int anoNasc = sc.nextInt();
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        int idade = anoAtual - anoNasc;
        int idade2050 = 2050 - anoNasc;

        System.out.println("\n---------------------------------");
        System.out.println("Resultados para quem nasceu em " + anoNasc + ":");
        System.out.println("a) Idade atual: " + idade + " anos");
        System.out.println("b) Idade em 2050: " + idade2050 + " anos");
        System.out.println("=================================");
        System.out.println("Produzido por @codebyfernanda\n");


        /*
        5. Salário base, gratificação de 10% e imposto de 4%.
        */

        System.out.println("============================================================================");
        System.out.println("-------------Algoritmo de Cálculo do Salário de um Funcionário--------------");
        System.out.println("------------------------Escrito por: @codebyfernanda------------------------");
        System.out.println("============================================================================");

        System.out.print("Digite o salário base do funcionário (R$): ");
        double salBase = sc.nextDouble();

        double gratificacao = salBase * 0.10;
        double salarioGratif = salBase + gratificacao;
        double imposto = salarioGratif * 0.04;
        double salFinal = salarioGratif - imposto;

        System.out.println("---------------------------------");
        // No Java, %8.2f faz o mesmo que o :>8.2f do Python
        System.out.printf("Salário Base:    R$ %8.2f%n", salBase);
        System.out.printf("Gratificação:  + R$ %8.2f%n", gratificacao);
        System.out.printf("Imposto (4%s):  - R$ %8.2f%n", "%", imposto);
        System.out.println("---------------------------------");
        System.out.printf("SALÁRIO LÍQUIDO: R$ %8.2f%n", salFinal);
        System.out.println("---------------------------------");
        System.out.println("Folha de pagamento criada por @codebyfernanda");

        sc.close(); // Fecha o scanner
    }
}
