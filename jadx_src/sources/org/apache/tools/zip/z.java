package org.apache.tools.zip;

import io.flutter.embedding.android.KeyboardMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: ZipOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class z extends FilterOutputStream {
    private static final int A = 4;
    private static final int B = 6;
    private static final int C = 8;
    private static final int D = 10;
    private static final int E = 14;
    private static final int F = 18;
    private static final int G = 22;
    private static final int H = 26;
    private static final int I = 28;
    private static final int J = 30;
    private static final int K = 0;
    private static final int L = 4;
    private static final int M = 6;
    private static final int N = 8;
    private static final int O = 10;
    private static final int P = 12;
    private static final int Q = 16;
    private static final int R = 20;
    private static final int S = 24;
    private static final int T = 28;
    private static final int U = 30;
    private static final int V = 32;
    private static final int W = 34;
    private static final int X = 36;
    private static final int Y = 38;
    private static final int Z = 42;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f137543a0 = 46;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f137544b0 = 8192;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f137545c0 = 8;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f137546p1 = -1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Deprecated
    public static final int f137547p2 = 2048;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f137549x1 = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f137551y = 512;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    static final String f137552y1 = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f137554z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f137555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f137556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f137557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f137558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f137559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f137560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<t> f137561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CRC32 f137562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f137563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f137564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f137565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<t, Long> f137566m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f137567n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private r f137568o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final Deflater f137569p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected byte[] f137570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RandomAccessFile f137571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f137572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f137573t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f137574u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f137575v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Zip64Mode f137576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Calendar f137577x;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final byte[] f137550x2 = new byte[0];

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final byte[] f137553y2 = {0, 0};
    private static final byte[] G2 = {0, 0, 0, 0};

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final byte[] f137548p3 = y.b(1);
    protected static final byte[] G3 = y.f137539m.a();
    protected static final byte[] J3 = y.f137540n.a();
    protected static final byte[] K3 = y.f137538l.a();
    protected static final byte[] L3 = y.b(101010256);
    static final byte[] M3 = y.b(101075792);
    static final byte[] N3 = y.b(117853008);

    /* JADX INFO: compiled from: ZipOutputStream.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f137578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f137579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f137580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f137581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f137582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f137583f;

        private b(t tVar) {
            this.f137579b = 0L;
            this.f137580c = 0L;
            this.f137581d = 0L;
            this.f137582e = false;
            this.f137578a = tVar;
        }

        static /* synthetic */ long g(b bVar, long j10) {
            long j11 = bVar.f137581d + j10;
            bVar.f137581d = j11;
            return j11;
        }
    }

    /* JADX INFO: compiled from: ZipOutputStream.java */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f137584b = new c("always");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f137585c = new c("never");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f137586d = new c("not encodeable");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f137587a;

        private c(String str) {
            this.f137587a = str;
        }

        public String toString() {
            return this.f137587a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        super(null);
        RandomAccessFile randomAccessFile2 = null;
        this.f137555b = false;
        this.f137557d = "";
        this.f137558e = -1;
        this.f137559f = false;
        this.f137560g = 8;
        this.f137561h = new LinkedList();
        this.f137562i = new CRC32();
        this.f137563j = 0L;
        this.f137564k = 0L;
        this.f137565l = 0L;
        this.f137566m = new HashMap();
        this.f137567n = null;
        this.f137568o = s.b(f137552y1);
        this.f137569p = new Deflater(this.f137558e, true);
        this.f137570q = new byte[512];
        this.f137572s = true;
        this.f137573t = false;
        this.f137574u = c.f137585c;
        this.f137575v = false;
        this.f137576w = Zip64Mode.AsNeeded;
        this.f137577x = Calendar.getInstance();
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(0L);
            } catch (IOException unused) {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                } else {
                    randomAccessFile2 = randomAccessFile;
                }
                ((FilterOutputStream) this).out = Files.newOutputStream(file.toPath(), new OpenOption[0]);
                randomAccessFile = randomAccessFile2;
            }
        } catch (IOException unused3) {
            randomAccessFile = null;
        }
        this.f137571r = randomAccessFile;
    }

    public z(OutputStream outputStream) {
        super(outputStream);
        this.f137555b = false;
        this.f137557d = "";
        this.f137558e = -1;
        this.f137559f = false;
        this.f137560g = 8;
        this.f137561h = new LinkedList();
        this.f137562i = new CRC32();
        this.f137563j = 0L;
        this.f137564k = 0L;
        this.f137565l = 0L;
        this.f137566m = new HashMap();
        this.f137567n = null;
        this.f137568o = s.b(f137552y1);
        this.f137569p = new Deflater(this.f137558e, true);
        this.f137570q = new byte[512];
        this.f137572s = true;
        this.f137573t = false;
        this.f137574u = c.f137585c;
        this.f137575v = false;
        this.f137576w = Zip64Mode.AsNeeded;
        this.f137577x = Calendar.getInstance();
        this.f137571r = null;
    }

    private o A(t tVar) {
        b bVar = this.f137556c;
        if (bVar != null) {
            bVar.f137582e = !this.f137575v;
        }
        this.f137575v = true;
        o oVar = (o) tVar.i(o.f137427g);
        if (oVar == null) {
            oVar = new o();
        }
        tVar.a(oVar);
        return oVar;
    }

    private boolean C(long j10, long j11, Zip64Mode zip64Mode) throws ZipException {
        if (this.f137556c.f137578a.getMethod() == 8) {
            this.f137556c.f137578a.setSize(this.f137556c.f137581d);
            this.f137556c.f137578a.setCompressedSize(j10);
            this.f137556c.f137578a.setCrc(j11);
            this.f137569p.reset();
        } else if (this.f137571r != null) {
            this.f137556c.f137578a.setSize(j10);
            this.f137556c.f137578a.setCompressedSize(j10);
            this.f137556c.f137578a.setCrc(j11);
        } else {
            if (this.f137556c.f137578a.getCrc() != j11) {
                throw new ZipException("bad CRC checksum for entry " + this.f137556c.f137578a.getName() + ": " + Long.toHexString(this.f137556c.f137578a.getCrc()) + " instead of " + Long.toHexString(j11));
            }
            if (this.f137556c.f137578a.getSize() != j10) {
                throw new ZipException("bad size for entry " + this.f137556c.f137578a.getName() + ": " + this.f137556c.f137578a.getSize() + " instead of " + j10);
            }
        }
        return d(zip64Mode);
    }

    private void I(t tVar, long j10, boolean z10) {
        if (z10) {
            o oVarA = A(tVar);
            if (tVar.getCompressedSize() >= KeyboardMap.kValueMask || tVar.getSize() >= KeyboardMap.kValueMask) {
                oVarA.n(new q(tVar.getCompressedSize()));
                oVarA.q(new q(tVar.getSize()));
            } else {
                oVarA.n(null);
                oVarA.q(null);
            }
            if (j10 >= KeyboardMap.kValueMask) {
                oVarA.p(new q(j10));
            }
            tVar.E();
        }
    }

    private boolean J(t tVar) {
        return tVar.i(o.f137427g) != null;
    }

    private boolean K(int i10) {
        return i10 == 8 && this.f137571r == null;
    }

    private boolean M(t tVar) {
        return tVar.getSize() >= KeyboardMap.kValueMask || tVar.getCompressedSize() >= KeyboardMap.kValueMask;
    }

    private boolean N(t tVar, Zip64Mode zip64Mode) {
        return zip64Mode == Zip64Mode.Always || M(tVar);
    }

    private void O() throws IOException {
        if (this.f137555b) {
            throw new IOException("Stream has already been finished");
        }
        b bVar = this.f137556c;
        if (bVar == null) {
            throw new IOException("No current entry to close");
        }
        if (bVar.f137583f) {
            return;
        }
        write(f137550x2, 0, 0);
    }

    private void Q(boolean z10) throws IOException {
        long filePointer = this.f137571r.getFilePointer();
        this.f137571r.seek(this.f137556c.f137579b);
        w0(y.b(this.f137556c.f137578a.getCrc()));
        if (J(this.f137556c.f137578a) && z10) {
            y yVar = y.f137541o;
            w0(yVar.a());
            w0(yVar.a());
        } else {
            w0(y.b(this.f137556c.f137578a.getCompressedSize()));
            w0(y.b(this.f137556c.f137578a.getSize()));
        }
        if (J(this.f137556c.f137578a)) {
            this.f137571r.seek(this.f137556c.f137579b + 12 + 4 + ((long) z(this.f137556c.f137578a).limit()) + 4);
            w0(q.b(this.f137556c.f137578a.getSize()));
            w0(q.b(this.f137556c.f137578a.getCompressedSize()));
            if (!z10) {
                this.f137571r.seek(this.f137556c.f137579b - 10);
                w0(a0.b(10));
                this.f137556c.f137578a.y(o.f137427g);
                this.f137556c.f137578a.E();
                if (this.f137556c.f137582e) {
                    this.f137575v = false;
                }
            }
        }
        this.f137571r.seek(filePointer);
    }

    private void V(t tVar) {
        if (tVar.getMethod() == -1) {
            tVar.setMethod(this.f137560g);
        }
        if (tVar.getTime() == -1) {
            tVar.setTime(System.currentTimeMillis());
        }
    }

    private void a(t tVar, boolean z10, ByteBuffer byteBuffer) throws IOException {
        c cVar = this.f137574u;
        c cVar2 = c.f137584b;
        if (cVar == cVar2 || !z10) {
            tVar.b(new k(tVar.getName(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position()));
        }
        String comment = tVar.getComment();
        if (comment == null || comment.isEmpty()) {
            return;
        }
        if (this.f137574u == cVar2 || !this.f137568o.b(comment)) {
            ByteBuffer byteBufferA = t(tVar).a(comment);
            tVar.b(new j(comment, byteBufferA.array(), byteBufferA.arrayOffset(), byteBufferA.limit() - byteBufferA.position()));
        }
    }

    @Deprecated
    protected static long b(int i10) {
        return b0.a(i10);
    }

    private boolean d(Zip64Mode zip64Mode) throws ZipException {
        boolean zN = N(this.f137556c.f137578a, zip64Mode);
        if (zN && zip64Mode == Zip64Mode.Never) {
            throw new Zip64RequiredException(Zip64RequiredException.a(this.f137556c.f137578a));
        }
        return zN;
    }

    private void f(boolean z10) throws IOException {
        if (this.f137571r != null) {
            Q(z10);
        }
        t0(this.f137556c.f137578a);
        this.f137556c = null;
    }

    private boolean f0(t tVar, Zip64Mode zip64Mode) {
        return zip64Mode == Zip64Mode.Always || tVar.getSize() >= KeyboardMap.kValueMask || tVar.getCompressedSize() >= KeyboardMap.kValueMask || !(tVar.getSize() != -1 || this.f137571r == null || zip64Mode == Zip64Mode.Never);
    }

    private byte[] g(t tVar) throws IOException {
        long jLongValue = this.f137566m.get(tVar).longValue();
        boolean z10 = J(tVar) || tVar.getCompressedSize() >= KeyboardMap.kValueMask || tVar.getSize() >= KeyboardMap.kValueMask || jLongValue >= KeyboardMap.kValueMask;
        if (z10 && this.f137576w == Zip64Mode.Never) {
            throw new Zip64RequiredException("archive's size exceeds the limit of 4GByte.");
        }
        I(tVar, jLongValue, z10);
        return i(tVar, z(tVar), jLongValue, z10);
    }

    @Deprecated
    protected static y g0(Date date) {
        return b0.k(date);
    }

    @Deprecated
    protected static byte[] h0(long j10) {
        return b0.n(j10);
    }

    private byte[] i(t tVar, ByteBuffer byteBuffer, long j10, boolean z10) throws IOException {
        byte[] bArrG = tVar.g();
        String comment = tVar.getComment();
        if (comment == null) {
            comment = "";
        }
        ByteBuffer byteBufferA = t(tVar).a(comment);
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        int iLimit2 = byteBufferA.limit() - byteBufferA.position();
        int i10 = iLimit + 46;
        byte[] bArr = new byte[bArrG.length + i10 + iLimit2];
        System.arraycopy(K3, 0, bArr, 0, 4);
        a0.f((tVar.s() << 8) | (!this.f137575v ? 20 : 45), bArr, 4);
        int method = tVar.getMethod();
        boolean zB = this.f137568o.b(tVar.getName());
        a0.f(j0(method, z10), bArr, 6);
        x(method, !zB && this.f137573t).a(bArr, 8);
        a0.f(method, bArr, 10);
        b0.m(this.f137577x, tVar.getTime(), bArr, 12);
        y.f(tVar.getCrc(), bArr, 16);
        if (tVar.getCompressedSize() >= KeyboardMap.kValueMask || tVar.getSize() >= KeyboardMap.kValueMask) {
            y yVar = y.f137541o;
            yVar.g(bArr, 20);
            yVar.g(bArr, 24);
        } else {
            y.f(tVar.getCompressedSize(), bArr, 20);
            y.f(tVar.getSize(), bArr, 24);
        }
        a0.f(iLimit, bArr, 28);
        a0.f(bArrG.length, bArr, 30);
        a0.f(iLimit2, bArr, 32);
        System.arraycopy(f137553y2, 0, bArr, 34, 2);
        a0.f(tVar.m(), bArr, 36);
        y.f(tVar.h(), bArr, 38);
        y.f(Math.min(j10, KeyboardMap.kValueMask), bArr, 42);
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 46, iLimit);
        System.arraycopy(bArrG, 0, bArr, i10, bArrG.length);
        System.arraycopy(byteBufferA.array(), byteBufferA.arrayOffset(), bArr, i10 + bArrG.length, iLimit2);
        return bArr;
    }

    private void i0(Zip64Mode zip64Mode) throws ZipException {
        if (this.f137556c.f137578a.getMethod() == 0 && this.f137571r == null) {
            if (this.f137556c.f137578a.getSize() == -1) {
                throw new ZipException("uncompressed size is required for STORED method when not writing to a file");
            }
            if (this.f137556c.f137578a.getCrc() == -1) {
                throw new ZipException("crc checksum is required for STORED method when not writing to a file");
            }
            this.f137556c.f137578a.setCompressedSize(this.f137556c.f137578a.getSize());
        }
        if ((this.f137556c.f137578a.getSize() >= KeyboardMap.kValueMask || this.f137556c.f137578a.getCompressedSize() >= KeyboardMap.kValueMask) && zip64Mode == Zip64Mode.Never) {
            throw new Zip64RequiredException(Zip64RequiredException.a(this.f137556c.f137578a));
        }
    }

    private int j0(int i10, boolean z10) {
        if (z10) {
            return 45;
        }
        return K(i10) ? 20 : 10;
    }

    private byte[] k(t tVar, ByteBuffer byteBuffer, boolean z10) {
        byte[] bArrO = tVar.o();
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        int i10 = iLimit + 30;
        byte[] bArr = new byte[bArrO.length + i10];
        System.arraycopy(G3, 0, bArr, 0, 4);
        int method = tVar.getMethod();
        a0.f(j0(method, J(tVar)), bArr, 4);
        x(method, !z10 && this.f137573t).a(bArr, 6);
        a0.f(method, bArr, 8);
        b0.m(this.f137577x, tVar.getTime(), bArr, 10);
        if (method == 8 || this.f137571r != null) {
            System.arraycopy(G2, 0, bArr, 14, 4);
        } else {
            y.f(tVar.getCrc(), bArr, 14);
        }
        if (J(this.f137556c.f137578a)) {
            y yVar = y.f137541o;
            yVar.g(bArr, 18);
            yVar.g(bArr, 22);
        } else if (method == 8 || this.f137571r != null) {
            byte[] bArr2 = G2;
            System.arraycopy(bArr2, 0, bArr, 18, 4);
            System.arraycopy(bArr2, 0, bArr, 22, 4);
        } else {
            y.f(tVar.getSize(), bArr, 18);
            y.f(tVar.getSize(), bArr, 22);
        }
        a0.f(iLimit, bArr, 26);
        a0.f(bArrO.length, bArr, 28);
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 30, iLimit);
        System.arraycopy(bArrO, 0, bArr, i10, bArrO.length);
        return bArr;
    }

    private void n() throws IOException {
        while (!this.f137569p.needsInput()) {
            m();
        }
    }

    private void o0() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(70000);
        Iterator<t> it = this.f137561h.iterator();
        while (true) {
            int i10 = 0;
            do {
                if (!it.hasNext()) {
                    q0(byteArrayOutputStream.toByteArray());
                    return;
                } else {
                    byteArrayOutputStream.write(g(it.next()));
                    i10++;
                }
            } while (i10 <= 1000);
            q0(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
        }
    }

    private void q() throws IOException {
        if (this.f137556c.f137578a.getMethod() == 8) {
            this.f137569p.finish();
            while (!this.f137569p.finished()) {
                m();
            }
        }
    }

    private void q0(byte[] bArr) throws IOException {
        s0(bArr, 0, bArr.length);
    }

    private Zip64Mode r(t tVar) {
        return (this.f137576w == Zip64Mode.AsNeeded && this.f137571r == null && tVar.getMethod() == 8 && tVar.getSize() == -1) ? Zip64Mode.Never : this.f137576w;
    }

    private void s0(byte[] bArr, int i10, int i11) throws IOException {
        x0(bArr, i10, i11);
        this.f137563j += (long) i11;
    }

    private r t(t tVar) {
        return (this.f137568o.b(tVar.getName()) || !this.f137573t) ? this.f137568o : s.f137473e;
    }

    private void u0(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 <= 0 || this.f137569p.finished()) {
            return;
        }
        b.g(this.f137556c, i11);
        if (i11 <= 8192) {
            this.f137569p.setInput(bArr, i10, i11);
            n();
            return;
        }
        int i12 = i11 / 8192;
        for (int i13 = 0; i13 < i12; i13++) {
            this.f137569p.setInput(bArr, (i13 * 8192) + i10, 8192);
            n();
        }
        int i14 = i12 * 8192;
        if (i14 < i11) {
            this.f137569p.setInput(bArr, i10 + i14, i11 - i14);
            n();
        }
    }

    private f x(int i10, boolean z10) {
        f fVar = new f();
        fVar.g(this.f137572s || z10);
        if (K(i10)) {
            fVar.d(true);
        }
        return fVar;
    }

    private ByteBuffer z(t tVar) throws IOException {
        return t(tVar).a(tVar.getName());
    }

    public boolean L() {
        return this.f137571r != null;
    }

    public void P(t tVar) throws IOException {
        if (this.f137555b) {
            throw new IOException("Stream has already been finished");
        }
        if (this.f137556c != null) {
            e();
        }
        b bVar = new b(tVar);
        this.f137556c = bVar;
        this.f137561h.add(bVar.f137578a);
        V(this.f137556c.f137578a);
        Zip64Mode zip64ModeR = r(this.f137556c.f137578a);
        i0(zip64ModeR);
        if (f0(this.f137556c.f137578a, zip64ModeR)) {
            o oVarA = A(this.f137556c.f137578a);
            q qVar = q.f137467y;
            if (this.f137556c.f137578a.getMethod() == 0 && this.f137556c.f137578a.getSize() != -1) {
                qVar = new q(this.f137556c.f137578a.getSize());
            }
            oVarA.q(qVar);
            oVarA.n(qVar);
            this.f137556c.f137578a.E();
        }
        if (this.f137556c.f137578a.getMethod() == 8 && this.f137559f) {
            this.f137569p.setLevel(this.f137558e);
            this.f137559f = false;
        }
        v0(this.f137556c.f137578a);
    }

    public void R(String str) {
        this.f137557d = str;
    }

    public void S(c cVar) {
        this.f137574u = cVar;
    }

    public void W(String str) {
        this.f137567n = str;
        this.f137568o = s.b(str);
        if (!this.f137572s || s.d(str)) {
            return;
        }
        this.f137572s = false;
    }

    public void Y(boolean z10) {
        this.f137573t = z10;
    }

    public void Z(int i10) {
        if (i10 < -1 || i10 > 9) {
            throw new IllegalArgumentException("Invalid compression level: " + i10);
        }
        if (this.f137558e == i10) {
            return;
        }
        this.f137559f = true;
        this.f137558e = i10;
    }

    public void a0(int i10) {
        this.f137560g = i10;
    }

    public boolean c(t tVar) {
        return b0.b(tVar);
    }

    public void c0(boolean z10) {
        this.f137572s = z10 && s.d(this.f137567n);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f137555b) {
            p();
        }
        o();
    }

    public void e() throws IOException {
        O();
        q();
        Zip64Mode zip64ModeR = r(this.f137556c.f137578a);
        long j10 = this.f137563j - this.f137556c.f137580c;
        long value = this.f137562i.getValue();
        this.f137562i.reset();
        f(C(j10, value, zip64ModeR));
    }

    public void e0(Zip64Mode zip64Mode) {
        this.f137576w = zip64Mode;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = ((FilterOutputStream) this).out;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    protected byte[] getBytes(String str) throws ZipException {
        try {
            ByteBuffer byteBufferA = s.b(this.f137567n).a(str);
            int iLimit = byteBufferA.limit();
            byte[] bArr = new byte[iLimit];
            System.arraycopy(byteBufferA.array(), byteBufferA.arrayOffset(), bArr, 0, iLimit);
            return bArr;
        } catch (IOException e10) {
            throw new ZipException("Failed to encode name: " + e10.getMessage());
        }
    }

    protected final void m() throws IOException {
        Deflater deflater = this.f137569p;
        byte[] bArr = this.f137570q;
        int iDeflate = deflater.deflate(bArr, 0, bArr.length);
        if (iDeflate > 0) {
            s0(this.f137570q, 0, iDeflate);
        }
    }

    protected void m0() throws IOException {
        q0(L3);
        byte[] bArr = f137553y2;
        q0(bArr);
        q0(bArr);
        int size = this.f137561h.size();
        if (size > 65535 && this.f137576w == Zip64Mode.Never) {
            throw new Zip64RequiredException("archive contains more than 65535 entries.");
        }
        if (this.f137564k > KeyboardMap.kValueMask && this.f137576w == Zip64Mode.Never) {
            throw new Zip64RequiredException("archive's size exceeds the limit of 4GByte.");
        }
        byte[] bArrB = a0.b(Math.min(size, 65535));
        q0(bArrB);
        q0(bArrB);
        q0(y.b(Math.min(this.f137565l, KeyboardMap.kValueMask)));
        q0(y.b(Math.min(this.f137564k, KeyboardMap.kValueMask)));
        ByteBuffer byteBufferA = this.f137568o.a(this.f137557d);
        int iLimit = byteBufferA.limit() - byteBufferA.position();
        q0(a0.b(iLimit));
        s0(byteBufferA.array(), byteBufferA.arrayOffset(), iLimit);
    }

    void o() throws IOException {
        RandomAccessFile randomAccessFile = this.f137571r;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        OutputStream outputStream = ((FilterOutputStream) this).out;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    public void p() throws IOException {
        if (this.f137555b) {
            throw new IOException("This archive has already been finished");
        }
        if (this.f137556c != null) {
            e();
        }
        this.f137564k = this.f137563j;
        o0();
        this.f137565l = this.f137563j - this.f137564k;
        z0();
        m0();
        this.f137566m.clear();
        this.f137561h.clear();
        this.f137569p.end();
        this.f137555b = true;
    }

    protected void p0(t tVar) throws IOException {
        q0(g(tVar));
    }

    public String s() {
        return this.f137567n;
    }

    protected void t0(t tVar) throws IOException {
        if (tVar.getMethod() == 8 && this.f137571r == null) {
            q0(J3);
            q0(y.b(tVar.getCrc()));
            if (J(tVar)) {
                q0(q.b(tVar.getCompressedSize()));
                q0(q.b(tVar.getSize()));
            } else {
                q0(y.b(tVar.getCompressedSize()));
                q0(y.b(tVar.getSize()));
            }
        }
    }

    protected void v0(t tVar) throws IOException {
        boolean zB = this.f137568o.b(tVar.getName());
        ByteBuffer byteBufferZ = z(tVar);
        if (this.f137574u != c.f137585c) {
            a(tVar, zB, byteBufferZ);
        }
        byte[] bArrK = k(tVar, byteBufferZ, zB);
        long j10 = this.f137563j;
        this.f137566m.put(tVar, Long.valueOf(j10));
        this.f137556c.f137579b = j10 + 14;
        q0(bArrK);
        this.f137556c.f137580c = this.f137563j;
    }

    protected final void w0(byte[] bArr) throws IOException {
        x0(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        b bVar = this.f137556c;
        if (bVar == null) {
            throw new IllegalStateException("No current entry");
        }
        b0.c(bVar.f137578a);
        this.f137556c.f137583f = true;
        if (this.f137556c.f137578a.getMethod() == 8) {
            u0(bArr, i10, i11);
        } else {
            s0(bArr, i10, i11);
        }
        this.f137562i.update(bArr, i10, i11);
    }

    protected final void x0(byte[] bArr, int i10, int i11) throws IOException {
        RandomAccessFile randomAccessFile = this.f137571r;
        if (randomAccessFile != null) {
            randomAccessFile.write(bArr, i10, i11);
        } else {
            ((FilterOutputStream) this).out.write(bArr, i10, i11);
        }
    }

    protected void z0() throws IOException {
        if (this.f137576w == Zip64Mode.Never) {
            return;
        }
        if (!this.f137575v && (this.f137564k >= KeyboardMap.kValueMask || this.f137565l >= KeyboardMap.kValueMask || this.f137561h.size() >= 65535)) {
            this.f137575v = true;
        }
        if (this.f137575v) {
            long j10 = this.f137563j;
            w0(M3);
            w0(q.b(44L));
            w0(a0.b(45));
            w0(a0.b(45));
            byte[] bArr = G2;
            w0(bArr);
            w0(bArr);
            byte[] bArrB = q.b(this.f137561h.size());
            w0(bArrB);
            w0(bArrB);
            w0(q.b(this.f137565l));
            w0(q.b(this.f137564k));
            w0(N3);
            w0(bArr);
            w0(q.b(j10));
            w0(f137548p3);
        }
    }
}
