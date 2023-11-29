/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166015pbolat58;

/*
Nama      : Sri Hastuti
Nim       : 22166015
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/

class Bilangan {
    private final int x;
    private final int y;

    // Konstruktor dengan x = 3 & y = 4
    public Bilangan() {
        this.x = 3;
        this.y = 4;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

// Kelas SelisihBilangan
class SelisihBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int hasilJumlah = super.getX() + super.getY();
        System.out.println("Hasil Jumlah: " + hasilJumlah);
    }

    public void tampilSelisih() {
        int selisih = super.getX() - super.getY();
        System.out.println("Hasil Selisih: " + selisih);
    }
}

// Kelas JumlahBilangan
class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int hasilJumlah = super.getX() + super.getY();
        System.out.println("Hasil Jumlah: " + hasilJumlah);
    }
    public static void main(String[] args) {
        JumlahBilangan jumlahBilangan = new JumlahBilangan();
        SelisihBilangan selisihBilangan = new SelisihBilangan();

        jumlahBilangan.tampilHasilJumlah();
        selisihBilangan.tampilSelisih();
    }
}

