/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166015pbolat55;

/*
Nama      : Sri Hastuti
Nim       : 22166015
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/

// Kelas Handphone
class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    // Konstruktor
    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    // Method displayProduct
    public void displayProduct() {
        System.out.println("Manufaktur: " + manufacture);
        System.out.println("OS: " + operatingSystem);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
    }
}

// Kelas Android yang merupakan turunan dari Handphone
class Android extends Handphone {
    private String keyStore;

    // Konstruktor
    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    // Getter dan setter tambahan
    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }

    // Override method displayProduct
    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Android Key Store: " + keyStore);
    }
}

// Kelas BlackBerry yang merupakan turunan dari Handphone
class BlackBerry extends Handphone {
    private String pinBB;

    // Konstruktor
    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    // Getter dan setter tambahan
    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }

    // Override method displayProduct
    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("PIN: " + pinBB);
    }
}

// Kelas WindowsPhone yang merupakan turunan dari Handphone
class WindowsPhone extends Handphone {
    private String wpKeyStore;

    // Konstruktor
    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    // Getter dan setter tambahan
    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }

    // Override method displayProduct
    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Wp Key Store: " + wpKeyStore);
    }
    public static void main(String[] args) {
        // Membuat objek Android
        Android samsung = new Android("Samsung", "Android", "Grand", 3000000);
        samsung.setKeyStore("234ibfd3840 fo");

        // Membuat objek BlackBerry
        BlackBerry blackberry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackberry.setPinBB("BHS249");

        // Membuat objek WindowsPhone
        WindowsPhone nokia = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        nokia.setWpKeyStore("UUUQIJWORJ");

        // Menampilkan informasi mengenai Handphone
        System.out.println("Manufaktur Samsung");
        samsung.displayProduct();

        System.out.println("\nManufaktur BlackB");
        blackberry.displayProduct();

        System.out.println("\nManufaktur Nokia");
        nokia.displayProduct();
    }
}

