package com;

//// 人間の設計書
//public class Person {
//    // メンバ変数
//    private String name;
//    private int age;
//
//
//    public void setName(String setName) {
//        name = setName;
//    }
//    public String getName() {
//        return name;
//    }
//
//
//    public void setAge(int setAge) {
//        age = setAge;
//    }
//    public int getAge() {
//        return age;
//    }
//}
//
//// パーソンオブジェクトクラス
//class PersonObjects{
//    public static void main(String[] args) {
//        // 田中オブジェクト作成
//        Person tanaka = new Person();
//        tanaka.setName("田中");
//        tanaka.setAge(30);
//
//        // 鈴木オブジェクト作成
//        Person suzuki = new Person();
//        suzuki.setName("鈴木");
//        suzuki.setAge(25);
//
//        System.out.println(tanaka.getName());
//        System.out.println(tanaka.getAge());
//        System.out.println(suzuki.getName());
//        System.out.println(suzuki.getAge());
//    }
//}

//// 呼び出し先の人間クラス
//public class Person {
//
//    // フィールド 名前、年齢
//    String name;
//    int age;
//
//    // コンストラクタ
//    Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    // メソッド メッセージを出力する処理
//
//}
//
//// 呼び出し元
//public class Main {
//    public static void main(String[] args) {
//        Person person = new Person("小出", 35);
//
//    }
//}


//// クラスメソッドとインスタンスメソッドの呼び出し方
//class Sub {
//    int num = 2;
//    static String str = "クラスフィールドとして定義しました。";
//
//    // staticがついてるので、クラスメソッド・・・インスタンス化
//    public static void classMethod() {
//        System.out.println("クラスメソッドから出力しています。");
//        System.out.println(str);
//    }
//
//    public void instanceMethod() {
//        System.out.println("インスタンスメソッドから出力しています。");
//        System.out.println(num);
//    }
//}
//
//
//public class PersonObjects {
//    public static void main(String[] args) {
//        Sub subClass = new Sub();
//        subClass.instanceMethod();
//        subClass.classMethod(); // staticの呼び出し方ではないためIDEで警告は出るが、実行は可能
//        Sub.classMethod(); // staticの呼び出し方ではないためIDEで警告は出るが、実行は可能
//    }
//}
