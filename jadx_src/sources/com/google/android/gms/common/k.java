package com.google.android.gms.common;

import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@s9.b
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f52585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f52586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f52587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Throwable f52588d;

    private k(String str, int i10, boolean z10, @Nullable String str2, @Nullable Throwable th2) {
        this.f52585a = str;
        this.f52586b = z10;
        this.f52587c = str2;
        this.f52588d = th2;
    }

    @androidx.annotation.n0
    public static k a(@androidx.annotation.n0 String str, @androidx.annotation.n0 String str2, @Nullable Throwable th2) {
        return new k(str, 1, false, str2, th2);
    }

    @androidx.annotation.n0
    public static k d(@androidx.annotation.n0 String str, int i10) {
        return new k(str, i10, true, null, null);
    }

    public final void b() {
        if (this.f52586b) {
            return;
        }
        String strConcat = "PackageVerificationRslt: ".concat(String.valueOf(this.f52587c));
        Throwable th2 = this.f52588d;
        if (th2 == null) {
            throw new SecurityException(strConcat);
        }
        throw new SecurityException(strConcat, th2);
    }

    public final boolean c() {
        return this.f52586b;
    }
}
