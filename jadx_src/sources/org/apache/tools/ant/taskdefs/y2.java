package org.apache.tools.ant.taskdefs;

import com.tencent.qcloud.core.util.IOUtils;
import com.uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Javac.java */
/* JADX INFO: loaded from: classes5.dex */
public class y2 extends h4 {
    private static final String G2 = "javac1.1";
    private static final String G3 = "classic";
    private static final String J3 = "extJavac";
    private static final char K3 = '{';
    private static final char L3 = '}';
    private static final char M3 = ',';
    private static final String N3 = "*";
    private static final org.apache.tools.ant.util.j0 O3 = org.apache.tools.ant.util.j0.O();
    private static final byte[] P3 = {-54, -2, -70, -66, 0, 0, 0, org.apache.tools.tar.c.G, 0, 7, 7, 0, 5, 7, 0, 6, 1, 0, 10, org.apache.tools.tar.c.P, 111, 117, 114, 99, 101, 70, 105, 108, 101, 1, 0, 17, 112, 97, 99, 107, 97, org.apache.tools.tar.c.S, 101, 45, 105, 110, 102, 111, 46, 106, 97, 118, 97, 1};
    private static final byte[] Q3 = {47, 112, 97, 99, 107, 97, org.apache.tools.tar.c.S, 101, 45, 105, 110, 102, 111, 1, 0, 16, 106, 97, 118, 97, 47, 108, 97, 110, org.apache.tools.tar.c.S, 47, 79, 98, 106, 101, 99, 116, 2, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 3, 0, 0, 0, 2, 0, 4};
    static final /* synthetic */ boolean R3 = false;
    private static final String Y = "Compile failed; see the compiler error output for details.";
    private static final String Z = "javac10+";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f135938a0 = "javac9";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f135939b0 = "javac1.9";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f135940c0 = "javac1.8";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f135941p1 = "javac1.7";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final String f135942p2 = "javac1.4";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final String f135943p3 = "modern";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final String f135944x1 = "javac1.6";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f135945x2 = "javac1.3";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final String f135946y1 = "javac1.5";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final String f135947y2 = "javac1.2";
    private String A;
    private org.apache.tools.ant.types.o0 B;
    private org.apache.tools.ant.types.o0 C;
    private Boolean D;
    private String I;
    private String J;
    private tj.d K;
    private String P;
    private String Q;
    private File R;
    private String S;
    private String T;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f135948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f135949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f135950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f135951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f135952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f135953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f135954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f135955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f135956t;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f135962z;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f135957u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f135958v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f135959w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f135960x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f135961y = false;
    private boolean E = false;
    private boolean F = false;
    private String G = null;
    private boolean H = false;
    protected boolean L = true;
    protected boolean M = false;
    protected File[] N = new File[0];
    private Map<String, Long> O = new HashMap();
    private boolean U = true;
    private boolean V = true;
    private org.apache.tools.ant.taskdefs.compilers.a W = null;
    private boolean X = true;

    /* JADX INFO: compiled from: Javac.java */
    public class a extends tj.e {
        public a() {
        }

        public void S1(String str) {
            super.R1(str);
        }
    }

    public y2() {
        this.K = null;
        this.K = new tj.d(A2());
    }

    private String A2() {
        if (org.apache.tools.ant.util.s0.q(org.apache.tools.ant.util.s0.f136934y)) {
            return f135940c0;
        }
        if (org.apache.tools.ant.util.s0.q("9")) {
            return f135938a0;
        }
        return org.apache.tools.ant.util.s0.n("10") ? Z : f135943p3;
    }

    private void C2() {
        org.apache.tools.ant.util.j0 j0VarO = org.apache.tools.ant.util.j0.O();
        for (String str : this.f135955s.z2()) {
            boolean z10 = false;
            for (Map.Entry<String, Collection<File>> entry : P3(b().Z(), str).entrySet()) {
                String key = entry.getKey();
                for (File file : entry.getValue()) {
                    if (file.exists()) {
                        Q3(file, j0VarO.n0(this.f135949m, key), p2(file).m());
                        z10 = true;
                    }
                }
            }
            if (!z10) {
                throw new BuildException("modulesourcepath \"" + str + "\" does not exist!", w1());
            }
        }
    }

