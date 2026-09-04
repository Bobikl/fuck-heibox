package q4;

import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static String a(String str) {
        String strA;
        try {
            strA = f.a(str);
        } catch (Throwable unused) {
            strA = "";
        }
        if (!e6.a.c(strA)) {
            return strA;
        }
        return c.a(".SystemConfig" + File.separator + str);
    }
}
