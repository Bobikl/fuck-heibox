package androidx.emoji2.text.flatbuffer;

/* JADX INFO: compiled from: ReadWriteBuf.java */
/* JADX INFO: loaded from: classes6.dex */
public interface q extends p {
    void a(float f10);

    void c(int i10);

    void d(long j10);

    void f(double d10);

    void g(short s10);

    void h(boolean z10);

    boolean i(int i10);

    void j(int i10, byte b10);

    int k();

    void l(byte b10);

    @Override // androidx.emoji2.text.flatbuffer.p
    int limit();

    void m(int i10, byte[] bArr, int i11, int i12);

    void o(byte[] bArr, int i10, int i11);

    void setBoolean(int i10, boolean z10);

    void setDouble(int i10, double d10);

    void setFloat(int i10, float f10);

    void setInt(int i10, int i11);

    void setLong(int i10, long j10);

    void setShort(int i10, short s10);
}
