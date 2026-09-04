package cn.fly.verify;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f35783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f35784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Context f35785c;

    static {
        int i10;
        String strReplace = "1.0.0";
        try {
            strReplace = "2024-10-18".replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ".");
            i10 = Integer.parseInt("2024-10-18".replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ""));
        } catch (Throwable unused) {
            i10 = 1;
        }
        f35783a = i10;
        f35784b = strReplace;
    }

    public static bb a() {
        return eh.f36281e == null ? bb.DEFAULT : eh.f36281e;
    }

    @Deprecated
    public static String a(String str) {
        return el.a(str);
    }

    public static String a(String str, String str2, String str3, boolean z10) {
        return ek.a(str, str2, str3, z10);
    }

    public static synchronized void a(Context context) {
        a(context, null, null);
    }

    public static synchronized void a(Context context, String str, String str2) {
        try {
            if (context == null) {
                Log.e("SDK", "Init error, context is null");
                return;
            }
            if (f35785c == null) {
                f35785c = context.getApplicationContext();
                eh.f36277a = str;
                eh.f36278b = str2;
                ek.a(false);
            } else if (!TextUtils.isEmpty(str) && !str.equals(eh.f36277a)) {
                eh.f36277a = str;
                eh.f36278b = str2;
                ek.a(true);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void a(aw awVar) {
        az.a().a(awVar);
    }

    public static void a(aw awVar, boolean z10) {
        a(z10);
        a(awVar);
    }

    public static void a(boolean z10) {
        en.b(z10);
    }

    public static boolean b() {
        return eh.f36282f;
    }

    public static boolean c() {
        return eh.f36283g;
    }

    public static String d() {
        if (en.h()) {
            return ek.a();
        }
        return null;
    }

    public static String e() {
        return TextUtils.isEmpty(eh.f36278b) ? eh.f36280d : eh.f36278b;
    }

    public static Context f() {
        return f35785c;
    }

    public static Context g() {
        if (f35785c == null) {
            try {
                Context contextA = el.a();
                if (contextA != null) {
                    a(contextA);
                }
            } catch (Throwable unused) {
            }
        }
        return f35785c;
    }

    public static final boolean h() {
        return ek.c();
    }

    public static int i() {
        return en.c();
    }
}
