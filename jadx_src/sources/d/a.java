package d;

import f.b;

/* JADX INFO: compiled from: JniWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f108124a = 0;

    static {
        try {
            System.loadLibrary("httpdns");
        } catch (Throwable unused) {
            b.g("Load dns so failed", new Object[0]);
        }
    }
}
