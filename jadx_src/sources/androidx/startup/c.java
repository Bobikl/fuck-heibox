package androidx.startup;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: StartupLogger.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f27496a = "StartupLogger";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final boolean f27497b = false;

    private c() {
    }

    public static void a(@n0 String str, @p0 Throwable th2) {
        Log.e(f27496a, str, th2);
    }

    public static void b(@n0 String str) {
        Log.i(f27496a, str);
    }

    public static void c(@n0 String str) {
        Log.w(f27496a, str);
    }
}
