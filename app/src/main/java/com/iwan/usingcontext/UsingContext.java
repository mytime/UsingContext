package com.iwan.usingcontext;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Context 的应用场景
 * Context作用：访问全局信息
 */
public class UsingContext extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.usingcontext);

        //直接赋值
        //Context -> this
//        tv = new TextView(this);
//        tv.setText("Hello world");


        //引用id来赋值 strings.xml
        //Context -> this
//        tv = new TextView(this);
//        tv.setText(R.string.hello);
//        setContentView(tv);


        //使用getResources()方法获取资源
//        System.out.println(getResources().getText(R.string.hello));

        //引用图片资源
        //Context: this
        ImageView iv = new ImageView(this);
        iv.setImageResource(R.mipmap.ic_launcher);
        setContentView(iv);

    }
}
