package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //System.out.println("Comienza aca: ");

        //Diseñar un ALGORITMO que permita el ingreso
        //de un usuario con correo y contraseña
        //se permitiran 3 intentos antes de bloquearlo

        //ENTRADAS DEL ALGORITMO 1

        Scanner leerTeclado=new Scanner(System.in);
        String colorBlanco="\u001B[29";
        String colorNegro="\u001B[30m";
        String colorRojo="\u001B[31m";
        String colorVerde="\u001B[32m";
        String colorAmarillo="\u001B[33m";
        String colorAzul="\u001B[34m";
        String colorMorado="\u001B[35m";

        //PROCESO
        System.out.println(colorMorado + "**************************");
        System.out.println("GESTOR APP by AMG 2025 🗿🗿🗿");
        System.out.println("**************************");

        String correoDigitadoUsuario;
        String contraseñaDigitadaUsuario;
        String correoGuardadoBaseDatos="amga@gmail.com";
        String contraseñaGuardadaBaseDatos="12345";


        //Diseñar un ALGORITMO que permita mostrar un
        //menu de opciones si el usuario se autentico con
        //exito. El menu sera el siguiente:
        //1. Registrar venta
        //2. Mostrar ventas del día
        //3. SALIR

        //NOTA: Una venta se considera en el sistema como una variable
        //con los siguientes datos:
        //id--->entero
        //fecha--->LocalDate
        //descripción--->Cadena
        //lista de productos--->Lista
        //total--->doble

        //NOTA 2: Un producto tiene:
        //id
        //preciounitario
        //fotografia
        //cantidad



    }
}