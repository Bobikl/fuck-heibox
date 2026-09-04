package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.w0;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(21)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c f20957a = new c();

    private c() {
    }

    @androidx.annotation.u
    @xh.m
    public static final void a(@dl.d Bundle bundle, @dl.d String key, @dl.e Size size) {
        kotlin.jvm.internal.f0.p(bundle, "bundle");
        kotlin.jvm.internal.f0.p(key, "key");
        bundle.putSize(key, size);
    }

    @androidx.annotation.u
    @xh.m
    public static final void b(@dl.d Bundle bundle, @dl.d String key, @dl.e SizeF sizeF) {
        kotlin.jvm.internal.f0.p(bundle, "bundle");
        kotlin.jvm.internal.f0.p(key, "key");
        bundle.putSizeF(key, sizeF);
    }
}
