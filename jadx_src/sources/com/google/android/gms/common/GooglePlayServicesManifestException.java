package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52306b;

    public GooglePlayServicesManifestException(int i10, @androidx.annotation.n0 String str) {
        super(str);
        this.f52306b = i10;
    }

    public int a() {
        return this.f52306b;
    }

    public int b() {
        return e.f52411a;
    }
}
