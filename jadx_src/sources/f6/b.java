package f6;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import org.json.JSONObject;
import t5.c;
import z5.e;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static a a(Context context, y5.a aVar) {
        if (aVar == null || aVar.n()) {
            return null;
        }
        return new a(aVar.i(), aVar.h(), aVar.j().longValue());
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        x5.b.e().b(context);
    }

    public static a c(Context context) throws Exception {
        try {
            r5.b bVarH = new c().h(x5.a.w(), context);
            if (bVarH != null) {
                JSONObject jSONObject = new JSONObject(bVarH.a());
                y5.a aVarA = y5.a.a(context);
                String strOptString = jSONObject.optString("tid");
                String string = jSONObject.getString("client_key");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(string)) {
                    aVarA.c(strOptString, string);
                }
                return a(context, aVarA);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void d(Context context) {
        y5.a.a(context).b();
    }

    public static String e(Context context) {
        b(context);
        return z5.c.d(context).c();
    }

    public static String f(Context context) {
        b(context);
        return z5.c.d(context).e();
    }

    public static synchronized String g(Context context) {
        a aVarK;
        aVarK = k(context);
        return a.d(aVarK) ? "" : aVarK.a();
    }

    public static String h(Context context) {
        b(context);
        l5.b.h();
        return l5.b.l();
    }

    public static String i(Context context) {
        b(context);
        l5.b.h();
        return l5.b.m();
    }

    public static a j(Context context) {
        y5.a aVarA = y5.a.a(context);
        if (aVarA.m()) {
            return null;
        }
        return new a(aVarA.i(), aVarA.h(), aVarA.j().longValue());
    }

    public static synchronized a k(Context context) {
        e.g(j5.a.f124275z, "load_create_tid");
        b(context);
        a aVarL = l(context);
        if (a.d(aVarL)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return null;
            }
            try {
                aVarL = c(context);
            } catch (Throwable unused) {
            }
        }
        return aVarL;
    }

    public static a l(Context context) {
        b(context);
        a aVarA = a(context, y5.a.a(context));
        if (aVarA == null) {
            e.g(j5.a.f124275z, "load_tid null");
        }
        return aVarA;
    }

    public static boolean m(Context context) throws Exception {
        e.g(j5.a.f124275z, "reset_tid");
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new Exception("Must be called on worker thread");
        }
        b(context);
        d(context);
        a aVarC = null;
        try {
            aVarC = c(context);
        } catch (Throwable unused) {
        }
        return !a.d(aVarC);
    }
}
