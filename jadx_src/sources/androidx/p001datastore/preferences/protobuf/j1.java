package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: IterableByteBufferInputStream.java */
/* JADX INFO: loaded from: classes6.dex */
public class j1 extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator<ByteBuffer> f22475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer f22476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22477d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f22481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f22483j;

    j1(Iterable<ByteBuffer> iterable) {
        this.f22475b = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f22477d++;
        }
        this.f22478e = -1;
        if (a()) {
            return;
        }
        this.f22476c = i1.f22460e;
        this.f22478e = 0;
        this.f22479f = 0;
        this.f22483j = 0L;
    }

    private boolean a() {
        this.f22478e++;
        if (!this.f22475b.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f22475b.next();
        this.f22476c = next;
        this.f22479f = next.position();
        if (this.f22476c.hasArray()) {
            this.f22480g = true;
            this.f22481h = this.f22476c.array();
            this.f22482i = this.f22476c.arrayOffset();
        } else {
            this.f22480g = false;
            this.f22483j = z3.i(this.f22476c);
            this.f22481h = null;
        }
        return true;
    }

    private void b(int i10) {
        int i11 = this.f22479f + i10;
        this.f22479f = i11;
        if (i11 == this.f22476c.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f22478e == this.f22477d) {
            return -1;
        }
        if (this.f22480g) {
            int i10 = this.f22481h[this.f22479f + this.f22482i] & 255;
            b(1);
            return i10;
        }
        int iY = z3.y(((long) this.f22479f) + this.f22483j) & 255;
        b(1);
        return iY;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f22478e == this.f22477d) {
            return -1;
        }
        int iLimit = this.f22476c.limit();
        int i12 = this.f22479f;
        int i13 = iLimit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.f22480g) {
            System.arraycopy(this.f22481h, i12 + this.f22482i, bArr, i10, i11);
            b(i11);
        } else {
            int iPosition = this.f22476c.position();
            this.f22476c.position(this.f22479f);
            this.f22476c.get(bArr, i10, i11);
            this.f22476c.position(iPosition);
            b(i11);
        }
        return i11;
    }
}
