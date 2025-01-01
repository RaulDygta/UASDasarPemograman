/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author DELL
 */
public class Bank {
    private int saldo;

    // Konstruktor
    public Bank(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Metode untuk menyimpan uang
    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
    }

    // Metode untuk mengambil uang
    public void ambilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup untuk mengambil Rp. " + jumlah);
        }
    }

    // Metode untuk mendapatkan saldo saat ini
    public int getSaldo() {
        return saldo;
    }
}

