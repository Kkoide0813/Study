package com;
import java.util.*;

public class SampleList {
    public static void main(String[] args) {
        // List型のインスタンス作成
       List<String> sampleList = new ArrayList<>();
       sampleList.add("A");
       sampleList.add("B");

       // 0番の要素の取得
       String text = sampleList.get(0);
       System.out.println(text);

        // 要素数の取得
        int listSize = sampleList.size();
        System.out.println(listSize);

        // for文を使って全要素の取得
        for (String s : sampleList){
            System.out.println(s);
        }

        // Set型のインスタンス作成
        Set<String> sampleset = new HashSet<>();
        sampleset.add("あ");
        sampleset.add("い");
        sampleset.add("う");

        // 要素数の取得
        // 全要素の取得
        // すでに要素が存在するかの確認

        // Integerの配列をリストに変換
        Integer[] nums = {10, 2, 3, 5, 6, 14};
        List<Integer> list = Arrays.asList(nums);
        // リストを昇順でソート
        Collections.sort(list);
        System.out.println(list);
        // リストを降順でソート
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}

