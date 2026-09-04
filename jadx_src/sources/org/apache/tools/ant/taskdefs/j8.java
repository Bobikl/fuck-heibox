package org.apache.tools.ant.taskdefs;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.zip.CRC32;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.ResourceUtils;
import org.apache.tools.zip.Zip64Mode;

/* JADX INFO: compiled from: Zip.java */
/* JADX INFO: loaded from: classes5.dex */
public class j8 extends h4 {
    private static final int R = 8192;
    private static final int S = 2000;
    private static final int T = 1999;
    private static final org.apache.tools.ant.util.j0 U = org.apache.tools.ant.util.j0.O();
    private static final long V = new CRC32().getValue();
    private static final org.apache.tools.ant.types.resources.selectors.n W = new org.apache.tools.ant.types.resources.selectors.n() { // from class: org.apache.tools.ant.taskdefs.g8
        @Override // org.apache.tools.ant.types.resources.selectors.n
        public final boolean a(org.apache.tools.ant.types.s1 s1Var) {
            return j8.v3(s1Var);
        }
    };
    private static final ResourceUtils.a X = new ResourceUtils.a() { // from class: org.apache.tools.ant.taskdefs.h8
        @Override // org.apache.tools.ant.util.ResourceUtils.a
        public final org.apache.tools.ant.types.resources.selectors.n a(org.apache.tools.ant.types.s1 s1Var) {
            return j8.w3(s1Var);
        }
    };
    private static final ThreadLocal<Boolean> Y = ThreadLocal.withInitial(new Supplier() { // from class: org.apache.tools.ant.taskdefs.i8
        @Override // java.util.function.Supplier
        public final Object get() {
            return Boolean.FALSE;
        }
    });
    private static final ThreadLocal<org.apache.tools.zip.u[]> Z = new ThreadLocal<>();
    private String H;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected File f134370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private org.apache.tools.ant.types.g2 f134371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f134372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected Hashtable<String, String> f134373o = new Hashtable<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<org.apache.tools.ant.types.b0> f134374p = new Vector();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<org.apache.tools.ant.types.d2> f134375q = new Vector();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected String f134376r = "add";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f134377s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f134378t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f134379u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f134380v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected String f134381w = "zip";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected String f134382x = org.apache.tools.ant.taskdefs.optional.vss.g.L2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List<org.apache.tools.ant.types.u1> f134383y = new Vector();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected Hashtable<String, String> f134384z = new Hashtable<>();
    private final List<String> A = new Vector();
    private String B = null;
    private long C = 0;
    protected boolean D = false;
    protected boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private boolean I = false;
    private boolean J = true;
    private String K = "";
    private int L = -1;
    private boolean M = false;
    private boolean N = true;
    private c O = c.f134391g;
    private boolean P = false;
    private e Q = e.f134397h;

