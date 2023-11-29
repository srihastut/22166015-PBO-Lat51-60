/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166015pbolat59;

/*
Nama      : Sri Hastuti
Nim       : 22166015
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/
class Conan {
    String name = "Conan Edogawa";
    String role = "Child version of Shinichi Kudo";

    void displayInfo() {
        System.out.println("Character Name: " + name);
        System.out.println("Role: " + role);
        // Tambahkan informasi lainnya sesuai kebutuhan
    }
}

class RanMouri {
    String name = "Ran Mouri";
    String role = "Shinichi's childhood friend and love interest";

    void displayInfo() {
        System.out.println("Character Name: " + name);
        System.out.println("Role: " + role);
        // Tambahkan informasi lainnya sesuai kebutuhan
    }
}

class KogoroMouri {
    String name = "Kogoro Mouri";
    String role = "Private eye and Ran's father";

    void displayInfo() {
        System.out.println("Character Name: " + name);
        System.out.println("Role: " + role);
        // Tambahkan informasi lainnya sesuai kebutuhan
    }
}

class AiHaibara {
    String name = "Ai Haibara";
    String role = "Ex-member of the Black Organization";

    void displayInfo() {
        System.out.println("Character Name: " + name);
        System.out.println("Role: " + role);
        // Tambahkan informasi lainnya sesuai kebutuhan
    }
    public static void main(String[] args) {
        
        // Buat objek karakter Conan (dalam bentuk anak-anak)
        Conan conan = new Conan();

        // Panggil metode untuk menampilkan informasi karakter
        conan.displayInfo();
    }
}
