/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion_3;

import java.util.Scanner;


public class Detalles_libros {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escriba los siguientes detalles sobre el libro: ");

        System.out.println("proporcione el titulo del libro:");
        var titulo = entrada.nextLine();

        System.out.println("proporcione el autor del libro:");
        var autor = entrada.nextLine();

        System.out.println(titulo + " fue escrito por " + autor);

        System.out.println("modificacion de archivo");

    }

}
