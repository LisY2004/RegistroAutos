/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registroautos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RegistroAutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Auto> autos = new ArrayList<>();

        System.out.println("Ingrese el número de autos:");
        int numeroAutos = scanner.nextInt();

        for (int i = 0; i < numeroAutos; i++) {
            scanner.nextLine();
            System.out.print("Ingrese la placa del auto:");
            String placa = scanner.nextLine();

            System.out.print("Ingrese el modelo del auto:");
            String modelo = scanner.nextLine();

            System.out.print("Ingrese el valor del auto:");
            double valor = scanner.nextDouble();

            Auto auto = new Auto(placa, modelo, valor);
            autos.add(auto);
        }

        double total = 0;
        for (Auto auto : autos) {
            total += auto.getValor();
        }

        System.out.println("El total de valores registrados en el parque automotor es: " + total);
    }
}
