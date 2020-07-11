package com.kiyotagbangers.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * 1番最初に呼ばれるライフサイクルメソッド
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ボタンをインスタンス化
        Button greeting = findViewById(R.id.greeting_button);

        // ボタンのクリック処理
        greeting.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView text = findViewById(R.id.greeting_text);
                text.setVisibility(View.VISIBLE);
            }
        });

    }

}
