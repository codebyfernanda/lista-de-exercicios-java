/*
Exercício: O Maior
Faça um programa que leia três valores inteiros e apresente o maior dos três valores 
lidos seguido da mensagem "eh o maior".Para resolver este problema, utilize a 
fórmula que calcula o maior entre dois valores. Nota: A fórmula acima calcula 
apenas o maior entre os dois primeiros valores. Portanto, um segundo passo é
necessário para comparar o resultado obtido com o terceiro valor ($c$) e chegar 
ao resultado final esperado. Entrada - O arquivo de entrada contém três valores 
inteiros. Saída - Imprima o maior dos três valores seguido por um espaço e a 
mensagem "eh o maior".
*/

// ============================================================================
// --------------------------Descubra o maior número---------------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // No padrão beecrowd: lê a linha inteira e o Scanner separa pelos espaços
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        // Descobrir o maior entre A e B usando a fórmula
        // (a + b + |a - b|) / 2
        int maiorAb = (a + b + Math.abs(a - b)) / 2;

        // Descobrir o maior entre o resultado anterior e C
        int resultadoFinal = (maiorAb + c + Math.abs(maiorAb - c)) / 2;

        // Saída conforme o enunciado
        System.out.println(resultadoFinal + " eh o maior");
        
        leitor.close();
    }
}

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================
