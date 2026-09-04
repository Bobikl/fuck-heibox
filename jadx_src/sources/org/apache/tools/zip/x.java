package org.apache.tools.zip;

import io.flutter.embedding.android.KeyboardMap;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: ZipFile.java */
/* JADX INFO: loaded from: classes5.dex */
public class x implements Closeable {
    private static final int A = 20;
    private static final int B = 8;
    private static final int C = 48;
    private static final long D = 26;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f137493o = 509;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final int f137494p = 15;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f137495q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f137496r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f137497s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f137498t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f137499u = 3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f137500v = 42;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f137501w = y.d(z.K3);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f137502x = 22;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f137503y = 65557;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f137504z = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<t> f137505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, LinkedList<t>> f137506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f137507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r f137508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f137509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RandomAccessFile f137510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f137511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f137512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f137513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final byte[] f137514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final byte[] f137515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final byte[] f137516m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Comparator<t> f137517n;

    /* JADX INFO: compiled from: ZipFile.java */
    public class a extends InflaterInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Inflater f137518b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputStream inputStream, Inflater inflater, Inflater inflater2) {
            super(inputStream, inflater);
            this.f137518b = inflater2;
        }

        @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f137518b.end();
        }
    }

    /* JADX INFO: compiled from: ZipFile.java */
    public class b extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f137520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f137521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f137522d = false;

        b(long j10, long j11) {
            this.f137520b = j11;
            this.f137521c = j10;
        }

        void a() {
            this.f137522d = true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i10;
            long j10 = this.f137520b;
            this.f137520b = j10 - 1;
            if (j10 <= 0) {
                if (!this.f137522d) {
                    return -1;
                }
                this.f137522d = false;
                return 0;
            }
            synchronized (x.this.f137510g) {
                RandomAccessFile randomAccessFile = x.this.f137510g;
                long j11 = this.f137521c;
                this.f137521c = 1 + j11;
                randomAccessFile.seek(j11);
                i10 = x.this.f137510g.read();
            }
            return i10;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12;
            long j10 = this.f137520b;
            if (j10 <= 0) {
                if (!this.f137522d) {
                    return -1;
                }
                this.f137522d = false;
                bArr[i10] = 0;
                return 1;
            }
            if (i11 <= 0) {
                return 0;
            }
            if (i11 > j10) {
                i11 = (int) j10;
            }
            synchronized (x.this.f137510g) {
                x.this.f137510g.seek(this.f137521c);
                i12 = x.this.f137510g.read(bArr, i10, i11);
            }
            if (i12 > 0) {
                long j11 = i12;
                this.f137521c += j11;
                this.f137520b -= j11;
            }
            return i12;
        }
    }

    /* JADX INFO: compiled from: ZipFile.java */
    public static class c extends t {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final e f137524s;

        c(e eVar) {
            this.f137524s = eVar;
        }

        e P() {
            return this.f137524s;
        }

        @Override // org.apache.tools.zip.t
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f137524s.f137527a == cVar.f137524s.f137527a && this.f137524s.f137528b == cVar.f137524s.f137528b;
        }

        @Override // org.apache.tools.zip.t, java.util.zip.ZipEntry
        public int hashCode() {
            return (super.hashCode() * 3) + ((int) (this.f137524s.f137527a % 2147483647L));
        }
    }

    /* JADX INFO: compiled from: ZipFile.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f137525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f137526b;

        private d(byte[] bArr, byte[] bArr2) {
            this.f137525a = bArr;
            this.f137526b = bArr2;
        }

        /* synthetic */ d(byte[] bArr, byte[] bArr2, a aVar) {
            this(bArr, bArr2);
        }
    }

    /* JADX INFO: compiled from: ZipFile.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f137527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f137528b;

        private e() {
            this.f137527a = -1L;
            this.f137528b = -1L;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    public x(File file) throws IOException {
        this(file, (String) null);
    }

    public x(File file, String str) throws IOException {
        this(file, str, true);
    }

    public x(File file, String str, boolean z10) throws IOException {
        this.f137505b = new LinkedList();
        this.f137506c = new HashMap(509);
        this.f137513j = new byte[8];
        this.f137514k = new byte[4];
        this.f137515l = new byte[42];
        this.f137516m = new byte[2];
        this.f137517n = new Comparator() { // from class: org.apache.tools.zip.w
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return x.q((t) obj, (t) obj2);
            }
        };
        this.f137509f = file.getAbsolutePath();
        this.f137507d = str;
        this.f137508e = s.b(str);
        this.f137511h = z10;
        this.f137510g = new RandomAccessFile(file, "r");
        try {
            I(s());
            this.f137512i = false;
        } catch (Throwable th2) {
            this.f137512i = true;
            try {
                this.f137510g.close();
            } catch (IOException unused) {
            }
            throw th2;
        }
    }

    public x(String str) throws IOException {
        this(new File(str), (String) null);
    }

    public x(String str, String str2) throws IOException {
        this(new File(str), str2, true);
    }

    private void A() throws IOException {
        if (!M(22L, 65557L, z.L3)) {
            throw new ZipException("archive is not a ZIP archive");
        }
    }

    private void C(Map<t, d> map) throws IOException {
        this.f137510g.readFully(this.f137515l);
        a aVar = null;
        e eVar = new e(aVar);
        c cVar = new c(eVar);
        cVar.M((a0.e(this.f137515l, 0) >> 8) & 15);
        f fVarC = f.c(this.f137515l, 4);
        boolean zK = fVarC.k();
        r rVar = zK ? s.f137473e : this.f137508e;
        cVar.G(fVarC);
        cVar.setMethod(a0.e(this.f137515l, 6));
        cVar.setTime(b0.e(y.e(this.f137515l, 8)));
        cVar.setCrc(y.e(this.f137515l, 12));
        cVar.setCompressedSize(y.e(this.f137515l, 16));
        cVar.setSize(y.e(this.f137515l, 20));
        int iE = a0.e(this.f137515l, 24);
        int iE2 = a0.e(this.f137515l, 26);
        int iE3 = a0.e(this.f137515l, 28);
        int iE4 = a0.e(this.f137515l, 30);
        cVar.H(a0.e(this.f137515l, 32));
        cVar.D(y.e(this.f137515l, 34));
        byte[] bArr = new byte[iE];
        this.f137510g.readFully(bArr);
        cVar.K(rVar.decode(bArr), bArr);
        eVar.f137527a = y.e(this.f137515l, 38);
        this.f137505b.add(cVar);
        byte[] bArr2 = new byte[iE2];
        this.f137510g.readFully(bArr2);
        cVar.B(bArr2);
        J(cVar, eVar, iE4);
        byte[] bArr3 = new byte[iE3];
        this.f137510g.readFully(bArr3);
        cVar.setComment(rVar.decode(bArr3));
        if (zK || !this.f137511h) {
            return;
        }
        map.put(cVar, new d(bArr, bArr3, aVar));
    }

    private void I(Map<t, d> map) throws IOException {
        Iterator<t> it = this.f137505b.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            e eVarP = cVar.P();
            long j10 = eVarP.f137527a;
            RandomAccessFile randomAccessFile = this.f137510g;
            long j11 = j10 + D;
            randomAccessFile.seek(j11);
            this.f137510g.readFully(this.f137516m);
            int iD = a0.d(this.f137516m);
            this.f137510g.readFully(this.f137516m);
            int iD2 = a0.d(this.f137516m);
            int i10 = iD;
            while (i10 > 0) {
                int iSkipBytes = this.f137510g.skipBytes(i10);
                if (iSkipBytes <= 0) {
                    throw new IOException("failed to skip file name in local file header");
                }
                i10 -= iSkipBytes;
            }
            byte[] bArr = new byte[iD2];
            this.f137510g.readFully(bArr);
            cVar.setExtra(bArr);
            eVarP.f137528b = j11 + 2 + 2 + ((long) iD) + ((long) iD2);
            if (map.containsKey(cVar)) {
                d dVar = map.get(cVar);
                b0.h(cVar, dVar.f137525a, dVar.f137526b);
            }
            ((LinkedList) this.f137506c.computeIfAbsent(cVar.getName(), new Function() { // from class: org.apache.tools.zip.v
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return x.r((String) obj);
                }
            })).addLast(cVar);
        }
    }

    private void J(t tVar, e eVar, int i10) throws IOException {
        o oVar = (o) tVar.i(o.f137427g);
        if (oVar != null) {
            boolean z10 = tVar.getSize() == KeyboardMap.kValueMask;
            boolean z11 = tVar.getCompressedSize() == KeyboardMap.kValueMask;
            boolean z12 = eVar.f137527a == KeyboardMap.kValueMask;
            oVar.m(z10, z11, z12, i10 == 65535);
            if (z10) {
                tVar.setSize(oVar.l().d());
            } else if (z11) {
                oVar.q(new q(tVar.getSize()));
            }
            if (z11) {
                tVar.setCompressedSize(oVar.i().d());
            } else if (z10) {
                oVar.n(new q(tVar.getCompressedSize()));
            }
            if (z12) {
                eVar.f137527a = oVar.k().d();
            }
        }
    }

    private void K(int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int iSkipBytes = this.f137510g.skipBytes(i10 - i11);
            if (iSkipBytes <= 0) {
                throw new EOFException();
            }
            i11 += iSkipBytes;
        }
    }

    private boolean L() throws IOException {
        this.f137510g.seek(0L);
        this.f137510g.readFully(this.f137514k);
        return Arrays.equals(this.f137514k, z.G3);
    }

    private boolean M(long j10, long j11, byte[] bArr) throws IOException {
        long length = this.f137510g.length() - j10;
        long jMax = Math.max(0L, this.f137510g.length() - j11);
        boolean z10 = true;
        if (length < 0) {
            z10 = false;
            break;
        }
        while (true) {
            if (length >= jMax) {
                this.f137510g.seek(length);
                int i10 = this.f137510g.read();
                if (i10 != -1) {
                    if (i10 == bArr[0] && this.f137510g.read() == bArr[1] && this.f137510g.read() == bArr[2] && this.f137510g.read() == bArr[3]) {
                        break;
                    }
                    length--;
                }
            }
            z10 = false;
            break;
        }
        if (z10) {
            this.f137510g.seek(length);
        }
        return z10;
    }

    public static void e(x xVar) {
        if (xVar != null) {
            try {
                xVar.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int q(t tVar, t tVar2) {
        if (tVar == tVar2) {
            return 0;
        }
        c cVar = tVar instanceof c ? (c) tVar : null;
        c cVar2 = tVar2 instanceof c ? (c) tVar2 : null;
        if (cVar == null) {
            return 1;
        }
        if (cVar2 == null) {
            return -1;
        }
        long j10 = cVar.P().f137527a - cVar2.P().f137527a;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LinkedList r(String str) {
        return new LinkedList();
    }

    private Map<t, d> s() throws IOException {
        HashMap map = new HashMap();
        t();
        this.f137510g.readFully(this.f137514k);
        long jD = y.d(this.f137514k);
        if (jD != f137501w && L()) {
            throw new IOException("central directory is empty, can't expand corrupt archive.");
        }
        while (jD == f137501w) {
            C(map);
            this.f137510g.readFully(this.f137514k);
            jD = y.d(this.f137514k);
        }
        return map;
    }

    private void t() throws IOException {
        A();
        boolean zEquals = false;
        boolean z10 = this.f137510g.getFilePointer() > 20;
        if (z10) {
            RandomAccessFile randomAccessFile = this.f137510g;
            randomAccessFile.seek(randomAccessFile.getFilePointer() - 20);
            this.f137510g.readFully(this.f137514k);
            zEquals = Arrays.equals(z.N3, this.f137514k);
        }
        if (zEquals) {
            z();
            return;
        }
        if (z10) {
            K(16);
        }
        x();
    }

    private void x() throws IOException {
        K(16);
        this.f137510g.readFully(this.f137514k);
        this.f137510g.seek(y.d(this.f137514k));
    }

    private void z() throws IOException {
        K(4);
        this.f137510g.readFully(this.f137513j);
        this.f137510g.seek(q.e(this.f137513j));
        this.f137510g.readFully(this.f137514k);
        if (!Arrays.equals(this.f137514k, z.M3)) {
            throw new ZipException("archive's ZIP64 end of central directory locator is corrupt.");
        }
        K(44);
        this.f137510g.readFully(this.f137513j);
        this.f137510g.seek(q.e(this.f137513j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f137512i = true;
        this.f137510g.close();
    }

    public boolean d(t tVar) {
        return b0.b(tVar);
    }

    public String f() {
        return this.f137507d;
    }

    protected void finalize() throws Throwable {
        try {
            if (!this.f137512i) {
                System.err.printf("Cleaning up unclosed %s for archive %s%n", getClass().getSimpleName(), this.f137509f);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public Iterable<t> g(String str) {
        LinkedList<t> linkedList = this.f137506c.get(str);
        return linkedList != null ? linkedList : Collections.emptyList();
    }

    public Enumeration<t> i() {
        return Collections.enumeration(this.f137505b);
    }

    public Iterable<t> k(String str) {
        return this.f137506c.containsKey(str) ? (Iterable) this.f137506c.get(str).stream().sorted(this.f137517n).collect(Collectors.toList()) : Collections.emptyList();
    }

    public Enumeration<t> m() {
        return (Enumeration) this.f137505b.stream().sorted(this.f137517n).collect(Collectors.collectingAndThen(Collectors.toList(), new org.apache.tools.ant.c()));
    }

    public t n(String str) {
        LinkedList<t> linkedList = this.f137506c.get(str);
        if (linkedList != null) {
            return linkedList.getFirst();
        }
        return null;
    }

    public InputStream o(t tVar) throws IOException {
        if (!(tVar instanceof c)) {
            return null;
        }
        e eVarP = ((c) tVar).P();
        b0.c(tVar);
        b bVar = new b(eVarP.f137528b, tVar.getCompressedSize());
        int method = tVar.getMethod();
        if (method == 0) {
            return bVar;
        }
        if (method == 8) {
            bVar.a();
            Inflater inflater = new Inflater(true);
            return new a(bVar, inflater, inflater);
        }
        throw new ZipException("Found unsupported compression method " + tVar.getMethod());
    }

    public String p() {
        return this.f137509f;
    }
}
