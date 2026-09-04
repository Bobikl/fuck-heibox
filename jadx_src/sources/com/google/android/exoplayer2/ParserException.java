package com.google.android.exoplayer2;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43516c;

    protected ParserException(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f43515b = z10;
        this.f43516c = i10;
    }

    public static ParserException a(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2) {
        return new ParserException(str, th2, true, 1);
    }

    public static ParserException b(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2) {
        return new ParserException(str, th2, true, 0);
    }

    public static ParserException c(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2) {
        return new ParserException(str, th2, true, 4);
    }

    public static ParserException d(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2) {
        return new ParserException(str, th2, false, 4);
    }

    public static ParserException e(@androidx.annotation.p0 String str) {
        return new ParserException(str, null, false, 1);
    }
}
