package com.tencent.qmsp.oaid2;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class y {
    public static String a(Context context) {
        x xVarA = x.a();
        return xVarA.a(context.getApplicationContext(), xVarA.f101668c);
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
        return x.a().a(context, false);
    }

    public static String b(Context context) {
        x xVarA = x.a();
        return xVarA.a(context.getApplicationContext(), xVarA.f101667b);
    }
}
