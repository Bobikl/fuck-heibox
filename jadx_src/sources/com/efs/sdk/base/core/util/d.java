package com.efs.sdk.base.core.util;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile String f42579a = "";

    public static String a(Context context) {
        if (TextUtils.isEmpty(f42579a)) {
            synchronized (d.class) {
                if (TextUtils.isEmpty(f42579a)) {
                    String strB = b(context);
                    f42579a = strB;
                    if (TextUtils.isEmpty(strB)) {
                        f42579a = c(context);
                    }
                }
            }
        }
        return f42579a;
    }

    private static String b(Context context) {
        try {
            File file = new File(a.a(context), "efsid");
            if (file.exists()) {
                return b.a(file);
            }
            return null;
        } catch (Exception e10) {
            Log.e("efs.base", "get uuid error", e10);
            return null;
        }
    }

    private static String c(Context context) {
        String string = "";
        for (int i10 = 0; i10 < 3; i10++) {
            try {
                string = UUID.randomUUID().toString();
                if (!TextUtils.isEmpty(string)) {
                    break;
                }
            } catch (Throwable unused) {
            }
        }
        try {
            File fileA = a.a(context);
            File file = new File(fileA, "efsid" + Process.myPid());
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            b.a(file, string);
            if (file.renameTo(new File(fileA, "efsid"))) {
                file.delete();
            }
        } catch (Exception e10) {
            Log.e("efs.base", "save uuid '" + string + "' error", e10);
        }
        return string;
    }
}
