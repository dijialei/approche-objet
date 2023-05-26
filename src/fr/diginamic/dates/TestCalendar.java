package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,4,19,23,59,30);
        Date date = calendar.getTime();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MMMM/yyyy");
        String strDate = formateur.format(date);
        System.out.println(strDate);
        calendar.setTime(new Date());
        date= calendar.getTime();
        formateur = new SimpleDateFormat("yyyy/MMMM/dd hh:mm:ss");
        strDate = formateur.format(date);
        System.out.println(strDate);
        formateur = new SimpleDateFormat("yyyy/MMMM/dd/EEEE hh:mm:ss", Locale.CHINA);
        strDate = formateur.format(date);
        System.out.println(strDate);
        formateur = new SimpleDateFormat("yyyy/MMMM/dd/EEEE hh:mm:ss", Locale.GERMAN);
        strDate = formateur.format(date);
        System.out.println(strDate);


    }
}
