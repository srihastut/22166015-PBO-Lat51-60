/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166015pbolat54;

/*
Nama      : Sri Hastuti
Nim       : 22166015
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/

// Kelas Koordinat
class Koordinat {
    private int x;
    private int y;

    // Konstruktor
    public Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter dan setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

// Kelas WarnaKoordinat yang merupakan turunan dari Koordinat
class WarnaKoordinat extends Koordinat {
    private String namaWarna;

    // Konstruktor
    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.namaWarna = namaWarna;
    }

    // Getter dan setter tambahan
    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    // Class Main yang terpisah
    public static void main(String[] args) {
        // Membuat objek WarnaKoordinat
        WarnaKoordinat koordinat = new WarnaKoordinat(10, 4, "Jingga");

        // Menampilkan informasi mengenai WarnaKoordinat
        System.out.println("Warna Koordinat: " + koordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + koordinat.getX() + ", y : " + koordinat.getY());
    }
}
