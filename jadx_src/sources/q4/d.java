package q4;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static synchronized void a(Context context, String str, String str2, String str3) {
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
