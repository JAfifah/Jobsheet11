import java.util.Scanner;
import java.util.Random;

public class quiz14Modif {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka antara 1 hingga 10: ");
                int answer = input.nextInt();
                input.nextLine();
                if (answer < number) {
                    System.out.println("Angka yang Anda tebak terlalu kecil.");
                } else if (answer > number) {
                    System.out.println("Angka yang Anda tebak terlalu besar.");
                } else {
                    success = true;
                }
            } while (!success);
            System.out.print("Selamat! Anda berhasil menebak angka dengan benar. Apakah Anda ingin mengulang permainan (Y/y)? ");
            menu = input.nextLine().charAt(0);
        } while (menu == 'Y' || menu == 'y');

        System.out.println("Terima kasih telah bermain!");
    }
}
//Jami'atul Afifah 14