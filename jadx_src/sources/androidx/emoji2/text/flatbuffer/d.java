package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: ByteBufferReadWriteBuf.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f23040a;

    public d(ByteBuffer byteBuffer) {
        this.f23040a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void a(float f10) {
        this.f23040a.putFloat(f10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void c(int i10) {
        this.f23040a.putInt(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void d(long j10) {
        this.f23040a.putLong(j10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte[] e() {
        return this.f23040a.array();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void f(double d10) {
        this.f23040a.putDouble(d10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void g(short s10) {
        this.f23040a.putShort(s10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte get(int i10) {
        return this.f23040a.get(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public boolean getBoolean(int i10) {
        return get(i10) != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public double getDouble(int i10) {
        return this.f23040a.getDouble(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public float getFloat(int i10) {
        return this.f23040a.getFloat(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public int getInt(int i10) {
        return this.f23040a.getInt(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public long getLong(int i10) {
        return this.f23040a.getLong(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public short getShort(int i10) {
        return this.f23040a.getShort(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void h(boolean z10) {
        this.f23040a.put(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public boolean i(int i10) {
        return i10 <= this.f23040a.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void j(int i10, byte b10) {
        i(i10 + 1);
        this.f23040a.put(i10, b10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public int k() {
        return this.f23040a.position();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void l(byte b10) {
        this.f23040a.put(b10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q, androidx.emoji2.text.flatbuffer.p
    public int limit() {
        return this.f23040a.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void m(int i10, byte[] bArr, int i11, int i12) {
        i((i12 - i11) + i10);
        int iPosition = this.f23040a.position();
        this.f23040a.position(i10);
        this.f23040a.put(bArr, i11, i12);
        this.f23040a.position(iPosition);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public String n(int i10, int i11) {
        return Utf8Safe.h(this.f23040a, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void o(byte[] bArr, int i10, int i11) {
        this.f23040a.put(bArr, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setBoolean(int i10, boolean z10) {
        j(i10, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setDouble(int i10, double d10) {
        i(i10 + 8);
        this.f23040a.putDouble(i10, d10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setFloat(int i10, float f10) {
        i(i10 + 4);
        this.f23040a.putFloat(i10, f10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setInt(int i10, int i11) {
        i(i10 + 4);
        this.f23040a.putInt(i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setLong(int i10, long j10) {
        i(i10 + 8);
        this.f23040a.putLong(i10, j10);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setShort(int i10, short s10) {
        i(i10 + 2);
        this.f23040a.putShort(i10, s10);
    }
}
