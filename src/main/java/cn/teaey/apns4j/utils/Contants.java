package cn.teaey.apns4j.utils;

import java.util.concurrent.TimeUnit;

public class Contants {

    public static final int DEF_EXPIRY = (int) TimeUnit.DAYS.toSeconds(1);

    public static int expiry = ((int) System.currentTimeMillis() / 1000) + DEF_EXPIRY;

}