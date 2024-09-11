import java.util.Scanner;
public class Siakad23 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
        System.out.print("Masukan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukan nomer absen: ");
        absen = sc.nextByte();
        System.out.print("Masukan nilai kuis ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan nilai UTS ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukan nilai UAS ");
        nilaiUas = sc.nextDouble();
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUts * 0.30) + (nilaiUas * 0.35);
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("sNilai Akhir: " + nilaiAkhir);


        
    }
}