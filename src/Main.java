import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[100]; // cria um vetor com tamanho máximo de 100 elementos
        int indice = 0;
        double media =0;
        int numero;
        int soma = 0;
        int qtdNumeros = 0;
        while (true) {
            System.out.print("Digite um número inteiro (digite -1 para encerrar): ");
            numero = scanner.nextInt();
            if (numero <0) {
                break;
            }
            vetor[indice] = numero; // Pega o número digitado e insere no vetor
            indice++; // Andando com o índice do vetor
            qtdNumeros++; // Contando quantos números foram digitados
            soma += numero; // fazendo o somatório (soma = soma + numero)
        }
        media = soma / qtdNumeros; // Cálculo da média
        System.out.println("Número de elementos inseridos: " + qtdNumeros);
        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);
    }


}