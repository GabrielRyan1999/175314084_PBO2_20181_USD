/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class cobadate {
    public static void main(String[] args) {
        Date date = new Date(99,4,24);
        Date today = new Date();
        SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Lahir: " + ft.format(date));
       int age = today.getYear() - date.getYear();
        System.out.println("usia = "+ age);
    }
}