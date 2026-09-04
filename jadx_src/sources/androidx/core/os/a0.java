package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.w0;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(22)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a0 f20955a = new a0();

    private a0() {
    }

    @androidx.annotation.u
    @xh.m
    public static final void a(@dl.d PersistableBundle persistableBundle, @dl.e String str, boolean z10) {
        kotlin.jvm.internal.f0.p(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z10);
    }

    @androidx.annotation.u
    @xh.m
    public static final void b(@dl.d PersistableBundle persistableBundle, @dl.e String str, @dl.d boolean[] value) {
        kotlin.jvm.internal.f0.p(persistableBundle, "persistableBundle");
        kotlin.jvm.internal.f0.p(value, "value");
        persistableBundle.putBooleanArray(str, value);
    }
}
