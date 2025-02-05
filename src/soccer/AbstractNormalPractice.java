package soccer;

public class AbstractNormalPractice {
    public static void main(String[] args) {
        // センターフォワードオブジェクトの生成
        SoccerPlayer fwd = new CenterForward("田村", 11);
        // 自己紹介
        System.out.println(fwd);
        // ボールを処理
        fwd.kickBall();
        fwd.catchBall();
        System.out.println();

        // ゴールキーパーオブジェクトの生成
        SoccerPlayer keeper = new GoalKeeper("川島", 12);
        // 自己紹介
        System.out.println(keeper);
        // ボールを処理
        keeper.kickBall();
        keeper.catchBall();
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
//    // ポジション名取得 背番号はString型に変換が必要
//    public String getPositionName(){
//    }

}

// 派生クラス・・・センターフォワード
class CenterForward extends SoccerPlayer {
    // ポジション名 定数
    final String POSITION_NAME = "センターフォワード";

    public CenterForward(String name, int uniformNumber) {
        super(name, uniformNumber);
    }
}

// 派生クラス・・・キーパー
class GoalKeeper extends SoccerPlayer {
    // ポジション名 定数
    final String POSITION_NAME = "ゴールキーパー";

    public GoalKeeper(String name, int uniformNumber) {
        super(name, uniformNumber);
    }
}
