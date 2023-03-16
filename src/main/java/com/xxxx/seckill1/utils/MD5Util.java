package com.xxxx.seckill1.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

@Component
public class MD5Util {
    public static String md5(String str){
        return DigestUtils.md5Hex(str);
    }
    public static String salt = "1a2b3c4d";

    public static String InputpassToFrompass(String inputpass){
        String str = "" + salt.charAt(0) + salt.charAt(2) + inputpass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }
    public static String FrompassToDBpass(String Frompass,String salt){
        String str = "" + salt.charAt(0) + salt.charAt(2) + Frompass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }
    public static String InputpassToDBpass(String inputpass,String salt){
        String formpass = InputpassToFrompass(inputpass);
        String dbpass = FrompassToDBpass(formpass,salt);
        return dbpass;
    }

    public static void main(String[] args) {
        System.out.println(InputpassToFrompass("123456"));
        System.out.println(FrompassToDBpass("d3b1294a61a07da9b49b6e22b2cbd7f9","1a2b3c4d"));
        System.out.println(InputpassToDBpass("123456","1a2b3c4d"));
    }
}
