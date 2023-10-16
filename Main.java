import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ay;
        int gun;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğdunuz Ayı Giriniz(örn:ocak): ");
        ay = scanner.nextLine();
        System.out.print("Doğduğunuz Günü Giriniz(örn:12):");
        gun = scanner.nextInt();
        if (gun >= 1 && gun <= 31) {
            if (ay.equals("ocak")) {
                if (gun < 21) {
                    System.out.println("Oğlak Burcusunuz.");
                } else System.out.println("Kova burcusunuz.");
            } //else System.out.println("Geçersiz bir gün girdiniz");


            if (ay.equals("şubat")) {
                if (gun < 20) {
                    System.out.println("Kova Burcusunuz.");
                } else System.out.println("Balık Burcusunuz.");
            } else if (ay.equals("mart")) {
                if (gun < 20) {
                    System.out.println("Balık Burcusunuz.");
                } else System.out.println("Koç Burcusunuz.");
            } else if (ay.equals("nisan")) {
                if (gun < 21) {
                    System.out.println("Koç Burcusunuz.");
                } else System.out.println("Boğa Burcusunuz.");
            } else if (ay.equals("mayıs")) {
                if (gun < 22) {
                    System.out.println("Boğa Burcusunuz.");
                } else System.out.println("İkizler Burcusunuz.");
            } else if (ay.equals("haziran")) {
                if (gun < 22) {
                    System.out.println("İkizler Burcusunuz.");
                } else System.out.println("Yengeç Burcusunuz.");
            } else if (ay.equals("temmuz")) {
                if (gun < 23) {
                    System.out.println("Yengeç Burcusunuz.");
                } else System.out.println("Aslan burcusunuz.");
            } else if (ay.equals("ağustos")) {
                if (gun < 23) {
                    System.out.println("Aslan Burcusunuz.");
                } else System.out.println("Başak Burcusunuz.");
            } else if (ay.equals("eylül")) {
                if (gun < 23) {
                    System.out.println("Başak Burcusunuz.");
                } else System.out.println("Terazi Burcusunuz.");
            } else if (ay.equals("ekim")) {
                if (gun < 23) {
                    System.out.println("Terazi Burcusunuz.");
                } else System.out.println("Akrep Burcusunuz.");
            } else if (ay.equals("kasım")) {
                if (gun < 22) {
                    System.out.println("Akrep Burcusunuz.");
                } else System.out.println("Yay Burcusunuz.");
            } else if (ay.equals("aralık")) {
                if (gun < 22) {
                    System.out.println("Yay Burcusunuz.");
                } else System.out.println("Oğlak Burcusunuz.");
            }

        } else System.out.println("Geçersiz bir gün girdiniz");

    }
}