    private void D2() {
        for (String str : this.f135948l.z2()) {
            File fileW0 = b().W0(str);
            if (!fileW0.exists()) {
                throw new BuildException("srcdir \"" + fileW0.getPath() + "\" does not exist!", w1());
            }
            org.apache.tools.ant.v0 v0VarP2 = p2(fileW0);
            File file = this.f135949m;
            if (file == null) {
                file = fileW0;
            }
            Q3(fileW0, file, v0VarP2.m());
        }
    }

    private static boolean G3(org.apache.tools.ant.types.o0 o0Var) {
        return (o0Var == null || o0Var.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection K3(String str) {
        return new ArrayList();
    }

    private void L3(File file, File[] fileArr) {
        for (File file2 : fileArr) {
            if ("package-info.java".equals(file2.getName())) {
                String strReplace = O3.l0(file, file2).replace(File.separatorChar, IOUtils.DIR_SEPARATOR_UNIX);
                if (strReplace.endsWith("/package-info.java")) {
                    this.O.put(strReplace.substring(0, strReplace.length() - 18), Long.valueOf(file2.lastModified()));
                } else {
                    x1("anomalous package-info.java path: " + strReplace, 1);
                }
            }
        }
    }

    private static Collection<? extends CharSequence> O3(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt != ',') {
                if (cCharAt == '{') {
                    i11++;
                } else if (cCharAt == '}') {
                    i11--;
                }
            } else if (i11 == 0) {
                arrayList.addAll(P2(charSequence.subSequence(i10, i12)));
                i10 = i12 + 1;
            }
        }
        arrayList.addAll(P2(charSequence.subSequence(i10, charSequence.length())));
        return arrayList;
    }

