import java.util.Scanner;
import java.text.DecimalFormat;

public class UKLsulit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukkan jumlah siswa: ");
            if (!sc.hasNextInt()) {
                System.out.println("Input tidak valid.");
                return;
            }
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Jumlah siswa harus lebih dari 0.");
                return;
            }

            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Nilai siswa ke-" + i + ": ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Nilai tidak valid, masukkan angka.");
                    sc.next();
                    System.out.print("Nilai siswa ke-" + i + ": ");
                }
                double nilai = sc.nextDouble();
                // opsional: batas validasi nilai (mis. 0-100)
                if (nilai < 0) nilai = 0;
                sum += nilai;
            }

            double rata = sum / n;
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("\nRata-rata nilai: " + df.format(rata));
        } finally {
            sc.close();
        }
    }
}