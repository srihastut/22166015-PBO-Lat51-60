/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166015pbolat52;
/*
Nama      : Sri Hastuti
Nim       : 22166015
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/

import java.util.Scanner;
class Manusia {

//variabel
    protected String nama;
    protected int umur;
    //metode get
    public String getNama() {
        return nama;
    }
    //metode set mengubah nilai variabel nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    //metode get
    public int getUmur() {
        return umur;
    }
    //metode set untuk mengubah nilai awal vatiabel umur
    public void setUmur(int umur) {
        this.umur = umur;
    }
    //metode siapakamu 
    public void siapakamu() {
        System.out.println("Saya manusia");
    }
}
//kelas dosen turunan dari kelas manusia
class Dosen extends Manusia {
    //variabel
    private String nip;
    private String matakuliah;
    //metode get
    public String getNip() {
        return nip;
    }
    //metode set untuk mengubah nilai awal variabel nip
    public void setNip(String nip) {
        this.nip = nip;
    }
    //metode get
    public String getMataKuliah() {
        return matakuliah;
    }
    //metode set untuk mengubah nilai awal variabel matakuliah
    public void setMataKuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }
    //metode mengajarapa
    public void mengajarApa() {
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " tahun sedang mengajar matakuliah " + matakuliah);
    }
    //metode siapakamu
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
//kelas mahasiswa turunan dari kelas manusia
class Mahasiswa extends Manusia {
    //variabel
    private String nim;
    private String kelas;
    //metode get
    public String getNim() {
        return nim;
    }
    //metode set untuk mengubah nilai awal variabel nim
    public void setNim(String nim) {
        this.nim = nim;
    }
    //metode get
    public String getKelas() {
        return kelas;
    }
    //metode set untuk mengubah nilai awal vaetiabel kelas
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    //metode kelasapa
    public void kelasApa() {
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " tahun sedang belajar di kelas " + kelas);
    }
    //metode siapakamu
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bagian untuk informasi Dosen
        System.out.println("==== Informasi Dosen ====");
        System.out.print("NIP DOSEN: ");
        String nipDosen = input.nextLine();
        System.out.println("Saya Dosen");
        System.out.print("Masukkan Nama Anda: ");
        String namaDosen = input.nextLine();
        System.out.print("Masukkan Umur Anda: ");
        int umurDosen = input.nextInt();
        input.nextLine(); // Menangani newline character
        System.out.print("Mengajar Matakuliah: ");
        String matakuliahDosen = input.nextLine();

        // Menampilkan hasil informasi Dosen
        System.out.println("Saya " + namaDosen + " umur " + umurDosen + " tahun sedang mengajar matakuliah " + matakuliahDosen);

        // Bagian untuk informasi Mahasiswa
        System.out.println("\n==== Informasi Mahasiswa ====");
        System.out.print("NIM MAHASISWA: ");
        String nimMahasiswa = input.nextLine();
        System.out.println("Saya Mahasiswa");
        System.out.print("Masukkan Nama Anda: ");
        String namaMahasiswa = input.nextLine();
        System.out.print("Masukkan Umur Anda: ");
        int umurMahasiswa = input.nextInt();
        input.nextLine(); // Menangani newline character
        System.out.print("Belajar di Kelas: ");
        String kelasMahasiswa = input.nextLine();

        // Menampilkan hasil informasi Mahasiswa
        System.out.println("Saya " + namaMahasiswa + " umur " + umurMahasiswa + " tahun sedang belajar di kelas " + kelasMahasiswa);
    }
}

    