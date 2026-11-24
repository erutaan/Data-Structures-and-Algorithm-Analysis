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
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
    System.out.println("Nama    : " + nama);
    System.out.println("NIM     : " + nim);
    System.out.println("jurusan : " + jurusan);
    System.out.println("IPK     : " + ipk);
    System.out.println("");
    }
}

public class PersonalAssignment1Question1 {
    public static void main(String[] args) {
        System.out.println("-------------Aditia Maulana-------------");
        System.out.println("---Personal Assignment 1 - Question 1---");
        System.out.println("----------------------------------------");

        Mahasiswa mahasiswa1 = new Mahasiswa("Aditia Maulana", "2902839371", "Computer Science", 3.56);
        Mahasiswa mahasiswa2 = new Mahasiswa("Winny Octoria", "2902839372", "Data Science", 3.74);
        Mahasiswa mahasiswa3 = new Mahasiswa("Claudio Taffarale", "2902839370", "DKV - Creative Media", 3.82);
        Mahasiswa mahasiswa4 = new Mahasiswa("Arfinus Mayreno", "2902839369", "Accounting", 3.85);
        Mahasiswa mahasiswa5 = new Mahasiswa("Nosyhar Mayreno", "2902839368", "Business Management", 3.83);

        Mahasiswa[] daftarMahasiswa = {mahasiswa1, mahasiswa2, mahasiswa3, mahasiswa4, mahasiswa5};
        
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            if (i == 0) {
                System.out.println("===Data Mahasiswa===");
            }
            daftarMahasiswa[i].tampilkanInfo();
            }

    }
}
