package o5;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static String a(Context context) {
        b bVarC = c.c(context);
        return (bVarC == null || k5.f.b(bVarC.g())) ? "ffffffffffffffffffffffff" : bVarC.g();
    }

    public static String b(Context context) {
        String strA = d.c(context).a();
        return (strA == null || k5.f.b(strA)) ? "ffffffffffffffffffffffff" : strA;
    }

    @Deprecated
    public static String c(Context context) {
        return a(context);
    }

    @Deprecated
    public static String d(Context context) {
        return b(context);
    }
}
