package androidx.window.sidecar;

import android.content.Context;
import androidx.annotation.RestrictTo;
import dl.d;
import xh.h;
import xh.m;

/* JADX INFO: compiled from: WindowInfoTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r {
    static {
        s.Companion companion = s.INSTANCE;
    }

    @d
    @h(name = "getOrCreate")
    @m
    public static s a(@d Context context) {
        return s.INSTANCE.a(context);
    }

    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void b(@d t tVar) {
        s.INSTANCE.b(tVar);
    }

    @m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void c() {
        s.INSTANCE.c();
    }
}
