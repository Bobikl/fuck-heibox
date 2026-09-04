package p4;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f138156a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f138157b = false;

    public static synchronized String a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            b(context);
            b bVar = f138156a;
            if (bVar != null) {
                try {
                    return bVar.a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void b(Context context) {
        if (f138156a != null || f138157b) {
            return;
        }
        synchronized (c.class) {
            if (f138156a == null && !f138157b) {
                f138156a = r4.a.b(context);
                f138157b = true;
            }
        }
    }
}
