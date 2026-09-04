package org.apache.tools.ant.taskdefs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: FixCRLF.java */
/* JADX INFO: loaded from: classes5.dex */
public class v1 extends h4 implements org.apache.tools.ant.filters.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f135838t = "<fixcrlf> error: ";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f135839u = "<fixcrlf> error: srcdir and file are mutually exclusive";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f135840v = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f135842m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f135844o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f135841l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f135843n = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private org.apache.tools.ant.filters.i f135845p = new org.apache.tools.ant.filters.i();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Vector<org.apache.tools.ant.types.c0> f135846q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f135847r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f135848s = null;

    /* JADX INFO: compiled from: FixCRLF.java */
    public static class a extends org.apache.tools.ant.types.w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"add", "asis", "remove"};
        }
    }

    /* JADX INFO: compiled from: FixCRLF.java */
    public static class b extends org.apache.tools.ant.types.w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"asis", "cr", "lf", "crlf", "mac", org.apache.tools.ant.taskdefs.condition.z.f133976r, org.apache.tools.ant.taskdefs.condition.z.f133973o};
        }
    }

    /* JADX INFO: compiled from: FixCRLF.java */
    @Deprecated
    public class c implements Enumeration<Object> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f135849i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f135850j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f135851k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f135852l = 8192;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f135853m = 200;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final char f135854n = 26;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f135855a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private BufferedReader f135858d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private File f135861g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private StringBuffer f135856b = new StringBuffer(200);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private StringBuffer f135857c = new StringBuffer();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private StringBuffer f135859e = new StringBuffer();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f135860f = false;

        /* JADX INFO: compiled from: FixCRLF.java */
        public class a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private String f135866d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f135867e;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f135865c = -1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f135863a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f135864b = 0;

            public a(String str, String str2) throws BuildException {
                this.f135866d = str;
                this.f135867e = str2;
            }

            public char a(int i10) {
                return this.f135866d.charAt(i10);
            }

            public int b() {
                return this.f135864b;
            }

            public String c() {
                return this.f135867e;
            }

            public int d() {
                return this.f135867e.length();
            }

            public String e() {
                return this.f135866d;
            }

            public int f() {
                return this.f135865c;
            }

            public int g() {
                return this.f135863a;
            }

            public char h() {
                return a(this.f135863a);
            }

            public char i() {
                int i10 = this.f135863a;
                this.f135863a = i10 + 1;
                return a(i10);
            }

            public int j() {
                return c.this.c();
            }

            public int k() {
                int i10 = this.f135864b;
                this.f135864b = i10 + 1;
                return i10;
            }

            public int l() {
                return this.f135866d.length();
            }

            public void m(int i10) {
                this.f135864b = i10;
            }

            public void n(int i10) {
                this.f135865c = i10;
            }

            public void o(int i10) {
                this.f135863a = i10;
            }

            public void p(int i10) {
                c.this.e(i10);
            }

            public String q(int i10) {
                return this.f135866d.substring(i10);
            }

            public String r(int i10, int i11) {
                return this.f135866d.substring(i10, i11);
            }
        }

        public c(File file) throws BuildException {
            this.f135855a = v1.this.f135845p.o() ? 1 : 0;
            this.f135861g = file;
            try {
                this.f135858d = new BufferedReader(v1.this.f135847r == null ? new FileReader(file) : new InputStreamReader(Files.newInputStream(file.toPath(), new OpenOption[0]), v1.this.f135847r), 8192);
                d();
            } catch (IOException e10) {
                throw new BuildException(file + ": " + e10.getMessage(), e10, v1.this.w1());
            }
        }

        public void a() throws IOException {
            BufferedReader bufferedReader = this.f135858d;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }

        public String b() {
            return this.f135857c.substring(0);
        }

        public int c() {
            return this.f135855a;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0085 A[Catch: IOException -> 0x00c3, TryCatch #0 {IOException -> 0x00c3, blocks: (B:3:0x000e, B:8:0x001f, B:11:0x002f, B:13:0x0037, B:15:0x003a, B:32:0x0085, B:33:0x008b, B:35:0x008e, B:38:0x0099, B:40:0x00a2, B:42:0x00b5, B:43:0x00bd, B:19:0x0043, B:23:0x0059, B:24:0x005f, B:26:0x0068, B:27:0x0071, B:28:0x0077, B:29:0x007d), top: B:48:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:35:0x008e A[Catch: IOException -> 0x00c3, TryCatch #0 {IOException -> 0x00c3, blocks: (B:3:0x000e, B:8:0x001f, B:11:0x002f, B:13:0x0037, B:15:0x003a, B:32:0x0085, B:33:0x008b, B:35:0x008e, B:38:0x0099, B:40:0x00a2, B:42:0x00b5, B:43:0x00bd, B:19:0x0043, B:23:0x0059, B:24:0x005f, B:26:0x0068, B:27:0x0071, B:28:0x0077, B:29:0x007d), top: B:48:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[Catch: IOException -> 0x00c3, TryCatch #0 {IOException -> 0x00c3, blocks: (B:3:0x000e, B:8:0x001f, B:11:0x002f, B:13:0x0037, B:15:0x003a, B:32:0x0085, B:33:0x008b, B:35:0x008e, B:38:0x0099, B:40:0x00a2, B:42:0x00b5, B:43:0x00bd, B:19:0x0043, B:23:0x0059, B:24:0x005f, B:26:0x0068, B:27:0x0071, B:28:0x0077, B:29:0x007d), top: B:48:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00b5 A[Catch: IOException -> 0x00c3, TryCatch #0 {IOException -> 0x00c3, blocks: (B:3:0x000e, B:8:0x001f, B:11:0x002f, B:13:0x0037, B:15:0x003a, B:32:0x0085, B:33:0x008b, B:35:0x008e, B:38:0x0099, B:40:0x00a2, B:42:0x00b5, B:43:0x00bd, B:19:0x0043, B:23:0x0059, B:24:0x005f, B:26:0x0068, B:27:0x0071, B:28:0x0077, B:29:0x007d), top: B:48:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:43:0x00bd A[Catch: IOException -> 0x00c3, TRY_LEAVE, TryCatch #0 {IOException -> 0x00c3, blocks: (B:3:0x000e, B:8:0x001f, B:11:0x002f, B:13:0x0037, B:15:0x003a, B:32:0x0085, B:33:0x008b, B:35:0x008e, B:38:0x0099, B:40:0x00a2, B:42:0x00b5, B:43:0x00bd, B:19:0x0043, B:23:0x0059, B:24:0x005f, B:26:0x0068, B:27:0x0071, B:28:0x0077, B:29:0x007d), top: B:48:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:52:0x0099 A[EDGE_INSN: B:52:0x0099->B:38:0x0099 BREAK  A[LOOP:1: B:33:0x008b->B:37:0x0098], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
        protected void d() throws BuildException {
            int length;
            int i10;
            this.f135856b = new StringBuffer();
            this.f135859e = new StringBuffer();
            try {
                int i11 = this.f135858d.read();
                while (i11 != -1 && i11 != 13 && i11 != 10) {
                    this.f135859e.append((char) i11);
                    i11 = this.f135858d.read();
                }
                if (i11 == -1 && this.f135859e.length() == 0) {
                    this.f135860f = true;
                    return;
                }
                char c10 = (char) i11;
                char c11 = 2;
                if (c10 != '\n') {
                    if (c10 != '\r') {
                        c11 = 0;
                    } else {
                        this.f135856b.append('\r');
                        this.f135858d.mark(2);
                        int i12 = this.f135858d.read();
                        if (i12 != -1) {
                            if (i12 == 10) {
                                this.f135856b.append('\n');
                            } else if (i12 == 13 && ((char) this.f135858d.read()) == '\n') {
                                c11 = 3;
                                this.f135856b.append("\r\n");
                            } else {
                                this.f135858d.reset();
                            }
                        }
                    }
                    if (c11 == 0) {
                        length = this.f135859e.length();
                        do {
                            length--;
                            if (length >= 0) {
                                break;
                            }
                        } while (this.f135859e.charAt(length) == 26);
                        if (length < this.f135859e.length() - 1) {
                            i10 = length + 1;
                            this.f135857c.append(this.f135859e.toString().substring(i10));
                            if (length < 0) {
                                this.f135859e.setLength(i10);
                            } else {
                                this.f135859e.setLength(0);
                                this.f135860f = true;
                            }
                        }
                    }
                }
                this.f135856b.append('\n');
                c11 = 1;
                if (c11 == 0) {
                    length = this.f135859e.length();
                    do {
                        length--;
                        if (length >= 0) {
                            break;
                            break;
                        }
                    } while (this.f135859e.charAt(length) == 26);
                    if (length < this.f135859e.length() - 1) {
                        i10 = length + 1;
                        this.f135857c.append(this.f135859e.toString().substring(i10));
                        if (length < 0) {
                            this.f135859e.setLength(i10);
                        } else {
                            this.f135859e.setLength(0);
                            this.f135860f = true;
                        }
                    }
                }
            } catch (IOException e10) {
                throw new BuildException(this.f135861g + ": " + e10.getMessage(), e10, v1.this.w1());
            }
        }

        public void e(int i10) {
            this.f135855a = i10;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return !this.f135860f;
        }

        @Override // java.util.Enumeration
        public Object nextElement() throws NoSuchElementException {
            if (!hasMoreElements()) {
                throw new NoSuchElementException("OneLiner");
            }
            a aVar = new a(this.f135859e.toString(), this.f135856b.substring(0));
            d();
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [org.apache.tools.ant.util.j0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [org.apache.tools.ant.util.j0] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v6 */
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
    private void A2(String str) throws Throwable {
        org.apache.tools.ant.util.j0 j0Var;
        File file;
        boolean z10;
        File file2 = new File(this.f135842m, str);
        long jLastModified = file2.lastModified();
        File file3 = this.f135843n;
        if (file3 == null) {
            file3 = this.f135842m;
        }
        File file4 = file3;
        if (this.f135846q == null) {
            org.apache.tools.ant.types.c0 c0Var = new org.apache.tools.ant.types.c0();
            c0Var.e2(this.f135845p);
            Vector<org.apache.tools.ant.types.c0> vector = new Vector<>(1);
            this.f135846q = vector;
            vector.add(c0Var);
        }
        org.apache.tools.ant.util.j0 j0Var2 = f135840v;
        ?? r10 = j0Var2;
        File fileG = r10.G(b(), "fixcrlf", "", null, true, true);
        try {
            try {
                Vector<org.apache.tools.ant.types.c0> vector2 = this.f135846q;
                String str2 = this.f135847r;
                String str3 = this.f135848s;
                try {
                    j0Var2.n(file2, fileG, null, vector2, true, false, str2, str3 == null ? str2 : str3, b());
                    File file5 = new File(file4, str);
                    if (file5.exists()) {
                        x1("destFile " + file5 + " exists", 4);
                        j0Var = j0Var2;
                        file = fileG;
                        try {
                            z10 = !j0Var.j(file5, file);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(file5);
                            sb2.append(z10 ? " is being written" : " is not written, as the contents are identical");
                            x1(sb2.toString(), 4);
                        } catch (IOException e10) {
                            e = e10;
                            throw new BuildException("error running fixcrlf on file " + file2, e);
                        }
                    } else {
                        j0Var = j0Var2;
                        file = fileG;
                        z10 = true;
                    }
                    if (z10) {
                        j0Var.m0(file, file5);
                        if (this.f135841l) {
                            x1("preserved lastModified for " + file5, 4);
                            j0Var.p0(file5, jLastModified);
                        }
                    }
                    if (file == null || !file.exists()) {
                        return;
                    }
                    j0Var.t0(file);
                } catch (IOException e11) {
                    e = e11;
                } catch (Throwable th2) {
                    th = th2;
                    r10 = fileG;
                    if (r10 != 0 && r10.exists()) {
                        f135840v.t0(r10);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (Throwable th4) {
            th = th4;
            r10 = fileG;
        }
    }

    private void O2() throws BuildException {
        File file = this.f135844o;
        if (file != null) {
            if (this.f135842m != null) {
                throw new BuildException(f135839u);
            }
            this.f134236k.V2(file);
            this.f135842m = this.f135844o.getParentFile();
        }
        File file2 = this.f135842m;
        if (file2 == null) {
            throw new BuildException("<fixcrlf> error: srcdir attribute must be set!");
        }
        if (!file2.exists()) {
            throw new BuildException("<fixcrlf> error: srcdir does not exist: '%s'", this.f135842m);
        }
        if (!this.f135842m.isDirectory()) {
            throw new BuildException("<fixcrlf> error: srcdir is not a directory: '%s'", this.f135842m);
        }
        File file3 = this.f135843n;
        if (file3 != null) {
            if (!file3.exists()) {
                throw new BuildException("<fixcrlf> error: destdir does not exist: '%s'", this.f135843n);
            }
            if (!this.f135843n.isDirectory()) {
                throw new BuildException("<fixcrlf> error: destdir is not a directory: '%s'", this.f135843n);
            }
        }
    }

    @Deprecated
    public void B2(a aVar) {
        x1("DEPRECATED: The cr attribute has been deprecated,", 1);
        x1("Please use the eol attribute instead", 1);
        String strD = aVar.d();
        b bVar = new b();
        if ("remove".equals(strD)) {
            bVar.g("lf");
        } else if ("asis".equals(strD)) {
            bVar.g("asis");
        } else {
            bVar.g("crlf");
        }
        F2(bVar);
    }

    public void C2(File file) {
        this.f135843n = file;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws Throwable {
        O2();
        String str = this.f135847r;
        if (str == null) {
            str = "default";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("options: eol=");
        sb2.append(this.f135845p.m().d());
        sb2.append(" tab=");
        sb2.append(this.f135845p.p().d());
        sb2.append(" eof=");
        sb2.append(this.f135845p.k().d());
        sb2.append(" tablength=");
        sb2.append(this.f135845p.q());
        sb2.append(" encoding=");
        sb2.append(str);
        sb2.append(" outputencoding=");
        String str2 = this.f135848s;
        if (str2 != null) {
            str = str2;
        }
        sb2.append(str);
        x1(sb2.toString(), 3);
        for (String str3 : super.p2(this.f135842m).m()) {
            A2(str3);
        }
    }

    public void D2(String str) {
        this.f135847r = str;
    }

    public void E2(a aVar) {
        this.f135845p.s(org.apache.tools.ant.filters.i.a.m(aVar.d()));
    }

    public void F2(b bVar) {
        this.f135845p.t(org.apache.tools.ant.filters.i.d.p(bVar.d()));
    }

    public void G2(File file) {
        this.f135844o = file;
    }

    public void H2(boolean z10) {
        this.f135845p.x(z10);
    }

    public void I2(boolean z10) {
        this.f135845p.z(z10);
    }

    public void J2(String str) {
        this.f135848s = str;
    }

    public void K2(boolean z10) {
        this.f135841l = z10;
    }

    public void L2(File file) {
        this.f135842m = file;
    }

    public void M2(a aVar) {
        this.f135845p.A(org.apache.tools.ant.filters.i.a.m(aVar.d()));
    }

    public void N2(int i10) throws BuildException {
        try {
            this.f135845p.C(i10);
        } catch (IOException e10) {
            throw new BuildException(e10.getMessage(), e10);
        }
    }

    @Override // org.apache.tools.ant.filters.c
    public final Reader t0(Reader reader) {
        return this.f135845p.t0(reader);
    }
}
