package org.apache.tools.ant.taskdefs.optional.javacc;

import com.tencent.qcloud.core.util.IOUtils;
import com.uc.crashsdk.export.LogType;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.s3;
import org.apache.tools.ant.types.CommandlineJava;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: JJTree.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends u2 {
    private static final String A = "NODE_PACKAGE";
    private static final String B = "VISITOR_EXCEPTION";
    private static final String C = "NODE_PREFIX";
    private static final String D = ".jj";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f135190r = "OUTPUT_FILE";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f135191s = "BUILD_NODE_FILES";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f135192t = "MULTI";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f135193u = "NODE_DEFAULT_VOID";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f135194v = "NODE_FACTORY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f135195w = "NODE_SCOPE_HOOK";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f135196x = "NODE_USES_PARSER";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f135197y = "STATIC";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f135198z = "VISITOR";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, Object> f135199k = new Hashtable();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135200l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f135201m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f135202n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f135203o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CommandlineJava f135204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f135205q;

    public d() {
        CommandlineJava commandlineJava = new CommandlineJava();
        this.f135204p = commandlineJava;
        this.f135205q = null;
        commandlineJava.Z(s0.i(LogType.JAVA_TYPE));
    }

    private String E2(String str, String str2) throws BuildException {
        if (str == null) {
            return null;
        }
        if (str2 == null && (str.startsWith("/") || str.startsWith("\\"))) {
            String strN2 = n2(str);
            z2(strN2);
            return strN2;
        }
        String absolutePath = l2(new File(str)).getAbsolutePath();
        if (absolutePath.length() <= 1 || !str.startsWith(absolutePath.substring(0, absolutePath.length() - 1))) {
            return str;
        }
        throw new BuildException("Drive letter in 'outputfile' not supported: %s", str);
    }

    private String j2(File file, String str, String str2) {
        String strE2 = E2(str, str2);
        String strReplace = file.getAbsolutePath().replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
        if (strE2 == null || strE2.isEmpty()) {
            int iLastIndexOf = strReplace.lastIndexOf(47);
            if (iLastIndexOf >= 0) {
                strReplace = strReplace.substring(iLastIndexOf + 1);
            }
            int iLastIndexOf2 = strReplace.lastIndexOf(46);
            if (iLastIndexOf2 == -1) {
                strE2 = strReplace + D;
            } else if (strReplace.substring(iLastIndexOf2).equals(D)) {
                strE2 = strReplace + D;
            } else {
                strE2 = strReplace.substring(0, iLastIndexOf2) + D;
            }
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = k2();
        }
        return (str2 + "/" + strE2).replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
    }

    private String k2() {
        return b().Z().getAbsolutePath().replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
    }

    private File l2(File file) {
        File absoluteFile = file.getAbsoluteFile();
        while (absoluteFile.getParent() != null) {
            absoluteFile = absoluteFile.getParentFile();
        }
        return absoluteFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m2(String str, Object obj) {
        this.f135204p.g().O1(Constants.ACCEPT_TIME_SEPARATOR_SERVER + str + ":" + obj.toString());
    }

    private String n2(String str) {
        StringBuilder sb2 = new StringBuilder();
        String strK2 = k2();
        int iIndexOf = strK2.indexOf(47);
        loop0: while (true) {
            iIndexOf++;
            do {
                if (iIndexOf <= -1 || iIndexOf >= strK2.length()) {
                    break loop0;
                }
                sb2.append("/..");
                iIndexOf = strK2.indexOf(47, iIndexOf);
            } while (iIndexOf == -1);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public void A2(boolean z10) {
        this.f135199k.put(f135197y, Boolean.valueOf(z10));
    }

    public void B2(File file) {
        this.f135202n = file;
    }

    public void C2(boolean z10) {
        this.f135199k.put(f135198z, Boolean.valueOf(z10));
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file;
        this.f135199k.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.optional.javacc.c
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f135189a.m2((String) obj, obj2);
            }
        });
        File file2 = this.f135202n;
        if (file2 == null || !file2.isFile()) {
            throw new BuildException("Invalid target: %s", this.f135202n);
        }
        File file3 = this.f135201m;
        if (file3 == null) {
            this.f135204p.g().O1("-OUTPUT_DIRECTORY:" + k2());
            file = new File(j2(this.f135202n, this.f135200l, null));
        } else {
            if (!file3.isDirectory()) {
                throw new BuildException("'outputdirectory' " + this.f135201m + " is not a directory.");
            }
            this.f135204p.g().O1("-OUTPUT_DIRECTORY:" + this.f135201m.getAbsolutePath().replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX));
            file = new File(j2(this.f135202n, this.f135200l, this.f135201m.getPath()));
        }
        if (file.exists() && this.f135202n.lastModified() < file.lastModified()) {
            x1("Target is already built - skipping (" + this.f135202n + ")", 3);
            return;
        }
        if (this.f135200l != null) {
            this.f135204p.g().O1("-OUTPUT_FILE:" + this.f135200l.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX));
        }
        this.f135204p.g().O1(this.f135202n.getAbsolutePath());
        o0 o0VarI = this.f135204p.i(b());
        o0VarI.v2().e(f.j2(this.f135203o).getAbsolutePath());
        o0VarI.m2();
        this.f135204p.R(f.m2(o0VarI, 2));
        this.f135204p.U(this.f135205q);
        this.f135204p.m().O1("-Dinstall.root=" + this.f135203o.getAbsolutePath());
        n1 n1Var = new n1(new s3((u2) this, 2, 2), null);
        x1(this.f135204p.n(), 3);
        n1Var.x(this.f135204p.u());
        try {
            if (n1Var.e() == 0) {
            } else {
                throw new BuildException("JJTree failed.");
            }
        } catch (IOException e10) {
            throw new BuildException("Failed to launch JJTree", e10);
        }
    }

    public void D2(String str) {
        this.f135199k.put(B, str);
    }

    public void o2(boolean z10) {
        this.f135199k.put(f135191s, Boolean.valueOf(z10));
    }

    public void p2(File file) {
        this.f135203o = file;
    }

    public void q2(String str) {
        this.f135205q = str;
    }

    public void r2(boolean z10) {
        this.f135199k.put(f135192t, Boolean.valueOf(z10));
    }

    public void s2(boolean z10) {
        this.f135199k.put(f135193u, Boolean.valueOf(z10));
    }

    public void t2(boolean z10) {
        this.f135199k.put(f135194v, Boolean.valueOf(z10));
    }

    public void u2(String str) {
        this.f135199k.put(A, str);
    }

    public void v2(String str) {
        this.f135199k.put(C, str);
    }

    public void w2(boolean z10) {
        this.f135199k.put(f135195w, Boolean.valueOf(z10));
    }

    public void x2(boolean z10) {
        this.f135199k.put(f135196x, Boolean.valueOf(z10));
    }

    public void y2(File file) {
        this.f135201m = file;
    }

    public void z2(String str) {
        this.f135200l = str;
    }
}
