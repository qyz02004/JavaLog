package jp.techacademy.fukushi.kouchi.javalog;

import android.util.Log;

class Human extends Animal {
    // クラス変数
    static String to_jp = "人間";

    // コンストラクタ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void say() {
            Log.d("javatest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」");
    }
}

