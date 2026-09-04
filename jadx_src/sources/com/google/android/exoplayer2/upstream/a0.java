package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: DummyDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f50930b = new a0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o.a f50931c = new o.a() { // from class: com.google.android.exoplayer2.upstream.z
        @Override // com.google.android.exoplayer2.upstream.o.a
        public final o a() {
            return a0.p();
        }
    };

    private a0() {
    }

    public static /* synthetic */ a0 p() {
        return new a0();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws IOException {
        throw new IOException("DummyDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public /* synthetic */ Map b() {
        return n.a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void e(u0 u0Var) {
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }
}
