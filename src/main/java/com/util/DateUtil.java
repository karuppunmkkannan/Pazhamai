/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author SBirmani
 */
public class DateUtil {
    static SimpleDateFormat yearMonthDate = new SimpleDateFormat("yyyy-MM-dd");
    public static SimpleDateFormat yearMonthDateTime = new SimpleDateFormat("yyyy-MM-dd hh:mm");
    public static Date parseDate(String input){
        Date output = null;
        try{
            output = yearMonthDate.parse(input);
        }
        catch(Exception ex){
            
        }
        return output;
    }
    public static String formatDate(Date input){
        String output = null;
        try{
            output = yearMonthDate.format(input);
        }
        catch(Exception ex){
            
        }
        return output;
    }
    public static String formatDateTime(Date input){
        String output = null;
        try{
            output = yearMonthDateTime.format(input);
        }
        catch(Exception ex){
            
        }
        return output;
    }
    public static Date addDays(Date input, int days){
        Date output = null;
        try{
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(input);
            calendar.add(Calendar.DATE, days);
            output = calendar.getTime();
        }
        catch(Exception ex){
            
        }
        return output;
    }
}