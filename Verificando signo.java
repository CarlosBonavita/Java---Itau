// informando seu signo, de acordo com sua data de nascimento.
import java.util.Scanner;
public class Signo {
    public static void main(String args[]) {
        Scanner tc=new Scanner(System.in);
        int dia,mes,ano;
        System.out.print("digite o dia que nasceu: ");
        //entrada.
        dia=tc.nextInt();
        System.out.print("digite o  mês que nasceu: ");
        mes=tc.nextInt();
        System.out.print("digite o  ano que nasceu: ");
        ano=tc.nextInt();
        //processamento e saída.
        if (dia >=20 && mes ==3 || dia<=20 && mes ==4){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Áries");
        }
        else if(dia >= 21 && mes==4 || dia <=20 && mes ==5){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Touro");
        }
        else if (dia >=21 && mes==5 || dia <=20&& mes ==6){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Gêmeos");
        }
        else if (dia >=21 && mes ==6 || dia <=22 && mes ==7){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Câncer");
        }
        else if( dia >=23 && mes ==7 || dia <= 22 && mes ==8){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Leão");
        }
        else if (dia >= 23 && mes ==8 || dia <= 22 && mes ==9){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Virgem");
        }
        else if (dia >= 23 && mes == 9|| dia <= 22 && mes ==10){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Libra");
        }
        else if (dia >= 23 && mes == 10 || dia <= 21 && mes ==11){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Escorpião");
        }
        else if (dia >= 22 && mes ==11 || dia <= 21 && mes ==12){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Sagitário");
        }
        else if (dia >= 22 && mes == 12 || dia <= 20 && mes == 1){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Capricórnio");
        }
        else if (dia >= 20 && mes == 1 || dia <= 18 && mes ==2){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Aquário");
        }
        else if (dia>=19 && mes == 2 || dia <= 20 && mes ==3 ){
            System.out.println(" você nascido em"+dia+"/"+mes+"/"+ano+"é do signo de Peixes");
        }
        else{
            System.out.println("Signo não encontrado");
        }
    }
}
