import java.util.Scanner;

public class AtmClass {

    private static double bakiye=2000;
    private static double yatan;

    private static double cekilen;
    private static String sifre="1324";

     static Scanner scan=new Scanner(System.in);

    public static void sifre(){
        System.out.println("lutfen sifrenizi giriniz");
        if (scan.next().equals(sifre)){
            System.out.println("sifre basarili");

        }else {
            System.out.println("sifre basarisiz, lutfen tekrar deneyiniz");
            sifre();
        }
    }
    public static void baslangic(){
        System.out.println("lutfen bir islem seciniz :\npara yatirmak icin 1" +
                "\npara cekmek icin   2" +
                "\nbakiye sormak icin 3" +
                "\ncikis icin         4");
        islemler();
    }

    public static void paraYatirma(){
        System.out.println("yatirmak istediginiz miktari giririz");
        double yatanMiktar=scan.nextDouble();
        System.out.println("Hesabinizin Guncel Bakiyesi : "+(bakiye += yatanMiktar));
        devam();

    }

    public static void devam(){
        System.out.println("baska bir islem yapmak istiyor musunuz? " +
                           "\nevet icin  E harfini" +
                           "\nhayir icin H harfini " +
                           "\nseciniz");
        char harf=scan.next().charAt(0);
        if (harf=='e' || harf=='E'){
            baslangic();
        }else if (harf=='h'||harf=='H'){
            cikis();
        }
    }

    public static void paraCekme(){
        System.out.println("cekmek istediginiz miktari giriniz");
        int cekilecekMiktar=scan.nextInt();
        if (cekilecekMiktar>bakiye){
            System.out.println("hesap bakiyeniz yeterli degildir, lutfen yeni bir miktar giriniz");
            paraCekme();
        }else {
            System.out.println("Hesabinizin Guncel Bakiyesi : "+(bakiye -= cekilecekMiktar));

            devam();
        }

    }

    public static void bakiyeSorma(){
        System.out.println("guncel bakiyeniz :"+bakiye);
        devam();
    }
    public static void cikis(){
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");
    }

    public static void islemler(){
        int islem=scan.nextInt();
        switch (islem){
            case 1:
                paraYatirma();
                break;
            case 2:
                paraCekme();
                break;
            case 3:
                bakiyeSorma();
                break;
            case 4:
                cikis();
                break;
            default:
                System.out.println("yanlis bir deger girdiniz");
                devam();
        }
    }


}
