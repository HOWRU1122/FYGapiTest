package com.jourwon.httpclient.utils;

import java.nio.charset.Charset;
import java.security.MessageDigest;


/**
 * MD5加密的工具类
 */
public class MD5Utils {

    public static String md5(String input) {
    	 StringBuffer sb = new StringBuffer();
         try {
             MessageDigest md = MessageDigest.getInstance("MD5");
             md.update(input.getBytes(Charset.forName("UTF-8")));
             byte b[] = md.digest();
             int i;
             for (int offset = 0; offset < b.length; offset++) {
                 i = b[offset];
                 if (i < 0)
                     i += 256;
                 if (i < 16)
                     sb.append("0");
                 sb.append(Integer.toHexString(i));
             }
         } catch (Exception e) {
             return null;
         }
         return sb.toString();
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();


        String sign = MD5Utils.md5("9b8bfe3390daba5daec5187e3ad4ce5e"+"clientKeydf0a1679040f4499b1de2746ece5d26e" + "keyword天猫"+"timestamp"+time+ "9b8bfe3390daba5daec5187e3ad4ce5e");
        String Sign = sign.toUpperCase();
        System.out.println(time);
        System.out.println(Sign);
    }

    }
