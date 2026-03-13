/*
Exercício: Gasto de Combustível
Joaozinho quer calcular a quantidade de litros de combustível gastos em uma 
viagem, utilizando um automóvel que faz 12 KM/L. Para isso, o programa deve
receber o tempo gasto na viagem (em horas) e a velocidade média durante a 
mesma (em km/h).A partir desses dados, é possível obter a distância percorrida 
e, em seguida, calcular quantos litros seriam necessários para concluir o trajeto.
Entrada - O arquivo de entrada contém dois números inteiros: O tempo gasto na viagem 
(em horas). A velocidade média durante a viagem (em km/h). Saída - Imprima a 
quantidade de litros necessária para realizar a viagem, formatada com três casas 
decimais após o ponto.
*/

// ============================================================================
// ----------------------------Gasto de Combustível----------------------------
// ------------------------Escrito por: @codebyfernanda------------------------
// ============================================================================

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Configura o Scanner para aceitar o ponto como separador decimal, 
        // evitando erros dependendo da região do computador.
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        // Leitura das entradas
        int tempo = leitor.nextInt();
        int velocidade = leitor.nextInt();

        // Cálculo da distância
        // Note que mesmo sendo inteiros, ao multiplicar e depois dividir, 
        // o Java tratará o resultado como double se a variável de destino for double.
        double distancia = (double) tempo * velocidade;

        // Cálculo do consumo (eficiência de 12 KM/L)
        double litros = distancia / 12.0;

        // Saída formatada com 3 casas decimais (o %.3f funciona igual ao Python)
        // O %n é usado para quebrar a linha de forma universal (Windows/Linux/Mac)
        System.out.printf("%.3f%n", litros);

        leitor.close();
    }
}

// ============================================================================
// ----------------------------------------------------------------------------
// ============================================================================
