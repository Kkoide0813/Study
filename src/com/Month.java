package com;

public class Month {
    public static void main(String[] args) {
        int month = 9;
        System.out.println(month + "月");


        // switch文の開始
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println( month + "月は31日まであります");
                break;

            case 4, 6, 9, 11:
                System.out.println( month + "月は30日まであります");
                break;

            case 2:
                System.out.println( month + "月は28日まであります");
                break;
        }
    }


}
