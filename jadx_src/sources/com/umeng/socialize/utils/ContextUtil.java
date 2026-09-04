package com.umeng.socialize.utils;

import android.content.Context;
import com.umeng.socialize.net.dplus.db.DBConfig;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class ContextUtil {
    private static Context context;

    public static Context getContext() {
        if (context == null) {
            SLog.E(UmengText.INTER.CONTEXT_ERROR);
        }
        return context;
    }

    public static File getDataFile(String str) {
        Context context2 = context;
        if (context2 != null) {
            return context2.getDatabasePath(DBConfig.DB_NAME);
        }
        return null;
    }

    public static final int getIcon() {
        Context context2 = context;
        if (context2 == null) {
            return 0;
        }
        return context2.getApplicationInfo().icon;
    }

    public static final String getPackageName() {
        Context context2 = context;
        return context2 == null ? "" : context2.getPackageName();
    }

    public static void setContext(Context context2) {
        context = context2;
    }
}
