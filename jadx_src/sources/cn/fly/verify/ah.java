package cn.fly.verify;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class ah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static gl f35704a;

    static {
        try {
            gl glVar = new gl(ax.g());
            f35704a = glVar;
            glVar.a("Fly_Pure_Cache", 1);
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        return f35704a.a(str);
    }

    public static String a(String str, String str2) {
        return f35704a.b(str, str2);
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            f35704a.k(str);
        } else {
            f35704a.a(str, str2);
        }
    }
}
