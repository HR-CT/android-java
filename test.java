package com.example.myapplication;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    private MainActivity mainActivity;

    @Before
    public void setUp() {
        // 在测试前初始化 MainActivity
        mainActivity = new MainActivity();
    }

    @Test
    public void testTextView() {
        // 创建一个 TextView，并设置文本
        TextView textView = new TextView(mainActivity);
        textView.setText("Hello, World!");

        // 断言 TextView 中的文本是否等于 "Hello, World!"
        assertEquals("Hello, World!", textView.getText().toString());
    }
}
