package com;

import jdk.jshell.DeclarationSnippet;

public class ClassBasicPractice {
    public static void main(String[] args) {
        // 1匹目のペットオブジェクトの生成
        Pet pet1 = new Pet();

        // 1匹目のペットデータを設定 インスタンスメソッドの呼び出し
        pet1.setType("犬");
        pet1.setName("ポチ");
        pet1.setAge((byte)4);
        pet1.setGender("オス");

        // 2匹目のペットオブジェクトの生成
        Pet pet2 = new Pet();

        pet2.setType("猫");
        pet2.setName("ミー");
        pet2.setAge((byte)2);
        pet2.setGender("メス");

        // 2匹のペットの紹介文を取得し、表示する
        System.out.println(pet1.getIntroduction());
        System.out.println(pet2.getIntroduction());
//        System.out.println(pet1.setType + "の名前は" + pet1.setName + "です。");
    }
}
class Pet {

    // フィールド
    private String type;
    private String name;
    private int age;
    private String gender;

    // setter
    public void setType(String type){
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    // getter
    public String getType(){
        return this.type;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }

    // 返すメッセージ
    public String getIntroduction(){
        return getType() + "の" + getName() + "は" + getGender() + "で" + getAge() + "歳です。";

    }
}