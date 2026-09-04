package com.google.android.gms.common;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@s9.b
public class m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final m0 f52610e = new m0(true, 3, 1, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f52611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    final String f52612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    final Throwable f52613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f52614d;

    private m0(boolean z10, int i10, int i11, @Nullable String str, @Nullable Throwable th2) {
        this.f52611a = z10;
        this.f52614d = i10;
        this.f52612b = str;
        this.f52613c = th2;
    }

    @Deprecated
    static m0 b() {
        return f52610e;
    }

    static m0 c(@androidx.annotation.n0 String str) {
        return new m0(false, 1, 5, str, null);
    }

    static m0 d(@androidx.annotation.n0 String str, @androidx.annotation.n0 Throwable th2) {
        return new m0(false, 1, 5, str, th2);
    }

    static m0 f(int i10) {
        return new m0(true, i10, 1, null, null);
    }

    static m0 g(int i10, int i11, @androidx.annotation.n0 String str, @Nullable Throwable th2) {
        return new m0(false, i10, i11, str, th2);
    }

    @Nullable
    String a() {
        return this.f52612b;
    }

    final void e() {
        if (this.f52611a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f52613c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f52613c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
