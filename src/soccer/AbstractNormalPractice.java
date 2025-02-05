package soccer;

public class AbstractNormalPractice {
    public static void main(String[] args) {
        // センターフォワードオブジェクトの生成
        SoccerPlayer fwd = new CenterForward("田村", 11);

        // System.out.println()メソッドの裏側の処理がわからなかった。
        // String valueOf(fwd)｛処理｝ → fwd.toString()が呼ばれる → fwd.toString(getPositionName() + "選手名" + this.name + "背番号" + this.uniformNumber))
        System.out.println(fwd);

        // ボールを処理
        fwd.kickBall();
        fwd.catchBall();

        System.out.println();

    }
}
// ここにサッカー選手抽象クラスを作成してください
abstract class SoccerPlayer {
    private String name;
    private int uniformNumber;

    // 引数に選手名と背番号を受け取るコンストラクタ
    public SoccerPlayer(String name, int uniformNumber) {
        this.name = name;
        this.uniformNumber = uniformNumber;
    }

    // 「○○はボールを蹴りました」と出力します。
    public void kickBall(){
        System.out.println(this.name + "はボールを蹴りました");
    }
    // 「○○はボールを足で受け止めました」と出力
    public void catchBall(){
        System.out.println(this.name + "はボールを足で受け止めました");
    }
    // ポジション名取得 背番号はString型に変換が必要

    public abstract String getPositionName();
    @Override
    public String toString(){
        return getPositionName() + " 選手名 " + this.name + " 背番号 " + this.uniformNumber;
    }
}

// 派生クラス・・・センターフォワード
class CenterForward extends SoccerPlayer {

    // ポジション名 定数
    public static final String POSITION_NAME = "センターフォワード";

    public CenterForward(String name, int uniformNumber) {
        super(name, uniformNumber);
    }
    public String getPositionName() {
        return POSITION_NAME;
    }
}
