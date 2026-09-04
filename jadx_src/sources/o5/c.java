package o5;

import android.content.Context;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f132198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f132199b = new Object();

    public static long a(b bVar) {
        if (bVar == null) {
            return 0L;
        }
        String str = String.format("%s%s%s%s%s", bVar.g(), bVar.i(), Long.valueOf(bVar.a()), bVar.k(), bVar.d());
        if (k5.f.b(str)) {
            return 0L;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(str.getBytes());
        return adler32.getValue();
    }

    public static b b(Context context) {
        if (context == null) {
            return null;
        }
        synchronized (f132199b) {
            String strE = d.c(context).e();
            if (k5.f.b(strE)) {
                return null;
            }
            if (strE.endsWith("\n")) {
                strE = strE.substring(0, strE.length() - 1);
            }
            b bVar = new b();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strB = k5.d.b(context);
            String strD = k5.d.d(context);
            bVar.h(strB);
            bVar.c(strB);
            bVar.e(jCurrentTimeMillis);
            bVar.f(strD);
            bVar.j(strE);
            bVar.b(a(bVar));
            return bVar;
        }
    }

    public static synchronized b c(Context context) {
        b bVar = f132198a;
        if (bVar != null) {
            return bVar;
        }
        if (context == null) {
            return null;
        }
        b bVarB = b(context);
        f132198a = bVarB;
        return bVarB;
    }
}
