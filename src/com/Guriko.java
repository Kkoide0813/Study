package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Guriko {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("グー、チョキ、パーから選んで入力しろや＝＞");

        // マップ<キー、値>に登録
        Map<String,String> game = new HashMap<>();
        game.put("グー", "グリコ");
        game.put("チョキ", "チョコレート");
        game.put("パー", "パイナップル");

        // 入力内容
        String hand = sc.nextLine();
        // マップから検索・取得
        String word = game.get(hand);

        // 例外処理
        try{
            // キーに対応する値の長さを取得
            int length = word.length();

            System.out.println( hand + "で勝った場合" + word + "と言いながら" + length + "歩進め！！");
        }catch (Exception e){
            System.out.println("文字数の取得に失敗しました。発生した Exception が持つメッセージ: " + e.getMessage());
//            e.printStackTrace();
        }
    }
}


