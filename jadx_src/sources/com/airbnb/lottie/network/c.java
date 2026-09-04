package com.airbnb.lottie.network;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: LottieFetchResult.java */
/* JADX INFO: loaded from: classes6.dex */
public interface c extends Closeable {
    @n0
    InputStream V0() throws IOException;

    boolean c1();

    @p0
    String h();

    @p0
    String j();
}
