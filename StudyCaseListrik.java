import java.util.Scanner;
public class StudyCaseListrik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tarif = 1500;
        System.out.print("Masukan jumlah penggunaan listrik anda: ");
        int penggunaan = in.nextInt();
        double totalTarif = tarif * penggunaan;
        boolean pengecekan = penggunaan > 500;
        System.out.println("Total tarif listrik anda adalah: " + totalTarif + " rupiah");    
        
        if (pengecekan) {
            System.out.println("Penggunaan listrik anda lebih dari 500 kWh");
        }
        else {
            System.out.println("Penggunaan listrik anda tidak melebihi 500 kWh");
        }
    }
    
}
