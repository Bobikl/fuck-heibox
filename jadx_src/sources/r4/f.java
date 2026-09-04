package r4;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class f implements p4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f138794a = false;

    @Override // p4.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f138794a) {
            c5.a.f(context);
            this.f138794a = true;
        }
        boolean zB = c5.a.b();
        t4.a.d("getOAID", "isSupported", Boolean.valueOf(zB));
        if (zB) {
            return c5.a.c(context);
        }
        return null;
    }
}
