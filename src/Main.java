import java.util.Scanner;

public class Main {
    static void plus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz.");
        int n = scanner.nextInt();
        int result = 0;

        for(int i = 1 ; i <= n ; i++){
            System.out.print("Sayı giriniz : ");
            int number = scanner.nextInt();
            result +=  number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void minus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz.");
        int n = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Sayı giriniz : ");
            int number = scanner.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);

    }
    static void times(){
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        System.out.println("Kaç adet sayı gireceksiniz.");
        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++){
            System.out.print("Sayı giriniz : ");
            int number = scanner.nextInt();
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void divided(){
        Scanner scanner = new Scanner(System.in);
        double result = 1;

        System.out.println("Kaç adet sayı gireceksiniz.");
        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++){
            System.out.print("Sayı giriniz : ");
            double number = scanner.nextInt();
            if(i != 1 && number == 0){
                System.out.println("Böleni 0 giremezsiniz!");
                continue;
            }
            if (i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);

    }
    static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int n = scanner.nextInt();
        int result = 1;
        for(int i = n ; i > 0 ; i--){
            result *= i;

        }
        System.out.println("Sonuç :  " + result);
    }
    static void power(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban değeri giriniz : ");
        int base = scanner.nextInt();
        System.out.println("Üs değerini giriniz : ");
        int exponent = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++){
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }
    static int mod (){
       Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayı : ");
       int a = scanner.nextInt();
        System.out.println("2. sayı");
       int b = scanner.nextInt();
       return a % b;
    }
    static void areaOfRectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. kenar : ");
        int a = scanner.nextInt();
        System.out.println("2. kenar");
        int b = scanner.nextInt();
        System.out.println("Dikdörtgenin alanı : " + (a * b));
    }
    static void circumferenceOfTheRectagle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. kenar : ");
        int a = scanner.nextInt();
        System.out.println("2. kenar");
        int b = scanner.nextInt();
        System.out.println("Dikdörtgenin çevresi : "+ (2 * (a + b)));

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select ;

        String menu = "İşlemler\n" +
                "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktöreyel Hesaplama\n"+
                "7-Mod Alma\n" +
                "8-Dikdörtgen Alan Hesaplama\n" +
                "9-Dikdörtgen Çevre Hesaplama\n" +
                "0-Çıkış ";
        do {
            System.out.println(menu);
            System.out.println("İşlem Seçiniz : ");
            select = scanner.nextInt();

            switch (select) {
                case 0:
                    System.out.println("Sistemden Çıkılıyor.");
                    break;
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                case 5:
                    power();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    System.out.println("Mod işlemi " + mod());
                    break;
                case 8:
                    areaOfRectangle();
                    break;
                case 9:
                    circumferenceOfTheRectagle();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz.Tekrar deneyiniz.");
                    break;
            }
        }
            while (select!=0);
    }
}