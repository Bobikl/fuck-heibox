package g5;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f118977a = "IdentifierManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Object f118978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f118979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f118980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f118981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f118982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f118983g;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f118979c = cls;
            f118978b = cls.newInstance();
            f118980d = f118979c.getMethod("getUDID", Context.class);
            f118981e = f118979c.getMethod("getOAID", Context.class);
            f118982f = f118979c.getMethod("getVAID", Context.class);
            f118983g = f118979c.getMethod("getAAID", Context.class);
        } catch (Exception e10) {
            Log.e(f118977a, "reflect exception!", e10);
        }
    }

    public static String a(Context context) {
        return b(context, f118983g);
    }

    public static String b(Context context, Method method) {
        Object obj = f118978b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception e10) {
            Log.e(f118977a, "invoke exception!", e10);
            return null;
        }
    }

    public static boolean c() {
        return (f118979c == null || f118978b == null) ? false : true;
    }

    public static String d(Context context) {
        return b(context, f118981e);
    }

    public static String e(Context context) {
        return b(context, f118980d);
    }

    public static String f(Context context) {
        return b(context, f118982f);
    }
}
