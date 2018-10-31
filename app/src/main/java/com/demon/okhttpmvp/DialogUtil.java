package com.demon.okhttpmvp;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by D&LL on 2017/5/5.
 */

public class DialogUtil {
    public static int style = R.style.MyDialog;
    public static ProgressDialog getProgressDialog(final Context context) {
        ProgressDialog dialog = new ProgressDialog(context, style);
        dialog.setMessage("加载中...");
        return dialog;
    }
}
