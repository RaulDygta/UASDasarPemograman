/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hp;

/**
 *
 * @author DELL
 */
public class HandphoneBeraksi {
      public static void main(String[] args) {
        // Membuat objek dari class Handphone
        Handphone hp = new Handphone();

        // Memanggil method-method dari class Handphone
        hp.hidupkan();
        hp.lakukanPanggilan();
        hp.kirimSMS();
        hp.matikan();
    }
}
