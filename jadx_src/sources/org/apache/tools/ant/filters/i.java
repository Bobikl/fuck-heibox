package org.apache.tools.ant.filters;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: FixCrLfFilter.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends org.apache.tools.ant.filters.b implements org.apache.tools.ant.filters.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f133162m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f133163n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f133164o = 80;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final char f133165p = 26;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f133166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f133167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f133168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f133169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f133170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f133171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f133172l;

    /* JADX INFO: compiled from: FixCrLfFilter.java */
    public static class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final a f133173c = m("asis");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final a f133174d = m("add");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final a f133175e = m("remove");

        /* JADX INFO: Access modifiers changed from: private */
        public a l() {
            return m(d());
        }

        public static a m(String str) {
            a aVar = new a();
            aVar.g(str);
            return aVar;
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"add", "asis", "remove"};
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && b() == ((a) obj).b();
        }

        public int hashCode() {
            return b();
        }

        a n() throws IllegalStateException {
            a aVar = f133173c;
            if (equals(aVar)) {
                return aVar;
            }
            a aVar2 = f133174d;
            if (equals(aVar2)) {
                return aVar2;
            }
            a aVar3 = f133175e;
            if (equals(aVar3)) {
                return aVar3;
            }
            throw new IllegalStateException("No replacement for " + this);
        }
    }

    /* JADX INFO: compiled from: FixCrLfFilter.java */
    public static class b extends C1227i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f133176f;

        public b(Reader reader) {
            super(reader);
            this.f133176f = -1;
        }

        @Override // org.apache.tools.ant.filters.i.C1227i, java.io.Reader
        public int read() throws IOException {
            int i10 = super.read();
            if (i10 != -1) {
                this.f133176f = i10;
            } else if (this.f133176f != 26) {
                this.f133176f = 26;
                return 26;
            }
            return i10;
        }
    }

    /* JADX INFO: compiled from: FixCrLfFilter.java */
    public static class c extends C1227i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f133177f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f133178g;

        public c(Reader reader, int i10) {
            super(reader);
            this.f133177f = 0;
            this.f133178g = i10;
        }

        @Override // org.apache.tools.ant.filters.i.C1227i, java.io.Reader
        public int read() throws IOException {
            int i10;
            int i11 = super.read();
            if (i11 == 9) {
                int i12 = this.f133177f;
                int i13 = this.f133178g;
                this.f133177f = (((i12 + i13) - 1) / i13) * i13;
            } else if (i11 == 10 || i11 == 13) {
                this.f133177f = 0;
            } else if (i11 != 32) {
                this.f133177f++;
            } else {
                this.f133177f++;
                if (!a()) {
                    int i14 = this.f133177f;
                    int i15 = this.f133178g;
                    int i16 = (((i14 + i15) - 1) / i15) * i15;
                    int i17 = 1;
                    int i18 = 0;
                    while (true) {
                        int i19 = super.read();
                        if (i19 == -1) {
                            break;
                        }
                        if (i19 == 9) {
                            this.f133177f = i16;
                            i18++;
                            i10 = this.f133178g;
                        } else {
                            if (i19 != 32) {
                                c(i19);
                                break;
                            }
                            int i20 = this.f133177f + 1;
                            this.f133177f = i20;
                            if (i20 == i16) {
                                i18++;
                                i10 = this.f133178g;
                            } else {
                                i17++;
                            }
                        }
                        i16 += i10;
                        i17 = 0;
                    }
                    while (true) {
                        int i21 = i17 - 1;
                        if (i17 <= 0) {
                            break;
                        }
                        b(' ');
                        this.f133177f--;
                        i17 = i21;
                    }
                    while (true) {
                        int i22 = i18 - 1;
                        if (i18 <= 0) {
                            break;
                        }
                        b('\t');
                        this.f133177f -= this.f133178g;
                        i18 = i22;
                    }
                    i11 = super.read();
                    if (i11 == 9) {
                        this.f133177f += this.f133178g;
                    } else if (i11 == 32) {
                        this.f133177f++;
                    }
                }
            }
            return i11;
        }
    }

    /* JADX INFO: compiled from: FixCrLfFilter.java */
    public static class d extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final d f133179c = p("asis");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final d f133180d = p("cr");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final d f133181e = p("crlf");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final d f133182f = p(org.apache.tools.ant.taskdefs.condition.z.f133973o);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final d f133183g = p("lf");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final d f133184h = p("mac");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final d f133185i = p(org.apache.tools.ant.taskdefs.condition.z.f133976r);

        /* JADX INFO: Access modifiers changed from: private */
        public d o() {
            return p(d());
        }

        public static d p(String str) {
            d dVar = new d();
            dVar.g(str);
            return dVar;
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"asis", "cr", "lf", "crlf", "mac", org.apache.tools.ant.taskdefs.condition.z.f133976r, org.apache.tools.ant.taskdefs.condition.z.f133973o};
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && b() == ((d) obj).b();
        }

        public int hashCode() {
            return b();
        }

        d q() {
            d dVar = f133179c;
            if (equals(dVar)) {
                return dVar;
            }
            d dVar2 = f133180d;
            if (!equals(dVar2) && !equals(f133184h)) {
                dVar2 = f133181e;
                if (!equals(dVar2) && !equals(f133182f)) {
                    dVar2 = f133183g;
                    if (!equals(dVar2) && !equals(f133185i)) {
                        throw new IllegalStateException("No replacement for " + this);
                    }
                }
            }
            return dVar2;
        }
    }

    /* JADX INFO: compiled from: FixCrLfFilter.java */
    public static class e extends C1227i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f133186h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f133187i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f133188j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f133189k = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f133190l = 5;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f133191m = 6;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f133192n = 8;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f133193f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f133194g;

        public e(Reader reader) {
            super(reader);
            this.f133193f = false;
            this.f133194g = 1;
        }

        @Override // org.apache.tools.ant.filters.i.C1227i
        public boolean a() {
            return this.f133193f || super.a();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // org.apache.tools.ant.filters.i.C1227i, java.io.Reader
        public int read() throws IOException {
            int i10 = super.read();
            int i11 = this.f133194g;
            this.f133193f = i11 == 2 || i11 == 3;
            switch (i11) {
                case 1:
                    if (i10 == 34) {
                        this.f133194g = 3;
                    } else if (i10 == 39) {
                        this.f133194g = 2;
                    } else if (i10 == 47) {
                        this.f133194g = 6;
                    }
                    return i10;
                case 2:
                    if (i10 == 39) {
                        this.f133194g = 1;
                    }
                    return i10;
                case 3:
                    if (i10 == 34) {
                        this.f133194g = 1;
                    }
                    return i10;
                case 4:
                    if (i10 == 10 || i10 == 13) {
                        this.f133194g = 1;
                    }
                    return i10;
                case 5:
                    if (i10 == 42) {
                        this.f133194g = 8;
                    }
                    return i10;
                case 6:
                    if (i10 == 34) {
                        this.f133194g = 3;
                    } else if (i10 == 39) {
                        this.f133194g = 2;
                    } else if (i10 == 42) {
                        this.f133194g = 5;
                    } else if (i10 != 47) {
                        this.f133194g = 1;
                    } else {
                        this.f133194g = 4;
                    }
                    return i10;
                case 7:
                default:
                    return i10;
                case 8:
                    if (i10 == 47) {
                        this.f133194g = 1;
                    }
                    return i10;
            }
        }
    }

    /* JADX INFO: compiled from: FixCrLfFilter.java */
    public static class f extends C1227i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f133195f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f133196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f133197h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private char[] f133198i;

        public f(Reader reader, String str, boolean z10) {
            super(reader);
            this.f133197h = 0;
            this.f133198i = null;
            this.f133198i = str.toCharArray();
            this.f133196g = z10;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0052  */
        /* JADX WARN: Code duplicated, block: B:39:0x005f  */
        @Override // org.apache.tools.ant.filters.i.C1227i, java.io.Reader
        public int read() throws IOException {
            int i10;
            int i11;
            int i12 = super.read();
            int i13 = this.f133197h;
            if (i13 != 0) {
                this.f133197h = i13 - 1;
                return i12;
            }
            if (i12 != -1) {
                if (i12 == 10) {
                    i11 = 1;
                } else if (i12 != 13) {
                    if (i12 == 26) {
                        int i14 = super.read();
                        if (i14 != -1) {
                            c(i14);
                        } else if (!this.f133196g || this.f133195f) {
                            i10 = 1;
                            i11 = 0;
                        } else {
                            c(i12);
                            i11 = 1;
                            i10 = i11;
                        }
                    }
                    i11 = 0;
                    i10 = i11;
                } else {
                    int i15 = super.read();
                    int i16 = super.read();
                    if (i15 == 13 && i16 == 10) {
                        i11 = 1;
                    } else if (i15 == 13) {
                        i11 = 2;
                        c(i16);
                    } else {
                        if (i15 == 10) {
                            c(i16);
                        } else {
                            c(i16);
                            c(i15);
                        }
                        i11 = 1;
                    }
                }
                i10 = 0;
            } else if (!this.f133196g || this.f133195f) {
                i10 = 1;
                i11 = 0;
            } else {
                i11 = 1;
                i10 = i11;
            }
            if (i11 <= 0) {
                if (i10 != 0) {
                    return i12;
                }
                this.f133195f = false;
                return i12;
            }
            while (true) {
                int i17 = i11 - 1;
                if (i11 <= 0) {
                    this.f133195f = true;
                    return read();
                }
                d(this.f133198i);
                this.f133197h += this.f133198i.length;
                i11 = i17;
            }
        }
    }

    /* JADX INFO: compiled from: FixCrLfFilter.java */
    public static class g extends C1227i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f133199f;

        public g(Reader reader) {
            super(reader);
            this.f133199f = -1;
            try {
                this.f133199f = reader.read();
            } catch (IOException unused) {
                this.f133199f = -1;
            }
        }

        @Override // org.apache.tools.ant.filters.i.C1227i, java.io.Reader
        public int read() throws IOException {
            int i10 = super.read();
            if (i10 == -1 && this.f133199f == 26) {
                return -1;
            }
            int i11 = this.f133199f;
            this.f133199f = i10;
            return i11;
        }
    }

    /* JADX INFO: compiled from: FixCrLfFilter.java */
    public static class h extends C1227i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f133200f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f133201g;

        public h(Reader reader, int i10) {
            super(reader);
            this.f133200f = 0;
            this.f133201g = i10;
        }

        @Override // org.apache.tools.ant.filters.i.C1227i, java.io.Reader
        public int read() throws IOException {
            int i10 = super.read();
            if (i10 == 9) {
                int i11 = this.f133201g;
                int i12 = i11 - (this.f133200f % i11);
                if (!a()) {
                    while (i12 > 1) {
                        b(' ');
                        i12--;
                    }
                    i10 = 32;
                }
                this.f133200f += i12;
            } else if (i10 == 10 || i10 == 13) {
                this.f133200f = 0;
            } else {
                this.f133200f++;
            }
            return i10;
        }
    }

    /* JADX INFO: renamed from: org.apache.tools.ant.filters.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FixCrLfFilter.java */
    public static class C1227i extends Reader {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f133202e = 16;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Reader f133203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f133204c = new int[16];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f133205d = 0;

        public C1227i(Reader reader) {
            this.f133203b = reader;
        }

        public boolean a() {
            Reader reader = this.f133203b;
            return (reader instanceof C1227i) && ((C1227i) reader).a();
        }

        public void b(char c10) {
            c(c10);
        }

        public void c(int i10) {
            try {
                int[] iArr = this.f133204c;
                int i11 = this.f133205d;
                this.f133205d = i11 + 1;
                iArr[i11] = i10;
            } catch (ArrayIndexOutOfBoundsException unused) {
                int[] iArr2 = this.f133204c;
                int[] iArr3 = new int[iArr2.length * 2];
                System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
                this.f133204c = iArr3;
                c(i10);
            }
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f133203b.close();
        }

        public void d(char[] cArr) {
            e(cArr, 0, cArr.length);
        }

        public void e(char[] cArr, int i10, int i11) {
            for (int i12 = (i11 + i10) - 1; i12 >= i10; i12--) {
                b(cArr[i12]);
            }
        }

        @Override // java.io.Reader
        public void mark(int i10) throws IOException {
            this.f133203b.mark(i10);
        }

        @Override // java.io.Reader
        public boolean markSupported() {
            return this.f133203b.markSupported();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int i10 = this.f133205d;
            if (i10 <= 0) {
                return this.f133203b.read();
            }
            int[] iArr = this.f133204c;
            int i11 = i10 - 1;
            this.f133205d = i11;
            return iArr[i11];
        }

        @Override // java.io.Reader
        public int read(char[] cArr) throws IOException {
            return read(cArr, 0, cArr.length);
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = i11 - 1;
                if (i11 <= 0 || (i13 = read()) == -1) {
                    break;
                }
                cArr[i10] = (char) i13;
                i12++;
                i10++;
                i11 = i14;
            }
            if (i12 == 0 && i13 == -1) {
                return -1;
            }
            return i12;
        }

        @Override // java.io.Reader
        public boolean ready() throws IOException {
            return this.f133203b.ready();
        }

        @Override // java.io.Reader
        public void reset() throws IOException {
            this.f133203b.reset();
        }

        @Override // java.io.Reader
        public long skip(long j10) throws IOException {
            return this.f133203b.skip(j10);
        }
    }

    public i() {
        this.f133166f = 8;
        this.f133170j = false;
        this.f133171k = true;
        this.f133172l = false;
        this.f133169i = a.f133173c;
        if (org.apache.tools.ant.taskdefs.condition.z.b("mac") && !org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133976r)) {
            this.f133168h = a.f133175e;
            t(d.f133184h);
        } else if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133973o)) {
            this.f133168h = a.f133173c;
            t(d.f133182f);
        } else {
            this.f133168h = a.f133175e;
            t(d.f133185i);
        }
    }

    public i(Reader reader) throws IOException {
        super(reader);
        this.f133166f = 8;
        this.f133170j = false;
        this.f133171k = true;
        this.f133172l = false;
        this.f133169i = a.f133173c;
        if (org.apache.tools.ant.taskdefs.condition.z.b("mac") && !org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133976r)) {
            this.f133168h = a.f133175e;
            t(d.f133184h);
        } else if (org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133973o)) {
            this.f133168h = a.f133173c;
            t(d.f133182f);
        } else {
            this.f133168h = a.f133175e;
            t(d.f133185i);
        }
    }

    private static String i(d dVar) {
        if (dVar == d.f133180d || dVar == d.f133184h) {
            return "\r";
        }
        return (dVar == d.f133181e || dVar == d.f133182f) ? "\r\n" : "\n";
    }

    private void r() {
        ((FilterReader) this).in = this.f133168h == a.f133175e ? new g(((FilterReader) this).in) : ((FilterReader) this).in;
        if (this.f133167g != d.f133179c) {
            ((FilterReader) this).in = new f(((FilterReader) this).in, i(this.f133167g), n());
        }
        if (this.f133169i != a.f133173c) {
            if (o()) {
                ((FilterReader) this).in = new e(((FilterReader) this).in);
            }
            ((FilterReader) this).in = this.f133169i == a.f133174d ? new c(((FilterReader) this).in, q()) : new h(((FilterReader) this).in, q());
        }
        ((FilterReader) this).in = this.f133168h == a.f133174d ? new b(((FilterReader) this).in) : ((FilterReader) this).in;
        this.f133172l = true;
    }

    public void A(a aVar) {
        this.f133169i = aVar.n();
    }

    public void C(int i10) throws IOException {
        if (i10 < 2 || i10 > 80) {
            throw new IOException("tablength must be between 2 and 80");
        }
        this.f133166f = i10;
    }

    public a k() {
        return this.f133168h.l();
    }

    public d m() {
        return this.f133167g.o();
    }

    public boolean n() {
        return this.f133171k;
    }

    public boolean o() {
        return this.f133170j;
    }

    public a p() {
        return this.f133169i.l();
    }

    public int q() {
        return this.f133166f;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized int read() throws IOException {
        if (!this.f133172l) {
            r();
        }
        return ((FilterReader) this).in.read();
    }

    public void s(a aVar) {
        this.f133168h = aVar.n();
    }

    public void t(d dVar) {
        this.f133167g = dVar.q();
    }

    @Override // org.apache.tools.ant.filters.c
    public Reader t0(Reader reader) {
        try {
            i iVar = new i(reader);
            iVar.z(o());
            iVar.t(m());
            iVar.A(p());
            iVar.C(q());
            iVar.s(k());
            iVar.x(n());
            iVar.r();
            return iVar;
        } catch (IOException e10) {
            throw new BuildException(e10);
        }
    }

    public void x(boolean z10) {
        this.f133171k = z10;
    }

    public void z(boolean z10) {
        this.f133170j = z10;
    }
}
