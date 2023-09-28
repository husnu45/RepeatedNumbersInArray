import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan alınan değerlerle arrayın oluşturulması

        System.out.print("Dizi boyutunu giriniz : ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Dizi elemanlarını giriniz :");
        for (int i = 0; i < size; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        boolean foundDuplicate = false;

        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) { // Eleman çift mi kontrol ediliyor
                boolean isDuplicate = false; // Tekrar eden mi kontrol ediliyor
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == numbers[i]) { // Dizi içinde aynı sayıyı bulursak
                        isDuplicate = true; // Tekrar eden çift sayıyı işaretliyoruz
                        break; // İkinci bir tekrar bulmamız gereksiz, bu yüzden döngüyü kırıyoruz
                    }
                }
                if (isDuplicate) { // Eğer tekrar eden bir çift sayı bulunduysa
                    foundDuplicate = true; // Bulunduğunu işaretliyoruz
                    System.out.println(numbers[i] + " tekrar eden çift sayıdır.");
                }
            }
        }

        if (!foundDuplicate) { // Eğer tekrar eden çift sayı bulunamadıysa
            System.out.println("Herhangi bir tekrar eden çift sayı bulunamadı.");
        }
    }
}
