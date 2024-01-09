package baseball;

public class BaseBallTeam {
    //フィールド
    protected String name; //チーム名(東京ヤクルトスワローズ、横浜DeNAベイスターズ、阪神タイガース、読売ジャイアンツ、広島東洋カープ、中日ドラゴンズ)
    protected double win; //勝(80, 73, 68, 68, 66, 66)
    protected double lose; //負(59, 68, 71, 72, 74, 75)
    protected double draw; //分(4, 2, 4, 3, 3, 2)

    //引数なしのコンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //getRateメソッド
    protected double getRate() {
        double result = this.win / (this.win + this.lose);
        return result;
    }

    //reportメソッド
    protected void report() {
        double result = getRate();
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + result + "です。" );
    }



}



