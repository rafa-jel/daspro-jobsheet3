import java.util.Scanner;
public class StudyCaseGaji {
    public static void main(String[] args) {
        int jmlJamKerja, upahPerJam;
        float persenBonus = 0.1f, persenPajak = 0.05f;

        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah jam kerja: ");
        jmlJamKerja = in.nextInt();
        System.out.print("Gaji karyawan (per jam): ");
        upahPerJam = in.nextInt();

        int totalGaji = jmlJamKerja * upahPerJam;

        float bonus = persenBonus + totalGaji;
        int gajiDgBonus = totalGaji + (int)bonus;
        float pajak = persenPajak * gajiDgBonus;
        int gajiBersih = gajiDgBonus - (int)pajak;
        System.out.println(String.format("Gaji karyawan dalam %s jam adalah: " + totalGaji, jmlJamKerja));
        System.out.println(String.format("Gaji karyawan + bonus dalam %s jam adalah: " + gajiDgBonus, jmlJamKerja));
        System.out.println(String.format("Gaji karyawan setelah pajak dalam %s jam adalah: " + gajiBersih, jmlJamKerja));

    }
    
}
