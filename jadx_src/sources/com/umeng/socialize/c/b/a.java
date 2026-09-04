package com.umeng.socialize.c.b;

import android.content.Context;
import com.umeng.socialize.utils.SLog;
import java.io.File;

/* JADX INFO: compiled from: CacheUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static void a() {
    }

    public static void a(Context context) {
        try {
            b(context);
        } catch (Exception e10) {
            SLog.error(e10);
        }
    }

    private static void b(Context context) {
        File[] fileArrListFiles = new File(context.getExternalFilesDir(null), c.f106180a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            file.delete();
        }
    }
}
