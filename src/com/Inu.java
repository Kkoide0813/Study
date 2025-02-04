package com;
import java.util.Scanner;

public class Inu {
    private String name;
    // 名前：コンストラクタ
    Inu(String s){
        name = s; // nameのようなオブジェクトのデータを表す変数をフィールドと呼ぶ
    }
    // 動作：メソッド
    void naku(){
        System.out.println("わん。僕は" + name + "だ");
    }
}

class InuSample{
    public static void main(String[]args){
        Inu poti = new Inu("ポチ"); // クラス型はInu　インスタンス変数がpoti　
        poti.naku(); //　変数potiがnaku()メソッドを呼び出している　poti.naku();はインスタンスメソッドともいう

        Inu tanaka = new Inu("田中");
        tanaka.naku();

        Inu keiji = new Inu("けいじ");
        keiji.naku();

    }
}

//class InuSample2{
//    public static void main(String[]args)throws IOException{ //入出力の際に呼び出し先に例外を投げる処理
//        // 犬の名前を入力
//        //BufferedReaderオブジェクトを生成しbrで参照するようにする
//        InputStreamReader isr = new InputStreamReader(System.in); //
//        BufferedReader br = new BufferedReader(isr);
//        br.readLine();
//
//        Inu poti = new Inu("ポチ"); // クラス型はInu　インスタンス変数がpoti　
//        poti.naku(); //　変数potiがnaku()メソッドを呼び出している　poti.naku();はインスタンスメソッドともいう
//
//        Inu tanaka = new Inu("田中");
//        tanaka.naku();
//
//        Inu keiji = new Inu("けいじ");
//        keiji.naku();
//
//    }
//}


class InuSample2{

    public static void main(String[] args) {

        System.out.println("キーボードから入力してください");

        Scanner scan = new Scanner(System.in); // import java.util.Scanner・・・Scannerクラスとは、java.utilパッケージに属するクラス
        String str = scan.next();
        System.out.println("入力された文字は「" + str + "」です");

    }
}
