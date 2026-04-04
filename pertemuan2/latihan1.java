package pertemuan2;

public class latihan1 {
    public static void main(String[] args) {

        // Data diri
        String nim = "241011400214";
        String nama = "Wulan Fitriani";
        int usia = 22;
        String jenisKelamin = "Perempuan";
        String jurusan = "Informatika";
        String alamat = "BSD";
        String Hobi = "Memasak";

        int tahunSekarang = 2026;
        int tahunLahir = tahunSekarang - usia;

        System.out.println("==============================");
        System.out.println("      DATA MAHASISWA");
        System.out.println("==============================");
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Usia           : " + usia);
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Jurusan        : " + jurusan);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Tahun Lahir    : " + tahunLahir);
        System.out.println("Hobi           : " + Hobi);

    }
}
