import java.util.Scanner;

public class PooEj12{
    public static void main(String[] args) {
        //Datos de entrada
        System.out.println("Ingrese el nombre del trabajador:");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("Ingrese cantidad de horas trabajadas:");
        Scanner entrada2 = new Scanner(System.in);
        int horas = entrada2.nextInt();

        System.out.println("Ingrese el valor de la hora de trabajo: ");
        Scanner entrada3 = new Scanner(System.in);
        double valorHora = entrada3.nextDouble();

        //proceso
        double salario = 0;
        if (horas>40){
            int horasExtras = horas - 40;
            if (horasExtras > 8){
                int horasMuyExtras = horasExtras - 8;
                salario = (40*valorHora) + (16*valorHora) + (horasMuyExtras*3*valorHora);
            }else{
                salario = (40*valorHora) + (horasExtras*2*valorHora);
            }
        }else{
            salario = horas * valorHora;
        }
        //Datos de salida
        System.out.println("El trabajador "+nombre+" devengo: $"+salario);
    }
}