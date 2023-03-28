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
        int idadefe;
        if (idadefe > 16 && idadefe <=25){
            System.out.println("");
        }
        else if (idadefe > 25 && idadefe <= 35){
            System.out.println("");
        }
        else if (idadefe > 36 && idadefe <= 45){
            System.out.println();
        }
        else if (idadefe > 46 && <=55){
            System.out.println();
        }
        else if (idadefe > 56 && <==65){
            System.out.println();
        }

    }
}
