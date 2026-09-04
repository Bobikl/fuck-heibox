package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BaseVector.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ByteBuffer f23039d;

    protected int a(int i10) {
        return this.f23036a + (i10 * this.f23038c);
    }

    protected void b(int i10, int i11, ByteBuffer byteBuffer) {
        this.f23039d = byteBuffer;
        if (byteBuffer != null) {
            this.f23036a = i10;
            this.f23037b = byteBuffer.getInt(i10 - 4);
            this.f23038c = i11;
        } else {
            this.f23036a = 0;
            this.f23037b = 0;
            this.f23038c = 0;
        }
    }

    protected int c() {
        return this.f23036a;
    }

    public int d() {
        return this.f23037b;
    }

    public void e() {
        b(0, 0, null);
    }
}
