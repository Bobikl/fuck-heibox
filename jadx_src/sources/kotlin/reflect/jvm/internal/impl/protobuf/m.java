package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: LiteralByteString.java */
/* JADX INFO: loaded from: classes5.dex */
public class m extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final byte[] f127364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f127365e = 0;

    /* JADX INFO: compiled from: LiteralByteString.java */
    public class b implements d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f127366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f127367c;

        private b() {
            this.f127366b = 0;
            this.f127367c = m.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(l());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f127366b < this.f127367c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte l() {
            try {
                byte[] bArr = m.this.f127364d;
                int i10 = this.f127366b;
                this.f127366b = i10 + 1;
                return bArr[i10];
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new NoSuchElementException(e10.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    m(byte[] bArr) {
        this.f127364d = bArr;
    }

    static int I(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String A(String str) throws UnsupportedEncodingException {
        return new String(this.f127364d, H(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void E(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f127364d, H() + i10, i11);
    }

    public byte F(int i10) {
        return this.f127364d[i10];
    }

    boolean G(m mVar, int i10, int i11) {
        if (i11 > mVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 > mVar.size()) {
            int size2 = mVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f127364d;
        byte[] bArr2 = mVar.f127364d;
        int iH = H() + i11;
        int iH2 = H();
        int iH3 = mVar.H() + i10;
        while (iH2 < iH) {
            if (bArr[iH2] != bArr2[iH3]) {
                return false;
            }
            iH2++;
            iH3++;
        }
        return true;
    }

    protected int H() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof m) {
            return G((m) obj, 0, size());
        }
        if (obj instanceof r) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int iV = this.f127365e;
        if (iV == 0) {
            int size = size();
            iV = v(size, 0, size);
            if (iV == 0) {
                iV = 1;
            }
            this.f127365e = iV;
        }
        return iV;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void l(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f127364d, i10, bArr, i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int m() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean o() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean q() {
        int iH = H();
        return u.f(this.f127364d, iH, size() + iH);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f127364d.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public e t() {
        return e.h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int v(int i10, int i11, int i12) {
        return I(i10, this.f127364d, H() + i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int w(int i10, int i11, int i12) {
        int iH = H() + i11;
        return u.g(i10, this.f127364d, iH, i12 + iH);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int x() {
        return this.f127365e;
    }
}
