package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Struct.java */
/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f23092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f23093b;

    public void a() {
        b(0, null);
    }

    protected void b(int i10, ByteBuffer byteBuffer) {
        this.f23093b = byteBuffer;
        if (byteBuffer != null) {
            this.f23092a = i10;
        } else {
            this.f23092a = 0;
        }
    }
}