    /* JADX INFO: compiled from: Zip.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f134385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final org.apache.tools.ant.types.s1[][] f134386b;

        a(boolean z10, org.apache.tools.ant.types.s1[][] s1VarArr) {
            this.f134385a = z10;
            this.f134386b = s1VarArr;
        }

        public org.apache.tools.ant.types.s1[][] a() {
            return this.f134386b;
        }

        public boolean b() {
            return this.f134385a;
        }

        public boolean c() {
            org.apache.tools.ant.types.s1[][] s1VarArr = this.f134386b;
            if (s1VarArr == null) {
                return true;
            }
            for (org.apache.tools.ant.types.s1[] s1VarArr2 : s1VarArr) {
                if (s1VarArr2 != null && s1VarArr2.length > 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: Zip.java */
    public static class b extends org.apache.tools.ant.types.w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"add", "preserve", "fail"};
        }
    }

    /* JADX INFO: compiled from: Zip.java */
    public static final class c extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Map<String, org.apache.tools.zip.z.c> f134387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f134388d = "never";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f134389e = "always";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f134390f = "not-encodeable";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f134391g;

        static {
            HashMap map = new HashMap();
            f134387c = map;
            map.put(f134388d, org.apache.tools.zip.z.c.f137585c);
            map.put(f134389e, org.apache.tools.zip.z.c.f137584b);
            map.put(f134390f, org.apache.tools.zip.z.c.f137586d);
            f134391g = new c(f134388d);
        }

        public c() {
        }

        private c(String str) {
            g(str);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{f134388d, f134389e, f134390f};
        }

        public org.apache.tools.zip.z.c h() {
            return f134387c.get(d());
        }
    }

    /* JADX INFO: compiled from: Zip.java */
    public static class d extends org.apache.tools.ant.types.w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"fail", org.apache.tools.ant.taskdefs.optional.vss.g.L2, TopicHashtagWrapper.TYPE_CREATE};
        }
    }

    /* JADX INFO: compiled from: Zip.java */
    public static final class e extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Map<String, Zip64Mode> f134392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f134393d = "never";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f134394e = "always";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f134395f = "as-needed";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f134396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final e f134397h;

        static {
            HashMap map = new HashMap();
            f134392c = map;
            map.put(f134393d, Zip64Mode.Never);
            map.put(f134394e, Zip64Mode.Always);
            map.put(f134395f, Zip64Mode.AsNeeded);
            f134396g = new e(f134393d);
            f134397h = new e(f134395f);
        }

        public e() {
        }

        private e(String str) {
            g(str);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{f134393d, f134394e, f134395f};
        }

        public Zip64Mode h() {
            return f134392c.get(d());
        }
    }

    private void A3() {
        for (org.apache.tools.ant.types.b0 b0Var : this.f134374p) {
            y3("Processing groupfileset ", 3);
            org.apache.tools.ant.v0 v0VarB2 = b0Var.B2(b());
            File fileF = v0VarB2.f();
            for (String str : v0VarB2.m()) {
                y3("Adding file " + str + " to fileset", 3);
                org.apache.tools.ant.types.d2 d2Var = new org.apache.tools.ant.types.d2();
                d2Var.J(b());
                d2Var.D3(new File(fileF, str));
                E2(d2Var);
                this.f134375q.add(d2Var);
            }
        }
    }

    private File B3() {
        org.apache.tools.ant.util.j0 j0Var = U;
        File fileG = j0Var.G(b(), "zip", ".tmp", this.f134370l.getParentFile(), true, false);
        try {
            j0Var.m0(this.f134370l, fileG);
            return fileG;
        } catch (IOException | SecurityException unused) {
            throw new BuildException("Unable to rename old file (%s) to temporary file", this.f134370l.getAbsolutePath());
        }
    }

    private void F2(org.apache.tools.ant.types.s1 s1Var, String str, String str2, File file, org.apache.tools.zip.z zVar, int i10, int i11) throws IOException {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        int iLastIndexOf = str.lastIndexOf(47, str.length() - 2);
        if (iLastIndexOf != -1) {
            H2(file, str.substring(0, iLastIndexOf + 1), zVar, str2, i10);
        }
        e4(s1Var, zVar, str2 + str, i11, s1Var instanceof org.apache.tools.ant.types.resources.x1 ? ((org.apache.tools.ant.types.resources.x1) s1Var).F2() : null);
    }

    private org.apache.tools.ant.types.s1[] F3(org.apache.tools.ant.types.s1[] s1VarArr, org.apache.tools.ant.util.g0 g0Var) {
        org.apache.tools.ant.types.s1[] s1VarArrA = ResourceUtils.A(this, E3(s1VarArr), g0Var, i3(), 2000L);
        if (this.f134380v) {
            return s1VarArrA;
        }
        org.apache.tools.ant.types.resources.w1 w1Var = new org.apache.tools.ant.types.resources.w1();
        w1Var.g2(Arrays.asList(D3(s1VarArr)));
        org.apache.tools.ant.types.u1 u1VarB = ResourceUtils.B(this, w1Var, g0Var, i3(), X);
        if (u1VarB.isEmpty()) {
            return s1VarArrA;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(((org.apache.tools.ant.types.resources.w1) u1VarB).y2()));
        arrayList.addAll(Arrays.asList(s1VarArrA));
        return (org.apache.tools.ant.types.s1[]) arrayList.toArray(s1VarArrA);
    }

    private void I2(org.apache.tools.ant.types.s1 s1Var, String str, String str2, org.apache.tools.zip.z zVar, int i10, org.apache.tools.zip.x xVar, File file) throws IOException {
        if (xVar == null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(s1Var.h2());
            try {
                h4(bufferedInputStream, zVar, str2 + str, s1Var.i2(), file, i10, s1Var instanceof org.apache.tools.ant.types.resources.x1 ? ((org.apache.tools.ant.types.resources.x1) s1Var).F2() : null);
                bufferedInputStream.close();
                return;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
        org.apache.tools.zip.t tVarN = xVar.n(s1Var.k2());
        if (tVarN != null) {
            boolean z10 = this.f134377s;
            if (this.I) {
                this.f134377s = tVarN.getMethod() == 8;
            }
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(xVar.o(tVarN));
                try {
                    h4(bufferedInputStream2, zVar, str2 + str, tVarN.getTime(), file, i10, tVarN.k(true));
                    bufferedInputStream2.close();
                    this.f134377s = z10;
                } catch (Throwable th4) {
                    try {
                        bufferedInputStream2.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                this.f134377s = z10;
                throw th6;
            }
        }
    }

    private void N2() {
        if (this.f134372n == null && this.f134383y.isEmpty() && this.f134374p.isEmpty() && "zip".equals(this.f134381w)) {
            throw new BuildException("basedir attribute must be set, or at least one resource collection must be given!");
        }
        if (this.f134370l == null) {
            throw new BuildException("You must specify the %s file to create!", this.f134381w);
        }
        String str = this.B;
        if (str != null) {
            try {
                long time = org.apache.tools.ant.util.d0.q(str).getTime();
                this.C = time;
                if (this.J) {
                    this.C = time + 1999;
                }
            } catch (ParseException unused) {
                throw new BuildException("Failed to parse date string %s.", this.B);
            }
        }
        if (this.f134370l.exists() && !this.f134370l.isFile()) {
            throw new BuildException("%s is not a file.", this.f134370l);
        }
        if (this.f134370l.exists() && !this.f134370l.canWrite()) {
            throw new BuildException("%s is read-only.", this.f134370l);
        }
    }

    private void P2(org.apache.tools.zip.z zVar, boolean z10) throws IOException {
        if (zVar == null) {
            return;
        }
        try {
            zVar.close();
        } catch (IOException e10) {
            if (z10) {
                throw e10;
            }
        }
    }

    private int f3(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.zip.x xVar, int i10) {
        if (xVar == null) {
            return s1Var instanceof org.apache.tools.ant.types.resources.g ? ((org.apache.tools.ant.types.resources.g) s1Var).A2() : i10;
        }
        int iU = xVar.n(s1Var.k2()).u();
        return ((iU == 0 || iU == 16384) && !this.M) ? i10 : iU;
    }

    private synchronized org.apache.tools.ant.types.g2 i3() {
        if (this.f134371m == null) {
            org.apache.tools.ant.types.g2 g2Var = new org.apache.tools.ant.types.g2();
            this.f134371m = g2Var;
            g2Var.V0(this.H);
            this.f134371m.X0(this.f134370l);
        }
        return this.f134371m;
    }

    protected static final boolean p3(org.apache.tools.ant.types.s1[][] s1VarArr) {
        for (org.apache.tools.ant.types.s1[] s1VarArr2 : s1VarArr) {
            if (s1VarArr2.length > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ org.apache.tools.ant.types.s1[] s3(int i10) {
        return new org.apache.tools.ant.types.s1[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean t3(org.apache.tools.ant.types.s1 s1Var) {
        if (!s1Var.o2()) {
            return true;
        }
        if (!this.f134380v) {
            return false;
        }
        y3("Ignoring directory " + s1Var.k2() + " as only files will be added.", 3);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ org.apache.tools.ant.types.s1[] u3(int i10) {
        return new org.apache.tools.ant.types.s1[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v3(org.apache.tools.ant.types.s1 s1Var) {
        return !s1Var.p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ org.apache.tools.ant.types.resources.selectors.n w3(org.apache.tools.ant.types.s1 s1Var) {
        return W;
    }

    private void z3() {
        if (!this.f134378t || this.f134370l.exists()) {
            return;
        }
        this.f134378t = false;
        y3("ignoring update attribute as " + this.f134381w + " doesn't exist.", 4);
    }

    public void C3() {
        this.f134383y.clear();
        this.f134370l = null;
        this.f134372n = null;
        this.f134374p.clear();
        this.f134376r = "add";
        this.f134381w = "zip";
        this.f134377s = true;
        this.f134382x = org.apache.tools.ant.taskdefs.optional.vss.g.L2;
        this.f134378t = false;
        this.f134380v = false;
        this.H = null;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.D) {
            this.E = true;
            R2();
            this.E = false;
        }
        R2();
    }

    protected org.apache.tools.ant.types.s1[] D3(org.apache.tools.ant.types.s1[] s1VarArr) {
        return G3(s1VarArr, new org.apache.tools.ant.types.resources.selectors.n() { // from class: org.apache.tools.ant.taskdefs.d8
            @Override // org.apache.tools.ant.types.resources.selectors.n
            public final boolean a(org.apache.tools.ant.types.s1 s1Var) {
                return s1Var.o2();
            }
        });
    }

    public void E2(org.apache.tools.ant.types.u1 u1Var) {
        this.f134383y.add(u1Var);
    }

    protected org.apache.tools.ant.types.s1[] E3(org.apache.tools.ant.types.s1[] s1VarArr) {
        return G3(s1VarArr, new org.apache.tools.ant.types.resources.selectors.n() { // from class: org.apache.tools.ant.taskdefs.c8
            @Override // org.apache.tools.ant.types.resources.selectors.n
            public final boolean a(org.apache.tools.ant.types.s1 s1Var) {
                return this.f133830b.t3(s1Var);
            }
        });
    }

    public void G2(org.apache.tools.ant.types.b0 b0Var) {
        E2(b0Var);
    }

    protected org.apache.tools.ant.types.s1[] G3(org.apache.tools.ant.types.s1[] s1VarArr, final org.apache.tools.ant.types.resources.selectors.n nVar) {
        if (s1VarArr.length == 0) {
            return s1VarArr;
        }
        Stream streamOf = Stream.of((Object[]) s1VarArr);
        Objects.requireNonNull(nVar);
        org.apache.tools.ant.types.s1[] s1VarArr2 = (org.apache.tools.ant.types.s1[]) streamOf.filter(new Predicate() { // from class: org.apache.tools.ant.taskdefs.a8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return nVar.a((org.apache.tools.ant.types.s1) obj);
            }
        }).toArray(new IntFunction() { // from class: org.apache.tools.ant.taskdefs.b8
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return j8.u3(i10);
            }
        });
        return s1VarArr2.length == s1VarArr.length ? s1VarArr : s1VarArr2;
    }

    protected final void H2(File file, String str, org.apache.tools.zip.z zVar, String str2, int i10) throws IOException {
        if (this.f134380v) {
            return;
        }
        Stack stack = new Stack();
        int length = str.length();
        while (true) {
            length = str.lastIndexOf(47, length - 1);
            if (length == -1) {
                break;
            }
            String strSubstring = str.substring(0, length + 1);
            if (this.f134384z.get(str2 + strSubstring) != null) {
                break;
            } else {
                stack.push(strSubstring);
            }
        }
        while (!stack.isEmpty()) {
            String str3 = (String) stack.pop();
            c4(file != null ? new File(file, str3) : new File(str3), zVar, str2 + str3, i10);
        }
    }

    public void H3(File file) {
        this.f134372n = file;
    }

    public void I3(String str) {
        this.K = str;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2 A[Catch: all -> 0x01ab, TryCatch #1 {all -> 0x01ab, blocks: (B:41:0x00ce, B:43:0x00d2, B:45:0x00da, B:47:0x00e0, B:50:0x00f7, B:52:0x00fd, B:56:0x0104, B:59:0x010d), top: B:92:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00da A[Catch: all -> 0x01ab, TryCatch #1 {all -> 0x01ab, blocks: (B:41:0x00ce, B:43:0x00d2, B:45:0x00da, B:47:0x00e0, B:50:0x00f7, B:52:0x00fd, B:56:0x0104, B:59:0x010d), top: B:92:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7 A[Catch: all -> 0x01ab, TryCatch #1 {all -> 0x01ab, blocks: (B:41:0x00ce, B:43:0x00d2, B:45:0x00da, B:47:0x00e0, B:50:0x00f7, B:52:0x00fd, B:56:0x0104, B:59:0x010d), top: B:92:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd A[Catch: all -> 0x01ab, TryCatch #1 {all -> 0x01ab, blocks: (B:41:0x00ce, B:43:0x00d2, B:45:0x00da, B:47:0x00e0, B:50:0x00f7, B:52:0x00fd, B:56:0x0104, B:59:0x010d), top: B:92:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0101  */
    /* JADX WARN: Code duplicated, block: B:55:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d A[Catch: all -> 0x01ab, TRY_LEAVE, TryCatch #1 {all -> 0x01ab, blocks: (B:41:0x00ce, B:43:0x00d2, B:45:0x00da, B:47:0x00e0, B:50:0x00f7, B:52:0x00fd, B:56:0x0104, B:59:0x010d), top: B:92:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:63:0x012b A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:62:0x0124, B:63:0x012b, B:65:0x0141, B:68:0x016a, B:75:0x0188, B:74:0x017e, B:71:0x0173), top: B:90:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0141 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:62:0x0124, B:63:0x012b, B:65:0x0141, B:68:0x016a, B:75:0x0188, B:74:0x017e, B:71:0x0173), top: B:90:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0164  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173 A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:62:0x0124, B:63:0x012b, B:65:0x0141, B:68:0x016a, B:75:0x0188, B:74:0x017e, B:71:0x0173), top: B:90:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x017b  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e A[Catch: all -> 0x01a2, TryCatch #0 {all -> 0x01a2, blocks: (B:62:0x0124, B:63:0x012b, B:65:0x0141, B:68:0x016a, B:75:0x0188, B:74:0x017e, B:71:0x0173), top: B:90:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0141, please report this as an issue */
    protected final void J2(org.apache.tools.ant.types.b0 b0Var, org.apache.tools.ant.types.s1[] s1VarArr, org.apache.tools.zip.z zVar) throws Throwable {
        String strM3;
        int iH3;
        int iK3;
        org.apache.tools.ant.types.k kVar;
        String str;
        org.apache.tools.zip.x xVar;
        boolean z10;
        File fileZ2;
        org.apache.tools.zip.x xVar2;
        int length;
        int i10;
        org.apache.tools.zip.x xVar3;
        org.apache.tools.ant.types.s1 s1Var;
        String strK2;
        String strReplace;
        int i11;
        int i12;
        String str2;
        int iF3;
        File fileR3;
        String str3;
        String strO3 = "";
        if (b0Var instanceof org.apache.tools.ant.types.k) {
            org.apache.tools.ant.types.k kVar2 = (org.apache.tools.ant.types.k) b0Var;
            strO3 = kVar2.o3(b());
            kVar = kVar2;
            strM3 = kVar2.m3(b());
            iH3 = kVar2.h3(b());
            iK3 = kVar2.k3(b());
        } else {
            strM3 = "";
            iH3 = 16877;
            iK3 = 33188;
            kVar = null;
        }
        if (!strO3.isEmpty() && !strM3.isEmpty()) {
            throw new BuildException("Both prefix and fullpath attributes must not be set on the same fileset.");
        }
        if (s1VarArr.length != 1 && !strM3.isEmpty()) {
            throw new BuildException("fullpath attribute may only be specified for filesets that specify a single file.");
        }
        if (strO3.isEmpty()) {
            str = strO3;
        } else {
            if (!strO3.endsWith("/") && !strO3.endsWith("\\")) {
                strO3 = strO3 + "/";
            }
            str = strO3;
            H2(null, str, zVar, "", iH3);
        }
        if (kVar == null) {
            fileZ2 = b0Var.z2(b());
            z10 = true;
            xVar2 = null;
            length = s1VarArr.length;
            i10 = 0;
            while (i10 < length) {
                s1Var = s1VarArr[i10];
                if (strM3.isEmpty()) {
                    strK2 = s1Var.k2();
                } else {
                    strK2 = strM3;
                }
                strReplace = strK2.replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX);
                if (!strReplace.isEmpty()) {
                    i11 = i10;
                    i12 = length;
                    xVar = xVar2;
                    str3 = str;
                } else if (s1Var.o2()) {
                    i11 = i10;
                    i12 = length;
                    xVar = xVar2;
                    str2 = str;
                    H2(fileZ2, strReplace, zVar, str2, iH3);
                    if (z10) {
                        f4(U.n0(fileZ2, s1Var.k2()), zVar, str2 + strReplace, iK3);
                        str3 = str2;
                    } else {
                        if (kVar == null) {
                            iF3 = f3(s1Var, xVar, iK3);
                        } else {
                            iF3 = f3(s1Var, xVar, iK3);
                        }
                        if (kVar == null) {
                            fileR3 = null;
                        } else {
                            fileR3 = kVar.r3(b());
                        }
                        str3 = str2;
                        I2(s1Var, strReplace, str2, zVar, iF3, xVar, fileR3);
                    }
                } else if (this.f134380v) {
                    i11 = i10;
                    i12 = length;
                    xVar = xVar2;
                    str3 = str;
                } else {
                    i11 = i10;
                    i12 = length;
                    xVar = xVar2;
                    String str4 = str;
                    F2(s1Var, strReplace, str, fileZ2, zVar, iH3, (kVar == null && kVar.s3()) ? iH3 : f3(s1Var, xVar2, iH3));
                    str3 = str4;
                }
                i10 = i11 + 1;
                xVar2 = xVar;
                length = i12;
                str = str3;
            }
            xVar3 = xVar2;
            if (xVar3 != null) {
                xVar3.close();
                return;
            }
            return;
        }
        try {
            if (kVar.r3(b()) == null) {
                fileZ2 = b0Var.z2(b());
                z10 = true;
                xVar2 = null;
            } else if (kVar instanceof org.apache.tools.ant.types.d2) {
                xVar2 = new org.apache.tools.zip.x(kVar.r3(b()), this.H);
                z10 = false;
                fileZ2 = null;
            } else {
                z10 = false;
                fileZ2 = null;
                xVar2 = null;
            }
            try {
                length = s1VarArr.length;
                i10 = 0;
                while (i10 < length) {
                    s1Var = s1VarArr[i10];
                    if (strM3.isEmpty()) {
                        strK2 = s1Var.k2();
                    } else {
                        strK2 = strM3;
                    }
                    strReplace = strK2.replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX);
                    if (!strReplace.isEmpty()) {
                        i11 = i10;
                        i12 = length;
                        xVar = xVar2;
                        str3 = str;
                    } else if (s1Var.o2()) {
                        i11 = i10;
                        i12 = length;
                        xVar = xVar2;
                        str2 = str;
                        H2(fileZ2, strReplace, zVar, str2, iH3);
                        if (z10) {
                            f4(U.n0(fileZ2, s1Var.k2()), zVar, str2 + strReplace, iK3);
                            str3 = str2;
                        } else {
                            if (kVar == null && kVar.t3()) {
                                iF3 = iK3;
                            } else {
                                iF3 = f3(s1Var, xVar, iK3);
                            }
                            if (kVar == null) {
                                fileR3 = null;
                            } else {
                                fileR3 = kVar.r3(b());
                            }
                            str3 = str2;
                            I2(s1Var, strReplace, str2, zVar, iF3, xVar, fileR3);
                        }
                    } else if (this.f134380v) {
                        i11 = i10;
                        i12 = length;
                        xVar = xVar2;
                        str3 = str;
                    } else {
                        i11 = i10;
                        i12 = length;
                        xVar = xVar2;
                        String str5 = str;
                        try {
                            F2(s1Var, strReplace, str, fileZ2, zVar, iH3, (kVar == null && kVar.s3()) ? iH3 : f3(s1Var, xVar2, iH3));
                            str3 = str5;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    i10 = i11 + 1;
                    xVar2 = xVar;
                    length = i12;
                    str = str3;
                }
                xVar3 = xVar2;
                if (xVar3 != null) {
                    xVar3.close();
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                xVar = xVar2;
            }
        } catch (Throwable th4) {
            th = th4;
            xVar = null;
        }
        if (xVar != null) {
            xVar.close();
        }
        throw th;
    }

    public void J3(boolean z10) {
        this.f134377s = z10;
    }

    protected final void K2(org.apache.tools.ant.types.u1 u1Var, org.apache.tools.ant.types.s1[] s1VarArr, org.apache.tools.zip.z zVar) throws Throwable {
        if (u1Var instanceof org.apache.tools.ant.types.b0) {
            J2((org.apache.tools.ant.types.b0) u1Var, s1VarArr, zVar);
            return;
        }
        for (org.apache.tools.ant.types.s1 s1Var : s1VarArr) {
            String strK2 = s1Var.k2();
            if (strK2 != null) {
                String strReplace = strK2.replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX);
                if (!strReplace.isEmpty() && (!s1Var.o2() || !this.f134380v)) {
                    org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
                    File fileW2 = yVar != null ? ResourceUtils.d(yVar).w2() : null;
                    if (s1Var.o2()) {
                        F2(s1Var, strReplace, "", fileW2, zVar, 16877, 16877);
                    } else {
                        H2(fileW2, strReplace, zVar, "", 16877);
                        if (yVar != null) {
                            f4(yVar.l0(), zVar, strReplace, 33188);
                        } else {
                            I2(s1Var, strReplace, "", zVar, 33188, null, null);
                        }
                    }
                }
            }
        }
    }

    public void K3(c cVar) {
        this.O = cVar;
    }

    public void L2(org.apache.tools.ant.types.b0 b0Var) {
        this.f134374p.add(b0Var);
    }

    protected final void L3(org.apache.tools.zip.u[] uVarArr) {
        Z.set(uVarArr);
    }

    public void M2(org.apache.tools.ant.types.d2 d2Var) {
        E2(d2Var);
    }

    public void M3(File file) {
        this.f134370l = file;
    }

    public void N3(b bVar) {
        this.f134376r = bVar.d();
    }

    protected void O2() {
        this.f134384z.clear();
        this.A.clear();
        this.f134373o.clear();
        this.G = false;
        this.f134378t = this.f134379u;
        this.f134383y.removeAll(this.f134375q);
        this.f134375q.clear();
        Y.set(Boolean.FALSE);
    }

    public void O3(String str) {
        this.H = str;
    }

    public void P3(boolean z10) {
        this.P = z10;
    }

    protected boolean Q2(File file) throws BuildException {
        if (!this.E) {
            x1("Note: creating empty " + this.f134381w + " archive " + file, 2);
        }
        try {
            OutputStream outputStreamNewOutputStream = Files.newOutputStream(file.toPath(), new OpenOption[0]);
            try {
                byte[] bArr = new byte[22];
                bArr[0] = 80;
                bArr[1] = org.apache.tools.tar.c.N;
                bArr[2] = 5;
                bArr[3] = 6;
                outputStreamNewOutputStream.write(bArr);
                outputStreamNewOutputStream.close();
                return true;
            } catch (Throwable th2) {
                if (outputStreamNewOutputStream != null) {
                    try {
                        outputStreamNewOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Could not create empty ZIP archive (" + e10.getMessage() + ")", e10, w1());
        }
    }

    @Deprecated
    public void Q3(File file) {
        M3(file);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void R2() throws BuildException {
        N2();
        this.G = true;
        z3();
        A3();
        ArrayList arrayList = new ArrayList();
        if (this.f134372n != null) {
            org.apache.tools.ant.types.b0 b0Var = (org.apache.tools.ant.types.b0) q2().clone();
            b0Var.R2(this.f134372n);
            arrayList.add(b0Var);
        }
        arrayList.addAll(this.f134383y);
        org.apache.tools.ant.types.u1[] u1VarArr = (org.apache.tools.ant.types.u1[]) arrayList.toArray(new org.apache.tools.ant.types.u1[arrayList.size()]);
        File file = null;
        zVar = null;
        org.apache.tools.zip.z zVar = null;
        try {
            try {
                a aVarE3 = e3(u1VarArr, this.f134370l, false);
                if (!aVarE3.b()) {
                    O2();
                    return;
                }
                File parentFile = this.f134370l.getParentFile();
                if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                    throw new BuildException("Failed to create missing parent directory for %s", this.f134370l);
                }
                this.F = true;
                if (!this.f134370l.exists() && aVarE3.c()) {
                    Q2(this.f134370l);
                    O2();
                    return;
                }
                org.apache.tools.ant.types.s1[][] s1VarArrA = aVarE3.a();
                File fileB3 = this.f134378t ? B3() : null;
                try {
                    String str = this.f134378t ? "Updating " : "Building ";
                    if (!this.E) {
                        log(str + this.f134381w + ": " + this.f134370l.getAbsolutePath());
                    }
                    try {
                        if (!this.E) {
                            org.apache.tools.zip.z zVar2 = new org.apache.tools.zip.z(this.f134370l);
                            try {
                                zVar2.W(this.H);
                                zVar2.c0(this.N);
                                zVar2.S(this.O.h());
                                zVar2.Y(this.P);
                                zVar2.a0(this.f134377s ? 8 : 0);
                                zVar2.Z(this.L);
                                zVar2.e0(this.Q.h());
                                zVar = zVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                zVar = zVar2;
                                P2(zVar, false);
                                throw th;
                            }
                        }
                        m3(zVar);
                        for (int i10 = 0; i10 < u1VarArr.length; i10++) {
                            org.apache.tools.ant.types.s1[] s1VarArr = s1VarArrA[i10];
                            if (s1VarArr.length != 0) {
                                K2(u1VarArr[i10], s1VarArr, zVar);
                            }
                        }
                        if (this.f134378t) {
                            this.G = false;
                            org.apache.tools.ant.types.d2 d2Var = new org.apache.tools.ant.types.d2();
                            d2Var.J(b());
                            d2Var.D3(fileB3);
                            d2Var.Q2(false);
                            Iterator<String> it = this.A.iterator();
                            while (it.hasNext()) {
                                d2Var.r2().e(it.next());
                            }
                            final org.apache.tools.ant.v0 v0VarB2 = d2Var.B2(b());
                            ((org.apache.tools.ant.types.g2) v0VarB2).V0(this.H);
                            Stream streamOf = Stream.of((Object[]) v0VarB2.m());
                            if (!this.f134380v) {
                                streamOf = Stream.concat(streamOf, Stream.of((Object[]) v0VarB2.j()));
                            }
                            J2(d2Var, (org.apache.tools.ant.types.s1[]) streamOf.map(new Function() { // from class: org.apache.tools.ant.taskdefs.e8
                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return v0VarB2.o((String) obj);
                                }
                            }).toArray(new IntFunction() { // from class: org.apache.tools.ant.taskdefs.f8
                                @Override // java.util.function.IntFunction
                                public final Object apply(int i11) {
                                    return j8.s3(i11);
                                }
                            }), zVar);
                        }
                        if (zVar != null) {
                            zVar.R(this.K);
                        }
                        S2(zVar);
                        if (this.f134378t && !fileB3.delete()) {
                            x1("Warning: unable to delete temporary file " + fileB3.getName(), 1);
                        }
                        P2(zVar, true);
                        O2();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e10) {
                    e = e10;
                    file = fileB3;
                    String str2 = "Problem creating " + this.f134381w + ": " + e.getMessage();
                    if ((!this.f134378t || file != null) && !this.f134370l.delete()) {
                        str2 = str2 + " (and the archive is probably corrupt but I could not delete it)";
                    }
                    if (this.f134378t && file != null) {
                        try {
                            U.m0(file, this.f134370l);
                        } catch (IOException unused) {
                            str2 = str2 + " (and I couldn't rename the temporary file " + file.getName() + " back)";
                        }
                    }
                    throw new BuildException(str2, e, w1());
                }
            } catch (Throwable th4) {
                O2();
                throw th4;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public void R3(boolean z10) {
        this.f134380v = z10;
    }

    protected void S2(org.apache.tools.zip.z zVar) throws IOException, BuildException {
    }

    public void S3(boolean z10) {
        this.I = z10;
    }

    public String T2() {
        return this.K;
    }

    public void T3(int i10) {
        this.L = i10;
    }

    public c U2() {
        return this.O;
    }

    public void U3(String str) {
        this.B = str;
    }

    protected final org.apache.tools.zip.u[] V2() {
        return Z.get();
    }

    public void V3(boolean z10) {
        this.M = z10;
    }

    public File W2() {
        return this.f134370l;
    }

    public void W3(boolean z10) {
        this.J = z10;
    }

    public String X2() {
        return this.H;
    }

    public void X3(boolean z10) {
        this.f134378t = z10;
        this.f134379u = z10;
    }

    public boolean Y2() {
        return this.P;
    }

    public void Y3(boolean z10) {
        this.N = z10;
    }

    public int Z2() {
        return this.L;
    }

    public void Z3(d dVar) {
        this.f134382x = dVar.d();
    }

    public String a3() {
        return this.B;
    }

    public void a4(e eVar) {
        this.Q = eVar;
    }

    protected a b3(org.apache.tools.ant.types.u1[] u1VarArr, File file, boolean z10) throws BuildException {
        org.apache.tools.ant.types.s1[][] s1VarArrJ3 = j3(u1VarArr);
        boolean zP3 = p3(s1VarArrJ3);
        Y.set(Boolean.valueOf(!zP3));
        if (zP3) {
            return new a(z10, s1VarArrJ3);
        }
        if (!file.exists()) {
            return new a(true, s1VarArrJ3);
        }
        if (z10 && !this.f134378t) {
            return new a(true, s1VarArrJ3);
        }
        org.apache.tools.ant.types.s1[][] s1VarArr = new org.apache.tools.ant.types.s1[u1VarArr.length][];
        for (int i10 = 0; i10 < u1VarArr.length; i10++) {
            if (s1VarArrJ3[i10].length != 0) {
                int i11 = 0;
                while (true) {
                    org.apache.tools.ant.types.s1[] s1VarArr2 = s1VarArrJ3[i10];
                    if (i11 >= s1VarArr2.length) {
                        org.apache.tools.ant.types.s1[] s1VarArrF3 = F3(s1VarArr2, new org.apache.tools.ant.util.q0());
                        s1VarArr[i10] = s1VarArrF3;
                        z10 = z10 || s1VarArrF3.length > 0;
                        if (z10 && !this.f134378t) {
                            break;
                        }
                        break;
                    }
                    org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1VarArr2[i11].e2(org.apache.tools.ant.types.resources.y.class);
                    if (yVar != null && file.equals(yVar.l0())) {
                        throw new BuildException("A zip file cannot include itself", w1());
                    }
                    i11++;
                }
            } else {
                s1VarArr[i10] = new org.apache.tools.ant.types.s1[0];
            }
        }
        return (!z10 || this.f134378t) ? new a(z10, s1VarArr) : new a(true, s1VarArrJ3);
    }

    @Deprecated
    public void b4(File file) {
        M3(file);
    }

    public boolean c3() {
        return this.M;
    }

    protected void c4(File file, org.apache.tools.zip.z zVar, String str, int i10) throws IOException {
        d4(file, zVar, str, i10, null);
    }

    protected a d3(org.apache.tools.ant.types.b0[] b0VarArr, File file, boolean z10) throws BuildException {
        org.apache.tools.ant.types.s1[][] s1VarArrK3 = k3(b0VarArr);
        if (p3(s1VarArrK3)) {
            if (Boolean.FALSE.equals(Y.get())) {
                if (z10 && this.f134378t) {
                    return new a(true, s1VarArrK3);
                }
                if (!org.apache.tools.ant.taskdefs.optional.vss.g.L2.equals(this.f134382x)) {
                    if ("fail".equals(this.f134382x)) {
                        throw new BuildException("Cannot create " + this.f134381w + " archive " + file + ": no files were included.", w1());
                    }
                    if (!file.exists()) {
                        z10 = true;
                    }
                } else if (this.f134378t) {
                    y3(this.f134381w + " archive " + file + " not updated because no new files were included.", 3);
                } else {
                    y3("Warning: skipping " + this.f134381w + " archive " + file + " because no files were included.", 1);
                }
            }
            return new a(z10, s1VarArrK3);
        }
        if (!file.exists()) {
            return new a(true, s1VarArrK3);
        }
        if (z10 && !this.f134378t) {
            return new a(true, s1VarArrK3);
        }
        org.apache.tools.ant.types.s1[][] s1VarArr = new org.apache.tools.ant.types.s1[b0VarArr.length][];
        for (int i10 = 0; i10 < b0VarArr.length; i10++) {
            org.apache.tools.ant.types.b0 b0Var = this.f134236k;
            if (!(b0Var instanceof org.apache.tools.ant.types.d2) || ((org.apache.tools.ant.types.d2) b0Var).r3(b()) == null) {
                File fileZ2 = b0VarArr[i10].z2(b());
                int i11 = 0;
                while (true) {
                    org.apache.tools.ant.types.s1[] s1VarArr2 = s1VarArrK3[i10];
                    if (i11 >= s1VarArr2.length) {
                        break;
                    }
                    if (U.n0(fileZ2, s1VarArr2[i11].k2()).equals(file)) {
                        throw new BuildException("A zip file cannot include itself", w1());
                    }
                    i11++;
                }
            }
        }
        for (int i12 = 0; i12 < b0VarArr.length; i12++) {
            if (s1VarArrK3[i12].length != 0) {
                org.apache.tools.ant.util.g0 q0Var = new org.apache.tools.ant.util.q0();
                org.apache.tools.ant.types.b0 b0Var2 = b0VarArr[i12];
                if (b0Var2 instanceof org.apache.tools.ant.types.d2) {
                    org.apache.tools.ant.types.d2 d2Var = (org.apache.tools.ant.types.d2) b0Var2;
                    if (d2Var.m3(b()) != null && !d2Var.m3(b()).isEmpty()) {
                        q0Var = new org.apache.tools.ant.util.b1();
                        q0Var.q0(d2Var.m3(b()));
                    } else if (d2Var.o3(b()) != null && !d2Var.o3(b()).isEmpty()) {
                        q0Var = new org.apache.tools.ant.util.p0();
                        q0Var.n0(androidx.webkit.b.f28327e);
                        String strO3 = d2Var.o3(b());
                        if (!strO3.endsWith("/") && !strO3.endsWith("\\")) {
                            strO3 = strO3 + "/";
                        }
                        q0Var.q0(strO3 + androidx.webkit.b.f28327e);
                    }
                }
                org.apache.tools.ant.types.s1[] s1VarArrF3 = F3(s1VarArrK3[i12], q0Var);
                s1VarArr[i12] = s1VarArrF3;
                z10 = z10 || s1VarArrF3.length > 0;
                if (z10 && !this.f134378t) {
                    break;
                }
            } else {
                s1VarArr[i12] = new org.apache.tools.ant.types.s1[0];
            }
        }
        return (!z10 || this.f134378t) ? new a(z10, s1VarArr) : new a(true, s1VarArrK3);
    }

    protected void d4(File file, org.apache.tools.zip.z zVar, String str, int i10, org.apache.tools.zip.u[] uVarArr) throws IOException {
        e4(file == null ? null : new org.apache.tools.ant.types.resources.z(file), zVar, str, i10, uVarArr);
    }

    protected a e3(org.apache.tools.ant.types.u1[] u1VarArr, File file, boolean z10) throws BuildException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (org.apache.tools.ant.types.u1 u1Var : u1VarArr) {
            if (u1Var instanceof org.apache.tools.ant.types.b0) {
                arrayList.add((org.apache.tools.ant.types.b0) u1Var);
            } else {
                arrayList2.add(u1Var);
            }
        }
        org.apache.tools.ant.types.u1[] u1VarArr2 = (org.apache.tools.ant.types.u1[]) arrayList2.toArray(new org.apache.tools.ant.types.u1[arrayList2.size()]);
        a aVarB3 = b3(u1VarArr2, file, z10);
        a aVarD3 = d3((org.apache.tools.ant.types.b0[]) arrayList.toArray(new org.apache.tools.ant.types.b0[arrayList.size()]), file, aVarB3.b());
        if (!aVarB3.b() && aVarD3.b()) {
            aVarB3 = b3(u1VarArr2, file, true);
        }
        org.apache.tools.ant.types.s1[][] s1VarArr = new org.apache.tools.ant.types.s1[u1VarArr.length][];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < u1VarArr.length; i12++) {
            if (u1VarArr[i12] instanceof org.apache.tools.ant.types.b0) {
                s1VarArr[i12] = aVarD3.a()[i11];
                i11++;
            } else {
                s1VarArr[i12] = aVarB3.a()[i10];
                i10++;
            }
        }
        return new a(aVarD3.b(), s1VarArr);
    }

    protected void e4(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.zip.z zVar, String str, int i10, org.apache.tools.zip.u[] uVarArr) throws IOException {
        if (this.f134380v) {
            y3("skipping directory " + str + " for file-only archive", 3);
            return;
        }
        if (this.f134384z.get(str) != null) {
            return;
        }
        y3("adding directory " + str, 3);
        this.f134384z.put(str, str);
        if (this.E) {
            return;
        }
        org.apache.tools.zip.t tVar = new org.apache.tools.zip.t(str);
        int i11 = this.J ? 1999 : 0;
        if (this.B != null) {
            tVar.setTime(this.C);
        } else if (s1Var == null || !s1Var.p2()) {
            tVar.setTime(System.currentTimeMillis() + ((long) i11));
        } else {
            tVar.setTime(s1Var.i2() + ((long) i11));
        }
        tVar.setSize(0L);
        tVar.setMethod(0);
        tVar.setCrc(V);
        tVar.O(i10);
        if (uVarArr != null) {
            tVar.F(uVarArr);
        }
        zVar.P(tVar);
    }

    protected void f4(File file, org.apache.tools.zip.z zVar, String str, int i10) throws IOException {
        if (file.equals(this.f134370l)) {
            throw new BuildException("A zip file cannot include itself", w1());
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(file.toPath(), new OpenOption[0]));
        try {
            g4(bufferedInputStream, zVar, str, file.lastModified() + ((long) (this.J ? 1999 : 0)), null, i10);
            bufferedInputStream.close();
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public boolean g3() {
        return this.N;
    }

    protected void g4(InputStream inputStream, org.apache.tools.zip.z zVar, String str, long j10, File file, int i10) throws IOException {
        if (!this.f134373o.containsKey(str)) {
            y3("adding entry " + str, 3);
        } else {
            if ("preserve".equals(this.f134376r)) {
                y3(str + " already added, skipping", 2);
                return;
            }
            if ("fail".equals(this.f134376r)) {
                throw new BuildException("Duplicate file %s was found and the duplicate attribute is 'fail'.", str);
            }
            y3("duplicate file " + str + " found, adding.", 3);
        }
        this.f134373o.put(str, str);
        if (!this.E) {
            org.apache.tools.zip.t tVar = new org.apache.tools.zip.t(str);
            if (this.B != null) {
                j10 = this.C;
            }
            tVar.setTime(j10);
            tVar.setMethod(this.f134377s ? 8 : 0);
            if (!inputStream.markSupported()) {
                inputStream = new BufferedInputStream(inputStream);
            }
            if (!zVar.L() && !this.f134377s) {
                long j11 = 0;
                CRC32 crc32 = new CRC32();
                inputStream.mark(Integer.MAX_VALUE);
                byte[] bArr = new byte[8192];
                int i11 = 0;
                do {
                    j11 += (long) i11;
                    crc32.update(bArr, 0, i11);
                    i11 = inputStream.read(bArr, 0, 8192);
                } while (i11 != -1);
                inputStream.reset();
                tVar.setSize(j11);
                tVar.setCrc(crc32.getValue());
            }
            tVar.O(i10);
            org.apache.tools.zip.u[] uVarArrV2 = V2();
            if (uVarArrV2 != null) {
                tVar.F(uVarArrV2);
            }
            zVar.P(tVar);
            byte[] bArr2 = new byte[8192];
            int i12 = 0;
            do {
                if (i12 != 0) {
                    zVar.write(bArr2, 0, i12);
                }
                i12 = inputStream.read(bArr2, 0, 8192);
            } while (i12 != -1);
        }
        this.A.add(str);
    }

    public e h3() {
        return this.Q;
    }

    protected final void h4(InputStream inputStream, org.apache.tools.zip.z zVar, String str, long j10, File file, int i10, org.apache.tools.zip.u[] uVarArr) throws IOException {
        try {
            L3(uVarArr);
            g4(inputStream, zVar, str, j10, file, i10);
        } finally {
            L3(null);
        }
    }

    protected org.apache.tools.ant.types.s1[][] j3(org.apache.tools.ant.types.u1[] u1VarArr) {
        org.apache.tools.ant.types.s1[][] s1VarArr = new org.apache.tools.ant.types.s1[u1VarArr.length][];
        for (int i10 = 0; i10 < u1VarArr.length; i10++) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (org.apache.tools.ant.types.s1 s1Var : u1VarArr[i10]) {
                if (s1Var.o2()) {
                    arrayList.add(s1Var);
                } else if (s1Var.p2()) {
                    arrayList2.add(s1Var);
                }
            }
            arrayList.sort(Comparator.comparing(new r6()));
            ArrayList arrayList3 = new ArrayList(arrayList);
            arrayList3.addAll(arrayList2);
            s1VarArr[i10] = (org.apache.tools.ant.types.s1[]) arrayList3.toArray(new org.apache.tools.ant.types.s1[arrayList3.size()]);
        }
        return s1VarArr;
    }

    protected org.apache.tools.ant.types.s1[][] k3(org.apache.tools.ant.types.b0[] b0VarArr) {
        org.apache.tools.ant.types.s1[][] s1VarArr = new org.apache.tools.ant.types.s1[b0VarArr.length][];
        for (int i10 = 0; i10 < b0VarArr.length; i10++) {
            org.apache.tools.ant.types.b0 b0Var = b0VarArr[i10];
            boolean z10 = true;
            if (b0Var instanceof org.apache.tools.ant.types.d2) {
                org.apache.tools.ant.types.d2 d2Var = (org.apache.tools.ant.types.d2) b0Var;
                if (!d2Var.o3(b()).isEmpty() || !d2Var.m3(b()).isEmpty()) {
                    z10 = false;
                }
            }
            org.apache.tools.ant.v0 v0VarB2 = b0VarArr[i10].B2(b());
            if (v0VarB2 instanceof org.apache.tools.ant.types.g2) {
                ((org.apache.tools.ant.types.g2) v0VarB2).V0(this.H);
            }
            Vector vector = new Vector();
            if (!this.f134380v) {
                for (String str : v0VarB2.j()) {
                    if (!str.isEmpty() || !z10) {
                        vector.add(v0VarB2.o(str));
                    }
                }
            }
            for (String str2 : v0VarB2.m()) {
                if (!str2.isEmpty() || !z10) {
                    vector.add(v0VarB2.o(str2));
                }
            }
            s1VarArr[i10] = (org.apache.tools.ant.types.s1[]) vector.toArray(new org.apache.tools.ant.types.s1[vector.size()]);
        }
        return s1VarArr;
    }

    protected boolean l3() {
        return this.F;
    }

    protected void m3(org.apache.tools.zip.z zVar) throws IOException, BuildException {
    }

    protected final boolean n3() {
        return this.G;
    }

    public boolean o3() {
        return this.f134377s;
    }

    protected final boolean q3() {
        return !this.D || this.E;
    }

    public boolean r3() {
        return this.f134378t;
    }

    protected void y3(String str, int i10) {
        if (this.E) {
            return;
        }
        x1(str, i10);
    }
}
