package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.w0;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(18)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f20956a = new b();

    private b() {
    }

    @androidx.annotation.u
    @xh.m
    public static final void a(@dl.d Bundle bundle, @dl.d String key, @dl.e IBinder iBinder) {
        kotlin.jvm.internal.f0.p(bundle, "bundle");
        kotlin.jvm.internal.f0.p(key, "key");
        bundle.putBinder(key, iBinder);
    }
}
