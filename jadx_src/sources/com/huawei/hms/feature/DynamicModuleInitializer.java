package com.huawei.hms.feature;

import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class DynamicModuleInitializer {
    private static WeakReference<Context> sContext;

    public static Context getContext() {
        WeakReference<Context> weakReference = sContext;
        if (weakReference != null) {
            return weakReference.get();
        }
        Log.i("DynamicModuleInitia", "getContext: is null");
        return null;
    }

    public static void initializeModule(Context context) {
        sContext = new WeakReference<>(context);
    }
}
