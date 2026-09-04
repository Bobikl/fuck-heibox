package t8;

import androidx.annotation.p0;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;

/* JADX INFO: compiled from: AesCipherDataSink.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f140671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f140672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final byte[] f140673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private c f140674d;

    public a(byte[] bArr, m mVar) {
        this(bArr, mVar, null);
    }

    public a(byte[] bArr, m mVar, @p0 byte[] bArr2) {
        this.f140671a = mVar;
        this.f140672b = bArr;
        this.f140673c = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public void a(r rVar) throws IOException {
        this.f140671a.a(rVar);
        this.f140674d = new c(1, this.f140672b, rVar.f51202i, rVar.f51200g + rVar.f51195b);
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public void close() throws IOException {
        this.f140674d = null;
        this.f140671a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f140673c == null) {
            ((c) u0.k(this.f140674d)).e(bArr, i10, i11);
            this.f140671a.write(bArr, i10, i11);
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            int iMin = Math.min(i11 - i12, this.f140673c.length);
            ((c) u0.k(this.f140674d)).d(bArr, i10 + i12, iMin, this.f140673c, 0);
            this.f140671a.write(this.f140673c, 0, iMin);
            i12 += iMin;
        }
    }
}
