package com.google.android.exoplayer2.transformer;

import android.os.ParcelFileDescriptor;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Muxer.java */
/* JADX INFO: loaded from: classes7.dex */
public interface d {

    /* JADX INFO: compiled from: Muxer.java */
    public interface a {
        d a(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException;

        boolean b(String str);

        boolean c(@p0 String str, String str2);

        d d(String str, String str2) throws IOException;
    }

    void a(boolean z10);

    void b(int i10, ByteBuffer byteBuffer, boolean z10, long j10);

    int c(a2 a2Var);
}
