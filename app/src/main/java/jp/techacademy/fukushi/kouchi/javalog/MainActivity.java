package jp.techacademy.fukushi.kouchi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("山田太郎", 33);     // 名前を山田太郎、年齢33歳で、Humanのインスタンスを作る

        human.say();    // 話す
     }
}
