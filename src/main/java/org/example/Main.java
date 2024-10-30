package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float peso;
        float altura;
        String nombreUsuario;
        Scanner leerTeclado=new Scanner(System.in);

        System.out.println("Señor usuario digite su nombre: ");
        nombreUsuario=leerTeclado.nextLine();

        System.out.println("Señor usuario digite su peso en Kg.: ");
        peso=leerTeclado.nextFloat();

        System.out.println("Señor usuario digite su Estatura en m.: ");
        altura= leerTeclado.nextFloat();

        float IMC=peso/(altura*altura);

        if (IMC<18.5){
            System.out.println("Señor "+nombreUsuario+" Usted está en desnutrición, debe consultar un médico");
        } else if (IMC>=18.5 && IMC<=24.9) {
            System.out.println("Señor "+nombreUsuario+" Usted está en rango normal");
        } else if (IMC>=25 && IMC<=29.9) {
            System.out.println("Señor "+nombreUsuario+" Usted tiene sobre peso");
        }else {
            System.out.println("Señor "+nombreUsuario+" Usted tiene obesidad, debe consultar un médico");
        }
    }
}
