import java.util.*;
public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String userName , password ;
        int right = 3 , balance = 1500 ;

        while (right>0){

            System.out.print("Kullanıcı adı giriniz : ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = input.nextLine();

            int select=0 ;

             if(userName.equals("sahinemre") && password.equals("emre1234")){
                 System.out.println("MERHABA! GÜNDÜZBEY BANKASINA HOŞGELDİNİZ!");
                 System.out.println("ANA BAKİYENİZ : 1500 TL'DİR.");
                 System.out.println();
                 do {
                     System.out.print("1) Para Yatırma \n" +
                             "2) Para Çekme \n" +
                             "3) Bakiye Görüntüleme \n" +
                             "4) Çıkış Yap \n" +
                             "Lütfen yapmak istediğiniz işlemi giriniz : ");

                     select = input.nextInt();

                     switch (select) {

                         case 1:

                             System.out.print("Ne kadar yatırmak istediğinizi girin : ");
                             int k = input.nextInt();
                             balance += k;
                             System.out.println("Yeni hesap bakiyeniz = " + balance);
                             break;

                         case 2:

                             System.out.println("Hesaptan ne kadar para çekmek istediğinizi girin : ");
                             int a = input.nextInt();

                             if (a > balance) {
                                 System.out.println("Hesabınızda yeterli para yok.");
                             } else {
                                 balance -= a;
                                 System.out.println("Yeni hesap bakiyeniz : " + balance);
                             }
                             break;

                         case 3:
                             System.out.println("Hesap Bakiyeniz : " + balance);
                             break;

                         case 4:
                             System.out.println("Çıkış yapılıyor.. Görüşmek üzere!");

                             break;

                         default: System.out.println("Hatalı giriş yaptınız tekrar deneyiniz.");
                     }
                 }while (select!=4);
                 break;
                           }
             else  {
                 right--;

                 System.out.println("Kullanıcı adı ve / veya şifre hatalı. Tekrar deneyiniz. Kalan deneme hakkınız : " + right);

             }
        }
    }
}