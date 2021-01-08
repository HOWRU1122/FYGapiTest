package com.jourwon.httpclient.utils;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.concurrent.ThreadLocalRandom;


/**
 * MD5加密的工具类
 */
public class NonceUtils {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getRandomString(32));
        }
    }
    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<length;i++){
            sb.append(str.charAt(ThreadLocalRandom.current().nextInt(str.length())));
        }
        return sb.toString();

    }

    }

