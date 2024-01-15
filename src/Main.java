import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Tarihinizi Ay Olarak Giriniz: ");
        int month = input.nextInt();
        System.out.println("Doğum Tarihinizi Gün Olarak Giriniz: ");
        int day = input.nextInt();

        String sign ="";
        String errorMsg = "Hatalı tarih girişi yaptınız lütfen tekrar deneyiniz.";
        boolean isError = false;
        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        sign = "Oğlak";
                    } else {
                        sign = "Kova";
                    }
                } else {
                    System.out.println("Hatalı tarih girişi yaptınız lütfen tekrar deneyiz");
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day <= 19) {
                        sign = "Kova";
                    } else {
                        sign = "Balık";
                    }
                } else {
                    System.out.println(errorMsg);
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day <= 20) {
                        sign = "Balık";
                    } else {
                        sign = "Koç";
                    }
                } else {
                    System.out.println(errorMsg);
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day <= 20) {
                        sign = "Koç";
                    } else {
                        sign = "Boğa";
                    }
                } else {
                    System.out.println(errorMsg);
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        sign = "Boğa";
                    } else {
                        sign = "İkizler";
                    }
                } else {
                    System.out.println(errorMsg);
                }
                break;
            case 6:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        sign = "İkizler";
                    } else {
                        sign = "Yengeç";
                    }
                } else {
                    System.out.println(errorMsg);
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        sign = "Yengeç";
                    } else {
                        sign = "Aslan";
                    }
                } else {
                    System.out.println(errorMsg);
                }
                break;
            case 8:
                if (day >= 1 && day <= 30) {
                    if (day <= 20) {
                        sign = "Aslan";
                    } else {
                        sign = "Başak";
                    }
                } else {
                    System.out.println(errorMsg);
                }
                break;
            case 9:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        sign = "Başak";
                    } else {
                        sign = "Terazi";
                    }
                } else {
                    System.out.println(errorMsg);
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day <= 22) {
                        sign = "Terazi";
                    } else {
                        sign = "Akrep";
                    }
                } else {
                    System.out.println(errorMsg);
                }
                break;
            case 11:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        sign = "Akrep";
                    } else {
                        sign = "Yay";
                    }
                } else {
                    System.out.println(errorMsg);
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        sign = "Yay";
                    } else {
                        sign = "Oğlak";
                    }
                } else {
                    System.out.println(errorMsg);
                }
                break;
            default:
                isError = true;
        }

        if (isError){
            System.out.println(errorMsg);
        }else{
            System.out.println("Merhaba SBurcunuz :" + sign);
        }
    }
}

        /* System.out.println("Doğum Tarihinizi Gün Olarak Giriniz: ");
        int day = input.nextInt();

        if (month > 0 && month < 13) {
            if (month == 1 ){
                if(day >= 1 && day <= 31) {
                    if(day <= 21) {
                }
                    System.out.println("Burcunuz : Oğlak ");
                }else{
                    System.out.println("Burcunuz : Kova");
                }
            }
            if (month == 2){
                if (day >= 1 && day >=28)
                    if(day <= 19){
                    System.out.println("Burcunuz : Kova ");
                }else{
                    System.out.println("Burcunuz : Balık");
                }
            }
            if (month == 3){
                if(day >= 1 && day <= 31){
                    if(day <=20){
                }
                    System.out.println("Burcunuz : Balık ");
                } else{
                    System.out.println("Burcunuz : Koç");

        } else {
            System.out.println("Hatalı Tarih Girişi Yaptınız, Lütfen Tekrar Deneyiniz.");
        }
    }
} */