/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166015pbolat60;

/*
Nama      : Sri Hastuti
Nim       : 22166015
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/
// Class dasar untuk karakter Akatsuki
class KarakterAkatsuki {
    String nama;
    String kekuatan;

    public KarakterAkatsuki(String nama, String kekuatan) {
        this.nama = nama;
        this.kekuatan = kekuatan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Kekuatan: " + kekuatan);
    }
}

// Contoh kelas turunan (inheritance) dari KarakterAkatsuki
class Itachi extends KarakterAkatsuki {
    public Itachi() {
        super("Itachi Uchiha", "Sharingan");
    }
}

// Contoh kelas turunan lainnya
class Kisame extends KarakterAkatsuki {
    public Kisame() {
        super("Kisame Hoshigaki", "Samehada");
    }
    public static void main(String[] args) {
        Itachi itachi = new Itachi();
        itachi.tampilkanInfo();

        Kisame kisame = new Kisame();
        kisame.tampilkanInfo();
    }
}



