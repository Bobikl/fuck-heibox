package e5;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f118548a = "OpenIdHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f118549b;

    public static String a(Context context) {
        e eVarB = e.b();
        return eVarB.c(context.getApplicationContext(), eVarB.f118559c);
    }

    public static void b(boolean z10) {
        e.b();
        e.f(z10);
    }

    public static final boolean c() {
        Context context = null;
        try {
            if (f118549b == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
                f118549b = method;
                method.setAccessible(true);
            }
            context = (Context) f118549b.invoke(null, new Object[0]);
        } catch (Exception e10) {
            Log.e(f118548a, "ActivityThread:currentApplication --> " + e10.toString());
        }
        if (context == null) {
            return false;
        }
        return e.b().h(context, false);
    }

    public static String d(Context context) {
        e eVarB = e.b();
        return eVarB.c(context.getApplicationContext(), eVarB.f118558b);
    }

    public static String e(Context context) {
        e eVarB = e.b();
        return eVarB.c(context.getApplicationContext(), eVarB.f118557a);
    }

    public static String f(Context context) {
        e eVarB = e.b();
        return eVarB.c(context.getApplicationContext(), eVarB.f118560d);
    }
}
