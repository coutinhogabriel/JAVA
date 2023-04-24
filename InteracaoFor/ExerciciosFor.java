package InteracaoFor;

import java.util.Scanner;

public class ExerciciosFor {
    Scanner sc = new Scanner(System.in);

    public void Exercicio8(){
        //ler idade e altura de 5 pessoas e 
        //
        int idade[] = new int [5];
        double altura [] = new double [5];
        //preencher vetores
        for (int i = 0; i < altura.length; i++){
            System.out.println("Informe a idade da pessoa "+(i+1));
            idade[i]=sc.nextInt();
            System.out.println("Informe a altura da pessoa "+(i+1));
            altura[i]=sc.nextDouble();
        }
        //imprimir na ordem inversa
        for (int i = 4; i >=0; i--){
            System.out.println("Informações da pessoa "+(i+1)+" :");
            System.out.println("Idade:" +idade[i]);
            System.out.println("Altura:" +altura[i]);
        }
    }
    public void Exercicio9(){
        int vetor[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        //calcular a soma dos quadrados
        int soma = 0; //acumular o valor
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i]*vetor[i];    
        }
        System.out.println("A soma do quadrado dos elementos do vetor é: " +soma);
    }
}
