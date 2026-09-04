package t8;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.u0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AesCipherDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f140675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f140676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private c f140677d;

    public b(byte[] bArr, o oVar) {
        this.f140675b = oVar;
        this.f140676c = bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws IOException {
        long jA = this.f140675b.a(rVar);
        this.f140677d = new c(2, this.f140676c, rVar.f51202i, rVar.f51200g + rVar.f51195b);
        return jA;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public Map<String, List<String>> b() {
        return this.f140675b.b();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() throws IOException {
        this.f140677d = null;
        this.f140675b.close();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void e(u0 u0Var) {
        com.google.android.exoplayer2.util.a.g(u0Var);
        this.f140675b.e(u0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @p0
    public Uri getUri() {
        return this.f140675b.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f140675b.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        ((c) com.google.android.exoplayer2.util.u0.k(this.f140677d)).e(bArr, i10, i12);
        return i12;
    }
}