    private static Collection<? extends CharSequence> P2(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StringBuilder());
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '{') {
                sb2.append(cCharAt);
            } else {
                int iK3 = k3(charSequence, i10);
                if (iK3 < 0) {
                    throw new BuildException(String.format("Unclosed group %s, starting at: %d", charSequence, Integer.valueOf(i10)));
                }
                Collection<? extends CharSequence> collectionO3 = O3(charSequence.subSequence(i10 + 1, iK3));
                int size = collectionO3.size();
                if (size != 0) {
                    if (size != 1) {
                        ArrayList arrayList2 = new ArrayList(arrayList.size() * collectionO3.size());
                        for (CharSequence charSequence2 : collectionO3) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                StringBuilder sb3 = new StringBuilder((CharSequence) it.next());
                                sb3.append((CharSequence) sb2);
                                sb3.append(charSequence2);
                                arrayList2.add(sb3);
                            }
                        }
                        sb2 = new StringBuilder();
                        arrayList = arrayList2;
                    } else {
                        sb2.append(collectionO3.iterator().next());
                    }
                }
                i10 = iK3;
            }
            i10++;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((StringBuilder) it2.next()).append((CharSequence) sb2);
        }
        return arrayList;
    }

    private static Map<String, Collection<File>> P3(File file, String str) {
        TreeMap treeMap = new TreeMap();
        Iterator<? extends CharSequence> it = P2(str).iterator();
        while (it.hasNext()) {
            R2(file, it.next().toString(), treeMap);
        }
        return treeMap;
    }

    private static void Q2(File file, String str, String str2, Map<String, Collection<File>> map) {
        File fileN0 = org.apache.tools.ant.util.j0.O().n0(file, str);
        if (fileN0.isDirectory()) {
            for (File file2 : fileN0.listFiles(new FileFilter() { // from class: org.apache.tools.ant.taskdefs.w2
                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    return file3.isDirectory();
                }
            })) {
                String name = file2.getName();
                if (str2 != null) {
                    file2 = new File(file2, str2);
                }
                ((Collection) map.computeIfAbsent(name, new Function() { // from class: org.apache.tools.ant.taskdefs.x2
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return y2.K3((String) obj);
                    }
                })).add(file2);
            }
        }
    }

    private static void R2(File file, String str, Map<String, Collection<File>> map) {
        String strReplace = str.replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar).replace(IOUtils.DIR_SEPARATOR_WINDOWS, File.separatorChar);
        int iIndexOf = strReplace.indexOf("*");
        if (iIndexOf == -1) {
            Q2(file, strReplace, null, map);
            return;
        }
        if (iIndexOf == 0) {
            throw new BuildException("The modulesourcepath entry must be a folder.");
        }
        int i10 = iIndexOf + 1;
        if (strReplace.charAt(iIndexOf - 1) != File.separatorChar) {
            throw new BuildException("The module mark must be preceded by separator");
        }
        if (i10 < strReplace.length() && strReplace.charAt(i10) != File.separatorChar) {
            throw new BuildException("The module mark must be followed by separator");
        }
        if (strReplace.indexOf("*", i10) != -1) {
            throw new BuildException("The modulesourcepath entry must contain at most one module mark");
        }
        Q2(file, strReplace.substring(0, iIndexOf), i10 != strReplace.length() ? strReplace.substring(i10 + 1) : null, map);
    }

    private String[] S2() {
        String strX2 = X2();
        org.apache.tools.ant.taskdefs.compilers.a aVarC = this.W;
        if (aVarC == null) {
            aVarC = org.apache.tools.ant.taskdefs.compilers.c.c(strX2, this, I2());
        }
        String[] strArrB = aVarC instanceof org.apache.tools.ant.taskdefs.compilers.b ? ((org.apache.tools.ant.taskdefs.compilers.b) aVarC).b() : null;
        if (strArrB == null) {
            strArrB = new String[]{LogType.JAVA_TYPE};
        }
        for (int i10 = 0; i10 < strArrB.length; i10++) {
            if (!strArrB[i10].startsWith("*.")) {
                strArrB[i10] = "*." + strArrB[i10];
            }
        }
        return strArrB;
    }

    private void T2(File file) throws IOException {
        for (Map.Entry<String, Long> entry : this.O.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            File file2 = new File(file, key.replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar));
            file2.mkdirs();
            File file3 = new File(file2, "package-info.class");
            if (!file3.isFile() || file3.lastModified() < value.longValue()) {
                log("Creating empty " + file3);
                OutputStream outputStreamNewOutputStream = Files.newOutputStream(file3.toPath(), new OpenOption[0]);
                try {
                    outputStreamNewOutputStream.write(P3);
                    byte[] bytes = key.getBytes(StandardCharsets.UTF_8);
                    byte length = (byte) (bytes.length + 13);
                    outputStreamNewOutputStream.write(length / 256);
                    outputStreamNewOutputStream.write(length % 256);
                    outputStreamNewOutputStream.write(bytes);
                    outputStreamNewOutputStream.write(Q3);
                    outputStreamNewOutputStream.close();
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
            }
        }
    }

    private String U2(String str) {
        if (Z.equalsIgnoreCase(str) || f135938a0.equalsIgnoreCase(str) || f135939b0.equalsIgnoreCase(str) || f135940c0.equalsIgnoreCase(str) || f135941p1.equalsIgnoreCase(str) || f135944x1.equalsIgnoreCase(str) || f135946y1.equalsIgnoreCase(str) || f135942p2.equalsIgnoreCase(str) || f135945x2.equalsIgnoreCase(str)) {
            return f135943p3;
        }
        if (f135947y2.equalsIgnoreCase(str) || G2.equalsIgnoreCase(str)) {
            return G3;
        }
        if (f135943p3.equalsIgnoreCase(str)) {
            String strA2 = A2();
            if (Z.equalsIgnoreCase(str) || f135938a0.equalsIgnoreCase(strA2) || f135940c0.equalsIgnoreCase(strA2)) {
                return strA2;
            }
        }
        if (G3.equalsIgnoreCase(str) || J3.equalsIgnoreCase(str)) {
            return A2();
        }
        return null;
    }

    private static int k3(CharSequence charSequence, int i10) {
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '{') {
                i11++;
            } else if (cCharAt == '}' && (i11 = i11 - 1) == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    protected String A3() {
        return org.apache.tools.ant.util.s0.h("javac");
    }

    public void A4(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f135948l;
        if (o0Var2 == null) {
            this.f135948l = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    protected void B2() throws BuildException {
        if (G3(this.f135948l)) {
            if (G3(this.f135955s)) {
                throw new BuildException("modulesourcepath cannot be combined with srcdir attribute!", w1());
            }
        } else {
            if (!G3(this.f135955s)) {
                throw new BuildException("either srcdir or modulesourcepath attribute must be set!", w1());
            }
            if (G3(this.f135948l) || G3(this.f135954r)) {
                throw new BuildException("modulesourcepath cannot be combined with srcdir or sourcepath !", w1());
            }
            if (this.f135949m == null) {
                throw new BuildException("modulesourcepath requires destdir attribute to be set!", w1());
            }
        }
        File file = this.f135949m;
        if (file != null && !file.isDirectory()) {
            throw new BuildException("destination directory \"" + this.f135949m + "\" does not exist or is not a directory", w1());
        }
        if (this.D == null && b().u0(org.apache.tools.ant.j1.f133479c) == null) {
            x1(w1() + "warning: 'includeantruntime' was not set, defaulting to " + org.apache.tools.ant.j1.f133479c + "=last; set to false for repeatable builds", 1);
        }
    }

    public String B3() {
        String str = this.f135962z;
        return str != null ? str : b().u0(org.apache.tools.ant.j1.f133499w);
    }

    public void B4(String str) {
        this.f135962z = str;
    }

    public boolean C3() {
        return this.U;
    }

    public void C4(File file) {
        this.R = file;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        B2();
        N3();
        if (G3(this.f135948l)) {
            D2();
        } else {
            C2();
        }
        E2();
        if (this.S == null || !this.U || this.N.length == 0) {
            return;
        }
        b().n1(this.S, "true");
    }

    public File D3() {
        return this.R;
    }

    public void D4(String str) {
        this.S = str;
    }

    protected void E2() {
        String strX2 = X2();
        if (this.N.length > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Compiling ");
            sb2.append(this.N.length);
            sb2.append(" source file");
            sb2.append(this.N.length == 1 ? "" : ak.aB);
            sb2.append(this.f135949m != null ? " to " + this.f135949m : "");
            log(sb2.toString());
            if (this.M) {
                for (File file : this.N) {
                    log(file.getAbsolutePath());
                }
            }
            org.apache.tools.ant.taskdefs.compilers.a aVarC = this.W;
            if (aVarC == null) {
                aVarC = org.apache.tools.ant.taskdefs.compilers.c.c(strX2, this, I2());
            }
            aVarC.a(this);
            if (!aVarC.execute()) {
                this.U = false;
                if (this.T != null) {
                    b().n1(this.T, "true");
                }
                if (this.L) {
                    throw new BuildException(Y, w1());
                }
                x1(Y, 0);
                return;
            }
            if (this.X) {
                try {
                    File fileW0 = this.f135949m;
                    if (fileW0 == null) {
                        fileW0 = b().W0(this.f135948l.z2()[0]);
                    }
                    T2(fileW0);
                } catch (IOException e10) {
                    throw new BuildException(e10, w1());
                }
            }
        }
    }

    public org.apache.tools.ant.types.o0 E3() {
        return this.f135953q;
    }

    public void E4(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f135953q;
        if (o0Var2 == null) {
            this.f135953q = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public org.apache.tools.ant.types.o0 F2() {
        if (this.B == null) {
            this.B = new org.apache.tools.ant.types.o0(b());
        }
        return this.B.u2();
    }

    public boolean F3() {
        return this.f135961y;
    }

    public void F4(org.apache.tools.ant.types.q1 q1Var) {
        O2().c2(q1Var);
    }

    public org.apache.tools.ant.types.o0 G2() {
        if (this.f135951o == null) {
            this.f135951o = new org.apache.tools.ant.types.o0(b());
        }
        return this.f135951o.u2();
    }

    public void G4(boolean z10) {
        this.f135961y = z10;
    }

    public a H2() {
        a aVar = new a();
        this.K.c(aVar);
        return aVar;
    }

    public boolean H3() {
        return this.F || J3.equalsIgnoreCase(X2());
    }

    public org.apache.tools.ant.types.o0 I2() {
        return this.K.g(b());
    }

    public boolean I3() {
        return this.V;
    }

    public org.apache.tools.ant.types.o0 J2() {
        if (this.C == null) {
            this.C = new org.apache.tools.ant.types.o0(b());
        }
        return this.C.u2();
    }

    protected boolean J3(String str) {
        return f135943p3.equals(str) || G3.equals(str) || Z.equals(str) || f135938a0.equals(str) || f135940c0.equals(str) || f135941p1.equals(str) || f135944x1.equals(str) || f135946y1.equals(str) || f135942p2.equals(str) || f135945x2.equals(str) || f135947y2.equals(str) || G2.equals(str);
    }

    public org.apache.tools.ant.types.o0 K2() {
        if (this.f135952p == null) {
            this.f135952p = new org.apache.tools.ant.types.o0(b());
        }
        return this.f135952p.u2();
    }

    public org.apache.tools.ant.types.o0 L2() {
        if (this.f135955s == null) {
            this.f135955s = new org.apache.tools.ant.types.o0(b());
        }
        return this.f135955s.u2();
    }

    public org.apache.tools.ant.types.o0 M2() {
        if (this.f135954r == null) {
            this.f135954r = new org.apache.tools.ant.types.o0(b());
        }
        return this.f135954r.u2();
    }

    protected org.apache.tools.ant.types.o0 M3() {
        this.f135948l = null;
        return N2();
    }

    public org.apache.tools.ant.types.o0 N2() {
        if (this.f135948l == null) {
            this.f135948l = new org.apache.tools.ant.types.o0(b());
        }
        return this.f135948l.u2();
    }

    protected void N3() {
        this.N = new File[0];
        this.O = new HashMap();
    }

    public org.apache.tools.ant.types.o0 O2() {
        if (this.f135953q == null) {
            this.f135953q = new org.apache.tools.ant.types.o0(b());
        }
        return this.f135953q.u2();
    }

    protected void Q3(File file, File file2, String[] strArr) {
        org.apache.tools.ant.util.p0 p0Var = new org.apache.tools.ant.util.p0();
        for (String str : S2()) {
            p0Var.n0(str);
            p0Var.q0("*.class");
            File[] fileArrM = new org.apache.tools.ant.util.f2(this).m(strArr, file, file2, p0Var);
            if (fileArrM.length > 0) {
                L3(file, fileArrM);
                File[] fileArr = this.N;
                File[] fileArr2 = new File[fileArr.length + fileArrM.length];
                System.arraycopy(fileArr, 0, fileArr2, 0, fileArr.length);
                System.arraycopy(fileArrM, 0, fileArr2, this.N.length, fileArrM.length);
                this.N = fileArr2;
            }
        }
    }

    public void R3(org.apache.tools.ant.types.q1 q1Var) {
        F2().c2(q1Var);
    }

    public void S3(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.B;
        if (o0Var2 == null) {
            this.B = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void T3(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f135951o;
        if (o0Var2 == null) {
            this.f135951o = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void U3(org.apache.tools.ant.types.q1 q1Var) {
        G2().c2(q1Var);
    }

    public org.apache.tools.ant.types.o0 V2() {
        return this.B;
    }

    public void V3(String str) {
        this.K.k(str);
    }

    public org.apache.tools.ant.types.o0 W2() {
        return this.f135951o;
    }

    public void W3(boolean z10) {
        this.X = z10;
    }

    public String X2() {
        String strY2 = Y2();
        if (!this.F) {
            return strY2;
        }
        if (J3(strY2)) {
            return J3;
        }
        x1("Since compiler setting isn't classic or modern, ignoring fork setting.", 1);
        return strY2;
    }

    public void X3(boolean z10) {
        this.f135957u = z10;
    }

    public String Y2() {
        this.K.l(b().u0("build.compiler"));
        return this.K.f();
    }

    public void Y3(String str) {
        this.Q = str;
    }

    public String[] Z2() {
        String strE = this.K.e();
        try {
            this.K.k(X2());
            String[] strArrD = this.K.d();
            String strU2 = U2(this.K.f());
            if (strArrD.length == 0 && strU2 != null) {
                this.K.k(strU2);
                strArrD = this.K.d();
            }
            return strArrD;
        } finally {
            this.K.k(strE);
        }
    }

    public void Z3(boolean z10) {
        this.f135960x = z10;
    }

    public boolean a3() {
        return this.f135957u;
    }

    public void a4(boolean z10) {
        this.f135959w = z10;
    }

    public String b3() {
        return this.Q;
    }

    public void b4(File file) {
        this.f135949m = file;
    }

    public boolean c3() {
        return this.f135960x;
    }

    public void c4(String str) {
        this.f135956t = str;
    }

    public boolean d3() {
        return this.f135959w;
    }

    public void d4(String str) {
        this.T = str;
    }

    public File e3() {
        return this.f135949m;
    }

    public void e4(String str) {
        this.G = str;
    }

    public String f3() {
        return this.f135956t;
    }

    public void f4(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.C;
        if (o0Var2 == null) {
            this.C = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public String g3() {
        return this.G;
    }

    public void g4(boolean z10) {
        this.L = z10;
    }

    public org.apache.tools.ant.types.o0 h3() {
        return this.C;
    }

    public void h4(boolean z10) {
        this.F = z10;
    }

    public boolean i3() {
        return this.L;
    }

    public void i4(boolean z10) {
        this.V = z10;
    }

    public File[] j3() {
        return this.N;
    }

    public void j4(boolean z10) {
        this.D = Boolean.valueOf(z10);
    }

    public void k4(boolean z10) {
        this.E = z10;
    }

    public boolean l3() {
        Boolean bool = this.D;
        return bool == null || bool.booleanValue();
    }

    public void l4(boolean z10) {
        this.M = z10;
    }

    public boolean m3() {
        return this.E;
    }

    public void m4(String str) {
        this.I = str;
    }

    public String n3() {
        if (this.G == null && H3()) {
            this.G = A3();
        } else if (this.G != null && !H3()) {
            this.G = null;
        }
        return this.G;
    }

    public void n4(String str) {
        this.J = str;
    }

    public boolean o3() {
        return this.M;
    }

    public void o4(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f135952p;
        if (o0Var2 == null) {
            this.f135952p = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public String p3() {
        return this.I;
    }

    public void p4(org.apache.tools.ant.types.q1 q1Var) {
        K2().c2(q1Var);
    }

    public String q3() {
        return this.J;
    }

    public void q4(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f135955s;
        if (o0Var2 == null) {
            this.f135955s = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public org.apache.tools.ant.types.o0 r3() {
        return this.f135952p;
    }

    public void r4(org.apache.tools.ant.types.q1 q1Var) {
        L2().c2(q1Var);
    }

    public org.apache.tools.ant.types.o0 s3() {
        return this.f135955s;
    }

    public void s4(File file) {
        this.f135950n = file;
    }

    public File t3() {
        return this.f135950n;
    }

    public void t4(boolean z10) {
        this.H = z10;
    }

    public boolean u3() {
        return this.H;
    }

    public void u4(boolean z10) {
        this.f135958v = z10;
    }

    public boolean v3() {
        return this.f135958v;
    }

    public void v4(boolean z10) {
        this.L = !z10;
    }

    public String w3() {
        return this.A;
    }

    public void w4(String str) {
        this.A = str;
    }

    public String x3() {
        String str = this.P;
        return str != null ? str : b().u0(org.apache.tools.ant.j1.f133498v);
    }

    public void x4(String str) {
        this.P = str;
    }

    public org.apache.tools.ant.types.o0 y3() {
        return this.f135954r;
    }

    public void y4(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f135954r;
        if (o0Var2 == null) {
            this.f135954r = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void z2(org.apache.tools.ant.taskdefs.compilers.a aVar) {
        if (this.W != null) {
            throw new BuildException("Can't have more than one compiler adapter");
        }
        this.W = aVar;
    }

    public org.apache.tools.ant.types.o0 z3() {
        return this.f135948l;
    }

    public void z4(org.apache.tools.ant.types.q1 q1Var) {
        M2().c2(q1Var);
    }
}
