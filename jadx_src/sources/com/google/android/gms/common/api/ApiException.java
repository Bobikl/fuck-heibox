package com.google.android.gms.common.api;

import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class ApiException extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    @Deprecated
    protected final Status f52331b;

    public ApiException(@n0 Status status) {
        super(status.d() + ": " + (status.f() != null ? status.f() : ""));
        this.f52331b = status;
    }

    @n0
    public Status a() {
        return this.f52331b;
    }

    public int b() {
        return this.f52331b.d();
    }

    @p0
    @Deprecated
    public String c() {
        return this.f52331b.f();
    }
}
