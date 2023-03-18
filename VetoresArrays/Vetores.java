package VetoresArrays;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criar meu vetor
        double valores[] = new double[] { 10.5, 15.8, 7.5, -17.6 };
        System.out.println("O 1º elemento do vetor - valores[0] é " + valores[0]);
        System.out.println("O 2º elemento do vetor - valores[1] é " + valores[1]);
        System.out.println("O 3º elemento do vetor - valores[2] é " + valores[2]);
        System.out.println("O 4º elemento do vetor - valores[3] é " + valores[3]);
        System.out.println("Digite um novo valor para a 4º posição/indice 3");
        valores[3] = sc.nextDouble();
        System.out.println("O novo valor da 4º posição/indice[3] é " + valores[3]);
    }

    public void exemplo2() {
        // criar um vetor vazio
        int valoresInt[] = new int[5];
        System.out.println("Digite 5 valores inteiros");
        valoresInt[0] = sc.nextInt();
        valoresInt[1] = sc.nextInt();
        valoresInt[2] = sc.nextInt();
        valoresInt[3] = sc.nextInt();
        valoresInt[4] = sc.nextInt();
        System.out.println("O 1º elemento do vetor - índice [0] é " + valoresInt[0]);
        System.out.println("O 2º elemento do vetor - índice [1] é " + valoresInt[1]);
        System.out.println("O 3º elemento do vetor - índice [2] é " + valoresInt[2]);
        System.out.println("O 4º elemento do vetor - índice [3] é " + valoresInt[3]);
        System.out.println("O 5º elemento do vetor - índice [4] é " + valoresInt[4]);
    }
    public void exemplo3() {
        // criar um vetor que leia 10 números reais e mostre-os na ordem inversa
        double valoresReais[] = new double[10];
        System.out.println("Digite 10 valores");
        valoresReais[0] = sc.nextDouble();
        valoresReais[1] = sc.nextDouble();
        valoresReais[2] = sc.nextDouble();
        valoresReais[3] = sc.nextDouble();
        valoresReais[4] = sc.nextDouble();
        valoresReais[5] = sc.nextDouble();
        valoresReais[6] = sc.nextDouble();
        valoresReais[7] = sc.nextDouble();
        valoresReais[8] = sc.nextDouble();
        valoresReais[9] = sc.nextDouble();
        System.out.println("O 9º elemento do vetor - índice [9] é " + valoresReais[9]);
        System.out.println("O 8º elemento do vetor - índice [8] é " + valoresReais[8]);
        System.out.println("O 7º elemento do vetor - índice [7] é " + valoresReais[7]);
        System.out.println("O 6º elemento do vetor - índice [6] é " + valoresReais[6]);
        System.out.println("O 5º elemento do vetor - índice [5] é " + valoresReais[5]);
        System.out.println("O 4º elemento do vetor - índice [4] é " + valoresReais[4]);
        System.out.println("O 3º elemento do vetor - índice [3] é " + valoresReais[3]);
        System.out.println("O 2º elemento do vetor - índice [2] é " + valoresReais[2]);
        System.out.println("O 1º elemento do vetor - índice [1] é " + valoresReais[1]);
        System.out.println("O 0º elemento do vetor - índice [0] é " + valoresReais[0]);
    }
    public void exemplo4() {
        // criar um programa que leai 4 notas, mostre as notas e a média na tela
        double valoresNotas[] = new double[4];
        System.out.println("Digite o valor das suas quatro notas");
        valoresNotas[0] = sc.nextDouble();
        valoresNotas[1] = sc.nextDouble();
        valoresNotas[2] = sc.nextDouble();
        valoresNotas[3] = sc.nextDouble();
        double Media = (valoresNotas[0]+valoresNotas[1]+valoresNotas[2]+valoresNotas[3]) / 4;
        System.out.println("As notas são " +valoresNotas[0] + " , " + valoresNotas[1] + " , " + valoresNotas[2] + " , " + valoresNotas[3] + " E a média é " +Media);
        
    }
}
