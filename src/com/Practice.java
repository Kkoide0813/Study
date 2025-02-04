package com;

//public class Practice {
//    public static void main(String[]args){
//
//        // みかんの価格
//        int price;
//
//        // みかんの価格変数に130を代入してください。
//        price = 130;
//
//        // みかんの個数を表現するint型の変数を宣言し、
//        int count;
//
//        // 初期値として6を代入してください。（変数名はおまかせします）
//        count = 6;
//
//        // みかんの総価格を表現するint型の変数を宣言し、
//        // 初期値に「みかん価格変数の値×みかん個数変数の値」の演算結果
//        int total = price * count;
//
//        // みかん価格変数の値を出力してください。
//        System.out.println(price);
//        // みかん個数変数の値を出力してください。
//        System.out.println(count);
//        // みかん総価格変数の値を出力してください。
//        System.out.println(total);
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

////int型の変数monthが宣言してあります。変数monthは月を表しています。
//public class Practice {
//    public static void main(String[] args) {
//        int month = 2;        // ←値を変更しながら実行
//        System.out.println(month + "月");
//        // switch文の開始
//        switch(month) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println(month + "月は31日まであります");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println(month + "月は30日まであります");
//                break;
//            case 2:
//                System.out.println("2月は28、または29日まであります");
//                break;
//            default :
//                System.out.println("エラー");
//                break;
//        }
//    }
//}

//2の場合は「2月は28、または、29日まであります」と表示します。
//
//また、変数monthの値が1〜12以外の値の場合は「エラー」と表示してください。
//
//条件分岐には必ずswitch文を使用してください。

public class Practice {
    public static void main(String[] args) {
        // 初期値なし
        List<String> modifiableList1 = new ArrayList<>();

        // 初期値あり
        List<String> modifiableList2 = new ArrayList<>() {
            {
                add("foo");
            }
        };
//        List<String> modifiableList3 = new ArrayList<>(Arrays.asList("foo", "bar"));

        // いずれの処理でも例外は発生しない
        modifiableList1.add("foo");
        modifiableList2.add("bar");

        List<String> modifiableList3 = new ArrayList<>(modifiableList2);
        modifiableList3.add("baz");

        System.out.println(modifiableList1);
        System.out.println(modifiableList2);
        System.out.println(modifiableList3);
    }
}