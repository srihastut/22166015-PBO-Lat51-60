/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166015pbolat56;

/*
Nama      : Sri Hastuti
Nim       : 22166015
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/

// Kelas BarangAntik
class BarangAntik {
    protected int umur;

    // Konstruktor
    public BarangAntik(int umur) {
        this.umur = umur;
    }

    // Method tampilUmur
    public void tampilUmur() {
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun.");
    }
}

// Kelas Radio yang merupakan turunan dari BarangAntik
class Radio extends BarangAntik {
    private String name;

    // Konstruktor
    public Radio(int umur) {
        super(umur);
    }

    // Getter dan setter tambahan
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        // Membuat objek Radio
        Radio radio = new Radio(234);
        radio.setName("Radio AM");

        // Menampilkan informasi mengenai BarangAntik
        System.out.println("Nama barang Antik: " + radio.getName());
        radio.tampilUmur();
    }
}


