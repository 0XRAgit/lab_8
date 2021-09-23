package com.oblach;

import sun.rmi.runtime.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        pyatChislo(Objects.requireNonNull(in()));
        register(Objects.requireNonNull(in()));
        sred(new int[]{1,2,3,4,5,6,7,8,9,10});
    }

    private static void pyatChislo(String arg){
        char[] chars = arg.toCharArray();
        out(chars);
    }

    private static void register(String chars){
        out(chars.toUpperCase());
    }

    private static void sred(int[] mas){
        int sum=0;
        for(int i=0;i<mas.length;i++)
            sum+=mas[i];
        out(sum/mas.length);
    }


/*   Для удобства вывода,
     что бы не писать каждый раз System.out.println/print*/

    private static void out(String text){
        System.out.println(text);
    }

    private static void out(String[] text){
        for (String s : text) System.out.println(s);
    }

    private static void out(int text){
        System.out.println(text);
    }

    private static void out(int[] text){
        for (int j : text) System.out.println(j);
    }

    private static void out(char[] text){
        for (char j : text) System.out.println(j);
    }

    private static String in(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return  br.readLine();
        } catch (IOException e) {
            Log.getLog("Input Error",e.getMessage(),true);
            return null;
        }
    }

    private static Integer inInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return  Integer.getInteger(br.readLine());
        } catch (IOException e) {
            Log.getLog("Input Error",e.getMessage(),true);
            return null;
        }
    }
}
