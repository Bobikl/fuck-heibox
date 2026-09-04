package org.apache.tools.ant.taskdefs;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Function;
import java.util.zip.GZIPOutputStream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.util.ResourceUtils;

/* JADX INFO: compiled from: Tar.java */
/* JADX INFO: loaded from: classes5.dex */
public class v6 extends h4 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f135894t = 8192;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final String f135895u = "warn";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final String f135896v = "fail";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final String f135897w = "truncate";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final String f135898x = "gnu";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final String f135899y = "omit";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    File f135900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    File f135901m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f135902n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Vector<b> f135903o = new Vector<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<org.apache.tools.ant.types.u1> f135904p = new Vector();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f135905q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f135906r = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f135907s;

    /* JADX INFO: compiled from: Tar.java */
    public static final class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f135908c = "none";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f135909d = "gzip";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f135910e = "bzip2";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f135911f = "xz";

        public a() {
            g("none");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public OutputStream i(OutputStream outputStream) throws IOException {
            String strD = d();
            if ("gzip".equals(strD)) {
                return new GZIPOutputStream(outputStream);
            }
            if (f135911f.equals(strD)) {
                return j(outputStream);
            }
            if (!f135910e.equals(strD)) {
                return outputStream;
            }
            outputStream.write(66);
            outputStream.write(90);
            return new org.apache.tools.bzip2.d(outputStream);
        }

        private static OutputStream j(OutputStream outputStream) throws BuildException {
            try {
                return (OutputStream) Class.forName("org.tukaani.xz.XZOutputStream").asSubclass(OutputStream.class).getConstructor(OutputStream.class, Class.forName("org.tukaani.xz.FilterOptions")).newInstance(outputStream, Class.forName("org.tukaani.xz.LZMA2Options").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException e10) {
                throw new BuildException("xz compression requires the XZ for Java library", e10);
            } catch (IllegalAccessException e11) {
                e = e11;
                throw new BuildException("failed to create XZOutputStream", e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new BuildException("failed to create XZOutputStream", e);
            } catch (NoSuchMethodException e13) {
                e = e13;
                throw new BuildException("failed to create XZOutputStream", e);
            } catch (InvocationTargetException e14) {
                e = e14;
                throw new BuildException("failed to create XZOutputStream", e);
            }
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"none", "gzip", f135910e, f135911f};
        }
    }

    /* JADX INFO: compiled from: Tar.java */
    public static class b extends org.apache.tools.ant.types.y1 {
        private String[] O;
        private boolean P;

        public b() {
            this.O = null;
            this.P = false;
        }

        public b(org.apache.tools.ant.types.b0 b0Var) {
            super(b0Var);
            this.O = null;
            this.P = false;
        }

        public String[] S3(Project project) {
            if (this.O == null) {
                this.O = v6.I2(this);
            }
            return this.O;
        }

        public int T3() {
            return k3(b());
        }

        public boolean U3() {
            return this.P;
        }

        public void V3(String str) {
            A3(str);
        }

        public void W3(boolean z10) {
            this.P = z10;
        }
    }

    /* JADX INFO: compiled from: Tar.java */
    public static class c extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f135912c = "warn";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f135913d = "fail";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f135914e = "truncate";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f135915f = "gnu";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f135917h = "omit";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f135916g = "posix";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String[] f135918i = {"warn", "fail", "truncate", "gnu", f135916g, "omit"};

        public c() {
            g("warn");
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return f135918i;
        }

        public boolean h() {
            return "fail".equalsIgnoreCase(d());
        }

        public boolean i() {
            return "gnu".equalsIgnoreCase(d());
        }

        public boolean j() {
            return "omit".equalsIgnoreCase(d());
        }

        public boolean k() {
            return f135916g.equalsIgnoreCase(d());
        }

        public boolean l() {
            return "truncate".equalsIgnoreCase(d());
        }

        public boolean m() {
            return "warn".equalsIgnoreCase(d());
        }
    }

    protected static String[] I2(org.apache.tools.ant.types.b0 b0Var) {
        org.apache.tools.ant.v0 v0VarB2 = b0Var.B2(b0Var.b());
        String[] strArrJ = v0VarB2.j();
        String[] strArrM = v0VarB2.m();
        String[] strArr = new String[strArrJ.length + strArrM.length];
        System.arraycopy(strArrJ, 0, strArr, 0, strArrJ.length);
        System.arraycopy(strArrM, 0, strArr, strArrJ.length, strArrM.length);
        return strArr;
    }

    protected static boolean J2(org.apache.tools.ant.types.u1 u1Var) {
        return (u1Var instanceof org.apache.tools.ant.types.b0) && u1Var.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List K2(File file) {
        return new Vector();
    }

    protected boolean A2(org.apache.tools.ant.types.s1 s1Var) {
        return org.apache.tools.ant.types.selectors.m0.g(new org.apache.tools.ant.types.resources.z(this.f135900l), s1Var, org.apache.tools.ant.util.j0.O().M());
    }

    @Deprecated
    protected boolean B2(String[] strArr) {
        return C2(strArr, this.f135901m);
    }

    protected boolean C2(String[] strArr, File file) {
        org.apache.tools.ant.util.f2 f2Var = new org.apache.tools.ant.util.f2(this);
        org.apache.tools.ant.util.b1 b1Var = new org.apache.tools.ant.util.b1();
        b1Var.q0(this.f135900l.getAbsolutePath());
        return f2Var.k(strArr, file, null, b1Var).length == 0;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file = this.f135900l;
        if (file == null) {
            throw new BuildException("tarfile attribute must be set!", w1());
        }
        if (file.exists() && this.f135900l.isDirectory()) {
            throw new BuildException("tarfile is a directory!", w1());
        }
        if (this.f135900l.exists() && !this.f135900l.canWrite()) {
            throw new BuildException("Can not write to the specified tarfile!", w1());
        }
        Vector<b> vector = new Vector<>(this.f135903o);
        try {
            File file2 = this.f135901m;
            if (file2 != null) {
                if (!file2.exists()) {
                    throw new BuildException("basedir does not exist!", w1());
                }
                b bVar = new b(this.f134236k);
                bVar.R2(this.f135901m);
                this.f135903o.addElement(bVar);
            }
            if (this.f135903o.isEmpty() && this.f135904p.isEmpty()) {
                throw new BuildException("You must supply either a basedir attribute or some nested resource collections.", w1());
            }
            Iterator<b> it = this.f135903o.iterator();
            boolean zG2 = true;
            while (it.hasNext()) {
                zG2 &= G2(it.next());
            }
            Iterator<org.apache.tools.ant.types.u1> it2 = this.f135904p.iterator();
            while (it2.hasNext()) {
                zG2 &= G2(it2.next());
            }
            if (zG2) {
                x1("Nothing to do: " + this.f135900l.getAbsolutePath() + " is up to date.", 2);
                this.f135903o = vector;
                return;
            }
            File parentFile = this.f135900l.getParentFile();
            if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new BuildException("Failed to create missing parent directory for %s", this.f135900l);
            }
            x1("Building tar: " + this.f135900l.getAbsolutePath(), 2);
            try {
                org.apache.tools.tar.g gVar = new org.apache.tools.tar.g(this.f135906r.i(new BufferedOutputStream(Files.newOutputStream(this.f135900l.toPath(), new OpenOption[0]))), this.f135907s);
                try {
                    gVar.r(true);
                    if (this.f135902n.l()) {
                        gVar.s(1);
                    } else if (this.f135902n.h() || this.f135902n.j()) {
                        gVar.s(0);
                    } else if (this.f135902n.k()) {
                        gVar.s(3);
                    } else {
                        gVar.s(2);
                    }
                    this.f135905q = false;
                    Iterator<b> it3 = this.f135903o.iterator();
                    while (it3.hasNext()) {
                        T2(it3.next(), gVar);
                    }
                    Iterator<org.apache.tools.ant.types.u1> it4 = this.f135904p.iterator();
                    while (it4.hasNext()) {
                        T2(it4.next(), gVar);
                    }
                    gVar.close();
                    this.f135903o = vector;
                } catch (Throwable th2) {
                    try {
                        gVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                throw new BuildException("Problem creating TAR: " + e10.getMessage(), e10, w1());
            }
        } catch (Throwable th4) {
            this.f135903o = vector;
            throw th4;
        }
    }

    protected b D2(org.apache.tools.ant.types.k kVar) {
        if (kVar instanceof b) {
            return (b) kVar;
        }
        b bVar = new b();
        bVar.J(b());
        if (kVar != null) {
            bVar.C3(kVar.o3(b()));
            bVar.B3(kVar.m3(b()));
            if (kVar.t3()) {
                bVar.v3(kVar.k3(b()));
            }
            if (kVar.s3()) {
                bVar.u3(kVar.h3(b()));
            }
            if (kVar instanceof org.apache.tools.ant.types.y1) {
                org.apache.tools.ant.types.y1 y1Var = (org.apache.tools.ant.types.y1) kVar;
                if (y1Var.N3()) {
                    bVar.R3(y1Var.J3());
                }
                if (y1Var.K3()) {
                    bVar.P3(y1Var.H3());
                }
                if (y1Var.M3()) {
                    bVar.Q3(y1Var.I3());
                }
                if (y1Var.L3()) {
                    bVar.O3(y1Var.G3());
                }
            }
        }
        return bVar;
    }

    protected boolean E2(File file, Collection<String> collection) {
        return F2(file, (String[]) collection.toArray(new String[collection.size()]));
    }

    protected boolean F2(File file, String[] strArr) {
        boolean zC2 = C2(strArr, file);
        for (String str : strArr) {
            if (this.f135900l.equals(new File(file, str))) {
                throw new BuildException("A tar file cannot include itself", w1());
            }
        }
        return zC2;
    }

    protected boolean G2(org.apache.tools.ant.types.u1 u1Var) {
        if (J2(u1Var)) {
            org.apache.tools.ant.types.b0 b0Var = (org.apache.tools.ant.types.b0) u1Var;
            return F2(b0Var.z2(b()), I2(b0Var));
        }
        if (!u1Var.O() && !S2()) {
            throw new BuildException("only filesystem resources are supported");
        }
        boolean zA2 = true;
        if (u1Var.O()) {
            HashSet<File> hashSet = new HashSet();
            HashMap map = new HashMap();
            Iterator<org.apache.tools.ant.types.s1> it = u1Var.iterator();
            while (it.hasNext()) {
                org.apache.tools.ant.types.resources.z zVarD = ResourceUtils.d((org.apache.tools.ant.types.resources.y) it.next().e2(org.apache.tools.ant.types.resources.y.class));
                File fileW2 = zVarD.w2();
                if (fileW2 == null) {
                    fileW2 = q0.M;
                }
                hashSet.add(fileW2);
                List list = (List) map.computeIfAbsent(fileW2, new Function() { // from class: org.apache.tools.ant.taskdefs.u6
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return v6.K2((File) obj);
                    }
                });
                if (fileW2 == q0.M) {
                    list.add(zVarD.l0().getAbsolutePath());
                } else {
                    list.add(zVarD.k2());
                }
            }
            for (File file : hashSet) {
                zA2 &= E2(file == q0.M ? null : file, (List) map.get(file));
            }
        } else {
            Iterator<org.apache.tools.ant.types.s1> it2 = u1Var.iterator();
            while (it2.hasNext()) {
                zA2 = A2(it2.next());
            }
        }
        return zA2;
    }

    public b H2() {
        b bVar = new b();
        bVar.J(b());
        this.f135903o.addElement(bVar);
        return bVar;
    }

    public void L2(File file) {
        this.f135901m = file;
    }

    public void M2(a aVar) {
        this.f135906r = aVar;
    }

    public void N2(File file) {
        this.f135900l = file;
    }

    public void O2(String str) {
        this.f135907s = str;
    }

    @Deprecated
    public void P2(String str) {
        log("DEPRECATED - The setLongfile(String) method has been deprecated. Use setLongfile(Tar.TarLongFileMode) instead.");
        c cVar = new c();
        this.f135902n = cVar;
        cVar.g(str);
    }

    public void Q2(c cVar) {
        this.f135902n = cVar;
    }

    @Deprecated
    public void R2(File file) {
        this.f135900l = file;
    }

    protected boolean S2() {
        return getClass().equals(v6.class);
    }

    protected void T2(org.apache.tools.ant.types.u1 u1Var, org.apache.tools.tar.g gVar) throws IOException {
        org.apache.tools.ant.types.k kVar = u1Var instanceof org.apache.tools.ant.types.k ? (org.apache.tools.ant.types.k) u1Var : null;
        if (kVar != null && kVar.size() > 1 && !kVar.m3(b()).isEmpty()) {
            throw new BuildException("fullpath attribute may only be specified for filesets that specify a single file.");
        }
        b bVarD2 = D2(kVar);
        if (J2(u1Var)) {
            org.apache.tools.ant.types.b0 b0Var = (org.apache.tools.ant.types.b0) u1Var;
            for (String str : I2(b0Var)) {
                U2(new File(b0Var.z2(b()), str), gVar, str.replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX), bVarD2);
            }
            return;
        }
        if (u1Var.O()) {
            Iterator<org.apache.tools.ant.types.s1> it = u1Var.iterator();
            while (it.hasNext()) {
                File fileL0 = ((org.apache.tools.ant.types.resources.y) it.next().e2(org.apache.tools.ant.types.resources.y.class)).l0();
                U2(fileL0, gVar, fileL0.getName(), bVarD2);
            }
            return;
        }
        for (org.apache.tools.ant.types.s1 s1Var : u1Var) {
            V2(s1Var, gVar, s1Var.k2(), bVarD2);
        }
    }

    protected void U2(File file, org.apache.tools.tar.g gVar, String str, b bVar) throws IOException {
        if (file.equals(this.f135900l)) {
            return;
        }
        V2(new org.apache.tools.ant.types.resources.z(file), gVar, str, bVar);
    }

    protected void V2(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.tar.g gVar, String str, b bVar) throws IOException {
        boolean zU3;
        if (s1Var.p2()) {
            if (bVar != null) {
                String strM3 = bVar.m3(b());
                if (!strM3.isEmpty()) {
                    str = strM3;
                } else {
                    if (str.isEmpty()) {
                        return;
                    }
                    String strO3 = bVar.o3(b());
                    if (!strO3.isEmpty() && !strO3.endsWith("/")) {
                        strO3 = strO3 + "/";
                    }
                    str = strO3 + str;
                }
                zU3 = bVar.U3();
                if (str.startsWith("/") && !zU3) {
                    int length = str.length();
                    if (length <= 1) {
                        return;
                    } else {
                        str = str.substring(1, length);
                    }
                }
            } else {
                zU3 = false;
            }
            if (s1Var.o2() && !str.endsWith("/")) {
                str = str + "/";
            }
            if (str.length() >= 100) {
                if (this.f135902n.j()) {
                    x1("Omitting: " + str, 2);
                    return;
                }
                if (this.f135902n.m()) {
                    x1("Entry: " + str + " longer than 100 characters.", 1);
                    if (!this.f135905q) {
                        x1("Resulting tar file can only be processed successfully by GNU compatible tar commands", 1);
                        this.f135905q = true;
                    }
                } else if (this.f135902n.h()) {
                    throw new BuildException("Entry: " + str + " longer than 100characters.", w1());
                }
            }
            org.apache.tools.tar.d dVar = new org.apache.tools.tar.d(str, zU3);
            dVar.T(s1Var.i2());
            if (s1Var instanceof org.apache.tools.ant.types.resources.g) {
                dVar.V(((org.apache.tools.ant.types.resources.g) s1Var).A2());
                if (s1Var instanceof org.apache.tools.ant.types.resources.m1) {
                    org.apache.tools.ant.types.resources.m1 m1Var = (org.apache.tools.ant.types.resources.m1) s1Var;
                    dVar.b0(m1Var.K2());
                    dVar.a0(m1Var.H2());
                    dVar.Q(m1Var.F2());
                    dVar.P(m1Var.G2());
                }
            }
            if (s1Var.o2()) {
                if (bVar != null && bVar.s3()) {
                    dVar.V(bVar.h3(b()));
                }
            } else {
                if (s1Var.size() > org.apache.tools.tar.c.f137288j) {
                    throw new BuildException("Resource: " + s1Var + " larger than " + org.apache.tools.tar.c.f137288j + " bytes.");
                }
                dVar.Y(s1Var.n2());
                if (bVar != null && bVar.t3()) {
                    dVar.V(bVar.T3());
                }
            }
            if (bVar != null) {
                if (bVar.N3()) {
                    dVar.b0(bVar.J3());
                }
                if (bVar.K3()) {
                    dVar.Q(bVar.H3());
                }
                if (bVar.M3()) {
                    dVar.Z(bVar.I3());
                }
                if (bVar.L3()) {
                    dVar.O(bVar.G3());
                }
            }
            InputStream inputStreamH2 = null;
            try {
                gVar.n(dVar);
                if (!s1Var.o2()) {
                    inputStreamH2 = s1Var.h2();
                    byte[] bArr = new byte[8192];
                    int i10 = 0;
                    do {
                        gVar.write(bArr, 0, i10);
                        i10 = inputStreamH2.read(bArr, 0, 8192);
                    } while (i10 != -1);
                }
                gVar.c();
            } finally {
                org.apache.tools.ant.util.j0.c(inputStreamH2);
            }
        }
    }

    public void z2(org.apache.tools.ant.types.u1 u1Var) {
        this.f135904p.add(u1Var);
    }
}
