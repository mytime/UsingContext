package com.iwan.usingcontext;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by iwan on 16/1/6.
 */
public class Main2Activity extends Activity{

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        // 在Activity onCreate时，系统会先执行Application 的onCreate
        System.out.println("Main2Activity  onCreate");

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

        //启动Activity显示数据
        textView.setText("共享的数据是:" + getApp().getTexData());


        //点击事件
        findViewById(R.id.btnSaveData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //通过getApplicationContext 获取editText里面的信息保存存在全局里面
                ((App) getApplicationContext()).setTexData(editText.getText().toString());

                //
                textView.setText("共享的数据是:" + editText.getText().toString());
            }
        });
    }

    //
    public App getApp(){
        return (App) getApplicationContext();
    }
}
