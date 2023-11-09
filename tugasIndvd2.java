import java.util.Scanner;

public class tugasIndvd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 5) = ");
        int n = sc.nextInt();

       
        if (n < 5) {
            System.out.println("N minimal harus 5.");
        } else {
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
//Jami'atul Afifah 14