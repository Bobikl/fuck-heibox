package com.google.android.exoplayer2.drm;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public final class UnsupportedDrmException extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44669c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f44670d = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44671b;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public UnsupportedDrmException(int i10) {
        this.f44671b = i10;
    }

    public UnsupportedDrmException(int i10, Exception exc) {
        super(exc);
        this.f44671b = i10;
    }
}
