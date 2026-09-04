package org.apache.tools.ant.taskdefs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.ResourceUtils;

/* JADX INFO: compiled from: Concat.java */
/* JADX INFO: loaded from: classes5.dex */
public class m0 extends org.apache.tools.ant.u2 implements org.apache.tools.ant.types.u1 {
    private static final int D = 8192;
    private static final org.apache.tools.ant.util.j0 E = org.apache.tools.ant.util.j0.O();
    private static final org.apache.tools.ant.types.resources.selectors.n F;
    private static final org.apache.tools.ant.types.resources.selectors.n G;
    private String A;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.s1 f134475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f134476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f134477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f134478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f134479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private StringBuffer f134480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.f1 f134481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Vector<org.apache.tools.ant.types.c0> f134482r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private e f134485u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private e f134486v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f134488x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f134483s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f134484t = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f134487w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Writer f134489y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f134490z = true;
    private d<org.apache.tools.ant.types.s1> B = new a();
    private d<Reader> C = new d() { // from class: org.apache.tools.ant.taskdefs.k0
        @Override // org.apache.tools.ant.taskdefs.m0.d
        public final Reader a(Object obj) {
            return m0.I2((Reader) obj);
        }
    };

    /* JADX INFO: compiled from: Concat.java */
    public class a implements d<org.apache.tools.ant.types.s1> {
        a() {
        }

