import java.sql.PseudoColumnUsage;
import java.util.Scanner;

/**
 * AtividadeGrupo
 */
public class AtividadeGrupo {
    Scanner sc = new Scanner(System.in);

    public void AtividadeGrupo() {
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Informe seu sexo  1 (masculino); 2 (feminino): ");
        int sexo = sc.nextInt();
        System.out.println("Informe sua altura (metros)");
        double altura = sc.nextDouble();
        System.out.println("Informe seu peso (kg)");
        double peso = sc.nextDouble();
        double pesoIdeal = 0;
        if (sexo == 1) {
            pesoIdeal = (altura * 72.7) - 58;
            System.out.println("O peso ideal é :" + pesoIdeal);
        } else if (sexo == 2) {
            pesoIdeal = (altura * 62.1) - 44.7;
            System.out.println("O peso ideal é :" + pesoIdeal);
        } else {
            System.out.println("DIGITE UM VALOR VALIDO, 1 (MASCULINO) OU 2 (FEMININO)");
        }

        // Quantos quilos precisam ganhar/perder

        if (sexo == 1 && peso > pesoIdeal) {
            System.out.println("O Aluno precisa perder " + (peso - pesoIdeal) + "Kg");
        } else if (sexo == 1 && peso < pesoIdeal) {
            System.out.println("O Aluno precisa ganhar " + (pesoIdeal - peso) + "Kg");
        }
        if (sexo == 2 && peso > pesoIdeal) {
            System.out.println("O Aluno precisa perder " + (peso - pesoIdeal) + "Kg");
        } else if (sexo == 2 && peso < pesoIdeal) {
            System.out.println("O Aluno precisa ganhar " + (pesoIdeal - peso) + "Kg");
        }

        // Cálculo IMC

        int leve;
        int moderada;
        int dificil;


        double imc = peso / (altura * altura);
        System.out.println("IMC do aluno é: " + imc);
        if (imc < 20){
            dificil = 3;
            System.out.println("O Aluno está abaixo do peso");
        }
        else if (imc > 20 && imc < 27){
            moderada = 2;
            System.out.println("O Aluno está no peso normal");
        }
        else if (imc > 27){
            leve = 1;
            System.out.println("O Aluno está acima do peso");
        }
        else {System.out.println(" Valor inválido");}
        
        //Faixa etária do aluno
        int idadefe =0;
        if (idade> 16 && idade<=25){
            System.out.println("Faixa de idade I: entre 16 e 25 anos");
        }
        else if (idade> 25 && idade<= 35){
            System.out.println("Faixa de idade II: entre 25 e 35 anos");
        }
        else if (idade> 36 && idade<= 45){
            System.out.println("Faixa de idade III: entre 36 e 45 anos");
        }
        else if (idade> 46 && idade <=55){
            System.out.println("Faixa de idade IV: entre 46 e 55 anos");
        }
        else if (idade> 56 && idade <=65){
            System.out.println("Faixa de idade V: entre 56 e 65 anos");
        }
        else if (idade > 66){
            System.out.println("Faixa de idade VI: mais de 66 anos");
        }
        else {System.out.println("Valor inválido");}

    }
}
