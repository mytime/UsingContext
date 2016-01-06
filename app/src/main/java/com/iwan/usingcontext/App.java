package com.iwan.usingcontext;

import android.app.Application;

/**
 * 自定义Application
 * Application才是真正Android全局上下文对象
 * 需要在Androidmanifast中配置
 */
public class App extends Application {

    private String texData = "default";

    public String getTexData() {
        return texData;
    }

    public void setTexData(String texData) {
        this.texData = texData;
    }


    //Application 生命周期
    //1 创建时执行
    // 在Activity onCreate时，系统会先执行Application 的onCreate


    @Override
    public void onCreate() {
        super.onCreate();

        System.out.println("App onCreate");
    }


    //2 结束,仅在模拟环境下执行

    @Override
    public void onTerminate() {
        super.onTerminate();

    }

    //3 低内存的时候执行

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    //4 内存清理时执行

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
