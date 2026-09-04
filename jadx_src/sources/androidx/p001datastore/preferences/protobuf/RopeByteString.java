package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public final class RopeByteString extends ByteString {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int[] f22321o = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, bb.c.b.f31073z1, bb.c.b.f30809n4, 610, bb.c.b.Zf, bb.c.b.Lr, bb.c.d.J9, bb.c.e.Jb, bb.c.g.f33206y4, bb.c.l.f34167gj, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f22322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ByteString f22323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ByteString f22324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f22325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f22326n;

    public class a extends ByteString.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f22327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ByteString.f f22328c = b();

        a() {
            this.f22327b = new c(RopeByteString.this, null);
        }

        private ByteString.f b() {
            if (this.f22327b.hasNext()) {
                return this.f22327b.next().iterator();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22328c != null;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.f
        public byte l() {
            ByteString.f fVar = this.f22328c;
            if (fVar == null) {
                throw new NoSuchElementException();
            }
            byte bL = fVar.l();
            if (!this.f22328c.hasNext()) {
                this.f22328c = b();
            }
            return bL;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque<ByteString> f22330a;

        private b() {
            this.f22330a = new ArrayDeque<>();
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString byteStringPop = this.f22330a.pop();
            while (!this.f22330a.isEmpty()) {
                byteStringPop = new RopeByteString(this.f22330a.pop(), byteStringPop, null);
            }
            return byteStringPop;
        }

        private void c(ByteString byteString) {
            if (byteString.G()) {
                e(byteString);
                return;
            }
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                c(ropeByteString.f22323k);
                c(ropeByteString.f22324l);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(RopeByteString.f22321o, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(ByteString byteString) {
            a aVar;
            int iD = d(byteString.size());
            int[] iArr = RopeByteString.f22321o;
            int i10 = iArr[iD + 1];
            if (this.f22330a.isEmpty() || this.f22330a.peek().size() >= i10) {
                this.f22330a.push(byteString);
                return;
            }
            int i11 = iArr[iD];
            ByteString byteStringPop = this.f22330a.pop();
            while (true) {
                aVar = null;
                if (this.f22330a.isEmpty() || this.f22330a.peek().size() >= i11) {
                    break;
                } else {
                    byteStringPop = new RopeByteString(this.f22330a.pop(), byteStringPop, aVar);
                }
            }
            RopeByteString ropeByteString = new RopeByteString(byteStringPop, byteString, aVar);
            while (!this.f22330a.isEmpty()) {
                if (this.f22330a.peek().size() >= RopeByteString.f22321o[d(ropeByteString.size()) + 1]) {
                    break;
                } else {
                    ropeByteString = new RopeByteString(this.f22330a.pop(), ropeByteString, aVar);
                }
            }
            this.f22330a.push(ropeByteString);
        }
    }

    public static final class c implements Iterator<ByteString.LeafByteString> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayDeque<RopeByteString> f22331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteString.LeafByteString f22332c;

        private c(ByteString byteString) {
            if (!(byteString instanceof RopeByteString)) {
                this.f22331b = null;
                this.f22332c = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque<RopeByteString> arrayDeque = new ArrayDeque<>(ropeByteString.E());
            this.f22331b = arrayDeque;
            arrayDeque.push(ropeByteString);
            this.f22332c = a(ropeByteString.f22323k);
        }

        /* synthetic */ c(ByteString byteString, a aVar) {
            this(byteString);
        }

        private ByteString.LeafByteString a(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f22331b.push(ropeByteString);
                byteString = ropeByteString.f22323k;
            }
            return (ByteString.LeafByteString) byteString;
        }

        private ByteString.LeafByteString b() {
            ByteString.LeafByteString leafByteStringA;
            do {
                ArrayDeque<RopeByteString> arrayDeque = this.f22331b;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByteStringA = a(this.f22331b.pop().f22324l);
            } while (leafByteStringA.isEmpty());
            return leafByteStringA;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f22332c;
            if (leafByteString == null) {
                throw new NoSuchElementException();
            }
            this.f22332c = b();
            return leafByteString;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22332c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class d extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f22333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteString.LeafByteString f22334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f22335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f22336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f22337f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f22338g;

        public d() {
            b();
        }

        private void a() {
            if (this.f22334c != null) {
                int i10 = this.f22336e;
                int i11 = this.f22335d;
                if (i10 == i11) {
                    this.f22337f += i11;
                    this.f22336e = 0;
                    if (!this.f22333b.hasNext()) {
                        this.f22334c = null;
                        this.f22335d = 0;
                    } else {
                        ByteString.LeafByteString next = this.f22333b.next();
                        this.f22334c = next;
                        this.f22335d = next.size();
                    }
                }
            }
        }

        private void b() {
            c cVar = new c(RopeByteString.this, null);
            this.f22333b = cVar;
            ByteString.LeafByteString next = cVar.next();
            this.f22334c = next;
            this.f22335d = next.size();
            this.f22336e = 0;
            this.f22337f = 0;
        }

        private int c(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (i12 > 0) {
                a();
                if (this.f22334c == null) {
                    if (i12 != i11) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.f22335d - this.f22336e, i12);
                if (bArr != null) {
                    this.f22334c.A(bArr, this.f22336e, i10, iMin);
                    i10 += iMin;
                }
                this.f22336e += iMin;
                i12 -= iMin;
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return RopeByteString.this.size() - (this.f22337f + this.f22336e);
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f22338g = this.f22337f + this.f22336e;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            ByteString.LeafByteString leafByteString = this.f22334c;
            if (leafByteString == null) {
                return -1;
            }
            int i10 = this.f22336e;
            this.f22336e = i10 + 1;
            return leafByteString.h(i10) & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            return c(bArr, i10, i11);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            b();
            c(null, 0, this.f22338g);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j10 > 2147483647L) {
                j10 = 2147483647L;
            }
            return c(null, 0, (int) j10);
        }
    }

    private RopeByteString(ByteString byteString, ByteString byteString2) {
        this.f22323k = byteString;
        this.f22324l = byteString2;
        int size = byteString.size();
        this.f22325m = size;
        this.f22322j = size + byteString2.size();
        this.f22326n = Math.max(byteString.E(), byteString2.E()) + 1;
    }

    /* synthetic */ RopeByteString(ByteString byteString, ByteString byteString2, a aVar) {
        this(byteString, byteString2);
    }

    static ByteString D0(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return E0(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.f22324l.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.f22323k, E0(ropeByteString.f22324l, byteString2));
            }
            if (ropeByteString.f22323k.E() > ropeByteString.f22324l.E() && ropeByteString.E() > byteString2.E()) {
                return new RopeByteString(ropeByteString.f22323k, new RopeByteString(ropeByteString.f22324l, byteString2));
            }
        }
        return size >= f22321o[Math.max(byteString.E(), byteString2.E()) + 1] ? new RopeByteString(byteString, byteString2) : new b(null).b(byteString, byteString2);
    }

    private static ByteString E0(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.A(bArr, 0, 0, size);
        byteString2.A(bArr, 0, size, size2);
        return ByteString.s0(bArr);
    }

    private boolean F0(ByteString byteString) {
        ByteString.LeafByteString next;
        a aVar = null;
        c cVar = new c(this, aVar);
        ByteString.LeafByteString next2 = cVar.next();
        c cVar2 = new c(byteString, aVar);
        ByteString.LeafByteString next3 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next2.size() - i10;
            int size2 = next3.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? next2.B0(next3, i11, iMin) : next3.B0(next2, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f22322j;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                next2 = next2;
                next2 = next;
                next3 = cVar2.next();
                i11 = 0;
            } else {
                next2 = next2;
                next2 = next;
                i11 += iMin;
            }
        }
    }

    static RopeByteString G0(ByteString byteString, ByteString byteString2) {
        return new RopeByteString(byteString, byteString2);
    }

    private void H0(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    void A0(t tVar) throws IOException {
        this.f22324l.A0(tVar);
        this.f22323k.A0(tVar);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    protected void B(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f22325m;
        if (i13 <= i14) {
            this.f22323k.B(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f22324l.B(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f22323k.B(bArr, i10, i11, i15);
            this.f22324l.B(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    protected int E() {
        return this.f22326n;
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    byte F(int i10) {
        int i11 = this.f22325m;
        return i10 < i11 ? this.f22323k.F(i10) : this.f22324l.F(i10 - i11);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    protected boolean G() {
        return this.f22322j >= f22321o[this.f22326n];
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public boolean H() {
        int iT = this.f22323k.T(0, 0, this.f22325m);
        ByteString byteString = this.f22324l;
        return byteString.T(iT, 0, byteString.size()) == 0;
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: I */
    public ByteString.f iterator() {
        return new a();
    }

    Object J0() {
        return ByteString.s0(d0());
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public w L() {
        return w.j(new d());
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public InputStream N() {
        return new d();
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    protected int S(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f22325m;
        if (i13 <= i14) {
            return this.f22323k.S(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f22324l.S(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f22324l.S(this.f22323k.S(i10, i11, i15), 0, i12 - i15);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    protected int T(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f22325m;
        if (i13 <= i14) {
            return this.f22323k.T(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f22324l.T(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f22324l.T(this.f22323k.T(i10, i11, i15), 0, i12 - i15);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public ByteBuffer b() {
        return ByteBuffer.wrap(d0()).asReadOnlyBuffer();
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public ByteString b0(int i10, int i11) {
        int iJ = ByteString.j(i10, i11, this.f22322j);
        if (iJ == 0) {
            return ByteString.f22239f;
        }
        if (iJ == this.f22322j) {
            return this;
        }
        int i12 = this.f22325m;
        if (i11 <= i12) {
            return this.f22323k.b0(i10, i11);
        }
        return i10 >= i12 ? this.f22324l.b0(i10 - i12, i11 - i12) : new RopeByteString(this.f22323k.a0(i10), this.f22324l.b0(0, i11 - this.f22325m));
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public List<ByteBuffer> e() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().b());
        }
        return arrayList;
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f22322j != byteString.size()) {
            return false;
        }
        if (this.f22322j == 0) {
            return true;
        }
        int iU = U();
        int iU2 = byteString.U();
        if (iU == 0 || iU2 == 0 || iU == iU2) {
            return F0(byteString);
        }
        return false;
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public byte h(int i10) {
        ByteString.i(i10, this.f22322j);
        return F(i10);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    protected String l0(Charset charset) {
        return new String(d0(), charset);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public int size() {
        return this.f22322j;
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    void u0(t tVar) throws IOException {
        this.f22323k.u0(tVar);
        this.f22324l.u0(tVar);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public void v0(OutputStream outputStream) throws IOException {
        this.f22323k.v0(outputStream);
        this.f22324l.v0(outputStream);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    public void x(ByteBuffer byteBuffer) {
        this.f22323k.x(byteBuffer);
        this.f22324l.x(byteBuffer);
    }

    @Override // androidx.p001datastore.preferences.protobuf.ByteString
    void y0(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        int i13 = this.f22325m;
        if (i12 <= i13) {
            this.f22323k.y0(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f22324l.y0(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f22323k.y0(outputStream, i10, i14);
            this.f22324l.y0(outputStream, 0, i11 - i14);
        }
    }
}
