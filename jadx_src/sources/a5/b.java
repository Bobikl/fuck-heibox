package a5;

import android.content.Context;
import u4.d;
import y4.c;

/* JADX INFO: loaded from: classes6.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f1177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static u4.a f1178b;

    public static a b(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (f1177a == null) {
            f1178b = d.b(context, str);
            f1177a = new b();
        }
        return f1177a;
    }

    @Override // a5.a
    public c a(y4.d dVar) {
        return y4.b.b(f1178b.a(y4.b.a(dVar)));
    }

    @Override // a5.a
    public boolean logCollect(String str) {
        return f1178b.logCollect(str);
    }
}
