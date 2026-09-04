package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.b2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: SampleStream.java */
/* JADX INFO: loaded from: classes7.dex */
public interface d1 {

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int f47724f1 = 1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f47725g1 = 2;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f47726h1 = 4;

    /* JADX INFO: compiled from: SampleStream.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: SampleStream.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    void b() throws IOException;

    int c(b2 b2Var, DecoderInputBuffer decoderInputBuffer, int i10);

    boolean isReady();

    int n(long j10);
}
