package com.tencent.beacon.c;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.beacon.a.b.g;
import com.tencent.beacon.a.c.b;
import com.tencent.beacon.base.util.c;
import com.tencent.qmsp.sdk.u.U;

/* JADX INFO: compiled from: A.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f98953a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f98954b = "load_so";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f98955c = "load_so_version";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f98956d = "beacon_so_beacon";

    private static int a(Context context) {
        return b(context).getInt(f98954b, 0);
    }

    public static synchronized String a(Context context, int i10, Activity activity, String str, int i11) {
        int iA;
        String strA;
        String str2;
        String strA2 = b.a();
        if (c(context).equals(strA2)) {
            iA = a(context);
        } else {
            c.d("[audit] app update", new Object[0]);
            a(context, strA2);
            a(context, 0);
            iA = 0;
        }
        c.a("[audit] last load so occur fetal error cnt: %s", Integer.valueOf(iA));
        if (iA >= i11) {
            g.e().a("502", "[audit] load so error count over max!");
            c.b("[audit] !!!!!!!!!!LOADERROR!!!!!!!!!! ", new Object[0]);
            str2 = "LOADERROR";
        } else {
            try {
                try {
                    if (!f98953a) {
                        a(context, iA + 1);
                        c.d("[audit] load libBeacon.so success", new Object[0]);
                        f98953a = true;
                    }
                    strA = U.a(context, i10, activity, str);
                } catch (Throwable th2) {
                    a(context, th2);
                    strA = "NOLIB";
                }
            } catch (UnsatisfiedLinkError unused) {
                f98953a = true;
                strA = U.a(context, i10, activity, str);
            } catch (Throwable th3) {
                a(context, th3);
                strA = "NOLIB";
            }
            a(context, 0);
            str2 = strA;
        }
        if (str2 == null || str2.isEmpty()) {
            g.e().a("501", "[audit] audit run fail! result is empty!");
        }
        return str2;
    }

    private static void a(Context context, int i10) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        if (com.tencent.beacon.base.util.b.a(editorEdit)) {
            editorEdit.putInt(f98954b, i10).apply();
        }
    }

    private static void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = b(context).edit();
        if (com.tencent.beacon.base.util.b.a(editorEdit)) {
            editorEdit.putString(f98955c, str).apply();
        }
    }

    private static void a(Context context, Throwable th2) {
        c.b("[audit] libBeacon.so load failed!", new Object[0]);
        c.a(th2);
        g.e().a("501", "[audit] libBeacon.so load failed!", th2);
    }

    private static SharedPreferences b(Context context) {
        return context.getSharedPreferences(f98956d, 0);
    }

    private static String c(Context context) {
        return b(context).getString(f98955c, "");
    }
}
