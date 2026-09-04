package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;

/* JADX INFO: compiled from: ArrayReadWriteBuf.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f23034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23035b;

    public a() {
        this(10);
    }

    public a(int i10) {
        this(new byte[i10]);
    }

    public a(byte[] bArr) {
        this.f23034a = bArr;
        this.f23035b = 0;
    }

    public a(byte[] bArr, int i10) {
        this.f23034a = bArr;
        this.f23035b = i10;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void a(float f10) {
        setFloat(this.f23035b, f10);
        this.f23035b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void c(int i10) {
        setInt(this.f23035b, i10);
        this.f23035b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void d(long j10) {
        setLong(this.f23035b, j10);
        this.f23035b += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte[] e() {
        return this.f23034a;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void f(double d10) {
        setDouble(this.f23035b, d10);
        this.f23035b += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void g(short s10) {
        setShort(this.f23035b, s10);
        this.f23035b += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public byte get(int i10) {
        return this.f23034a[i10];
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public boolean getBoolean(int i10) {
        return this.f23034a[i10] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public double getDouble(int i10) {
        return Double.longBitsToDouble(getLong(i10));
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public float getFloat(int i10) {
        return Float.intBitsToFloat(getInt(i10));
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public int getInt(int i10) {
        byte[] bArr = this.f23034a;
        return (bArr[i10] & 255) | (bArr[i10 + 3] << com.google.common.base.a.B) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public long getLong(int i10) {
        byte[] bArr = this.f23034a;
        int i11 = i10 + 1;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8) | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i13 + 1;
        long j12 = j11 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i14 + 1;
        long j13 = j12 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i15 + 1;
        return j13 | ((((long) bArr[i15]) & 255) << 40) | ((255 & ((long) bArr[i16])) << 48) | (((long) bArr[i16 + 1]) << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public short getShort(int i10) {
        byte[] bArr = this.f23034a;
        return (short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void h(boolean z10) {
        setBoolean(this.f23035b, z10);
        this.f23035b++;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public boolean i(int i10) {
        byte[] bArr = this.f23034a;
        if (bArr.length > i10) {
            return true;
        }
        int length = bArr.length;
        this.f23034a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void j(int i10, byte b10) {
        i(i10 + 1);
        this.f23034a[i10] = b10;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public int k() {
        return this.f23035b;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void l(byte b10) {
        j(this.f23035b, b10);
        this.f23035b++;
    }

    @Override // androidx.emoji2.text.flatbuffer.q, androidx.emoji2.text.flatbuffer.p
    public int limit() {
        return this.f23035b;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void m(int i10, byte[] bArr, int i11, int i12) {
        i((i12 - i11) + i10);
        System.arraycopy(bArr, i11, this.f23034a, i10, i12);
    }

    @Override // androidx.emoji2.text.flatbuffer.p
    public String n(int i10, int i11) {
        return Utf8Safe.g(this.f23034a, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void o(byte[] bArr, int i10, int i11) {
        m(this.f23035b, bArr, i10, i11);
        this.f23035b += i11;
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setBoolean(int i10, boolean z10) {
        j(i10, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setDouble(int i10, double d10) {
        i(i10 + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i11 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.f23034a;
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i11 >> 8) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i11 >> 16) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((i11 >> 24) & 255);
        int i16 = (int) (jDoubleToRawLongBits >> 32);
        int i17 = i15 + 1;
        bArr[i15] = (byte) (i16 & 255);
        int i18 = i17 + 1;
        bArr[i17] = (byte) ((i16 >> 8) & 255);
        bArr[i18] = (byte) ((i16 >> 16) & 255);
        bArr[i18 + 1] = (byte) ((i16 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setFloat(int i10, float f10) {
        i(i10 + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        byte[] bArr = this.f23034a;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (iFloatToRawIntBits & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i12] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i12 + 1] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setInt(int i10, int i11) {
        i(i10 + 4);
        byte[] bArr = this.f23034a;
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i11 >> 8) & 255);
        bArr[i13] = (byte) ((i11 >> 16) & 255);
        bArr[i13 + 1] = (byte) ((i11 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setLong(int i10, long j10) {
        i(i10 + 8);
        int i11 = (int) j10;
        byte[] bArr = this.f23034a;
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i11 >> 8) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i11 >> 16) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((i11 >> 24) & 255);
        int i16 = (int) (j10 >> 32);
        int i17 = i15 + 1;
        bArr[i15] = (byte) (i16 & 255);
        int i18 = i17 + 1;
        bArr[i17] = (byte) ((i16 >> 8) & 255);
        bArr[i18] = (byte) ((i16 >> 16) & 255);
        bArr[i18 + 1] = (byte) ((i16 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.q
    public void setShort(int i10, short s10) {
        i(i10 + 2);
        byte[] bArr = this.f23034a;
        bArr[i10] = (byte) (s10 & 255);
        bArr[i10 + 1] = (byte) ((s10 >> 8) & 255);
    }
}
