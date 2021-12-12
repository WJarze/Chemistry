/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ph;

import java.util.Scanner;

/**
 *
 * @author Wojtek
 */
public class pH {

    public double H;
    public final double Kw = 1E-14;

    public pH(double H) {

        this.H = H;

    }

    public double oblicz(double H) {
        double pH = -Math.log10((H + Math.sqrt(Math.pow(H, 2) + 4 * Kw)) / 2);
        return pH;
    }

    public static void main(String[] args) {

        double H = 0;
        final double Kw = 1E-14;

        Scanner wejście = new Scanner(System.in);

        System.out.println("podaj kwas czy zasada");
        String KwasLubZasada = wejście.nextLine();
        System.out.println("podaj stężenie molowe");
        double h = wejście.nextDouble();
        switch (KwasLubZasada) {
            case "kwas" ->
                H = h;
            case "zasada" ->
                H = Kw - h;
            default ->
                System.out.println("podaj kwas albo zasada");
        }
        pH ph = new pH(H);

        double pH = ph.oblicz(H);
        System.out.format("%.2f", pH);
    }
}
