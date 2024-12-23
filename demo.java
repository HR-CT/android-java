package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class demo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 创建并设置布局
        TextView textView = new TextView(this);
        textView.setText("Hello, World!");
        textView.setTextSize(30);  // 设置字体大小为 30sp
        setContentView(textView);  // 设置显示内容
    }
}
