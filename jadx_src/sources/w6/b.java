package w6;

import androidx.annotation.n0;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.m;

/* JADX INFO: compiled from: BytesResource.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements s<byte[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f141000b;

    public b(byte[] bArr) {
        this.f141000b = (byte[]) m.e(bArr);
    }

    @Override // com.bumptech.glide.load.engine.s
    public int a() {
        return this.f141000b.length;
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    public Class<byte[]> b() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.s
    @n0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f141000b;
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
    }
}
