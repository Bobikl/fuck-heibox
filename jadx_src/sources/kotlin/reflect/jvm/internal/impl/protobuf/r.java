package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: compiled from: RopeByteString.java */
/* JADX INFO: loaded from: classes5.dex */
public class r extends kotlin.reflect.jvm.internal.impl.protobuf.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f127369j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f127370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f127371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f127372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f127373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f127374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f127375i;

    /* JADX INFO: compiled from: RopeByteString.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> f127376a;

        private b() {
            this.f127376a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
            c(dVar);
            c(dVar2);
            kotlin.reflect.jvm.internal.impl.protobuf.d dVarPop = this.f127376a.pop();
            while (!this.f127376a.isEmpty()) {
                dVarPop = new r(this.f127376a.pop(), dVarPop);
            }
            return dVarPop;
        }

        private void c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            if (dVar.o()) {
                e(dVar);
                return;
            }
            if (dVar instanceof r) {
                r rVar = (r) dVar;
                c(rVar.f127371e);
                c(rVar.f127372f);
            } else {
                String strValueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(r.f127369j, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            int iD = d(dVar.size());
            int i10 = r.f127369j[iD + 1];
            if (this.f127376a.isEmpty() || this.f127376a.peek().size() >= i10) {
                this.f127376a.push(dVar);
                return;
            }
            int i11 = r.f127369j[iD];
            kotlin.reflect.jvm.internal.impl.protobuf.d dVarPop = this.f127376a.pop();
            while (true) {
                if (this.f127376a.isEmpty() || this.f127376a.peek().size() >= i11) {
                    break;
                } else {
                    dVarPop = new r(this.f127376a.pop(), dVarPop);
                }
            }
            r rVar = new r(dVarPop, dVar);
            while (!this.f127376a.isEmpty()) {
                if (this.f127376a.peek().size() >= r.f127369j[d(rVar.size()) + 1]) {
                    break;
                } else {
                    rVar = new r(this.f127376a.pop(), rVar);
                }
            }
            this.f127376a.push(rVar);
        }
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    public static class c implements Iterator<m> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Stack<r> f127377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m f127378c;

        private c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f127377b = new Stack<>();
            this.f127378c = a(dVar);
        }

        private m a(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            while (dVar instanceof r) {
                r rVar = (r) dVar;
                this.f127377b.push(rVar);
                dVar = rVar.f127371e;
            }
            return (m) dVar;
        }

        private m b() {
            while (!this.f127377b.isEmpty()) {
                m mVarA = a(this.f127377b.pop().f127372f);
                if (!mVarA.isEmpty()) {
                    return mVarA;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public m next() {
            m mVar = this.f127378c;
            if (mVar == null) {
                throw new NoSuchElementException();
            }
            this.f127378c = b();
            return mVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f127378c != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    public class d implements kotlin.reflect.jvm.internal.impl.protobuf.d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f127379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.d.a f127380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f127381d;

        private d() {
            c cVar = new c(r.this);
            this.f127379b = cVar;
            this.f127380c = cVar.next().iterator();
            this.f127381d = r.this.size();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(l());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f127381d > 0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte l() {
            if (!this.f127380c.hasNext()) {
                this.f127380c = this.f127379b.next().iterator();
            }
            this.f127381d--;
            return this.f127380c.l();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: RopeByteString.java */
    public class e extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f127383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m f127384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f127385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f127386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f127387f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f127388g;

        public e() {
            b();
        }

        private void a() {
            if (this.f127384c != null) {
                int i10 = this.f127386e;
                int i11 = this.f127385d;
                if (i10 == i11) {
                    this.f127387f += i11;
                    this.f127386e = 0;
                    if (!this.f127383b.hasNext()) {
                        this.f127384c = null;
                        this.f127385d = 0;
                    } else {
                        m next = this.f127383b.next();
                        this.f127384c = next;
                        this.f127385d = next.size();
                    }
                }
            }
        }

        private void b() {
            c cVar = new c(r.this);
            this.f127383b = cVar;
            m next = cVar.next();
            this.f127384c = next;
            this.f127385d = next.size();
            this.f127386e = 0;
            this.f127387f = 0;
        }

        private int c(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (i12 > 0) {
                a();
                if (this.f127384c == null) {
                    if (i12 != i11) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.f127385d - this.f127386e, i12);
                if (bArr != null) {
                    this.f127384c.j(bArr, this.f127386e, i10, iMin);
                    i10 += iMin;
                }
                this.f127386e += iMin;
                i12 -= iMin;
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return r.this.size() - (this.f127387f + this.f127386e);
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f127388g = this.f127387f + this.f127386e;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            m mVar = this.f127384c;
            if (mVar == null) {
                return -1;
            }
            int i10 = this.f127386e;
            this.f127386e = i10 + 1;
            return mVar.F(i10) & 255;
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
            c(null, 0, this.f127388g);
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

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f127369j = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f127369j;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }

    private r(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        this.f127375i = 0;
        this.f127371e = dVar;
        this.f127372f = dVar2;
        int size = dVar.size();
        this.f127373g = size;
        this.f127370d = size + dVar2.size();
        this.f127374h = Math.max(dVar.m(), dVar2.m()) + 1;
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.d I(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        r rVar = dVar instanceof r ? (r) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return J(dVar, dVar2);
            }
            if (rVar != null && rVar.f127372f.size() + dVar2.size() < 128) {
                dVar2 = new r(rVar.f127371e, J(rVar.f127372f, dVar2));
            } else {
                if (rVar == null || rVar.f127371e.m() <= rVar.f127372f.m() || rVar.m() <= dVar2.m()) {
                    return size >= f127369j[Math.max(dVar.m(), dVar2.m()) + 1] ? new r(dVar, dVar2) : new b().b(dVar, dVar2);
                }
                dVar2 = new r(rVar.f127371e, new r(rVar.f127372f, dVar2));
            }
        }
        return dVar2;
    }

    private static m J(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.j(bArr, 0, 0, size);
        dVar2.j(bArr, 0, size, size2);
        return new m(bArr);
    }

    private boolean L(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
        c cVar = new c(this);
        m next = cVar.next();
        c cVar2 = new c(dVar);
        m next2 = cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = next.size() - i10;
            int size2 = next2.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? next.G(next2, i11, iMin) : next2.G(next, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f127370d;
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
                next2 = cVar2.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String A(String str) throws UnsupportedEncodingException {
        return new String(y(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void E(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        int i13 = this.f127373g;
        if (i12 <= i13) {
            this.f127371e.E(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f127372f.E(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f127371e.E(outputStream, i10, i14);
            this.f127372f.E(outputStream, 0, i11 - i14);
        }
    }

    public boolean equals(Object obj) {
        int iX;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.d)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
        if (this.f127370d != dVar.size()) {
            return false;
        }
        if (this.f127370d == 0) {
            return true;
        }
        if (this.f127375i == 0 || (iX = dVar.x()) == 0 || this.f127375i == iX) {
            return L(dVar);
        }
        return false;
    }

    public int hashCode() {
        int iV = this.f127375i;
        if (iV == 0) {
            int i10 = this.f127370d;
            iV = v(i10, 0, i10);
            if (iV == 0) {
                iV = 1;
            }
            this.f127375i = iV;
        }
        return iV;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void l(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f127373g;
        if (i13 <= i14) {
            this.f127371e.l(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f127372f.l(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f127371e.l(bArr, i10, i11, i15);
            this.f127372f.l(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int m() {
        return this.f127374h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean o() {
        return this.f127370d >= f127369j[this.f127374h];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean q() {
        int iW = this.f127371e.w(0, 0, this.f127373g);
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f127372f;
        return dVar.w(iW, 0, dVar.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* JADX INFO: renamed from: s */
    public kotlin.reflect.jvm.internal.impl.protobuf.d.a iterator() {
        return new d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f127370d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.e t() {
        return kotlin.reflect.jvm.internal.impl.protobuf.e.g(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int v(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f127373g;
        if (i13 <= i14) {
            return this.f127371e.v(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f127372f.v(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f127372f.v(this.f127371e.v(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int w(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f127373g;
        if (i13 <= i14) {
            return this.f127371e.w(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f127372f.w(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f127372f.w(this.f127371e.w(i10, i11, i15), 0, i12 - i15);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int x() {
        return this.f127375i;
    }
}
