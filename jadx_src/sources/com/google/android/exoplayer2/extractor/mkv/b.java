package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.l;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: EbmlProcessor.java */
/* JADX INFO: loaded from: classes7.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f45101a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f45102b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f45103c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45104d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f45105e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f45106f = 5;

    /* JADX INFO: compiled from: EbmlProcessor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(int i10) throws ParserException;

    void b(int i10, double d10) throws ParserException;

    void c(int i10, long j10) throws ParserException;

    void d(int i10, int i11, l lVar) throws IOException;

    void e(int i10, String str) throws ParserException;

    void f(int i10, long j10, long j11) throws ParserException;

    int g(int i10);

    boolean h(int i10);
}
