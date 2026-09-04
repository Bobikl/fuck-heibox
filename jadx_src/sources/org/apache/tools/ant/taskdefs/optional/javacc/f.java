package org.apache.tools.ant.taskdefs.optional.javacc;

import com.tencent.qcloud.core.util.IOUtils;
import com.uc.crashsdk.export.LogType;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.g;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.z0;
import org.apache.tools.ant.types.CommandlineJava;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: JavaCC.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends u2 {
    private static final String A = "UNICODE_INPUT";
    private static final String B = "IGNORE_CASE";
    private static final String C = "COMMON_TOKEN_ACTION";
    private static final String D = "USER_TOKEN_MANAGER";
    private static final String E = "USER_CHAR_STREAM";
    private static final String F = "BUILD_PARSER";
    private static final String G = "BUILD_TOKEN_MANAGER";
    private static final String H = "SANITY_CHECK";
    private static final String I = "FORCE_LA_CHECK";
    private static final String J = "CACHE_TOKENS";
    private static final String K = "KEEP_LINE_COLUMN";
    private static final String L = "JDK_VERSION";
    protected static final int M = 1;
    protected static final int N = 2;
    protected static final int O = 3;
    protected static final String[] P = {"JavaCC.zip", "bin/lib/JavaCC.zip", "bin/lib/javacc.jar", "javacc.jar"};
    protected static final int[] Q = {1, 2, 3, 3};
    protected static final String R = "COM.sun.labs.";
    protected static final String S = "javacc.Main";
    protected static final String T = "jjtree.Main";
    protected static final String U = "jjdoc.JJDocMain";
    protected static final String V = "org.netbeans.javacc.";
    protected static final String W = "org.javacc.";
    protected static final String X = "parser.Main";
    protected static final String Y = "jjtree.Main";
    protected static final String Z = "jjdoc.JJDocMain";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f135207q = "LOOKAHEAD";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f135208r = "CHOICE_AMBIGUITY_CHECK";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f135209s = "OTHER_AMBIGUITY_CHECK";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f135210t = "STATIC";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f135211u = "DEBUG_PARSER";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f135212v = "DEBUG_LOOKAHEAD";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f135213w = "DEBUG_TOKEN_MANAGER";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f135214x = "OPTIMIZE_TOKEN_MANAGER";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f135215y = "ERROR_REPORTING";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f135216z = "JAVA_UNICODE_ESCAPE";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, Object> f135217k = new Hashtable();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135218l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f135219m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f135220n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CommandlineJava f135221o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135222p;

    public f() {
        CommandlineJava commandlineJava = new CommandlineJava();
        this.f135221o = commandlineJava;
        this.f135222p = null;
        commandlineJava.Z(s0.i(LogType.JAVA_TYPE));
    }

    protected static File j2(File file) throws BuildException {
        return new File(file, P[k2(file)]);
    }

    private static int k2(File file) throws BuildException {
        if (file == null || !file.isDirectory()) {
            throw new BuildException("JavaCC home must be a valid directory.");
        }
        int i10 = 0;
        while (true) {
            String[] strArr = P;
            if (i10 >= strArr.length) {
                throw new BuildException("Could not find a path to JavaCC.zip or javacc.jar from '%s'.", file);
            }
            if (new File(file, strArr[i10]).exists()) {
                return i10;
            }
            i10++;
        }
    }

    protected static String l2(File file, int i10) throws BuildException {
        o0 o0Var = new o0(null);
        o0Var.v2().b(j2(file));
        o0Var.m2();
        return m2(o0Var, i10);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c A[PHI: r0
  0x003c: PHI (r0v7 java.lang.String) = (r0v4 java.lang.String), (r0v11 java.lang.String) binds: [B:24:0x0086, B:9:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x003e A[PHI: r0
  0x003e: PHI (r0v6 java.lang.String) = (r0v4 java.lang.String), (r0v11 java.lang.String) binds: [B:23:0x0084, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    protected static String m2(o0 o0Var, int i10) throws BuildException {
        String str;
        String str2 = null;
        g gVarF0 = g.f0(null, null, o0Var.s2(z0.b.f136024i), true);
        try {
            if (gVarF0.getResourceAsStream("COM.sun.labs.javacc.Main".replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".class") != null) {
                str = R;
                if (i10 == 1) {
                    str2 = S;
                } else if (i10 == 2) {
                    str2 = "jjtree.Main";
                } else if (i10 == 3) {
                    str2 = "jjdoc.JJDocMain";
                }
            } else {
                InputStream resourceAsStream = gVarF0.getResourceAsStream("org.javacc.parser.Main".replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".class");
                if (resourceAsStream != null) {
                    str = W;
                } else {
                    resourceAsStream = gVarF0.getResourceAsStream("org.netbeans.javacc.parser.Main".replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".class");
                    str = resourceAsStream != null ? V : null;
                }
                if (resourceAsStream != null) {
                    if (i10 == 1) {
                        str2 = X;
                    } else if (i10 == 2) {
                        str2 = "jjtree.Main";
                    } else if (i10 == 3) {
                        str2 = "jjdoc.JJDocMain";
                    }
                }
            }
            if (str == null) {
                throw new BuildException("failed to load JavaCC");
            }
            if (str2 == null) {
                throw new BuildException("unknown task type " + i10);
            }
            String str3 = str + str2;
            gVarF0.close();
            return str3;
        } catch (Throwable th2) {
            if (gVarF0 != null) {
                try {
                    gVarF0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    protected static int n2(File file) throws BuildException {
        return Q[k2(file)];
    }

    private File o2(File file, File file2) {
        String str;
        String path = file2.getPath();
        String str2 = File.separator;
        int iLastIndexOf = path.lastIndexOf(str2);
        if (iLastIndexOf != -1) {
            path = path.substring(iLastIndexOf + 1);
        }
        int iLastIndexOf2 = path.lastIndexOf(46);
        if (iLastIndexOf2 != -1) {
            str = path.substring(0, iLastIndexOf2) + ".java";
        } else {
            str = path + ".java";
        }
        if (file != null) {
            str = file + str2 + str;
        }
        return new File(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p2(String str, Object obj) {
        this.f135221o.g().O1(Constants.ACCEPT_TIME_SEPARATOR_SERVER + str + ":" + obj);
    }

    public void A2(boolean z10) {
        this.f135217k.put(B, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void B2(String str) {
        this.f135217k.put(L, str);
    }

    public void C2(File file) {
        this.f135220n = file;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        this.f135217k.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.optional.javacc.e
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f135206a.p2((String) obj, obj2);
            }
        });
        File file = this.f135219m;
        if (file == null || !file.isFile()) {
            throw new BuildException("Invalid target: %s", this.f135219m);
        }
        File file2 = this.f135218l;
        if (file2 == null) {
            this.f135218l = new File(this.f135219m.getParent());
        } else if (!file2.isDirectory()) {
            throw new BuildException("Outputdir not a directory.");
        }
        this.f135221o.g().O1("-OUTPUT_DIRECTORY:" + this.f135218l.getAbsolutePath());
        File fileO2 = o2(this.f135218l, this.f135219m);
        if (fileO2.exists() && this.f135219m.lastModified() < fileO2.lastModified()) {
            x1("Target is already built - skipping (" + this.f135219m + ")", 3);
            return;
        }
        this.f135221o.g().O1(this.f135219m.getAbsolutePath());
        o0 o0VarI = this.f135221o.i(b());
        o0VarI.v2().e(j2(this.f135220n).getAbsolutePath());
        o0VarI.m2();
        this.f135221o.R(m2(o0VarI, 1));
        this.f135221o.U(this.f135222p);
        this.f135221o.m().O1("-Dinstall.root=" + this.f135220n.getAbsolutePath());
        n1.v(this, this.f135221o.u());
    }

    public void D2(boolean z10) {
        this.f135217k.put(f135216z, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void E2(boolean z10) {
        this.f135217k.put(K, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void F2(int i10) {
        this.f135217k.put(f135207q, Integer.valueOf(i10));
    }

    public void G2(String str) {
        this.f135222p = str;
    }

    public void H2(boolean z10) {
        this.f135217k.put(f135214x, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void I2(int i10) {
        this.f135217k.put(f135209s, Integer.valueOf(i10));
    }

    public void J2(File file) {
        this.f135218l = file;
    }

    public void K2(boolean z10) {
        this.f135217k.put(H, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void L2(boolean z10) {
        this.f135217k.put(f135210t, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void M2(File file) {
        this.f135219m = file;
    }

    public void N2(boolean z10) {
        this.f135217k.put(A, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void O2(boolean z10) {
        this.f135217k.put(E, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void P2(boolean z10) {
        this.f135217k.put(D, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void q2(boolean z10) {
        this.f135217k.put(F, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void r2(boolean z10) {
        this.f135217k.put(G, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void s2(boolean z10) {
        this.f135217k.put(J, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void t2(int i10) {
        this.f135217k.put(f135208r, Integer.valueOf(i10));
    }

    public void u2(boolean z10) {
        this.f135217k.put(C, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void v2(boolean z10) {
        this.f135217k.put(f135212v, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void w2(boolean z10) {
        this.f135217k.put(f135211u, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void x2(boolean z10) {
        this.f135217k.put(f135213w, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void y2(boolean z10) {
        this.f135217k.put(f135215y, z10 ? Boolean.TRUE : Boolean.FALSE);
    }

    public void z2(boolean z10) {
        this.f135217k.put(I, z10 ? Boolean.TRUE : Boolean.FALSE);
    }
}
