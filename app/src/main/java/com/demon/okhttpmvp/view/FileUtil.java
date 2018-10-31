package com.demon.okhttpmvp.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by D&LL on 2017/5/5.
 */

public class FileUtil {
    /**
     * 根据输入流保存文件，文件名设置为name
     *
     * @param name
     * @param inputStream
     */
    public static Bitmap saveFile(String name, InputStream inputStream) {
        Bitmap bitmap = null;
        File appDir = new File(Environment.getExternalStorageDirectory(),
                "Download");//存储路径为SD卡根目录Download文件
        if (!appDir.exists()) {
            appDir.mkdir();
        }

        String fileName = name;
        File file = new File(appDir, fileName);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            bitmap = BitmapFactory.decodeStream(inputStream);
            byte[] buffer = new byte[2048];
            int len = 0;
            while ((len = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
            fileOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
