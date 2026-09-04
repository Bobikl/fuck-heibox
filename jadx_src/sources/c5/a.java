package c5;

import android.content.Context;
import n4.b;
import n4.c;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static String a(Context context) {
        if (b.f131997a) {
            return c.b.f132005a.a(context.getApplicationContext(), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static boolean b() {
        if (b.f131997a) {
            return b.f131998b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String c(Context context) {
        if (b.f131997a) {
            return c.b.f132005a.a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String d(Context context) {
        if (b.f131997a) {
            return c.b.f132005a.a(context.getApplicationContext(), "GUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String e(Context context) {
        if (b.f131997a) {
            return c.b.f132005a.a(context.getApplicationContext(), "DUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void f(Context context) {
        b.f131998b = c.b.f132005a.b(context.getApplicationContext());
        b.f131997a = true;
    }
}
