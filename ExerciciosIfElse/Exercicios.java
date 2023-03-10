package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o primeiro valor");
        int valor1 = sc.nextInt();
        System.out.println("Informe o segundo valor");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O maior valor é " + valor1);
        } else {
            System.out.println("O maior valor é" + valor2);
        }
    }

    public void exercicio2() {
        System.out.println("Informe sa data de nascimento");
        int valor = sc.nextInt();
        if (valor >= 2008) {
            System.out.println("Não, não pode votar");
        }
        if (valor <= 2007) {
            System.out.println("Sim, pode votar");
        }
    }

    public void exercicio3() {
        System.out.println("Informe a senha");
        double valor = sc.nextDouble();
        if (valor == 1234) {
            System.out.println("ACESSO PERMITIDO");
        }
        if (valor > 1234) {
            System.out.println("ACESSO NEGADO");
        }
        if (valor < 1234) {
            System.out.println("ACESSO NEGADO");
        }

    }

    public void exercicio4() {
        System.out.println("Informe o numero de maças");
        double valor = sc.nextDouble();
        if (valor >= 12) {
            valor = valor * 0.25;
        } else {
            valor = valor * 0.30;
        }
        System.out.println("Total a pagar é: R$  " + valor);

    }

    public void exercicio5() {
        System.out.println("Informe o primeiro valor");
        double valor1 = sc.nextDouble();
        System.out.println("Informe o segundo valor");
        double valor2 = sc.nextDouble();
        System.out.println("Informe o terceiro valor");
        double valor3 = sc.nextDouble();
        if ((valor1 < valor2) && (valor2 < valor3)){
        System.out.println("Ordem crescente" + valor1 + "," + valor2 + "," + valor3);
        }
        else if (valor2 < valor3 && valor3 < valor1) {
            System.out.println("Ordem crescente" + valor2 + "," + valor3 +"," + valor1);
        }
        else if (valor3 < valor1 && valor1 < valor2) {
            System.out.println("Ordem crescente" + valor3 + "," + valor1 + "," + valor2);
        }
        else if (valor1 < valor3 && valor3 < valor2) {
            System.out.println("Ordem crescente" + valor1 + "," + valor3 + "," + valor2);
        }
        else if (valor2 < valor1 && valor1 < valor3) {
            System.out.println("Ordem crescente" + valor2 + "," + valor1 + "," + valor3);
        }
        else if (valor3 < valor2 && valor2 < valor1) {
            System.out.println("Ordem crescente" + valor3 + "," + valor2 + "," + valor1);
        }
        else {System.out.println("ERRO, ALGUNS VALORES SÃO REPETIDOS"); }
        }
        public void exercicio6(){
            System.out.println("Informe sua altura");
            double valor1 = sc.nextDouble();
            System.out.println("Informe seu sexo 1 (masculino); 2 (feminino)");
            double valor2 = sc.nextDouble();
            double valor3;
            if (valor2 == 1) {
                valor3 = (valor1 * 72.7) - 58;
                System.out.println("O peso ideal é:" + valor3);
            }
            else if (valor2 == 2) {
                valor3 = (valor1 * 62.1) - 44.7;
                System.out.println("O peso ideal é:" + valor3);
            }
            else {System.out.println("DIGITE UM VALOR VALIDO, 1 (MASCULINO) OU 2 (FEMININO)");}
        }
        public void exercicio7() {
            boolean mediaOk, frequenciaOk;
            System.out.println("Informe a primeira nota do aluno:");
            double nota1 = sc.nextDouble();
            System.out.println("Informe a segunda nota do aluno:");
            double nota2 = sc.nextDouble();
            double media = (nota1 + nota2) / 2;
            mediaOk = media >= 50;
            System.out.println("Informe a frequencia do aluno:");
            double freq = sc.nextDouble();
            frequenciaOk = freq >= 75;
            boolean aprovado = mediaOk && frequenciaOk;
            System.out.println("Aluno foi aprovado em nota? " + mediaOk);
            System.out.println("Aluno foi aprovado em frenquencia? " + frequenciaOk);
            if (aprovado == true) {
                System.out.println("O aluno passou de ano.");
            } else {
                System.out.println("O aluno não passou de ano.");
            }
        }
}

