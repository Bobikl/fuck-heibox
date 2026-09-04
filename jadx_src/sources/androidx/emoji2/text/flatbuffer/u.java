package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: Table.java */
/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f23094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f23095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Utf8 f23098e = Utf8.d();

    /* JADX INFO: compiled from: Table.java */
    public class a implements Comparator<Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f23099b;

        a(ByteBuffer byteBuffer) {
            this.f23099b = byteBuffer;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Integer num, Integer num2) {
            return u.this.s(num, num2, this.f23099b);
        }
    }

    protected static boolean a(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (str.charAt(i10) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i10))) {
                return false;
            }
        }
        return true;
    }

    protected static int c(int i10, ByteBuffer byteBuffer) {
        return i10 + byteBuffer.getInt(i10);
    }

    protected static int e(int i10, int i11, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - i11;
        return byteBuffer.getShort((i10 + iCapacity) - byteBuffer.getInt(iCapacity)) + iCapacity;
    }

    protected static String i(int i10, ByteBuffer byteBuffer, Utf8 utf8) {
        int i11 = i10 + byteBuffer.getInt(i10);
        return utf8.a(byteBuffer, i11 + 4, byteBuffer.getInt(i11));
    }

    protected static u k(u uVar, int i10, ByteBuffer byteBuffer) {
        uVar.g(c(i10, byteBuffer), byteBuffer);
        return uVar;
    }

    protected static int p(int i10, int i11, ByteBuffer byteBuffer) {
        int i12 = i10 + byteBuffer.getInt(i10);
        int i13 = i11 + byteBuffer.getInt(i11);
        int i14 = byteBuffer.getInt(i12);
        int i15 = byteBuffer.getInt(i13);
        int i16 = i12 + 4;
        int i17 = i13 + 4;
        int iMin = Math.min(i14, i15);
        for (int i18 = 0; i18 < iMin; i18++) {
            int i19 = i18 + i16;
            int i20 = i18 + i17;
            if (byteBuffer.get(i19) != byteBuffer.get(i20)) {
                return byteBuffer.get(i19) - byteBuffer.get(i20);
            }
        }
        return i14 - i15;
    }

    protected static int q(int i10, byte[] bArr, ByteBuffer byteBuffer) {
        int i11 = i10 + byteBuffer.getInt(i10);
        int i12 = byteBuffer.getInt(i11);
        int length = bArr.length;
        int i13 = i11 + 4;
        int iMin = Math.min(i12, length);
        for (int i14 = 0; i14 < iMin; i14++) {
            int i15 = i14 + i13;
            if (byteBuffer.get(i15) != bArr[i14]) {
                return byteBuffer.get(i15) - bArr[i14];
            }
        }
        return i12 - length;
    }

    protected int b(int i10) {
        return i10 + this.f23095b.getInt(i10);
    }

    protected int d(int i10) {
        if (i10 < this.f23097d) {
            return this.f23095b.getShort(this.f23096c + i10);
        }
        return 0;
    }

    public void f() {
        g(0, null);
    }

    protected void g(int i10, ByteBuffer byteBuffer) {
        this.f23095b = byteBuffer;
        if (byteBuffer == null) {
            this.f23094a = 0;
            this.f23096c = 0;
            this.f23097d = 0;
        } else {
            this.f23094a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f23096c = i11;
            this.f23097d = this.f23095b.getShort(i11);
        }
    }

    protected String h(int i10) {
        return i(i10, this.f23095b, this.f23098e);
    }

    protected u j(u uVar, int i10) {
        return k(uVar, i10, this.f23095b);
    }

    protected int l(int i10) {
        int i11 = i10 + this.f23094a;
        return i11 + this.f23095b.getInt(i11) + 4;
    }

    protected ByteBuffer m(int i10, int i11) {
        int iD = d(i10);
        if (iD == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.f23095b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int iL = l(iD);
        byteBufferOrder.position(iL);
        byteBufferOrder.limit(iL + (o(iD) * i11));
        return byteBufferOrder;
    }

    protected ByteBuffer n(ByteBuffer byteBuffer, int i10, int i11) {
        int iD = d(i10);
        if (iD == 0) {
            return null;
        }
        int iL = l(iD);
        byteBuffer.rewind();
        byteBuffer.limit((o(iD) * i11) + iL);
        byteBuffer.position(iL);
        return byteBuffer;
    }

    protected int o(int i10) {
        int i11 = i10 + this.f23094a;
        return this.f23095b.getInt(i11 + this.f23095b.getInt(i11));
    }

    public ByteBuffer r() {
        return this.f23095b;
    }

    protected int s(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    protected void t(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        Arrays.sort(numArr, new a(byteBuffer));
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = numArr[i11].intValue();
        }
    }
}
