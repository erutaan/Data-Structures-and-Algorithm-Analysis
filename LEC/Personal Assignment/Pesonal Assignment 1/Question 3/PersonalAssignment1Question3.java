class Mahasiswa {

    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    //Constructor : https://www.w3schools.com/java/java_constructors.asp
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        setIpk(ipk);
    }

    //menampilkan info mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("jurusan  : " + jurusan);
        System.out.println("IPK      : " + ipk);
    }

    // Getter untuk ipk karena private
    public double getIpk() {
        return ipk;
    }
    
    // Getter untuk membandingkan value nim karena private
    public String getNIM() {
        return nim;
    }

    // Setter
    public void setIpk(double ipk) {
        if (ipk >= 0 && ipk <= 4.00) {
            this.ipk = ipk;
        }
    }

    // Mengecek kelulusan
    public void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status   : Lulus");
        }
        else {
            System.out.println("Status   : Belum Lulus");
        }
    }

    // Menentukan predikat akademik
    public void hitungPredikat() { //https://www.w3schools.com/java/java_conditions_elseif.asp
        if (ipk >= 3.75) {
            System.out.println("Predikat : Dengan Pujian");
            System.out.println("");
        }
        else if (ipk < 3.75 && ipk >= 3.50) { //bisa juga hanya dengan < 3.50 tanpa &&
            System.out.println("Predikat : Sangat Memuaskan");
            System.out.println("");
        }
        else if (ipk < 3.50 && ipk >= 3.00) { //bisa juga hanya dengan < 3.00 tanpa &&
            System.out.println("Predikat : Memuaskan");
            System.out.println("");
        }
        else {
            System.out.println("Predikat : Perlu Perbaikan");
            System.out.println("");
        }
    }

    // Memperbarui IPK
    public void updateIpk(double ipkBaru) {
        setIpk(ipkBaru);
    }
}

public class PersonalAssignment1Question3 {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Aditia Maulana", "2902839371", "Computer Science", 2.56);
        Mahasiswa mahasiswa2 = new Mahasiswa("Winny Octoria", "2902839372", "Data Science", 3.49);
        Mahasiswa mahasiswa3 = new Mahasiswa("Claudio Taffarale", "2902839370", "DKV - Creative Media", 3.65);
        Mahasiswa mahasiswa4 = new Mahasiswa("Arfinus Mayreno", "2902839369", "Accounting", 3.85);
        Mahasiswa mahasiswa5 = new Mahasiswa("Nosyhar Mayreno", "2902839368", "Business Management", 3.83);

        System.out.println("-------------Aditia Maulana-------------");
        System.out.println("---Personal Assignment 1 - Question 3---");
        System.out.println("----------------------------------------");
        System.out.println("");

        Mahasiswa[] daftarMahasiswa = {mahasiswa1, mahasiswa2, mahasiswa3, mahasiswa4, mahasiswa5};

        /* Tidak dgunakan untuk question 3 - https://www.w3schools.com/java/java_user_input.asp
        Scanner input = new Scanner(System.in);
        Boolean found = false;

        while (found == false) {
            System.out.println("Masukkan NIM mahasiswa: ");
            String nimText = input.nextLine();
            for (int i = 0; i < daftarMahasiswa.length; i++) {
                if (daftarMahasiswa[i].getNIM().equals(nimText)) {

                    found = true;

                    System.out.println("Masukkan IPK baru: ");
                    double ipkBaru = input.nextDouble();

                    while (ipkBaru < 0 || ipkBaru > 4.00) {
                        System.out.println("IPK tidak valid! Masukkan kembali.");
                        System.out.print("Masukkan IPK baru (0.00 - 4.00): ");
                        ipkBaru = input.nextDouble();
                    }

                    daftarMahasiswa[i].updateIpk(ipkBaru);
                    daftarMahasiswa[i].tampilkanInfo();
                    daftarMahasiswa[i].cekKelulusan();
                    break;
                }
            }
            if (found == false) {
                System.out.println("NIM mahasiswa tidak ditemukan");
            }
        }
        */

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            if (i == 0) {
                System.out.println("===Data Mahasiswa===");
            }
            daftarMahasiswa[i].tampilkanInfo();
            daftarMahasiswa[i].cekKelulusan();
            daftarMahasiswa[i].hitungPredikat();
            }
        
    }
}
