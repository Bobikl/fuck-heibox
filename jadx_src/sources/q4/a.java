package q4;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static String a(Context context, String str, String str2) {
        synchronized (a.class) {
            String strE = null;
            if (context != null) {
                try {
                    if (!e6.a.c(str) && !e6.a.c(str2)) {
                        try {
                            String strA = e.a(context, str, str2, "");
                            if (e6.a.c(strA)) {
                                return null;
                            }
                            strE = d6.c.e(d6.c.a(), strA);
                        } catch (Throwable unused) {
                        }
                        return strE;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return null;
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        synchronized (a.class) {
            if (e6.a.c(str) || e6.a.c(str2) || context == null) {
                return;
            }
            try {
                String strB = d6.c.b(d6.c.a(), str3);
                HashMap map = new HashMap();
                map.put(str2, strB);
                e.b(context, str, map);
            } catch (Throwable unused) {
            }
        }
    }
}
