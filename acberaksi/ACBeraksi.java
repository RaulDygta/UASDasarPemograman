/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acberaksi;

/**
 *
 * @author DELL
 */
public class ACBeraksi implements AC {

    @Override
    public void matikanAC() {
        System.out.println("AC dimatikan.");
    }

    @Override
    public void hidupkanAC() {
        System.out.println("AC dihidupkan.");
    }

    @Override
    public void dinginkanAC() {
        System.out.println("AC sedang mendinginkan ruangan.");
    }

    @Override
    public void panaskanAC() {
        System.out.println("AC sedang memanaskan ruangan.");
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        ACBeraksi ac = new ACBeraksi();

        // Panggil metode
        ac.hidupkanAC();
        ac.dinginkanAC();
        ac.panaskanAC();
        ac.matikanAC();
    }
}

