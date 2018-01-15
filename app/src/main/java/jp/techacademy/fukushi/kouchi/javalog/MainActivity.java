package jp.techacademy.fukushi.kouchi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human yamada = new Human("山田太郎", 33,"読書");     // 名前を山田太郎、年齢33歳、趣味は読書で、Humanのインスタンスを作る
        Human suzuki = new Human("鈴木次郎", 43,"スポーツ");     // 名前を鈴木次郎、年齢43歳、趣味はスポーツで、Humanのインスタンスを作る

        yamada.say();       // 話す
        yamada.think();    // 考える

        suzuki.say();       // 話す
        suzuki.think();    // 考える
     }
}
