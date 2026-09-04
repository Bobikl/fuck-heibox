package com.ss.bytertc.engine.utils;

import android.content.Context;
import com.bytedance.realx.base.CalledByNative;
import com.ss.bytertc.base.utils.RtcContextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class EffectBeautyResource {
    @CalledByNative
    public static String GetEffectComposeMakeupPath() {
        Context applicationContext = RtcContextUtils.getApplicationContext();
        File file = new File(applicationContext.getFilesDir(), "basic_beauty");
        copyAssetFolder(applicationContext, "basic_beauty", file.getAbsolutePath());
        return file.getAbsolutePath();
    }

    private static boolean copyAssetFile(Context context, String str, String str2) {
        try {
            File file = new File(str2);
            if (file.exists()) {
                return true;
            }
            InputStream inputStreamOpen = context.getAssets().open(str);
            if (inputStreamOpen == null) {
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = inputStreamOpen.read(bArr);
                if (i10 == -1) {
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static boolean copyAssetFolder(Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list == null) {
                return false;
            }
            if (list.length == 0) {
                return copyAssetFile(context, str, str2);
            }
            boolean zMkdirs = new File(str2).mkdirs();
            for (String str3 : list) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                String str4 = File.separator;
                sb2.append(str4);
                sb2.append(str3);
                zMkdirs &= copyAssetFolder(context, sb2.toString(), str2 + str4 + str3);
            }
            return zMkdirs;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