        @Override // org.apache.tools.ant.taskdefs.m0.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Reader a(org.apache.tools.ant.types.s1 s1Var) throws IOException {
            InputStream inputStreamH2 = s1Var.h2();
            return new BufferedReader(m0.this.f134477m == null ? new InputStreamReader(inputStreamH2) : new InputStreamReader(inputStreamH2, m0.this.f134477m));
        }
    }

    /* JADX INFO: compiled from: Concat.java */
    public final class b extends org.apache.tools.ant.types.s1 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private org.apache.tools.ant.types.u1 f134492p;

        private b(org.apache.tools.ant.types.u1 u1Var) {
            this.f134492p = u1Var;
        }

        /* synthetic */ b(m0 m0Var, org.apache.tools.ant.types.u1 u1Var, a aVar) {
            this(u1Var);
        }

        @Override // org.apache.tools.ant.types.s1
        public InputStream h2() {
            if (m0.this.f134479o) {
                org.apache.tools.ant.util.u uVar = new org.apache.tools.ant.util.u(this.f134492p);
                uVar.g(this);
                return uVar;
            }
            a aVar = null;
            Reader readerE2 = m0.this.E2(new c(m0.this, this.f134492p.iterator(), m0.this.B, aVar));
            if (m0.this.f134486v != null || m0.this.f134485u != null) {
                int i10 = 1;
                int i11 = m0.this.f134486v != null ? 2 : 1;
                if (m0.this.f134485u != null) {
                    i11++;
                }
                Reader[] readerArr = new Reader[i11];
                if (m0.this.f134486v != null) {
                    readerArr[0] = new StringReader(m0.this.f134486v.H1());
                    if (m0.this.f134486v.G1()) {
                        readerArr[0] = m0.this.E2(readerArr[0]);
                    }
                } else {
                    i10 = 0;
                }
                int i12 = i10 + 1;
                readerArr[i10] = readerE2;
                if (m0.this.f134485u != null) {
                    readerArr[i12] = new StringReader(m0.this.f134485u.H1());
                    if (m0.this.f134485u.G1()) {
                        readerArr[i12] = m0.this.E2(readerArr[i12]);
                    }
                }
                readerE2 = new c(m0.this, Arrays.asList(readerArr).iterator(), m0.this.C, aVar);
            }
            return m0.this.f134478n == null ? new org.apache.tools.ant.util.i1(readerE2) : new org.apache.tools.ant.util.i1(readerE2, m0.this.f134478n);
        }

        @Override // org.apache.tools.ant.types.s1
        public String k2() {
            if (m0.this.A != null) {
                return m0.this.A;
            }
            return "concat (" + String.valueOf(this.f134492p) + ")";
        }
    }

    /* JADX INFO: compiled from: Concat.java */
    public final class c<S> extends Reader {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Reader f134494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f134495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private char[] f134496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f134497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Iterator<S> f134498f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d<S> f134499g;

        private c(Iterator<S> it, d<S> dVar) {
            this.f134494b = null;
            this.f134495c = 0;
            this.f134496d = new char[m0.this.f134488x.length()];
            this.f134497e = false;
            this.f134498f = it;
            this.f134499g = dVar;
        }

        /* synthetic */ c(m0 m0Var, Iterator it, d dVar, a aVar) {
            this(it, dVar);
        }

        private void a(char c10) {
            char[] cArr = this.f134496d;
            System.arraycopy(cArr, 1, cArr, 0, (cArr.length - 2) + 1);
            char[] cArr2 = this.f134496d;
            cArr2[cArr2.length - 1] = c10;
        }

        private Reader b() throws IOException {
            if (this.f134494b == null && this.f134498f.hasNext()) {
                this.f134494b = this.f134499g.a(this.f134498f.next());
                Arrays.fill(this.f134496d, (char) 0);
            }
            return this.f134494b;
        }

        private boolean c() {
            return m0.this.f134487w && m0.this.f134480p == null;
        }

        private boolean d() {
            int i10 = 0;
            while (true) {
                char[] cArr = this.f134496d;
                if (i10 >= cArr.length) {
                    return false;
                }
                if (cArr[i10] != m0.this.f134488x.charAt(i10)) {
                    return true;
                }
                i10++;
            }
        }

        private void e() throws IOException {
            close();
            this.f134494b = null;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Reader reader = this.f134494b;
            if (reader != null) {
                reader.close();
            }
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            if (this.f134497e) {
                if (this.f134495c < m0.this.f134488x.length()) {
                    String str = m0.this.f134488x;
                    int i10 = this.f134495c;
                    this.f134495c = i10 + 1;
                    return str.charAt(i10);
                }
                this.f134495c = 0;
                this.f134497e = false;
            }
            while (b() != null) {
                int i11 = b().read();
                if (i11 != -1) {
                    a((char) i11);
                    return i11;
                }
                e();
                if (c() && d()) {
                    this.f134497e = true;
                    this.f134495c = 1;
                    return m0.this.f134488x.charAt(0);
                }
            }
            return -1;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            int i12 = 0;
            while (true) {
                if (b() == null && !this.f134497e) {
                    if (i12 == 0) {
                        return -1;
                    }
                    return i12;
                }
                if (this.f134497e) {
                    String str = m0.this.f134488x;
                    int i13 = this.f134495c;
                    this.f134495c = i13 + 1;
                    cArr[i10] = str.charAt(i13);
                    if (this.f134495c >= m0.this.f134488x.length()) {
                        this.f134495c = 0;
                        this.f134497e = false;
                    }
                    i11--;
                    i10++;
                    i12++;
                    if (i11 == 0) {
                        return i12;
                    }
                } else {
                    int i14 = b().read(cArr, i10, i11);
                    if (i14 == -1 || i14 == 0) {
                        e();
                        if (c() && d()) {
                            this.f134497e = true;
                            this.f134495c = 0;
                        }
                    } else {
                        if (c()) {
                            for (int i15 = i14; i15 > i14 - this.f134496d.length && i15 > 0; i15--) {
                                a(cArr[(i10 + i15) - 1]);
                            }
                        }
                        i11 -= i14;
                        i10 += i14;
                        i12 += i14;
                        if (i11 == 0) {
                            return i12;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: Concat.java */
    public interface d<S> {
        Reader a(S s10) throws IOException;
    }

    /* JADX INFO: compiled from: Concat.java */
    public static class e extends org.apache.tools.ant.b2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f134501e = "";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f134502f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f134503g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f134504h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f134505i = null;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean G1() {
            return this.f134504h;
        }

        public void D1(String str) {
            this.f134501e += b().V0(str);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0045  */
        public String H1() {
            if (this.f134501e == null) {
                this.f134501e = "";
            }
            if (this.f134501e.trim().isEmpty()) {
                this.f134501e = "";
            }
            if (this.f134502f) {
                StringBuilder sb2 = new StringBuilder();
                boolean z10 = true;
                for (char c10 : this.f134501e.toCharArray()) {
                    if (!z10) {
                        sb2.append(c10);
                        if (c10 != '\n' || c10 == '\r') {
                            z10 = true;
                        }
                    } else if (c10 != ' ' && c10 != '\t') {
                        z10 = false;
                        sb2.append(c10);
                        if (c10 != '\n') {
                            z10 = true;
                        } else {
                            z10 = true;
                        }
                    }
                }
                this.f134501e = sb2.toString();
            }
            if (this.f134503g) {
                this.f134501e = this.f134501e.trim();
            }
            return this.f134501e;
        }

        public void I1(String str) {
            this.f134505i = str;
        }

        public void K1(File file) throws BuildException {
            if (!file.exists()) {
                throw new BuildException("File %s does not exist.", file);
            }
            BufferedReader bufferedReader = null;
            try {
                try {
                    bufferedReader = this.f134505i == null ? new BufferedReader(new FileReader(file)) : new BufferedReader(new InputStreamReader(Files.newInputStream(file.toPath(), new OpenOption[0]), this.f134505i));
                    this.f134501e = org.apache.tools.ant.util.j0.o0(bufferedReader);
                    org.apache.tools.ant.util.j0.e(bufferedReader);
                } catch (IOException e10) {
                    throw new BuildException(e10);
                }
            } catch (Throwable th2) {
                org.apache.tools.ant.util.j0.e(bufferedReader);
                throw th2;
            }
        }

        public void L1(boolean z10) {
            this.f134504h = z10;
        }

        public void N1(boolean z10) {
            this.f134503g = z10;
        }

        public void O1(boolean z10) {
            this.f134502f = z10;
        }
    }

    static {
        org.apache.tools.ant.types.resources.selectors.e eVar = new org.apache.tools.ant.types.resources.selectors.e();
        F = eVar;
        G = new org.apache.tools.ant.types.resources.selectors.k(eVar);
    }

    public m0() {
        J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Reader E2(Reader reader) {
        if (this.f134482r == null) {
            return reader;
        }
        org.apache.tools.ant.filters.util.i iVar = new org.apache.tools.ant.filters.util.i();
        iVar.k(8192);
        iVar.m(reader);
        iVar.l(this.f134482r);
        iVar.n(b());
        return iVar.f();
    }

    private org.apache.tools.ant.types.u1 F2() {
        if (this.f134481q == null) {
            return new org.apache.tools.ant.types.resources.l1(b(), this.f134480p.toString());
        }
        if (this.f134475k != null) {
            org.apache.tools.ant.types.resources.j0 j0Var = new org.apache.tools.ant.types.resources.j0();
            j0Var.J(b());
            j0Var.f2(this.f134481q);
            j0Var.f2(this.f134475k);
            if (j0Var.size() > 0) {
                throw new BuildException("Destination resource %s was specified as an input resource.", this.f134475k);
            }
        }
        org.apache.tools.ant.types.resources.i1 i1Var = new org.apache.tools.ant.types.resources.i1();
        i1Var.e2(G);
        i1Var.i2(this.f134481q);
        Iterator<org.apache.tools.ant.types.s1> it = i1Var.iterator();
        while (it.hasNext()) {
            x1(it.next() + org.apache.tools.ant.v0.I, 0);
        }
        org.apache.tools.ant.types.resources.i1 i1Var2 = new org.apache.tools.ant.types.resources.i1();
        i1Var2.e2(F);
        i1Var2.i2(this.f134481q);
        return i1Var2;
    }

    private boolean G2(org.apache.tools.ant.types.u1 u1Var) {
        return (this.f134475k == null || this.f134483s || !u1Var.stream().noneMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.l0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f134440a.H2((org.apache.tools.ant.types.s1) obj);
            }
        })) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean H2(org.apache.tools.ant.types.s1 s1Var) {
        return org.apache.tools.ant.types.selectors.m0.g(s1Var, this.f134475k, E.M());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Reader I2(Reader reader) throws IOException {
        return reader;
    }

    private void K2() {
        StringBuffer stringBuffer = this.f134480p;
        if (stringBuffer == null || !stringBuffer.toString().trim().isEmpty()) {
            return;
        }
        this.f134480p = null;
    }

    private void Z2() {
        K2();
        if (this.f134479o) {
            if (this.f134480p != null) {
                throw new BuildException("Nested text is incompatible with binary concatenation");
            }
            if (this.f134477m != null || this.f134478n != null) {
                throw new BuildException("Setting input or output encoding is incompatible with binary concatenation");
            }
            if (this.f134482r != null) {
                throw new BuildException("Setting filters is incompatible with binary concatenation");
            }
            if (this.f134487w) {
                throw new BuildException("Setting fixlastline is incompatible with binary concatenation");
            }
            if (this.f134486v != null || this.f134485u != null) {
                throw new BuildException("Nested header or footer is incompatible with binary concatenation");
            }
        }
        if (this.f134475k != null && this.f134489y != null) {
            throw new BuildException("Cannot specify both a destination resource and an output writer");
        }
        org.apache.tools.ant.types.resources.f1 f1Var = this.f134481q;
        if (f1Var == null && this.f134480p == null) {
            throw new BuildException("At least one resource must be provided, or some text.");
        }
        if (f1Var != null && this.f134480p != null) {
            throw new BuildException("Cannot include inline text when using resources.");
        }
    }

    public void A2(e eVar) {
        this.f134485u = eVar;
    }

    public void B2(e eVar) {
        this.f134486v = eVar;
    }

    public void C2(String str) {
        if (this.f134480p == null) {
            this.f134480p = new StringBuffer(str.length());
        }
        this.f134480p.append(str);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        Z2();
        if (this.f134479o && this.f134475k == null) {
            throw new BuildException("dest|destfile attribute is required for binary concatenation");
        }
        org.apache.tools.ant.types.u1 u1VarF2 = F2();
        if (G2(u1VarF2)) {
            x1(this.f134475k + " is up-to-date.", 3);
            return;
        }
        if (u1VarF2.isEmpty() && this.f134490z) {
            return;
        }
        try {
            b bVar = new b(this, u1VarF2, null);
            org.apache.tools.ant.types.s1 p0Var = this.f134475k;
            if (p0Var == null) {
                p0Var = new org.apache.tools.ant.types.resources.p0(this, 1);
            }
            ResourceUtils.m(bVar, p0Var, null, null, true, false, this.f134476l, null, null, b(), this.f134484t);
        } catch (IOException e10) {
            throw new BuildException("error concatenating content to " + this.f134475k, e10);
        }
    }

    public org.apache.tools.ant.types.o0 D2() {
        org.apache.tools.ant.types.o0 o0Var = new org.apache.tools.ant.types.o0(b());
        w2(o0Var);
        return o0Var;
    }

    public void J2() {
        this.f134476l = false;
        this.f134483s = true;
        this.f134475k = null;
        this.f134477m = null;
        this.f134478n = null;
        this.f134487w = false;
        this.f134482r = null;
        this.f134485u = null;
        this.f134486v = null;
        this.f134479o = false;
        this.f134489y = null;
        this.f134480p = null;
        this.f134488x = System.lineSeparator();
        this.f134481q = null;
        this.f134490z = true;
        this.f134484t = false;
    }

    public void L2(boolean z10) {
        this.f134476l = z10;
    }

    public void M2(boolean z10) {
        this.f134479o = z10;
    }

    public void N2(org.apache.tools.ant.types.s1 s1Var) {
        this.f134475k = s1Var;
    }

    @Override // org.apache.tools.ant.types.u1
    public boolean O() {
        return false;
    }

    public void O2(File file) {
        N2(new org.apache.tools.ant.types.resources.z(file));
    }

    public void P2(String str) {
        this.f134477m = str;
        if (this.f134478n == null) {
            this.f134478n = str;
        }
    }

    public void Q2(v1.b bVar) {
        String strD = bVar.d();
        if ("cr".equals(strD) || "mac".equals(strD)) {
            this.f134488x = "\r";
            return;
        }
        if ("lf".equals(strD) || org.apache.tools.ant.taskdefs.condition.z.f133976r.equals(strD)) {
            this.f134488x = "\n";
        } else if ("crlf".equals(strD) || org.apache.tools.ant.taskdefs.condition.z.f133973o.equals(strD)) {
            this.f134488x = "\r\n";
        }
    }

    public void R2(boolean z10) {
        this.f134487w = z10;
    }

    @Deprecated
    public void S2(boolean z10) {
        this.f134483s = z10;
    }

    public void T2(boolean z10) {
        this.f134484t = z10;
    }

    public void U2(boolean z10) {
        this.f134490z = z10;
    }

    public void V2(String str) {
        this.f134478n = str;
    }

    public void W2(boolean z10) {
        S2(z10);
    }

    public void X2(String str) {
        this.A = str;
    }

    public void Y2(Writer writer) {
        this.f134489y = writer;
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return org.apache.tools.ant.types.t1.a(this);
    }

    @Override // java.lang.Iterable
    public Iterator<org.apache.tools.ant.types.s1> iterator() {
        Z2();
        return Collections.singletonList(new b(this, F2(), null)).iterator();
    }

    @Override // org.apache.tools.ant.types.u1
    public int size() {
        return 1;
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return org.apache.tools.ant.types.t1.b(this);
    }

    public void w2(org.apache.tools.ant.types.u1 u1Var) {
        synchronized (this) {
            if (this.f134481q == null) {
                org.apache.tools.ant.types.resources.f1 f1Var = new org.apache.tools.ant.types.resources.f1();
                this.f134481q = f1Var;
                f1Var.J(b());
                this.f134481q.k2(true);
            }
        }
        this.f134481q.g2(u1Var);
    }

    public void x2(org.apache.tools.ant.types.a0 a0Var) {
        w2(a0Var);
    }

    public void y2(org.apache.tools.ant.types.b0 b0Var) {
        w2(b0Var);
    }

    public void z2(org.apache.tools.ant.types.c0 c0Var) {
        if (this.f134482r == null) {
            this.f134482r = new Vector<>();
        }
        this.f134482r.addElement(c0Var);
    }
}
