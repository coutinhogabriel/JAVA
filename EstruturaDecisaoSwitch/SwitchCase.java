package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Digite uma letra");
        String letraDigitada = sc.nextLine();
        switch (letraDigitada) {
            case "a":
                System.out.println("A letra digitada: " + letraDigitada + " é vogal");
                break;
            case "e":
                System.out.println("A letra digitada: " + letraDigitada + " é vogal");
                break;
            case "i":
                System.out.println("A letra digitada: " + letraDigitada + " é vogal");
                break;
            case "o":
                System.out.println("A letra digitada: " + letraDigitada + " é vogal");
                break;
            case "u":
                System.out.println("A letra digitada: " + letraDigitada + " é vogal");
                break;
            default: System.out.println("A letra digitada: " + letraDigitada + " é consoante");
                break;            

        }
    }

    public void mês (){
        System.out.println("Digite o número referente ao mês");
        int mes = sc.nextInt();
        String nomeMes;
        switch (mes){
            case 1: nomeMes = "Janeiro";
            break;
            case 2: nomeMes = "Fevereiro";
            break;
            case 3: nomeMes = "Março";
            break;
            case 4: nomeMes = "Abril";
            break;
            case 5: nomeMes = "Maio";
            break;
            case 6: nomeMes = "Junho";
            break;
            case 7: nomeMes = "Julho";
            break;
            case 8: nomeMes = "Agosto";
            break;
            case 9: nomeMes = "Setembro";
            break;
            case 10: nomeMes = "Outubro";
            break;
            case 11: nomeMes = "Novembro";
            break;
            case 12: nomeMes = "Dezembro";
            break;
            default: nomeMes = "Valor inválido";
            break;
        }
        System.out.println("O mês selecionado é :" + nomeMes);


    }
}
