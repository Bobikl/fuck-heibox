package com.bumptech.glide.load;

import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class HttpException extends IOException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40817c = -1;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40818b;

    public HttpException(int i10) {
        this("Http request failed", i10);
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i10) {
        this(str, i10, null);
    }

    public HttpException(String str, int i10, @p0 Throwable th2) {
        super(str + ", status code: " + i10, th2);
        this.f40818b = i10;
    }

    public int a() {
        return this.f40818b;
    }
}
