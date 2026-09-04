package com.google.android.exoplayer2.source.ads;

import androidx.annotation.p0;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.upstream.r;
import java.io.IOException;

/* JADX INFO: compiled from: AdsLoader.java */
/* JADX INFO: loaded from: classes7.dex */
public interface e {

    /* JADX INFO: compiled from: AdsLoader.java */
    public interface a {
        void a(c cVar);

        void b(AdsMediaSource.AdLoadException adLoadException, r rVar);

        void c();

        void d();
    }

    void a(@p0 c3 c3Var);

    void b(AdsMediaSource adsMediaSource, r rVar, Object obj, com.google.android.exoplayer2.ui.c cVar, a aVar);

    void c(AdsMediaSource adsMediaSource, int i10, int i11, IOException iOException);

    void d(AdsMediaSource adsMediaSource, a aVar);

    void e(int... iArr);

    void f(AdsMediaSource adsMediaSource, int i10, int i11);

    void release();
}
