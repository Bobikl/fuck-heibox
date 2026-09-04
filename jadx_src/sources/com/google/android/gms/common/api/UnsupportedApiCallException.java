package com.google.android.gms.common.api;

import androidx.annotation.n0;
import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Feature f52347b;

    @v8.a
    public UnsupportedApiCallException(@n0 Feature feature) {
        this.f52347b = feature;
    }

    @Override // java.lang.Throwable
    @n0
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f52347b));
    }
}
