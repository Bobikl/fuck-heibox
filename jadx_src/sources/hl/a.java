package hl;

import android.content.Context;
import gl.b;

/* JADX INFO: compiled from: OpenIDSDK.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static void a(Context context) {
        gl.a.f119069b = b.C1079b.f119076a.b(context.getApplicationContext());
        gl.a.f119068a = true;
    }

    public static boolean b() {
        if (gl.a.f119068a) {
            return gl.a.f119069b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String c(Context context) {
        if (gl.a.f119068a) {
            return b.C1079b.f119076a.a(context.getApplicationContext(), "GUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String d(Context context) {
        if (gl.a.f119068a) {
            return b.C1079b.f119076a.a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String e(Context context) {
        if (gl.a.f119068a) {
            return b.C1079b.f119076a.a(context.getApplicationContext(), "DUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String f(Context context) {
        if (gl.a.f119068a) {
            return b.C1079b.f119076a.a(context.getApplicationContext(), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
