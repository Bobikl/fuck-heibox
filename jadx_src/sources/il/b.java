package il;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: IdentifierManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f119401a = "IdentifierManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f119402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class<?> f119403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f119404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f119405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f119406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Method f119407g;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f119403c = cls;
            f119402b = cls.newInstance();
            f119404d = f119403c.getMethod("getUDID", Context.class);
            f119405e = f119403c.getMethod("getOAID", Context.class);
            f119406f = f119403c.getMethod("getVAID", Context.class);
            f119407g = f119403c.getMethod("getAAID", Context.class);
        } catch (Exception e10) {
            Log.e("IdentifierManager", "reflect exception!", e10);
        }
    }

    public static String a(Context context) {
        return b(context, f119404d);
    }

    private static String b(Context context, Method method) {
        Object obj = f119402b;
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
            Log.e("IdentifierManager", "invoke exception!", e10);
            return null;
        }
    }

    public static boolean c() {
        return (f119403c == null || f119402b == null) ? false : true;
    }

    public static String d(Context context) {
        return b(context, f119405e);
    }

    public static String e(Context context) {
        return b(context, f119406f);
    }

    public static String f(Context context) {
        return b(context, f119407g);
    }
}
