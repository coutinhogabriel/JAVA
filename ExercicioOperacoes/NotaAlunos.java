package ExercicioOperacoes;

public class NotaAlunos {
    public void NotaAlunos() {
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
