/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan26;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
public class Latihan26 {
    public static void main(String[] args) {
        Date date = new Date();
        Locale locale = new Locale("id","ID");
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss",locale);
        
        String today = formatter.format(date);
        System.out.println("Hari ini adalah hari : " +today);
    }
    
}
