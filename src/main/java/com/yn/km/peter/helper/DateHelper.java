package com.yn.km.peter.helper;


import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateHelper {
    public static final String PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static String currentTimeMillis() {
        return format(new Date(), "yyyyMMddHHmmssSSS");
    }

    public static String format(Date date, String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }

    public static String format(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(PATTERN);
        return format.format(parse(date, "yyyyMMddHHmmss"));
    }

    public static String format(Timestamp timestamp) {
        return new SimpleDateFormat(PATTERN).format(timestamp);
    }


    public static Date parse(String date, String pattern) throws ParseException {
        return new SimpleDateFormat(pattern).parse(date);
    }

    public static long timestamp(Date date) {
        return date.getTime();
    }

    public static Timestamp sqlDate(Date date) {
        return new Timestamp(timestamp(date));
    }

    public static Date addTime(Date date, int field, int value) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(field, value);
        return calendar.getTime();
    }

    public static Date getEndOfDay() {
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime endOfDay = localDateTime.with(LocalTime.MAX);
        return Date.from(endOfDay.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * 获得当月1号00:00:00
     *
     * @return
     */
    public static String initDateByMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return format(calendar.getTime(), PATTERN);
    }

}
