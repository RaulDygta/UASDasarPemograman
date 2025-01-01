/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematikaOverloading;

/**
 *
 * @author DELL
 */
public class Matematika {
    // Metode pertambahan (int, int)
    public void pertambahan(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    // Overloading metode pertambahan (double, double, double)
    public void pertambahan(double a, double b, double c) {
        System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
    }

    // Metode pengurangan
    public void pengurangan(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    // Overloading metode pengurangan (double, double, double)
    public void pengurangan(double a, double b, double c) {
        System.out.println(a + " - " + b + " - " + c + " = " + (a - b - c));
    }

    // Metode perkalian
    public void perkalian(int a, int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    // Overloading metode perkalian (double, double, double)
    public void perkalian(double a, double b, double c) {
        System.out.println(a + " * " + b + " * " + c + " = " + (a * b * c));
    }

    // Metode pembagian
    public void pembagian(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    // Overloading metode pembagian (double, double, double)
    public void pembagian(double a, double b, double c) {
        System.out.println(a + " / " + b + " / " + c + " = " + (a / b / c));
    }

    // Metode modulus
    public void modulus(int a, int b) {
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}

