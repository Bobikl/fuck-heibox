package anet.channel.util;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f29998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f29999b = 0;

    public a(InputStream inputStream) {
        this.f29998a = null;
        if (inputStream == null) {
            throw new NullPointerException("input stream cannot be null");
        }
        this.f29998a = inputStream;
    }

    public long a() {
        return this.f29999b;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.f29999b++;
        return this.f29998a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f29998a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f29999b += (long) i12;
        }
        return i12;
    }
}
