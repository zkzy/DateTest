package cn.cook.datelibrary;

import android.text.TextUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ${zhangkai} on 2016/10/14.
 * 简介：
 * 版本：
 */

public class DateUtils {
    public static String formatDateToString(Date date){
        if(date==null){
            return "";
        }
        SimpleDateFormat sim=new SimpleDateFormat("yy-MM-dd");
        String dateStr=sim.format(date);
        return dateStr;
    }

    public static String formatDateToStringWithHour(Date date){
        if(date==null){
            return "";
        }
        SimpleDateFormat sim=new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        String dateStr=sim.format(date);
        return dateStr;
    }
    public static Date formatStringToDateWithHour(String str){
        if(TextUtils.isEmpty(str)){
            return null;
        }
        SimpleDateFormat sim=new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        try {
            Date date=sim.parse(str);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Date formatStringToDate(String str){
        if(TextUtils.isEmpty(str)){
            return null;
        }
        SimpleDateFormat sim=new SimpleDateFormat("yy-MM-dd");
        try {
            Date date=sim.parse(str);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
