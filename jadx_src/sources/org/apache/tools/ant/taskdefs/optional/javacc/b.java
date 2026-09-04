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

/* JADX INFO: compiled from: JJDoc.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends u2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f135177r = "OUTPUT_FILE";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f135178s = "TEXT";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f135179t = "ONE_TABLE";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f135180u = ".html";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f135181v = ".txt";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, Object> f135182k = new Hashtable();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135183l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f135184m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f135185n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f135186o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CommandlineJava f135187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f135188q;

    public b() {
        CommandlineJava commandlineJava = new CommandlineJava();
        this.f135187p = commandlineJava;
        this.f135188q = null;
        commandlineJava.Z(s0.i(LogType.JAVA_TYPE));
    }

    private String j2(File file, String str, boolean z10) {
        String strReplace;
        String strReplace2 = file.getAbsolutePath().replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
        String str2 = z10 ? f135181v : f135180u;
        if (str == null || str.isEmpty()) {
            int iLastIndexOf = strReplace2.lastIndexOf(47);
            if (iLastIndexOf >= 0) {
                strReplace2 = strReplace2.substring(iLastIndexOf + 1);
            }
            int iLastIndexOf2 = strReplace2.lastIndexOf(46);
            if (iLastIndexOf2 == -1) {
                strReplace = strReplace2 + str2;
            } else if (strReplace2.substring(iLastIndexOf2).equals(str2)) {
                strReplace = strReplace2 + str2;
            } else {
                strReplace = strReplace2.substring(0, iLastIndexOf2) + str2;
            }
        } else {
            strReplace = str.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
        }
        return (b().Z() + "/" + strReplace).replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k2(String str, Object obj) {
        this.f135187p.g().O1(Constants.ACCEPT_TIME_SEPARATOR_SERVER + str + ":" + obj.toString());
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        this.f135182k.forEach(new BiConsumer() { // from class: org.apache.tools.ant.taskdefs.optional.javacc.a
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f135176a.k2((String) obj, obj2);
            }
        });
        File file = this.f135185n;
        if (file == null || !file.isFile()) {
            throw new BuildException("Invalid target: %s", this.f135185n);
        }
        if (this.f135183l != null) {
            this.f135187p.g().O1("-OUTPUT_FILE:" + this.f135183l.replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX));
        }
        File file2 = new File(j2(this.f135185n, this.f135183l, this.f135184m));
        if (file2.exists() && this.f135185n.lastModified() < file2.lastModified()) {
            x1("Target is already built - skipping (" + this.f135185n + ")", 3);
            return;
        }
        this.f135187p.g().O1(this.f135185n.getAbsolutePath());
        o0 o0VarI = this.f135187p.i(b());
        o0VarI.v2().e(f.j2(this.f135186o).getAbsolutePath());
        o0VarI.m2();
        this.f135187p.R(f.m2(o0VarI, 3));
        this.f135187p.U(this.f135188q);
        this.f135187p.m().O1("-Dinstall.root=" + this.f135186o.getAbsolutePath());
        n1 n1Var = new n1(new s3((u2) this, 2, 2), null);
        x1(this.f135187p.n(), 3);
        n1Var.x(this.f135187p.u());
        try {
            if (n1Var.e() == 0) {
            } else {
                throw new BuildException("JJDoc failed.");
            }
        } catch (IOException e10) {
            throw new BuildException("Failed to launch JJDoc", e10);
        }
    }

    public void l2(File file) {
        this.f135186o = file;
    }

    public void m2(String str) {
        this.f135188q = str;
    }

    public void n2(boolean z10) {
        this.f135182k.put(f135179t, Boolean.valueOf(z10));
    }

    public void o2(String str) {
        this.f135183l = str;
    }

    public void p2(File file) {
        this.f135185n = file;
    }

    public void q2(boolean z10) {
        this.f135182k.put("TEXT", Boolean.valueOf(z10));
        this.f135184m = z10;
    }
}
