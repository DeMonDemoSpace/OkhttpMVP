package com.demon.okhttpmvp.view;

import android.graphics.Bitmap;

/**
 * Created by D&LL on 2017/3/13.
 */

public interface MainView {//视图层，数据传输
    void getView(String s);
    void postView(String s);
    void imgView(Bitmap bitmap);
}
