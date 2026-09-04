package com.google.android.exoplayer2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public final class ExoTimeoutException extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f43507c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43508d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f43509e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f43510f = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43511b;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public ExoTimeoutException(int i10) {
        super(a(i10));
        this.f43511b = i10;
    }

    private static String a(int i10) {
        if (i10 == 1) {
            return "Player release timed out.";
        }
        if (i10 != 2) {
            return i10 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }
}
