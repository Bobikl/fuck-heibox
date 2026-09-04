package g;

import android.content.Context;

/* JADX INFO: compiled from: NetworkChangeManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile a f118914a;

    public static void a(Context context) {
        if (context == null) {
            f.b.g("Install network change manager failed: context can not be null", new Object[0]);
        } else if (f118914a == null) {
            synchronized (c.class) {
                if (f118914a == null) {
                    f118914a = new d(context);
                }
            }
        }
    }
}
