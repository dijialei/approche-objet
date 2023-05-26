package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MMMM/yyyy");
        String strDate = format.format(date);
        System.out.println(strDate);
        Date dateCustm = new Date(116,4,19,23,59,30);
        format = new SimpleDateFormat("yyyy/MMMM/dd hh:mm:ss");
        strDate = format.format(dateCustm);
        System.out.println(strDate);
    }
}
