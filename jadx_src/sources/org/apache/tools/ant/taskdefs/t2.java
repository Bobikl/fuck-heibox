package org.apache.tools.ant.taskdefs;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Jar.java */
/* JADX INFO: loaded from: classes5.dex */
public class t2 extends j8 {
    private static final String Q3 = "META-INF/INDEX.LIST";
    private static final String R3 = "META-INF/MANIFEST.MF";
    private static final org.apache.tools.zip.u[] S3 = {org.apache.tools.zip.g.h()};
    private File G2;
    private List<String> K3;
    private org.apache.tools.ant.types.o0 L3;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private y3 f135767b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private y3 f135768c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private y3 f135769p1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private y3 f135772x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private y3 f135773x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private a f135774y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private String f135775y2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private List<sj.c> f135766a0 = new ArrayList();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f135770p2 = true;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f135771p3 = false;
    private boolean G3 = false;
    private boolean J3 = false;
    private org.apache.tools.ant.util.g0 M3 = null;
    private c N3 = new c(z0.b.f136024i);
    private boolean O3 = false;
    private boolean P3 = false;

    /* JADX INFO: compiled from: Jar.java */
    public static class a extends org.apache.tools.ant.types.w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{org.apache.tools.ant.taskdefs.optional.vss.g.L2, "merge", "mergewithoutmain"};
        }
    }

    /* JADX INFO: compiled from: Jar.java */
    public static class b implements org.apache.tools.ant.util.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f135776b;

        b(String[] strArr) {
            this.f135776b = strArr;
        }

        @Override // org.apache.tools.ant.util.g0
        public void n0(String str) {
        }

        @Override // org.apache.tools.ant.util.g0
        public void q0(String str) {
        }

        @Override // org.apache.tools.ant.util.g0
        public String[] y0(String str) {
            String strX4 = t2.x4(str, this.f135776b);
            if (strX4 == null) {
                return null;
            }
            return new String[]{strX4};
        }
    }

    /* JADX INFO: compiled from: Jar.java */
    public static class c extends org.apache.tools.ant.types.w {
        public c() {
        }

        public c(String str) {
            g(str);
        }

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"fail", "warn", z0.b.f136024i};
        }

        public int h() {
            return z0.b.f136024i.equals(d()) ? 3 : 1;
        }
    }

    public t2() {
        this.f134381w = "jar";
        this.f134382x = TopicHashtagWrapper.TYPE_CREATE;
        O3("UTF8");
        a4(j8.e.f134396g);
        this.K3 = new Vector();
    }

    private y3 A4(Reader reader) {
        try {
            return new y3(reader);
        } catch (IOException e10) {
            throw new BuildException("Unable to read manifest file (" + e10.getMessage() + ")", e10);
        } catch (ManifestException e11) {
            x1("Manifest is invalid: " + e11.getMessage(), 0);
            throw new BuildException("Invalid Manifest: " + this.G2, e11, w1());
        }
    }

    private Charset B4() {
        String str = this.f135775y2;
        if (str == null) {
            return Charset.defaultCharset();
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException e10) {
            throw new BuildException("Unsupported encoding while reading manifest: " + e10.getMessage(), e10);
        }
    }

    private y3 C4(File file) throws IOException {
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry zipEntry = (ZipEntry) org.apache.tools.ant.util.h2.a(zipFile.entries()).filter(new Predicate() { // from class: org.apache.tools.ant.taskdefs.q2
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return t2.H4((ZipEntry) obj);
                }
            }).findFirst().orElse(null);
            if (zipEntry == null) {
                zipFile.close();
                return null;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(zipFile.getInputStream(zipEntry), StandardCharsets.UTF_8);
            try {
                y3 y3VarA4 = A4(inputStreamReader);
                inputStreamReader.close();
                zipFile.close();
                return y3VarA4;
            } catch (Throwable th2) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                zipFile.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    protected static void D4(String str, List<String> list, final List<String> list2) throws IOException {
        org.apache.tools.zip.x xVar = new org.apache.tools.zip.x(str, "utf-8");
        try {
            final HashSet hashSet = new HashSet();
            org.apache.tools.ant.util.h2.a(xVar.i()).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.o2
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    t2.I4(hashSet, list2, (org.apache.tools.zip.t) obj);
                }
            });
            list.addAll(hashSet);
            xVar.close();
        } catch (Throwable th2) {
            try {
                xVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private org.apache.tools.ant.types.s1[][] E4(org.apache.tools.ant.types.u1[] u1VarArr) {
        org.apache.tools.ant.types.s1[][] s1VarArr = new org.apache.tools.ant.types.s1[u1VarArr.length][];
        for (int i10 = 0; i10 < u1VarArr.length; i10++) {
            org.apache.tools.ant.types.u1 u1Var = u1VarArr[i10];
            org.apache.tools.ant.types.s1[][] s1VarArrK3 = u1Var instanceof org.apache.tools.ant.types.b0 ? k3(new org.apache.tools.ant.types.b0[]{(org.apache.tools.ant.types.b0) u1Var}) : j3(new org.apache.tools.ant.types.u1[]{u1Var});
            int i11 = 0;
            while (true) {
                org.apache.tools.ant.types.s1[] s1VarArr2 = s1VarArrK3[0];
                if (i11 >= s1VarArr2.length) {
                    break;
                }
                String strReplace = s1VarArr2[i11].k2().replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
                org.apache.tools.ant.types.u1 u1Var2 = u1VarArr[i10];
                if (u1Var2 instanceof org.apache.tools.ant.types.k) {
                    org.apache.tools.ant.types.k kVar = (org.apache.tools.ant.types.k) u1Var2;
                    if (!kVar.m3(b()).isEmpty()) {
                        strReplace = kVar.m3(b());
                    } else if (!kVar.o3(b()).isEmpty()) {
                        String strO3 = kVar.o3(b());
                        if (!strO3.endsWith("/") && !strO3.endsWith("\\")) {
                            strO3 = strO3 + "/";
                        }
                        strReplace = strO3 + strReplace;
                    }
                }
                if (R3.equalsIgnoreCase(strReplace)) {
                    s1VarArr[i10] = new org.apache.tools.ant.types.s1[]{s1VarArrK3[0][i11]};
                    break;
                }
                i11++;
            }
            if (s1VarArr[i10] == null) {
                s1VarArr[i10] = new org.apache.tools.ant.types.s1[0];
            }
        }
        return s1VarArr;
    }

    private boolean F4(File file) throws IOException {
        ZipFile zipFile = new ZipFile(file);
        try {
            boolean zAnyMatch = org.apache.tools.ant.util.h2.a(zipFile.entries()).anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.n2
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return t2.J4((ZipEntry) obj);
                }
            });
            zipFile.close();
            return zAnyMatch;
        } catch (Throwable th2) {
            try {
                zipFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int G4(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean H4(ZipEntry zipEntry) {
        return R3.equalsIgnoreCase(zipEntry.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I4(Set set, List list, org.apache.tools.zip.t tVar) {
        String name = tVar.getName();
        if (tVar.isDirectory()) {
            set.add(name);
        } else if (name.contains("/")) {
            set.add(name.substring(0, name.lastIndexOf(47) + 1));
        } else {
            list.add(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean J4(ZipEntry zipEntry) {
        return Q3.equalsIgnoreCase(zipEntry.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K4(String str) {
        x1("Manifest warning: " + str, 1);
    }

    private void W4(org.apache.tools.zip.z zVar, y3 y3Var) throws IOException {
        org.apache.tools.ant.util.h2.a(y3Var.l()).forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.p2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f135508b.K4((String) obj);
            }
        });
        e4(null, zVar, "META-INF/", 16877, S3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(byteArrayOutputStream, y3.f135974n));
        y3Var.r(printWriter, this.P3);
        if (printWriter.checkError()) {
            throw new IOException("Encountered an error writing the manifest");
        }
        printWriter.close();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        try {
            super.g4(byteArrayInputStream, zVar, R3, System.currentTimeMillis(), null, 33188);
            org.apache.tools.ant.util.j0.c(byteArrayInputStream);
            super.m3(zVar);
        } catch (Throwable th2) {
            org.apache.tools.ant.util.j0.c(byteArrayInputStream);
            throw th2;
        }
    }

    private void X4(org.apache.tools.zip.z zVar) throws IOException {
        for (sj.c cVar : this.f135766a0) {
            InputStream inputStreamG1 = cVar.G1();
            try {
                super.g4(inputStreamG1, zVar, "META-INF/services/" + cVar.H1(), System.currentTimeMillis(), null, 33188);
                if (inputStreamG1 != null) {
                    inputStreamG1.close();
                }
            } catch (Throwable th2) {
                if (inputStreamG1 != null) {
                    try {
                        inputStreamG1.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    private void s4() {
        StringBuilder sb2 = new StringBuilder();
        y3 y3Var = this.f135767b0;
        y3.b bVarH = y3Var == null ? null : y3Var.h();
        if (bVarH == null) {
            sb2.append("No Implementation-Title set.");
            sb2.append("No Implementation-Version set.");
            sb2.append("No Implementation-Vendor set.");
        } else {
            if (bVarH.f("Implementation-Title") == null) {
                sb2.append("No Implementation-Title set.");
            }
            if (bVarH.f("Implementation-Version") == null) {
                sb2.append("No Implementation-Version set.");
            }
            if (bVarH.f("Implementation-Vendor") == null) {
                sb2.append("No Implementation-Vendor set.");
            }
        }
        if (sb2.length() > 0) {
            sb2.append(String.format("%nLocation: %s%n", w1()));
            if ("fail".equalsIgnoreCase(this.N3.d())) {
                throw new BuildException(sb2.toString(), w1());
            }
            y3(sb2.toString(), this.N3.h());
        }
    }

    private org.apache.tools.ant.util.g0 t4() {
        String[] strArr;
        y3.a aVarF = v4().h().f(y3.f135968h);
        if (aVarF == null || aVarF.e() == null) {
            strArr = null;
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(aVarF.e(), " ");
            strArr = new String[stringTokenizer.countTokens()];
            int i10 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                strArr[i10] = stringTokenizer.nextToken();
                i10++;
            }
        }
        return new b(strArr);
    }

    private void u4(org.apache.tools.zip.z zVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8));
        printWriter.println("JarIndex-Version: 1.0");
        printWriter.println();
        printWriter.println(this.f134370l.getName());
        V4(new ArrayList<>(this.f134384z.keySet()), this.K3, printWriter);
        printWriter.println();
        if (this.L3 != null) {
            org.apache.tools.ant.util.g0 g0VarT4 = this.M3;
            if (g0VarT4 == null) {
                g0VarT4 = t4();
            }
            for (String str : this.L3.z2()) {
                String[] strArrY0 = g0VarT4.y0(str);
                if (strArrY0 != null && strArrY0.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    D4(str, arrayList, arrayList2);
                    if (arrayList.size() + arrayList2.size() > 0) {
                        printWriter.println(strArrY0[0]);
                        V4(arrayList, arrayList2, printWriter);
                        printWriter.println();
                    }
                }
            }
        }
        if (printWriter.checkError()) {
            throw new IOException("Encountered an error writing jar index");
        }
        printWriter.close();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        try {
            super.g4(byteArrayInputStream, zVar, Q3, System.currentTimeMillis(), null, 33188);
            byteArrayInputStream.close();
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private y3 v4() throws BuildException {
        y3 y3VarG;
        File file;
        try {
            if (this.f135773x2 == null && (file = this.G2) != null) {
                this.f135773x2 = z4(file);
            }
            boolean z10 = true;
            boolean z11 = !this.f135770p2 && this.f135769p1 != null && this.f135767b0 == null && this.f135773x2 == null;
            if (z11) {
                y3VarG = new y3();
                y3VarG.p(this.f135769p1, false, this.O3);
                y3VarG.p(y3.g(), true, this.O3);
            } else {
                y3VarG = y3.g();
            }
            if (r3()) {
                y3VarG.p(this.f135772x1, false, this.O3);
            }
            if (!z11) {
                y3VarG.p(this.f135769p1, false, this.O3);
            }
            y3VarG.p(this.f135767b0, !this.f135770p2, this.O3);
            y3 y3Var = this.f135773x2;
            if (this.f135770p2) {
                z10 = false;
            }
            y3VarG.p(y3Var, z10, this.O3);
            return y3VarG;
        } catch (ManifestException e10) {
            x1("Manifest is invalid: " + e10.getMessage(), 0);
            throw new BuildException("Invalid Manifest", e10, w1());
        }
    }

    private void w4(File file, InputStream inputStream) throws IOException {
        y3 y3VarA4;
        File file2 = this.G2;
        if (file2 != null && file2.equals(file)) {
            x1("Found manifest " + file, 3);
            if (inputStream == null) {
                this.f135773x2 = z4(file);
                return;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, B4());
            try {
                this.f135773x2 = A4(inputStreamReader);
                inputStreamReader.close();
                return;
            } catch (Throwable th2) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        a aVar = this.f135774y1;
        if (aVar == null || org.apache.tools.ant.taskdefs.optional.vss.g.L2.equals(aVar.d())) {
            return;
        }
        y3("Found manifest to merge in file " + file, 3);
        try {
            if (inputStream == null) {
                y3VarA4 = z4(file);
            } else {
                InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream, B4());
                try {
                    y3VarA4 = A4(inputStreamReader2);
                    inputStreamReader2.close();
                } catch (Throwable th4) {
                    try {
                        inputStreamReader2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            y3 y3Var = this.f135769p1;
            if (y3Var == null) {
                this.f135769p1 = y3VarA4;
            } else {
                y3Var.p(y3VarA4, false, this.O3);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new BuildException("Unsupported encoding while reading manifest: " + e10.getMessage(), e10);
        } catch (ManifestException e11) {
            x1("Manifest in file " + file + " is invalid: " + e11.getMessage(), 0);
            throw new BuildException("Invalid Manifest", e11, w1());
        }
    }

    protected static String x4(String str, String[] strArr) {
        if (strArr == null) {
            return new File(str).getName();
        }
        String strReplace = str.replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX);
        TreeMap treeMap = new TreeMap(Comparator.comparingInt(new ToIntFunction() { // from class: org.apache.tools.ant.taskdefs.r2
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return t2.G4((String) obj);
            }
        }).reversed());
        for (String str2 : strArr) {
            String strSubstring = str2;
            while (true) {
                if (strReplace.endsWith(strSubstring)) {
                    treeMap.put(strSubstring, str2);
                    break;
                }
                int iIndexOf = strSubstring.indexOf(47);
                if (iIndexOf < 0) {
                    break;
                }
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
        }
        if (treeMap.isEmpty()) {
            return null;
        }
        return (String) treeMap.get(treeMap.firstKey());
    }

    private y3 z4(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(file.toPath(), new OpenOption[0]), B4());
            try {
                y3 y3VarA4 = A4(inputStreamReader);
                inputStreamReader.close();
                return y3VarA4;
            } catch (Throwable th2) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Unable to read manifest file: " + file + " (" + e10.getMessage() + ")", e10);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.j8
    public void C3() {
        super.C3();
        this.f134382x = TopicHashtagWrapper.TYPE_CREATE;
        this.f135767b0 = null;
        this.f135774y1 = null;
        this.f135770p2 = false;
        this.G2 = null;
        this.f135771p3 = false;
    }

    public void L4(a aVar) {
        this.f135774y1 = aVar;
        this.f135770p2 = aVar != null && "merge".equals(aVar.d());
        a aVar2 = this.f135774y1;
        if (aVar2 == null || org.apache.tools.ant.taskdefs.optional.vss.g.L2.equals(aVar2.d())) {
            return;
        }
        this.D = true;
    }

    public void M4(boolean z10) {
        this.P3 = z10;
    }

    public void N4(boolean z10) {
        this.f135771p3 = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.j8
    protected void O2() {
        super.O2();
        s4();
        if (!this.D || !this.E) {
            this.f135773x2 = null;
            this.f135767b0 = this.f135768c0;
            this.f135769p1 = null;
            this.f135772x1 = null;
        }
        this.K3.clear();
    }

    public void O4(boolean z10) {
        this.G3 = z10;
    }

    @Deprecated
    public void P4(File file) {
        M3(file);
    }

    @Override // org.apache.tools.ant.taskdefs.j8
    protected boolean Q2(File file) throws BuildException {
        if (!this.J3) {
            return true;
        }
        if (org.apache.tools.ant.taskdefs.optional.vss.g.L2.equals(this.f134382x)) {
            if (!this.E) {
                x1("Warning: skipping " + this.f134381w + " archive " + file + " because no files were included.", 1);
            }
            return true;
        }
        if ("fail".equals(this.f134382x)) {
            throw new BuildException("Cannot create " + this.f134381w + " archive " + file + ": no files were included.", w1());
        }
        if (!this.E) {
            log("Building MANIFEST-only jar: " + W2().getAbsolutePath());
            try {
                try {
                    org.apache.tools.zip.z zVar = new org.apache.tools.zip.z(W2());
                    try {
                        zVar.W(X2());
                        zVar.e0(h3().h());
                        if (o3()) {
                            zVar.a0(8);
                        } else {
                            zVar.a0(0);
                        }
                        m3(zVar);
                        S2(zVar);
                        zVar.close();
                        this.J3 = false;
                    } catch (Throwable th2) {
                        try {
                            zVar.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    throw new BuildException("Could not create almost empty JAR archive (" + e10.getMessage() + ")", e10, w1());
                }
            } catch (Throwable th4) {
                this.J3 = false;
                throw th4;
            }
        }
        return true;
    }

    public void Q4(File file) {
        if (file.exists()) {
            this.G2 = file;
            return;
        }
        throw new BuildException("Manifest file: " + file + org.apache.tools.ant.v0.I, w1());
    }

    public void R4(String str) {
        this.f135775y2 = str;
    }

    @Override // org.apache.tools.ant.taskdefs.j8
    protected void S2(org.apache.tools.zip.z zVar) throws IOException, BuildException {
        if (this.f135771p3) {
            u4(zVar);
        }
    }

    public void S4(boolean z10) {
        this.O3 = z10;
    }

    public void T4(c cVar) {
        this.N3 = cVar;
    }

    public void U4(j8.d dVar) {
        this.f134382x = dVar.d();
    }

    protected final void V4(List<String> list, List<String> list2, final PrintWriter printWriter) {
        Collections.sort(list);
        Collections.sort(list2);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strReplace = it.next().replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
            if (strReplace.startsWith("./")) {
                strReplace = strReplace.substring(2);
            }
            while (strReplace.startsWith("/")) {
                strReplace = strReplace.substring(1);
            }
            int iLastIndexOf = strReplace.lastIndexOf(47);
            if (iLastIndexOf != -1) {
                strReplace = strReplace.substring(0, iLastIndexOf);
            }
            if (this.G3 || !strReplace.startsWith("META-INF")) {
                printWriter.println(strReplace);
            }
        }
        Objects.requireNonNull(printWriter);
        list2.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.s2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                printWriter.println((String) obj);
            }
        });
    }

    @Override // org.apache.tools.ant.taskdefs.j8
    public void Z3(j8.d dVar) {
        x1("JARs are never empty, they contain at least a manifest file", 1);
    }

    @Override // org.apache.tools.ant.taskdefs.j8
    protected j8.a e3(org.apache.tools.ant.types.u1[] u1VarArr, File file, boolean z10) throws BuildException {
        boolean zF4 = true;
        if (this.E) {
            org.apache.tools.ant.types.s1[][] s1VarArrE4 = E4(u1VarArr);
            int length = 0;
            for (org.apache.tools.ant.types.s1[] s1VarArr : s1VarArrE4) {
                length += s1VarArr.length;
            }
            x1("found a total of " + length + " manifests in " + s1VarArrE4.length + " resource collections", 3);
            return new j8.a(true, s1VarArrE4);
        }
        if (file.exists()) {
            try {
                y3 y3VarC4 = C4(file);
                this.f135772x1 = y3VarC4;
                if (y3VarC4 == null) {
                    x1("Updating jar since the current jar has no manifest", 3);
                } else if (!v4().equals(this.f135772x1)) {
                    x1("Updating jar since jar manifest has changed", 3);
                }
            } catch (Throwable th2) {
                x1("error while reading original manifest in file: " + file.toString() + " due to " + th2.getMessage(), 1);
            }
            z10 = true;
        } else {
            z10 = true;
        }
        this.J3 = z10;
        if (z10 || !this.f135771p3) {
            zF4 = z10;
        } else {
            try {
                zF4 = true ^ F4(file);
            } catch (IOException unused) {
            }
        }
        return super.e3(u1VarArr, file, zF4);
    }

    @Override // org.apache.tools.ant.taskdefs.j8
    protected void g4(InputStream inputStream, org.apache.tools.zip.z zVar, String str, long j10, File file, int i10) throws IOException {
        if (R3.equalsIgnoreCase(str)) {
            if (q3()) {
                w4(file, inputStream);
            }
        } else {
            if (!Q3.equalsIgnoreCase(str) || !this.f135771p3) {
                if (this.f135771p3 && !str.contains("/")) {
                    this.K3.add(str);
                }
                super.g4(inputStream, zVar, str, j10, file, i10);
                return;
            }
            y3("Warning: selected " + this.f134381w + " files include a " + Q3 + " which will be replaced by a newly generated one.", 1);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.j8
    protected void m3(org.apache.tools.zip.z zVar) throws IOException, BuildException {
        if (this.E) {
            return;
        }
        W4(zVar, v4());
        X4(zVar);
    }

    public void n4(org.apache.tools.ant.types.o0 o0Var) {
        if (this.L3 == null) {
            this.L3 = new org.apache.tools.ant.types.o0(b());
        }
        this.L3.n2(o0Var);
    }

    public void o4(org.apache.tools.ant.types.k0 k0Var) {
        if (this.M3 != null) {
            throw new BuildException("Cannot define more than one indexjar-mapper", w1());
        }
        this.M3 = k0Var.i2();
    }

    public void p4(y3 y3Var) throws ManifestException {
        y3 y3Var2 = this.f135767b0;
        if (y3Var2 == null) {
            this.f135767b0 = y3Var;
        } else {
            y3Var2.p(y3Var, false, this.O3);
        }
        this.f135768c0 = this.f135767b0;
    }

    public void q4(sj.c cVar) {
        cVar.D1();
        this.f135766a0.add(cVar);
    }

    public void r4(org.apache.tools.ant.types.d2 d2Var) {
        d2Var.C3("META-INF/");
        super.G2(d2Var);
    }

    public org.apache.tools.ant.util.g0 y4() {
        return this.M3;
    }
}
