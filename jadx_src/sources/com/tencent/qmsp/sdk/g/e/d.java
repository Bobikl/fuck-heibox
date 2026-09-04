package com.tencent.qmsp.sdk.g.e;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static String a(Context context) {
        c cVarA = c.a();
        return cVarA.a(context.getApplicationContext(), cVarA.f101998c);
    }

    public static final boolean a() {
        Context context = null;
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
            method.setAccessible(true);
            context = (Context) method.invoke(null, new Object[0]);
        } catch (Exception e10) {
            Log.e(e5.b.f118548a, "ActivityThread:currentApplication --> " + e10.toString());
        }
        if (context == null) {
            return false;
        }
        return c.a().a(context, false);
    }

    public static String b(Context context) {
        c cVarA = c.a();
        return cVarA.a(context.getApplicationContext(), cVarA.f101997b);
    }
}
