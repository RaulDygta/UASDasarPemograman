/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematikaOverloading;

/**
 *
 * @author DELL
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Buat objek dari class MatematikaCanggih
        MatematikaCanggih mc = new MatematikaCanggih();

        // Uji metode dengan int
        mc.pertambahan(12, 28);
        mc.pengurangan(23, 34);

        // Uji metode dengan double dan tiga parameter
        mc.pertambahan(12.5, 28.7, 14.2);
        mc.perkalian(3.4, 4.9, 2.1);
    }
}

