package androidx.p001datastore.preferences.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f22236c = 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f22237d = 256;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f22238e = 8192;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ByteString f22239f = new LiteralByteString(i1.f22459d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final e f22240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f22241h = 255;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<ByteString> f22242i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22243b = 0;

    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f22244k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f22245l;

        BoundedByteString(byte[] bArr, int i10, int i11) {
            super(bArr);
            ByteString.j(i10, i10 + i11, bArr.length);
            this.f22244k = i10;
            this.f22245l = i11;
        }

        private void D0(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.p001datastore.preferences.protobuf.ByteString
        protected void B(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f22246j, C0() + i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        protected int C0() {
            return this.f22244k;
        }

        Object E0() {
            return ByteString.s0(d0());
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.p001datastore.preferences.protobuf.ByteString
        byte F(int i10) {
            return this.f22246j[this.f22244k + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.p001datastore.preferences.protobuf.ByteString
        public byte h(int i10) {
            ByteString.i(i10, size());
            return this.f22246j[this.f22244k + i10];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.p001datastore.preferences.protobuf.ByteString
        public int size() {
            return this.f22245l;
        }
    }

    public static abstract class LeafByteString extends ByteString {
        LeafByteString() {
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        void A0(t tVar) throws IOException {
            u0(tVar);
        }

        abstract boolean B0(ByteString byteString, int i10, int i11);

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        protected final int E() {
            return 0;
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        protected final boolean G() {
            return true;
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected final byte[] f22246j;

        LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.f22246j = bArr;
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        protected void B(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f22246j, i10, bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LeafByteString
        final boolean B0(ByteString byteString, int i10, int i11) {
            if (i11 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > byteString.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + byteString.size());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.b0(i10, i12).equals(b0(0, i11));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = this.f22246j;
            byte[] bArr2 = literalByteString.f22246j;
            int iC0 = C0() + i11;
            int iC1 = C0();
            int iC2 = literalByteString.C0() + i10;
            while (iC1 < iC0) {
                if (bArr[iC1] != bArr2[iC2]) {
                    return false;
                }
                iC1++;
                iC2++;
            }
            return true;
        }

        protected int C0() {
            return 0;
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        byte F(int i10) {
            return this.f22246j[i10];
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        public final boolean H() {
            int iC0 = C0();
            return Utf8.u(this.f22246j, iC0, size() + iC0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        public final w L() {
            return w.r(this.f22246j, C0(), size(), true);
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        public final InputStream N() {
            return new ByteArrayInputStream(this.f22246j, C0(), size());
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        protected final int S(int i10, int i11, int i12) {
            return i1.w(i10, this.f22246j, C0() + i11, i12);
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        protected final int T(int i10, int i11, int i12) {
            int iC0 = C0() + i11;
            return Utf8.w(i10, this.f22246j, iC0, i12 + iC0);
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        public final ByteBuffer b() {
            return ByteBuffer.wrap(this.f22246j, C0(), size()).asReadOnlyBuffer();
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        public final ByteString b0(int i10, int i11) {
            int iJ = ByteString.j(i10, i11, size());
            return iJ == 0 ? ByteString.f22239f : new BoundedByteString(this.f22246j, C0() + i10, iJ);
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        public final List<ByteBuffer> e() {
            return Collections.singletonList(b());
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int iU = U();
            int iU2 = literalByteString.U();
            if (iU == 0 || iU2 == 0 || iU == iU2) {
                return B0(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        public byte h(int i10) {
            return this.f22246j[i10];
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        protected final String l0(Charset charset) {
            return new String(this.f22246j, C0(), size(), charset);
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        public int size() {
            return this.f22246j.length;
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        final void u0(t tVar) throws IOException {
            tVar.X(this.f22246j, C0(), size());
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        public final void v0(OutputStream outputStream) throws IOException {
            outputStream.write(d0());
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        public final void x(ByteBuffer byteBuffer) {
            byteBuffer.put(this.f22246j, C0(), size());
        }

        @Override // androidx.p001datastore.preferences.protobuf.ByteString
        final void y0(OutputStream outputStream, int i10, int i11) throws IOException {
            outputStream.write(this.f22246j, C0() + i10, i11);
        }
    }

    public class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22247b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f22248c;

        a() {
            this.f22248c = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22247b < this.f22248c;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.f
        public byte l() {
            int i10 = this.f22247b;
            if (i10 >= this.f22248c) {
                throw new NoSuchElementException();
            }
            this.f22247b = i10 + 1;
            return ByteString.this.F(i10);
        }
    }

    public static final class b implements Comparator<ByteString> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ByteString byteString, ByteString byteString2) {
            f it = byteString.iterator();
            f it2 = byteString2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompare = Integer.compare(ByteString.h0(it.l()), ByteString.h0(it2.l()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    public static abstract class c implements f {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(l());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d implements e {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.e
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    public interface e {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    public interface f extends Iterator<Byte> {
        byte l();
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f22250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f22251b;

        private g(int i10) {
            byte[] bArr = new byte[i10];
            this.f22251b = bArr;
            this.f22250a = CodedOutputStream.n1(bArr);
        }

        /* synthetic */ g(int i10, a aVar) {
            this(i10);
        }

        public ByteString a() {
            this.f22250a.Z();
            return new LiteralByteString(this.f22251b);
        }

        public CodedOutputStream b() {
            return this.f22250a;
        }
    }

    public static final class h extends OutputStream {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final byte[] f22252g = new byte[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList<ByteString> f22254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f22255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f22256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f22257f;

        h(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f22253b = i10;
            this.f22254c = new ArrayList<>();
            this.f22256e = new byte[i10];
        }

        private byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void b(int i10) {
            this.f22254c.add(new LiteralByteString(this.f22256e));
            int length = this.f22255d + this.f22256e.length;
            this.f22255d = length;
            this.f22256e = new byte[Math.max(this.f22253b, Math.max(i10, length >>> 1))];
            this.f22257f = 0;
        }

        private void c() {
            int i10 = this.f22257f;
            byte[] bArr = this.f22256e;
            if (i10 >= bArr.length) {
                this.f22254c.add(new LiteralByteString(this.f22256e));
                this.f22256e = f22252g;
            } else if (i10 > 0) {
                this.f22254c.add(new LiteralByteString(a(bArr, i10)));
            }
            this.f22255d += this.f22257f;
            this.f22257f = 0;
        }

        public synchronized void d() {
            this.f22254c.clear();
            this.f22255d = 0;
            this.f22257f = 0;
        }

        public synchronized int e() {
            return this.f22255d + this.f22257f;
        }

        public synchronized ByteString f() {
            c();
            return ByteString.m(this.f22254c);
        }

        public void g(OutputStream outputStream) throws IOException {
            ByteString[] byteStringArr;
            byte[] bArr;
            int i10;
            synchronized (this) {
                ArrayList<ByteString> arrayList = this.f22254c;
                byteStringArr = (ByteString[]) arrayList.toArray(new ByteString[arrayList.size()]);
                bArr = this.f22256e;
                i10 = this.f22257f;
            }
            for (ByteString byteString : byteStringArr) {
                byteString.v0(outputStream);
            }
            outputStream.write(a(bArr, i10));
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            if (this.f22257f == this.f22256e.length) {
                b(1);
            }
            byte[] bArr = this.f22256e;
            int i11 = this.f22257f;
            this.f22257f = i11 + 1;
            bArr[i11] = (byte) i10;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = this.f22256e;
            int length = bArr2.length;
            int i12 = this.f22257f;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f22257f += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                b(i13);
                System.arraycopy(bArr, i10 + length2, this.f22256e, 0, i13);
                this.f22257f = i13;
            }
        }
    }

    public static final class i implements e {
        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.e
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f22240g = androidx.p001datastore.preferences.protobuf.e.c() ? new i(aVar) : new d(aVar);
        f22242i = new b();
    }

    ByteString() {
    }

    static g J(int i10) {
        return new g(i10, null);
    }

    public static h Q() {
        return new h(128);
    }

    public static h R(int i10) {
        return new h(i10);
    }

    private static ByteString V(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                break;
            }
            i11 += i12;
        }
        if (i11 == 0) {
            return null;
        }
        return v(bArr, 0, i11);
    }

    public static ByteString W(InputStream inputStream) throws IOException {
        return Y(inputStream, 256, 8192);
    }

    public static ByteString X(InputStream inputStream, int i10) throws IOException {
        return Y(inputStream, i10, i10);
    }

    public static ByteString Y(InputStream inputStream, int i10, int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            ByteString byteStringV = V(inputStream, i10);
            if (byteStringV == null) {
                return m(arrayList);
            }
            arrayList.add(byteStringV);
            i10 = Math.min(i10 * 2, i11);
        }
    }

    private static ByteString g(Iterator<ByteString> it, int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return g(it, i11).l(g(it, i10 - i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h0(byte b10) {
        return b10 & 255;
    }

    static void i(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int j(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static ByteString m(Iterable<ByteString> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            size = 0;
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f22239f : g(iterable.iterator(), size);
    }

    public static ByteString o(String str, String str2) throws UnsupportedEncodingException {
        return new LiteralByteString(str.getBytes(str2));
    }

    public static ByteString q(String str, Charset charset) {
        return new LiteralByteString(str.getBytes(charset));
    }

    public static Comparator<ByteString> q0() {
        return f22242i;
    }

    static ByteString r0(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return t0(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static ByteString s(ByteBuffer byteBuffer) {
        return t(byteBuffer, byteBuffer.remaining());
    }

    static ByteString s0(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public static ByteString t(ByteBuffer byteBuffer, int i10) {
        j(0, i10, byteBuffer.remaining());
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new LiteralByteString(bArr);
    }

    static ByteString t0(byte[] bArr, int i10, int i11) {
        return new BoundedByteString(bArr, i10, i11);
    }

    public static ByteString u(byte[] bArr) {
        return v(bArr, 0, bArr.length);
    }

    public static ByteString v(byte[] bArr, int i10, int i11) {
        j(i10, i10 + i11, bArr.length);
        return new LiteralByteString(f22240g.a(bArr, i10, i11));
    }

    public static ByteString w(String str) {
        return new LiteralByteString(str.getBytes(i1.f22456a));
    }

    @Deprecated
    public final void A(byte[] bArr, int i10, int i11, int i12) {
        j(i10, i10 + i12, size());
        j(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            B(bArr, i10, i11, i12);
        }
    }

    abstract void A0(t tVar) throws IOException;

    protected abstract void B(byte[] bArr, int i10, int i11, int i12);

    public final boolean D(ByteString byteString) {
        return size() >= byteString.size() && a0(size() - byteString.size()).equals(byteString);
    }

    protected abstract int E();

    abstract byte F(int i10);

    protected abstract boolean G();

    public abstract boolean H();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public f iterator() {
        return new a();
    }

    public abstract w L();

    public abstract InputStream N();

    protected abstract int S(int i10, int i11, int i12);

    protected abstract int T(int i10, int i11, int i12);

    protected final int U() {
        return this.f22243b;
    }

    public final boolean Z(ByteString byteString) {
        return size() >= byteString.size() && b0(0, byteString.size()).equals(byteString);
    }

    public final ByteString a0(int i10) {
        return b0(i10, size());
    }

    public abstract ByteBuffer b();

    public abstract ByteString b0(int i10, int i11);

    public final byte[] d0() {
        int size = size();
        if (size == 0) {
            return i1.f22459d;
        }
        byte[] bArr = new byte[size];
        B(bArr, 0, 0, size);
        return bArr;
    }

    public abstract List<ByteBuffer> e();

    public abstract boolean equals(Object obj);

    public abstract byte h(int i10);

    public final int hashCode() {
        int iS = this.f22243b;
        if (iS == 0) {
            int size = size();
            iS = S(size, 0, size);
            if (iS == 0) {
                iS = 1;
            }
            this.f22243b = iS;
        }
        return iS;
    }

    public final String i0(String str) throws UnsupportedEncodingException {
        try {
            return k0(Charset.forName(str));
        } catch (UnsupportedCharsetException e10) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e10);
            throw unsupportedEncodingException;
        }
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final String k0(Charset charset) {
        return size() == 0 ? "" : l0(charset);
    }

    public final ByteString l(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.D0(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    protected abstract String l0(Charset charset);

    public final String n0() {
        return k0(i1.f22456a);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    abstract void u0(t tVar) throws IOException;

    public abstract void v0(OutputStream outputStream) throws IOException;

    final void w0(OutputStream outputStream, int i10, int i11) throws IOException {
        j(i10, i10 + i11, size());
        if (i11 > 0) {
            y0(outputStream, i10, i11);
        }
    }

    public abstract void x(ByteBuffer byteBuffer);

    public void y(byte[] bArr, int i10) {
        A(bArr, 0, i10, size());
    }

    abstract void y0(OutputStream outputStream, int i10, int i11) throws IOException;
}
